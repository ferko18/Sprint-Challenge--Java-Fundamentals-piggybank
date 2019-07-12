package com.erko;
public class Dime extends Coin
{
    public Dime(int count, int withdraw)
    {
        super(count, withdraw);
        value = 0.10;
    }

    @Override
    public String coinValue()
    {
        return  count + " Dime";
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
