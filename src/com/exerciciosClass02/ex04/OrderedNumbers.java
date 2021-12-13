package com.exerciciosClass02.ex04;

import java.util.List;

import static com.exerciciosClass02.ReadNumbers.getAverage;
import static com.exerciciosClass02.ReadNumbers.readNumbers;

public class OrderedNumbers {

    public static void main(String[] args) {
        List<Integer> ordered = readNumbers();

        Integer min = ordered.get(0);
        Integer max = ordered.get(ordered.size() - 1);
        double average = getAverage(ordered);

        System.out.println("Smallest number: " + min);
        System.out.println("Biggest number: " + max);
        System.out.println("Average: " + average);
    }
}

