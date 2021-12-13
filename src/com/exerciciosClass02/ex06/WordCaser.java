package com.exerciciosClass02.ex06;

import com.exerciciosClass02.Reader;

public class WordCaser {
    public static void main(String[] args) {

        System.out.println("Enter a name:");
        String name = Reader.readString();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            if (i % 2 == 0) {
                String str = name.substring(i, i + 1).toUpperCase();
                builder.append(str);
            } else {
                builder.append(name.charAt(i));
            }
        }
        System.out.println(builder);
    }
}
