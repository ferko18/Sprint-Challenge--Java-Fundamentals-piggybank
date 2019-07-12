package com.erko;

public abstract class Coin {

    int count = 1;
    double value;
//constructor
    public Coin(int count) {
        this.count = count;

    }
//toal value public method
    public double getValue() {
        return value * count;
    }

//abstract method as a blueprint to return the count of each coin type
    public abstract String coinValue();

//override default tostring 
    @Override
    public String toString() {
        return "Coin{" + "count = " + count + ", value = " + value + '\n';

    }
}
