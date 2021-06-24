package com.zmonteiro.exercise02;

public class Employee {
    private String name;
    private String email;
    private String number;
    private Double salary;

    public Employee(String name, String email, String number, Double salary) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getSalary(){
        return salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }
}
