package com.zmonteiro.exercise02;

import java.util.Objects;

public abstract class Employee {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && email.equals(employee.email) && number.equals(employee.number) && salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, number, salary);
    }
}
