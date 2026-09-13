package com.praticeCodewithme.Polymorphism;

public class Main {
    public  static  void  main (String[] args){

        Vehicle vehicle;
         vehicle = new car();
        vehicle.move();
        vehicle = new Bicycle();
        vehicle.move();
        vehicle = new motor();
        vehicle.move();


    }
}
