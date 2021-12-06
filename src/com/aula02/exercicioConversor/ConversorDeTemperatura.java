package com.aula02.exercicioConversor;

import static com.aula02.exercicioConversor.Printer.print;
import static com.aula02.exercicioConversor.Reader.read;

public class ConversorDeTemperatura {
    public static void main(String[] args) {

        System.out.println("Insira abaixo a temperatura em celcius para conversão:");

        double c = read();

        double f = c * 1.8 + 32;
        double k = c + 273.15;
        double re = c * 0.8;
        double ra = c * 1.8 + 491;

        print(f, k, re, ra);

    }
}



