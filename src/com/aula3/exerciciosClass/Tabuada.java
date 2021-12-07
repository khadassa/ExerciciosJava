package com.aula3.exerciciosClass;

import static com.aula3.exerciciosClass.Leitor.leitorInt;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Digite o numero desejado para o calculo da tabuada:");
        int num = leitorInt();
        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = multiplicador * num;
            System.out.printf("%d x %d = %d %n", multiplicador, num, resultado);
            multiplicador++;

        }


    }
}
