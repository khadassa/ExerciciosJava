package com.exerciciosClass02.ex07;

import com.exerciciosClass02.ReadNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgeName {

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        List<String> names = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int maxLen = 5;
        for (int i = 0; i < maxLen; i++) {
            System.out.println("Enter a name and an age:");
            String name = scanner.next();
            int number = scanner.nextInt();
            names.add(name);
            ages.add(number);
        }
        double average = ReadNumbers.getAverage(ages);

        List<Integer> integers = ReadNumbers.sortList(ages);

        Integer min = integers.get(0);
        Integer max = integers.get(ages.size() - 1);

        int minIndex = ages.lastIndexOf(min);
        int maxIndex = ages.lastIndexOf(max);

        System.out.println("Youngest: " + names.get(minIndex));
        System.out.println("Oldest: " + names.get(maxIndex));
        System.out.println("Age Average:" + average);

    }
}
