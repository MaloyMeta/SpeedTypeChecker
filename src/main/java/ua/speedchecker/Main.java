package ua.speedchecker;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, are you ready to start? (y/n)");

        String answer = sc.nextLine();

        if(answer.equals("y")) {
            System.out.println("Prepare to start.");

            for(int i = 3; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }

            while(true){
                String currentPhrase = Vocabulary.randomizePhrase(Vocabulary.basicVocabulary());

                int lengthOfPhrase = currentPhrase.length();

                long startTime = System.currentTimeMillis();

                System.out.println(currentPhrase);

                String userInput = sc.nextLine();

                if(userInput.equals("exit")) {
                    System.out.println("");
                    System.out.println("BB!");
                    Thread.sleep(1000);
                    sc.close();
                    System.exit(0);
                }

                long endTime = System.currentTimeMillis();

                double timeElapsed = (endTime - startTime) / 1000.0;

                double symbolPerMinute = (lengthOfPhrase / timeElapsed) * 60;

                if (ValidatePhrase.validatePhrase(currentPhrase, userInput.trim())) {
                    System.out.println(timeElapsed + " s");
                    System.out.println("TPM " + symbolPerMinute);
                }
                System.out.println("");
            }

        } else {
            System.out.println("Ok, bye");
            Thread.currentThread().sleep(1000);
        }

    }
}