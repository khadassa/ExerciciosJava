package com.aula3.exerciciosClass;

import static com.aula3.exerciciosClass.Leitor.leitorD;

public class ConversorFahrenheit {
    public static void main(String[] args) {
        System.out.println("Insira abaixo a temperatura para conversão:");

        double celsius = leitorD();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("A temperatura em fahrenheit é: %.2f", fahrenheit);

    }
}
