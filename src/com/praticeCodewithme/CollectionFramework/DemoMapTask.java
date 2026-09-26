package com.praticeCodewithme.CollectionFramework;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class DemoMapTask {
    public static void  main(String[] args) {
        Map<String, BigDecimal> balance = new HashMap<>();
        balance.put("ACOO1",new BigDecimal(1000));
        balance.put("AC002", new BigDecimal(2500));
        balance.put("AC003", new BigDecimal(500));

        System.out.println("balance:  " +balance);
        BigDecimal balance1 =balance.get("AC002");
        System.out.println("AC002: "+ balance1);
    }
}
