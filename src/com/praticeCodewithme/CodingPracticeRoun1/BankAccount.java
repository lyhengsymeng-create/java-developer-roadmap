package com.praticeCodewithme.CodingPracticeRoun1;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal balance;
    public BankAccount (String accountNumber , BigDecimal balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit( BigDecimal amount){
        if(amount.compareTo(BigDecimal.ZERO)<=0 ){
           throw  new IllegalArgumentException("Deposit amount must be greater than 0");
        }
        balance = balance.add(amount);
    }
    public  void  withdraw(BigDecimal amount){
        if(amount.compareTo(BigDecimal.ZERO)<= 0 ){
            throw  new IllegalArgumentException("Withdraw amount must be greater than 0");
        }
        if (amount.compareTo(balance)> 0 ){
            throw new IllegalArgumentException("Withdraw amount cannot exceed Balance");

        }
        balance = balance.subtract(amount);

    }
    public BigDecimal getBalance(){
        return balance;
    }
}
