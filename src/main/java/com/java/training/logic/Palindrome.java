package com.java.training.logic;

public class Palindrome {

    public boolean validatePalindrome(String wordPalidrome) {
        String word = wordPalidrome.toLowerCase();

        char[] letters = word.toCharArray();

        int size = letters.length - 1;

        String newWordInverted = "";

        for (int i = size; i >= 0; i--) {
            newWordInverted = newWordInverted + letters[i];
        }

        return newWordInverted.equals(word);
    }

}