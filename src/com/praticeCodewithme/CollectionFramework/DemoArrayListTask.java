package com.praticeCodewithme.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayListTask {
    public  static  void  main(String[] args){
        List<String> customers = new ArrayList<>();
        customers.add("Dara");
        customers.add("Sokha");
        customers.add("Davy");
        customers.add("Dara");
        // task 1
        System.out.println("Customer: "+customers);
        // task 2
      String firstCustomer = customers.get(0);
        System.out.println("First Customer: " + firstCustomer);
        // task
        System.out.println(customers.size());
        // task
         boolean exists = customers.contains("Dara");
        System.out.println("Contains Data" + exists);
        //task 5
        customers.remove("Davy");
        //task 6
        System.out.println( "Final Customer "+ customers);
    }

}
