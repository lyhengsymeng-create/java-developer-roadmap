package com.praticeCodewithme.Interface;

public class BankTransferService implements TransferService{

    @Override
    public void transfer(double amount) {
        System.out.println("Bank transfer $: " + amount );
    }

    @Override
    public void cancelTransfer() {
        System.out.println("Bank transfer cancelled ! ");

    }

    @Override
    public void checkStatus() {
        System.out.println("Bank transfer checked : SUCCESS ! ");

    }

    @Override
    public void pringtReceipt() {
        System.out.println("print bank transfer receipt");

    }

    @Override
    public void verifyAccount() {
        System.out.println("Bank transfer verified account ");

    }
}
