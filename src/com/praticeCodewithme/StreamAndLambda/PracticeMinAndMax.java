package com.praticeCodewithme.StreamAndLambda;

import java.util.List;
import java.util.Optional;

public class PracticeMinAndMax {
     public  static void  main(String[] args){
         List<Integer> numbers = List.of(50, 10, 40, 20, 30);
         //Task 4 — min():Find the smallest number.
         Optional<Integer> min = numbers.stream()
                 .min(Integer::compareTo);
         System.out.println("Min: " + min);
         //Task 4 — min():Find the  biggest  number.
         Optional<Integer> max = numbers.stream()
                 .max(Integer::compareTo);

         System.out.println("Max: " + max);
    }
}
