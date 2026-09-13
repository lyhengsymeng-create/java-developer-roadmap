package com.praticeCodewithme.Encapsulation;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        String c ;
        System.out.print("Enter your ID:");
        person.setId(input.nextInt());
        c = input.nextLine();
        System.out.print("Enter your FistName:");
        person.setFirstName(input.nextLine());
        System.out.print("Enter your LastName:");
        person.setLastName(input.nextLine());
        System.out.print("Enter your Age:");
        person.setAge(input.nextInt());
        c = input.nextLine();
        System.out.print("Enter your PhoneNumbers:");
        person.setPhone(input.nextLine());
        System.out.print("Enter your Email:");
        person.setEmail(input.nextLine());
        System.out.print("Enter your Address:");
        person.setAddress(input.nextLine());
        System.out.print("Enter your City:");
        person.setCity(input.nextLine());
        System.out.print("Enter your State:");
        person.setState(input.nextLine());
        System.out.print("Enter your ZipCode:");
        person.setZip(input.nextLine());
        System.out.print(person.toString());







    }
}