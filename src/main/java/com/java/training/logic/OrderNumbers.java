package com.java.training.logic;

public class OrderNumbers {

    public int[] validateOrderNumbers(int[] numbers) {
        int size = numbers.length - 1;

        for (int i = 0; i < size; i++) {
            boolean change = false;

            for (int j = 0; j < size - i; j++) {
                if (numbers[j] < numbers[j + 1]) {

                    int orderTemp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = orderTemp;
                    change = true;
                }
            }

            if (!change) {
                break;
            }
        }

        return numbers;
    }

}