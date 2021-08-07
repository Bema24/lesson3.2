package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double negativeValue = 0;
        int sum = 0;
        double[] numbers = { 1.5, 4.6, -5.2, -6.4, 3.4, 2.8, 9.7, -7.1, 8.2, -9.2, 3.6, -1.9, 5.4, 6.1, -8.5 };
        for (double currentElement: numbers) {
            if (currentElement > 0) {
                negativeValue += currentElement;
                sum++;
            }
        }
        System.out.println((float) negativeValue / sum);


        
        bubbleSort(numbers);


    }

    static void bubbleSort (double array[]) {
        int num = array.length;

        for (int i = 0; i < num - 1; i++) {

            for (int j = 0; j < num - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    double num2 = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num2;

                }
            }
            System.out.println(Arrays.toString(array));
        }

    }

}
