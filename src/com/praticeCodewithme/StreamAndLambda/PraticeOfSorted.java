package com.praticeCodewithme.StreamAndLambda;

import java.util.Comparator;
import java.util.List;

public class PraticeOfSorted {
    public  static  void main(String[] args){
        List<Integer> numbers = List.of(50 , 10 , 40 , 20 , 30);
        // task 1 use stream to print the numbers from smallest to larges
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        // task 2 Use stream to print the numbers from larges to smallest
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
