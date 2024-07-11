package com.edu.OOPHomework;

public class HW04 {

    public static void main(String[] args) {
        Employee w = new Worker(2000, "w1");
        Employee p = new Peasant(2000, "p1");

        w.print();
        p.print();

        Teacher1 t = new Teacher1(2000, "t1");
        t.setDaypay(30);
        t.setDays(30);
        t.print();

        Scientist s = new Scientist(2000, "s1", 20000);
        s.print();

    }

}


class Employee {
     private double basepay;
     private String name;
     private int month = 12;

     public void print(){
         System.out.println(name + "全年工资 = " + (basepay * month));
    }

    public Employee(double basepay, String name) {
        this.basepay = basepay;
        this.name = name;
    }

    public double getBasepay() {
        return basepay;
    }

    public void setBasepay(double basepay) {
        this.basepay = basepay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}

class Worker extends Employee{

    public Worker(double basepay, String name) {
        super(basepay, name);
    }

    @Override
    public void print() {
        System.out.println( getName() + "工人全年工资 = " + ( getBasepay() * getMonth() ));
    }
}

class  Peasant extends Employee {

    public Peasant(double basepay, String name) {
        super(basepay, name);
    }

    @Override
    public void print() {
        System.out.println( getName() + "农民全年工资 = " + ( getBasepay() * getMonth() ));
    }
}

class Teacher1 extends Employee{
    private double daypay;
    private int days;

    @Override
    public void print() {
        System.out.println( getName() + "老师全年工资 = " + ( getBasepay() * getMonth() + daypay * days) );
    }

    public Teacher1(double basepay, String name) {
        super(basepay, name);
    }

    public double getDaypay() {
        return daypay;
    }

    public void setDaypay(double daypay) {
        this.daypay = daypay;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}

class Scientist extends Employee {
    private double yearpay;

    @Override
    public void print() {
        System.out.println( getName() + "科学家全年工资 = " + ( getBasepay() * getMonth() + yearpay ) );
    }

    public Scientist(double basepay, String name, double yearpay) {
        super(basepay, name);
        this.yearpay = yearpay;
    }

    public double getYearpay() {
        return yearpay;
    }

    public void setYearpay(double yearpay) {
        this.yearpay = yearpay;
    }
}
