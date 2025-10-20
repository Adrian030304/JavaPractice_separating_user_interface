package org.example;

import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }
    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word){
        return this.words.contains(word);
    }

    public int palindromes() {
        int no_palindromes = 0;
        for (String wd: words) {
            if (isPalindrome(wd)) {
                no_palindromes += 1;
            }
        }
        return no_palindromes;
    }

    private boolean isPalindrome(String cuvant) {
        for (int i = 0; i < cuvant.length() / 2; i++) {
            if (cuvant.charAt(i) != cuvant.charAt(cuvant.length()-i - 1)) {
                return false;
            }
        }
        return true;
    }
}
