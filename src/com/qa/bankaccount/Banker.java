package com.qa.bankaccount;

public class Banker extends BankAccount {

    public double depositFunds(double deposit) {
        setBalance(balance += deposit);
        System.out.println("Deposit Accepted");
        return this.balance;
    }

    public static void staticMethod() {
        System.out.println("This is a static method");
    }

}
