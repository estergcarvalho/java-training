package com.java.training.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderNumbersTest {

    @Test
    public void bubbleSort() {
        OrderNumbers orderNumbers = new OrderNumbers();

        int [] number = {14,33,27,10,35};

        int[] result = orderNumbers.validateOrderNumbers(number);

        assertEquals(5, result.length);
    }

}