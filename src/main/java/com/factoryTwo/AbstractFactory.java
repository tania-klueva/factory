package com.factoryTwo;

public class AbstractFactory {
    WoodenFactory wood(){
        return new WoodenFactory();
    }

    TeddyFactory teddy(){
        return new TeddyFactory();
    }
}
