package com.erko;
public class Dollar extends Coin
{
    public Dollar(int count, int withdraw)
    {
        super(count, withdraw);
        value = 1.00;
    }

    @Override
    public String coinValue()
    {
        return  "$" + count ;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}