package com.erko;

public class Nickel extends Coin {
    
    public Nickel(int count)
     {
        super(count);
        value = 0.05;
    }

    @Override
    public String coinValue() {
        return " Number of Nickels -" + count;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}