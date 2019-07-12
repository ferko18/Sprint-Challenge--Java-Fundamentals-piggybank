package com.erko;

public class Quarter extends Coin
 {
    public Quarter(int count, int withdraw)
    {
        super(count, withdraw);
        value = 0.25;
    }

    @Override
    public String coinValue() {
        return count + " Quarter";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}