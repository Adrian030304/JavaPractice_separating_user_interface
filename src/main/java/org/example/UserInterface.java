package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private WordSet words;

    public UserInterface(WordSet words, Scanner scanner) {
        this.scanner = scanner;
        this.words = words;
    }

    public void start() {
        while (true) {
            System.out.println("Enter a word");
            String word = scanner.nextLine();

            if (words.contains(word)) {
                break;
            }
            this.words.add(word);
        }
        System.out.println("You already entered the word twice.");
        System.out.println("There are " + words.palindromes() + " palindromes in the list.");

    }
}
