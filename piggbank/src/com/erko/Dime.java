package com.erko;
public class Dime extends Coin
{
    public Dime(int count)
    {
        super(count);
        value = 0.10;
    }

    @Override
    public String coinValue()
    {
        return "Number of Dimes - " + count;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
