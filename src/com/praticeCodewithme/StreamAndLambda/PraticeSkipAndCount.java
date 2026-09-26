package com.praticeCodewithme.StreamAndLambda;

import java.util.List;

public class PraticeSkipAndCount {
    public static  void main(String[] args){
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60, 70);
        // task 1 : Skip the first 3 numbers and print the rest.
        numbers.stream()
                .skip(3)
                .forEach(System.out::println);
        System.out.println("-----Task 1-----");

        // Task 2 : Skip the first 2 numbers, then take the next 3
        // Skip and limit
        numbers.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-----Task 2-----");

        // Task 3 — count() : Count how many numbers are greater than 30.
        long count = numbers.stream()
                .filter(number -> number > 30)
                .count( );
        System.out.println(count);


    }
}
