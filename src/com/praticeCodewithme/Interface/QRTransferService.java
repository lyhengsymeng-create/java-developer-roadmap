package com.praticeCodewithme.Interface;

public class QRTransferService implements TransferService{
    @Override
    public void transfer(double amount) {
        System.out.println("QR transfer $: " + amount );
    }

    @Override
    public void cancelTransfer() {
        System.out.println("QR transfer cancelled ! ");

    }

    @Override
    public void checkStatus() {
        System.out.println("QR transfer checked : SUCCESS ! ");

    }

    @Override
    public void pringtReceipt() {
        System.out.println("print bank transfer receipt");

    }

    @Override
    public void verifyAccount() {
        System.out.println("QR transfer verify account ");

    }
}
