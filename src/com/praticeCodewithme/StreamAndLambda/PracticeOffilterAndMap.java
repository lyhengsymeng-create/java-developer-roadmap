package com.praticeCodewithme.StreamAndLambda;

import java.util.List;
public  class PracticeOffilterAndMap {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);
        numbers.stream()
                .filter(number -> number > 15)
                .map(number -> number * 10 )
                .forEach(System.out::println);


    }
}