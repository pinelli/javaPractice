package com.company;

/**
 * Created by User on 23.08.2015.
 */
public class Account {
   private int balance;

    public Account(int initBalance){
        this.balance = initBalance;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public int getBalance(){
        return this.balance;
    }
}
