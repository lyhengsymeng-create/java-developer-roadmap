package com.praticeCodewithme.Abstraction;

public class Mian {
    public  static  void main (String[] args ){
        BankingOnline banking = new ATM();
        banking.insertCard();
        banking.enterPin();
        banking.chooseWithdrawal();
        banking.enterAmount();
    }
}
