package com.teachmeskills.lesson4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int sizeOfArray = scanner.nextInt();

        double[] array = new double[sizeOfArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = 0;
        for (double value : array) {
            max = Math.max(max, value);
        }

        double min = 0;
        for (double value : array) {
            max = Math.min(min, value);
        }

        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Среднее значение массива: " + (min + max) / 2);
    }
}
