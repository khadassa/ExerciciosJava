package com.exerciciosClass02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadNumbers {
    private static final ArrayList<Integer> numbers = new ArrayList<>();

    public static List<Integer> readNumbers() {
        Scanner scanner = new Scanner(System.in);
        int maxLen = 5;
        for (int i = 0; i < maxLen; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        return sortList(numbers);
    }

    public static List<Integer> sortList(List<Integer> integers) {
        return integers.stream().sorted().collect(Collectors.toList());
    }

    public static double getAverage(List<Integer> integers) {
        double average = 0.0;
        for (int number : integers) {
            average += number;
        }
        average /= integers.size();
        return average;
    }
}
