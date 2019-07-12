package com.erko;

public abstract class Coin {

//fields
    int count = 1;
    double value;
    int withdraw = -1;

//constructor
    public Coin(int count, int withdraw) {
        this.count = count;
        this.withdraw =withdraw;

    }
//toal value public method
    public double getValue() {
        return value * count;
    }

//get withdrawn amoount 
public double getWithdraw (){
    return withdraw * value;
}

//abstract method as a blueprint to return the count of each coin type
    public abstract String coinValue();

//override default tostring 
    @Override
    public String toString() {
        return "Coin{" + "count = " + count + ", value = " + value + '\n';

    }
}
