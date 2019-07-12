package com.erko;

import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // create an array list
        ArrayList<Coin> piggyBank = new ArrayList<>();

        // deposite coins
        piggyBank.add(new Dollar(10, 2));
        piggyBank.add(new Quarter(2, 0));
        piggyBank.add(new Dime(20, 5));
        piggyBank.add(new Nickel(50, 10));
        piggyBank.add(new Penny(100, 20));

        // print out each coin number
        piggyBank.forEach(coin -> System.out.println(coin.coinValue()));

        // compute and print total deposit
        double totaldeposited = 0.0;
        for (Coin c : piggyBank) {
            totaldeposited = totaldeposited + c.getValue();
        }

        DecimalFormat fp = new DecimalFormat("$###,###.00");
        System.out.println("\nThe piggy bank holds " + fp.format(totaldeposited));

        // compute and print total withdraw
        double totalwithdraw = 0.0;
        for (Coin c : piggyBank) {
            if (c.count < c.withdraw) {
                System.out.println("\nnot enough coin");
            } else{
                 totalwithdraw = totalwithdraw - c.getWithdraw();
            }
           
        }

        DecimalFormat fpw = new DecimalFormat("$###,###.00");
        System.out.println("\namount withdrawn " + fpw.format(totalwithdraw));

        double currentBalance = totaldeposited + totalwithdraw;

        System.out.println("\ncurrent balance " + fpw.format(currentBalance));

    }
}