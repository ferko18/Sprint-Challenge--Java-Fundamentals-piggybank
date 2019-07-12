package com.erko;

public class Penny extends Coin
 {
    public Penny(int count, int withdraw)
    {
        super(count, withdraw);
        value = 0.01;
    }

    @Override
    public String coinValue() {
        return  count + " penny";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}