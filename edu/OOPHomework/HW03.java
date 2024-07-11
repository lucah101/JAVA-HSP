package com.edu.OOPHomework;

public class HW03 {
    public static void main(String[] args) {
        Employee1 m = new Manager("1", 200, 30, 1.2);
        Employee1 n = new Norm("2", 200, 30, 1.2);
        Manager m1 = (Manager) m;
        m1.setBonus(1000.0);
       m1.print();
       n.print();

    }

}

class Employee1{
    private String name;
    private double pay;
    private int days;
    private double level;
    private double sum;

    public void print(){
        System.out.println( name + pay + days + level);
        System.out.println( "sumpay = " + sum  );
    }

    public Employee1(String name, double pay, int days, double level) {
        this.name = name;
        this.pay = pay;
        this.days = days;
        this.level = level;
        sum = pay * days * level;
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", pay=" + pay +
                ", days=" + days +
                ", level=" + level +
                '}';
    }


}

class Manager extends Employee1{

    double bonus;
    double sum1;

    public Manager(String name, double pay, int days, double level) {
        super(name, pay, days, level);
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
        sum1 = bonus + getDays() * getPay() * getLevel();
    }

    public double getSum1() {
        return sum1;
    }

    public void setSum1(double sum1) {
        this.sum1 = sum1;
    }

    @Override
    public void print() {
        System.out.println( getName() + getPay() + getDays() + getLevel());
        System.out.println( "sumpay = " + sum1 );
    }
}

class Norm extends Employee1{

    public Norm(String name, double pay, int days, double level) {
        super(name, pay, days, level);
    }

    @Override
    public void print() {
        super.print();
    }
}