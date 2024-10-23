package com.java.training.logic;

public class Pangram {

    public boolean validatePangram(String sentence) {
        String alphabet = "abcdefghijlmnopqrstuvxz";
        boolean isPangram = true;

        for (char letterAlphabet : alphabet.toCharArray()) {
            isPangram = false;

            for (char letterSentence : sentence.toLowerCase().toCharArray()) {
                if (letterAlphabet == letterSentence) {
                    isPangram = true;
                    break;
                }
            }
        }

        return isPangram;
    }

}