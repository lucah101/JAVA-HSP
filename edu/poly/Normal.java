package com.edu.poly;

public class Normal extends Employee{

    public Normal(String name, double pay) {
        super(name, pay);
    }

    public void work(){
        System.out.println("work");
    }

    public double getAnnual(){
        return super.getAnnual();
    }

}

