package com.erko;

public class Nickel extends Coin {

    public Nickel(int count, int withdraw)
    {
        super(count, withdraw);
        value = 0.05;
    }

    @Override
    public String coinValue() {
        return   count + " Nickel";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}