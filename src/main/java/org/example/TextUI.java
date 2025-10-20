package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dictionar;

    TextUI (Scanner scan, SimpleDictionary dictionar) {
        this.scan = scan;
        this.dictionar = dictionar;
    }
    void start() {

        while (true) {
            System.out.println("Command: ");
            String command = this.scan.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye Bye");
                break;
            } else if (command.equals("add")) {
                System.out.println("Select word to translate: ");
                String key = scan.nextLine();
                System.out.println("Select translation for the previous word: ");
                String value = scan.nextLine();
                dictionar.add(key, value);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = scan.nextLine();
                if (dictionar.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found.");
                } else {
                    System.out.println("Translation: " + dictionar.translate(toBeTranslated));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
