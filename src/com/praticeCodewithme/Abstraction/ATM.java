package com.praticeCodewithme.Abstraction;

public class ATM extends  BankingOnline{
    @Override
    public void insertCard() {
        System.out.println("Card inserted successfully !");
    }

    @Override
    public void enterPin() {
        System.out.println( "please enter your own pin :  ");
    }

    @Override
    public void chooseWithdrawal() {
        System.out.println("Please choose withdrawal : ");

    }

    @Override
    public void enterAmount() {
        System.out.println("please enter your amount : ");

    }
}
