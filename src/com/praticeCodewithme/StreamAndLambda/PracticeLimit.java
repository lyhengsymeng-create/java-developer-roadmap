package com.praticeCodewithme.StreamAndLambda;

import java.util.List;

public class PracticeLimit {
    public  static  void  main(String[] args){
        List<Integer> numbers = List.of(50, 10, 40, 20, 30, 60, 70);
        // Task 1 : Print only the first 3 elements.
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("----Task 1-----");

        // Task 2 Print the 3 smallest numbers.
        numbers.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("----Task 2-----");

//     Task 3 Find numbers greater than 20, but print only the first 2 matching numbers.
        numbers.stream()
                .filter(number -> number >20)
                .limit(2)
                .forEach(System.out::println);
        System.out.println("----Task 3-----");

    }
}
