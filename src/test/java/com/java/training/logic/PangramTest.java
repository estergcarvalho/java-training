package com.java.training.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PangramTest {

    @Test
    @DisplayName("must be a pangram")
    void isPangram() {
        Pangram pangram = new Pangram();

        String sentence = "gazeta publica hoje: breve anuncio de faxina na quermesse";

        boolean result = pangram.validatePangram(sentence);

        assertTrue(result);
    }

    @Test
    @DisplayName("must not be a pangram")
    void isNotPangram() {
        Pangram pangram = new Pangram();

        String frase = "O dia esta lindo hoje";

        boolean result = pangram.validatePangram(frase);

        assertFalse(result);
    }

}