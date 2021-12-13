package com.exerciciosClass02.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImcCalculator {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> names = new ArrayList<>();
    private static final List<Double> imcs = new ArrayList<>();

    private static double calculate(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    private static boolean isIdeal(double imc) {
        return imc >= 18.5 && imc < 25;
    }

    public static void main(String[] args) {
        int maxLen = 5;
        for (int i = 0; i < maxLen; i++) {
            System.out.println("Enter name, weight and height:");

            String name = scanner.next();
            names.add(name);

            double weight = scanner.nextDouble();
            double height = scanner.nextDouble();
            Double imc = calculate(weight, height);
            imcs.add(imc);
        }

        for (int i = 0; i < imcs.size(); i++) {
            Double imc = imcs.get(i);
            if (!isIdeal(imc)) {
                String name = names.get(i);
                System.out.println(name + " está fora do peso ideal");
            }
        }

    }
}
