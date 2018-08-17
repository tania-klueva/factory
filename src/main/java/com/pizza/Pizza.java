package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    List<String> ingr;

    {
        ingr = new ArrayList<String>();
    }

    public Pizza(String name, List<String> ingr) {
        this.name = name;
        this.ingr = ingr;
    }

    public Pizza() {
    }

    Pizza add(String ingredient){
        ingr.add(ingredient);
        return this;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingr=" + ingr +
                '}';
    }
}
