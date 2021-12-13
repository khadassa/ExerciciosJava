package com.exerciciosClass02;

import java.util.ArrayList;

public class ListItens {
    private static final ArrayList<String> itemsList = new ArrayList<>();

    public static ArrayList<String> run(String name) {
        int total = 5;

        for (int i = 0; i < total; i++) {
            System.out.println("Enter the " + name + ":");
            String item = Reader.readString();
            itemsList.add(item);
        }
        return itemsList;
    }
}
