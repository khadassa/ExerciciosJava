package com.aula02.exercicioConversor;

public class ConversorDeTemperatura {
    public static void main(String[] args) {

        double c = 18;

        double f = c * 1.8 + 32;

        double k = c + 273.15;

        double re = c * 0.8;

        double ra = c * 1.8 + 491;

        System.out.printf("A temperatura em Fahrenheit é %.2f %n", f );
        System.out.printf("A temperatura em Kelvin é %.2f %n", k );
        System.out.printf("A temperatura em Réaumur é %.2f %n", re );
        System.out.printf("A temperatura em Rankine é %.2f %n", ra );
    }
}
