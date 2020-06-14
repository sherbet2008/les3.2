package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7,
                -1.8, -1.9, -1.1, -2.2, -2.3, -2, 4, -2.5, -2.6};
        boolean startCount = false;
        double sumOfNumbers = 0.1;
        double result;
        int amountOfNumbers = 0;

        for (double i : array) {
            if (i < 0) {
                startCount = true;
            }
            if (startCount) {
                if (i > 0) {
                    sumOfNumbers += i;
                    amountOfNumbers++;
                }
            }


        }
        result = sumOfNumbers / amountOfNumbers;
        System.out.println(" Среднее арифметическое положительных чисел = " + result);


    }
}