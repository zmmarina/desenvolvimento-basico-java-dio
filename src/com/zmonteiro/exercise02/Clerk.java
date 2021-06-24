package com.zmonteiro.exercise02;

public class Clerk extends Employee{
    public Clerk(String name, String email, String number, Double salary) {
        super(name, email, number, salary);
    }

    public Double setSalary(){
        return this.getSalary() * 0.0001;
    }
}
