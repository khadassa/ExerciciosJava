package com.exerciciosClass02.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenNumbers {
    private static final ArrayList<Integer> num = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            num.add(number);
        }
        System.out.println("odd numbers:");
        for (int n : num) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }
        System.out.println("even numbers:");
        for (int n : num) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
