package org.example;

import javax.naming.PartialResultException;
import java.util.HashMap;
import java.util.Hashtable;


public class Main {
    public static void main(String[] args) {

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        HashMap<String, Book> directory = new HashMap<>();
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
        System.out.println(directory);
    }
}




