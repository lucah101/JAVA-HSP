package com.edu.poly;

public class Manager extends Employee{
    public Manager(String name, double pay, double bonus) {
        super(name, pay);
        this.bonus = bonus;
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void mamage(){
        System.out.println("manage");
    }

    public double getAnnual(){
        return getPay()*14+bonus;
    }
}
