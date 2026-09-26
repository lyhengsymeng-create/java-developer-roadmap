package com.praticeCodewithme.CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListPractice {
    public  static  void  main (String[] args){
        List<String> arraylist = new ArrayList<>();
        List<String> linkedlist = new LinkedList<>();
        arraylist.add("Dara");
        arraylist.add("Sokha");
        arraylist.add("Davy");
        arraylist.add("ly");
        linkedlist.add("Dara");
        linkedlist.add("Sokha");
        linkedlist.add("Davy");
        linkedlist.add("ly");

        System.out.println(arraylist);
        System.out.println(linkedlist);

        System.out.println("ArrayList index 2 " + arraylist.get(2));
        System.out.println("linkedList index 2 " + linkedlist.get(2));

        arraylist.add(0,"v  ichea");
        linkedlist.add(0,"Vichea");

        arraylist.remove(0);
        linkedlist.remove(0);

        System.out.println("Final arraylist :" + arraylist);
        System.out.println("Final linkedList :" + linkedlist);





    }
}
