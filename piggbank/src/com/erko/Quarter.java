package com.erko;

public class Quarter extends Coin
 {
    public Quarter(int count)
     {
        super(count);
        value = 0.25;
    }

    @Override
    public String coinValue() {
        return " Number of Quarters -" + count;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}