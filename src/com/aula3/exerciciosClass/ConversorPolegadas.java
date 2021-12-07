package com.aula3.exerciciosClass;

import static com.aula3.exerciciosClass.Leitor.leitorD;

public class ConversorPolegadas {
    public static void main(String[] args) {
        System.out.println("Digite o valor em polegadas:");
        double polegadas = leitorD();

        double centimetros = polegadas * 2.54;

        System.out.printf("A medida %.2fin é igual a: %.2fcm", polegadas, centimetros);
    }
}
