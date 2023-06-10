package com.example.calculator.model;

public class Customer {
    private int id;
    private String name;
    private boolean gender;
    private String customerType;
    private String color2;
    private String color;
    private boolean status;

    public Customer(int id) {
        this.id = id;
    }

    public Customer(int id, String name, boolean gender, String customerType) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.customerType = customerType;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", customerType='" + customerType + '\'' +
                ", color2='" + color2 + '\'' +
                ", color='" + color + '\'' +
                ", status=" + status +
                '}';
    }
}
