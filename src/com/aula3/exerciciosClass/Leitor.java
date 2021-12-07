package com.aula3.exerciciosClass;

import java.util.Scanner;

public class Leitor {
    public static int leitorInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double leitorD() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}

