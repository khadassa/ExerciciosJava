package com.exerciciosClass02.ex02;

import com.exerciciosClass02.Reader;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println("Enter the name:");
        String name = Reader.readString();

        char[] nameCharacters = name.toCharArray();
        StringBuilder nameReversed = new StringBuilder();

        for (int i = nameCharacters.length - 1; i >= 0; i--) {
            nameReversed.append(nameCharacters[i]);
        }

        System.out.println(nameReversed);
    }
}
