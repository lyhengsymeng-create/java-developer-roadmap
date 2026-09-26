package com.praticeCodewithme.StreamAndLambda;


import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Main {
    public  static  void  main(String[] args ){
        List<Employee> employees =  List.of(
                new Employee( "Dara","IT" , 1200),
                new Employee( "Sokha","HR" , 900),
                new Employee( "Davy","IT" , 1700),
                new Employee( "Ly","CS" , 2200)
              );
        System.out.println("Task A: Salary > 1000 ");
        employees.stream()
                .filter(employee -> employee.getSalary() > 1000)
                .forEach(System.out::println);

        System.out.println("Task B: Find only employees from \"IT\" ");
        employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .forEach(System.out::println);

        System.out.println("Task C:Get only the employee names");
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("Task D: Find IT employees whose salary is greater than 1000 ");
        employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .filter(employee -> employee.getSalary() > 1000)
                .forEach(System.out::println);

        System.out.println("Task E:  Get the names of those employees.  ");
        employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .filter(employee -> employee.getSalary() > 1000)
                .map(Employee::getName)
                .toList();
        employees.forEach(System.out::println);


    }


}
