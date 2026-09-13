package com.praticeCodewithme.Inheritance;

public class Accountant extends Employee{
    private  String certification ;

    public  Accountant(){}
    public  Accountant(int id, String name , double salary , String department,String certification){
        super(id, name , salary ,department);
        this.certification = certification;

    }


    public  void prepareReport(){
        System.out.print("Accountant is preparing a financial report.  " );

    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}
