package com.edu.poly;

public class Employee {
    private String name;
    private double pay;

    public Employee(String name, double pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getAnnual(){
        return pay*12 ;
    }
}
