package com.exerciciosClass02.ex05;

import com.exerciciosClass02.ListItens;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PeoplesList {
    public static void main(String[] args) {
        List<String> guest = ListItens.run("guest")
                .stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());


        int index = guest.size() - 1;
        System.out.println("The biggest name length:");
        System.out.println(guest.get(index));


    }
}
