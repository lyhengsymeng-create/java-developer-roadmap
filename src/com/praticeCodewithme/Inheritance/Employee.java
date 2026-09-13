package com.praticeCodewithme.Inheritance;

public class Employee {
   private int  id;
   private String name;
   private double salary;
   private  String department;
    // this is celled defual  constructor
   public  Employee(){}
    // this is celled constructor
    public  Employee(int id, String name , double salary , String department){
       this.id = id;
       this.name = name ;
       this.salary = salary;
       this.department = department;

    }
    public void work(){
        System.out.println("Employees is working....");
   }
   public void displayInfo(){
       System.out.println("Employee id :" + id);
       System.out.println("Employee name :" + name);
       System.out.println("Employee salary :" + salary);
       System.out.println("Employee department :" + department);


   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
