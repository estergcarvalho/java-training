package com.java.training.logic;

public class Anagram {

    public boolean validateAnagram(String word, String wordAnagram) {
        String[] letterWord = word.split("");
        String[] letterAnagram = wordAnagram.split("");

        for (String p : letterWord) {
            for (int l = 0; l < letterAnagram.length; l++) {
                if (p.equals(letterAnagram[l])) {
                    letterAnagram[l] = null;
                    break;
                }
            }
        }

        for (String letter : letterAnagram) {
            if (letter != null) {
                return false;

            }
        }

        return true;
    }

}