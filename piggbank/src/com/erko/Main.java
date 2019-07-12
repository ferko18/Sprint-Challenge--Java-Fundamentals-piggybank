package com.erko;
import java.util.*;
import java.text.DecimalFormat;

public class Main {
 public static void main(String [] args)
 {
     //create an array list 
     ArrayList<Coin> piggyBank = new ArrayList<>();

     //deposite coins 
     piggyBank.add(new Dollar(10));
     piggyBank.add(new Quarter(2));
     piggyBank.add(new Dime(20));
     piggyBank.add(new Nickel(50));
     piggyBank.add(new Penny(100));

     //print out each coin number 
     piggyBank.forEach(coin -> System.out.println(coin.coinValue()));

     //compute and print total deposit 
     double total = 0.0;
     for (Coin c:piggyBank)
     {
         total = total + c.getValue();
     }

     DecimalFormat fp = new DecimalFormat("$###,###.00");
     System.out.println("\nThe piggy bank holds " + fp.format(total));

 }
}