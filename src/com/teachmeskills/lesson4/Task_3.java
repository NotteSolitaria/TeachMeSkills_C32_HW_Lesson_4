package com.teachmeskills.lesson4;

public class Task_3 {
    public static void main(String[] args) {
        double[] array1 = new double[5];
        double[] array2 = new double[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = Math.random();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Math.random();
        }

        System.out.println("Значения 1 массива: " + array1[0] + ", " + array1[1] + ", " + array1[2] + ", " + array1[3] + ", " + array1[4] + ".");
        System.out.println("Значения 2 массива: " + array2[0] + ", " + array2[1] + ", " + array2[2] + ", " + array2[3] + ", " + array2[4] + ".");

        System.out.println("Среднее арифметическое 1 массива: ");

        double sum1 = 0;

        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i];

            if (i == (array1.length - 1)){
                System.out.println(sum1 / 2);
            }
        }

        System.out.println("Среднее арифметическое 2 массива: ");

        double sum2 = 0;

        for (int i = 0; i < array2.length; i++) {
            sum2 = sum2 + array2[i];

            if (i == (array2.length - 1)){
                System.out.println(sum2 / 2);
            }
        }

        if (sum1 > sum2){
            System.out.println("Среднее арифметическое 1 массива больше среднего арифметического 2 массива.");
        } else if (sum2 > sum1) {
            System.out.println("Среднее арифметическое 2 массива больше среднего арифметического 1 массива.");
        } else {
            System.out.println("Средние арифметические 2 массивов равны.");
        }
    }
}
