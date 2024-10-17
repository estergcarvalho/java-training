package com.java.training.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @Test
    @DisplayName("It must be a palindrome word")
    public void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        String word = "Renner";

        boolean result = palindrome.validatePalindrome(word);

        assertTrue(result);
    }

    @Test
    @DisplayName("Not it must be a palindrome word")
    public void notIsPalindrome() {
        Palindrome palindrome = new Palindrome();
        String word = "Hello";

        boolean result = palindrome.validatePalindrome(word);

        assertFalse(result);
    }

}