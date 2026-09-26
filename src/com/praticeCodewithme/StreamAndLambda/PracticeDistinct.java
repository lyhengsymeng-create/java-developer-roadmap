package com.praticeCodewithme.StreamAndLambda;
import java.util.Comparator;
import java.util.List;

public class PracticeDistinct {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10,90, 20, 10, 30, 20, 40, 30, 50);

        // Task 1 : Print each number only once.
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("---------------------");
        // Task 2 Remove duplicates, then sort from largest to smallest.
        numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
