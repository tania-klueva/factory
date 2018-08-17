package com.factoryTwo;

public class TeddyFactory  {

    TeddyCat teddyCat(){
        return new TeddyCat();
    }

    TeddyBear teddyBear(){
        return new TeddyBear();
    }
}


