package com.praticeCodewithme.StreamAndLambda;

import java.util.List;

public class PracticeAnyMatchAndAllMatch {
    public static void main(String[] args){
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        // Task 6 — anyMatch(): Check whether at least one number is greater than 40.
        boolean anyMatch = numbers.stream()
                .anyMatch(number -> number > 40 );
        System.out.println(anyMatch);
        System.out.println("---task6---");

        // Task 6 — anyMatch(): Check whether at least one number is greater than 100.
        boolean anyMatch1 = numbers.stream()
                .anyMatch(number -> number > 100 );
        System.out.println(anyMatch1);
        System.out.println("---task7---");

        // Task 8 — allMatch(): Check whether all numbers are greater than 0.
        boolean allMatch = numbers.stream()
                .allMatch(number -> number > 0 );
        System.out.println(allMatch);
        System.out.println("---task8---");


        // Task 8 — allMatch(): Check whether all numbers are greater than 0.
        boolean allMatch1 = numbers.stream()
                .allMatch(number -> number > 20 );
        System.out.println(allMatch1);
        System.out.println("---task8---");


    }
}
