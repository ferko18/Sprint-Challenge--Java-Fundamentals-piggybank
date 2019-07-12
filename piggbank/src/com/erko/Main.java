package com.erko;
import java.util.*;

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
     piggyBank.forEach(piggy -> System.out.println(piggy.coinValue()));

 }
}