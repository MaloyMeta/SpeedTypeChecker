package ua.speedchecker;

import java.util.Scanner;

class Main {
    private static CliHandler cliHandler;

    public static void main(String[] args) throws InterruptedException {
        cliHandler = new CliHandler(new Scanner(System.in));
        CountSPM count = new CountSPM();

        String answer = cliHandler.getUserInput("Hello, are you ready to start? (Y/n)");

        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Prepare to start.");
            countdown();

            while (true) {
                String currentPhrase = Vocabulary.randomizePhrase(Vocabulary.basicVocabulary());
                long startTime, endTime;
                String userInput;
                int lengthOfPhrase;
                double timeElapsed, SPM;

                while (true) {
                    startTime = System.currentTimeMillis();

                    userInput = cliHandler.getUserInput(currentPhrase);

                    if (exitCommand(userInput)) {
                        close();
                    }

                    endTime = System.currentTimeMillis();
                    lengthOfPhrase = currentPhrase.length();

                    if (ValidatePhrase.validatePhrase(currentPhrase, userInput.trim())) {
                        timeElapsed = count.timeElapsed(startTime, endTime);
                        SPM = count.countSpm(lengthOfPhrase, timeElapsed);

                        System.out.println(timeElapsed + " s");
                        System.out.println("TPM " + SPM);
                        break;
                    }
                    System.out.println("");
                }
            }

        } else {
            close();
        }

    }

    private static boolean exitCommand(String userInput) {
        return userInput.equals("exit") || userInput.equals("close");
    }

    private static void close() throws InterruptedException {
        System.out.println("");
        System.out.println("Ok, bye");
        cliHandler.scannerClose();
        Thread.sleep(1000);
        System.exit(0);
    }

    private static void countdown() throws InterruptedException {
        for (int i = 3; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}