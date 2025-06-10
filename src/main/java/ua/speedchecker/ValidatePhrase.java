package ua.speedchecker;

public class ValidatePhrase {
    public static boolean validatePhrase(String currentPhrase, String userPhrase) throws InterruptedException {

        if (currentPhrase.length() != userPhrase.length()) {
            return false;
        }
        for(int  i = 0; i < currentPhrase.length(); i++) {
            if(currentPhrase.charAt(i) != userPhrase.charAt(i)) {
                System.out.println("");
                System.out.println(userPhrase);
                System.out.println(" ".repeat(i) + "^");
                Thread currentThread = Thread.currentThread();
                System.out.println("Phrases don't match");
                currentThread.sleep(1000);
                return false;
            }
        }
        return true;
    }
}
