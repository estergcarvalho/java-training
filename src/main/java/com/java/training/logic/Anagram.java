package com.java.training.logic;

public class Anagram {

    public boolean isAnagram(String word, String anagram) {
        String[] wordLetters = word.split("");
        String[] anagramLetters = anagram.split("");

        for (String letter : wordLetters) {
            for (int i = 0; i < anagramLetters.length; i++) {
                if (letter.equals(anagramLetters[i])) {
                    anagramLetters[i] = null;
                    break;
                }
            }
        }

        for (String letter : anagramLetters) {
            if (letter != null) {
                return false;
            }
        }

        return true;
    }

}