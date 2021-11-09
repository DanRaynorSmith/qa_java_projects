package com.qa.bankaccount;

public class Runner {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Banker account2 = new Banker();

        account.setAccountNumber(1005);
        account.setBalance(1000);
        account.setCustomerName("Dan Smith");
        account.setEmail("ds@email.com");
        account.setPhoneNumber("0123456789");

        System.out.println(account.getCustomerName());
        System.out.println(account.getPhoneNumber());
        System.out.println(account.getEmail());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        Banker.staticMethod();
        double balance = new Banker().depositFunds(1000);
        System.out.println(balance);


    }
}
