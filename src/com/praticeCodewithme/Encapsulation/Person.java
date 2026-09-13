package com.praticeCodewithme.Encapsulation;

public class Person {
   private int id;
   private String lastName;
   private String firstName;
   private int age;
   private String phone;
   private String email;
   private String address;
   private String city;
   private String state ;
   private String zip;
   public  Person(){}
    public  Person (int id , String lastName , String firstName , int age,
                    String phone, String email, String address , String city ,
                    String state , String zip){
          this.id = id;
          this.lastName = lastName;
          this.firstName = firstName;
          this.age = age;
          this.phone = phone;
          this.email = email;
          this.address = address;
          this.city = city;
          this.state = state;
          this.zip = zip;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {

    }
    @Override
    public  String toString(){
          return "Person{" +"id"+ id+
                  ", lastName='" + lastName +
                  '\'' + ", firstName='" + firstName +
                  '\'' + ", age=" + age +
                  ", phone='" + phone + '\'' +
                  ", email='" + email + '\'' +
                  ", address='" + address + '\'' +
                  ", city='" + city + '\'' +
                  ", state='" + state + '\'' +
                  ", zip='" + zip + '\'' + '}'; }
    }

