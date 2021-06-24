package com.zmonteiro.exercise02;

public class Manager extends Employee{

    public Manager(String name, String email, String number, Double salary) {
        super(name, email, number, salary);
    }

    public Double setSalary(){
        return this.getSalary() * 0.001;
    }
}
