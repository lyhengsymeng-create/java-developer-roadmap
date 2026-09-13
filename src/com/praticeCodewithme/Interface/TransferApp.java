package com.praticeCodewithme.Interface;

import com.praticeCodewithme.Abstraction.BankingOnline;

public class TransferApp {
    public static void  main(String[] args){
        // how to a one type
        BankTransferService bank = new BankTransferService();
        bank.transfer(200);
        bank.cancelTransfer();
        bank.checkStatus();
        bank.pringtReceipt();
        bank.verifyAccount();
        System.out.println(" your successfully transfer");
        MobileTransferService mobile = new MobileTransferService();
        mobile.transfer(900);
        mobile.cancelTransfer();
        mobile.checkStatus();
        mobile.pringtReceipt();
        mobile.verifyAccount();
        // please your write yourself  until QR class?
        // two types of polymorphism
        TransferService service; // variable is an interface reference

        service = new BankTransferService();
        service.transfer(200);

        service = new MobileTransferService();
        service.transfer(300);

        service = new QRTransferService();
        service.transfer(400);

    }
}
