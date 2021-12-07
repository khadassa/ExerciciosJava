package com.aula3.exerciciosClass;

import static com.aula3.exerciciosClass.Leitor.leitorD;

public class Cotacao {
    public static void main(String[] args) {
        System.out.println("Digite a cotação do Dolar de hoje:");
        double dolar = leitorD();

        System.out.println("Digite o valor em Reais:");
        double real = leitorD();

        double conversao = real / dolar;

        System.out.printf("O valor em dólar da quantia R$%.2f é: $%.2f", real, conversao);

    }
}
