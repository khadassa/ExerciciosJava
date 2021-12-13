package com.exerciciosClass02.ex01;

import com.exerciciosClass02.ListItens;

import java.util.ArrayList;

public class Fruits {

    public static void main(String[] args) {
        ArrayList<String> shoppingCart = ListItens.run("fruit");
        System.out.println(shoppingCart);
    }
}

