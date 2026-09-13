package com.praticeCodewithme.Interface;

public class MobileTransferService implements TransferService{
    @Override
    public void transfer(double amount) {
        System.out.println("Mobile transfer $: " + amount );
    }

    @Override
    public void cancelTransfer() {
        System.out.println("Mobile transfer cancelled ! ");

    }

    @Override
    public void checkStatus() {
        System.out.println("Mobile  transfer checked : SUCCESS ! ");

    }

    @Override
    public void pringtReceipt() {
        System.out.println("print mobile transfer receipt");

    }

    @Override
    public void verifyAccount() {
        System.out.println("Mobile transfer verified account ");

    }
}
