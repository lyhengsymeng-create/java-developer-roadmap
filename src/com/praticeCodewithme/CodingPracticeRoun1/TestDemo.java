package com.praticeCodewithme.CodingPracticeRoun1;

import java.math.BigDecimal;

public class TestDemo {
    public  static  void  main(String[] args){
        BankAccount account = new BankAccount("lymeng", BigDecimal.ZERO);
        account.deposit(new BigDecimal("1000"));
        account.withdraw(new BigDecimal("-0"));
        System.out.println( "balance: " + account.getBalance());
    }
}
