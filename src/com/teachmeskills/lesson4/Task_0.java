package com.teachmeskills.lesson4;

import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки: ");

        Scanner scanner = new Scanner(System.in);
        int vvodimoe = scanner.nextInt();

        int[] array = new int[]{1,2,3,4};

        for (int i : array) {
            if (vvodimoe == i) {
                System.out.println("Заданное число входит в массив.");
            }else {
                System.out.println("Заданное число не входит в массив.");
            }
        }
    }
}
