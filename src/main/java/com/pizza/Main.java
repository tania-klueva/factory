package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        List<String> margarita = new ArrayList<String>();
        margarita.add("tomato");
        margarita.add("cheese");


        pizza.add("cherry").add("milk").add("шешось");
        System.out.println(pizza);

        Pizza margarura = new Pizza("margarura", margarita);
        System.out.println(margarura);
        margarura.add("ret").add("tyeru");
        System.out.println(margarura);
    }
}
