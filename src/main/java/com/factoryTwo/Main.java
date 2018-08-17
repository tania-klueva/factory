package com.factoryTwo;

public class Main {
    public static void main(String[] args) {
        TeddyFactory teddy = new AbstractFactory().teddy();
        teddy.teddyBear().speak();
        WoodenFactory wood = new AbstractFactory().wood();
        wood.woodenCat().speak();
    }
}
