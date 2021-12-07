package com.aula3.exerciciosClass;

import static com.aula3.exerciciosClass.Leitor.leitorInt;

public class Calculadora {
    public static void main(String[] args) {

        System.out.println("digite dois números:");

        int num1 = leitorInt();
        int num2 = leitorInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("O resultado da soma é: " + sum);
        System.out.println("O resultado da subtração é: " + sub);
        System.out.println("O resultado da multiplicação é: " + mult);
        System.out.println("O resultado da divisão é: " + div);
    }
}
