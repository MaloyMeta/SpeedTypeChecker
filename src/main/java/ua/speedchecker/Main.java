package ua.speedchecker;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, are you ready to start? (y/n)");

        String answer = sc.nextLine();

        if(answer.equals("y")) {
            System.out.println("Prepare to start.");
            Thread.currentThread().sleep(1000);
            System.out.println("3");
            Thread.currentThread().sleep(1000);
            System.out.println("2");
            Thread.currentThread().sleep(1000);
            System.out.println("1");
            Thread.currentThread().sleep(1000);
            System.out.println("0");
            while(true){
                String currentPhrase = Vocabulary.randomizePhrase(Vocabulary.basicVocabulary());

                int lengthOfPhrase = currentPhrase.length();

                long startTime = System.currentTimeMillis();

                System.out.println(currentPhrase);

                String userInput = sc.nextLine();

                long endTime = System.currentTimeMillis();

                double timeElapsed = (endTime - startTime) / 1000.0;

                double symbolPerMinute = (lengthOfPhrase / timeElapsed) * 60;

                if (currentPhrase.equals(userInput.trim())) {
                    System.out.println(timeElapsed + " s");
                    System.out.println("TPM " + symbolPerMinute);
                } else {
                    System.out.println("Phrases don't match");
                }
            }

        } else {
            System.out.println("Ok, bye");
            Thread.currentThread().sleep(1000);
        }

    }
}