package com.java.training.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {

    @Test
    @DisplayName("It much be a anagram")
    void isAnagram() {
        Anagram anagram = new Anagram();
        String word = "amor";
        String word2 = "roma";

        boolean validate = anagram.isAnagram(word, word2);

        assertTrue(validate);
    }

    @Test
    @DisplayName("Not it much be a anagram")
    void notIsAnagram() {
        Anagram anagram = new Anagram();
        String word = "buti";
        String word2 = "amor";

        boolean validate = anagram.isAnagram(word, word2);

        assertFalse(validate);
    }

}