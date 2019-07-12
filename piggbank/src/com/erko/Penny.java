package com.erko;

public class Penny extends Coin
 {
    public Penny(int count)
     {
        super(count);
        value = 0.01;
    }

    @Override
    public String coinValue() {
        return " Number of Pennies -" + count;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}