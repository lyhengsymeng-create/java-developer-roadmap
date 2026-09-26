package com.praticeCodewithme.CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class DemoSetTask {
    public  static  void  main(String[] args) {
        Set<String> transactionTypes = new HashSet<>();
        transactionTypes.add("DEPOSIT");
        transactionTypes.add("WITHDRAW");
        transactionTypes.add("TRANSFER");
        transactionTypes.add("DEPOSIT");
        transactionTypes.add("TRANSFER");

        System.out.println("Transaction types: " + transactionTypes);

        System.out.println("Size: " + transactionTypes.size());

        System.out.println("Contains DEPOSIT: " + transactionTypes.contains("DEPOSIT"));
    }
}
