package com.praticeCodewithme.Inheritance;

public class CustomerServiceOfficer extends  Employee {
    private  int customersHandled;
    public  CustomerServiceOfficer(){}
    public  CustomerServiceOfficer(int id, String name , double salary , String department,int customersHandled){
        super(id, name , salary ,department);
        this.customersHandled = customersHandled;

    }


    public void assistCustomer(){
        System.out.println("Customer Service Officer is assisting a customer.");
    }

}
