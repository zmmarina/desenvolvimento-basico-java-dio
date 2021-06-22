package com.zmonteiro.exercise01;

public class Car {
    public String brand;
    public String model;
    public Integer year;
    public String variant;

    public Car(String brand, String model, Integer year, String variant) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.variant = variant;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }
}
