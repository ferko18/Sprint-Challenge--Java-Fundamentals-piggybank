package com.erko;
public class Dollar extends Coin
{
    public Dollar(int count)
    {
        super(count);
        value = 1.00;
    }

    @Override
    public String coinValue()
    {
        return "Number of Dollars - " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}