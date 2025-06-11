package ua.speedchecker;

import java.util.Scanner;

public class CliHandler {
    private Scanner scanner;

    public CliHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getUserInput(String message){
        System.out.println(message);
        return scanner.nextLine().trim();
    }

    public void scannerClose(){
        if(scanner != null){
            scanner.close();
        }
    }
}
