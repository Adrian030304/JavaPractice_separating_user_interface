package org.example;

import java.util.Hashtable;

public class SimpleDictionary {
    private Hashtable<String, String> dictionar;

    SimpleDictionary() {
        this.dictionar = new Hashtable<>();
    }

    void add(String key, String value) {
        this.dictionar.put(key, value);
    }

    String translate(String key) {
        return this.dictionar.get(key);
    }
}




