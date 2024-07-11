package com.edu.computer;

public class PC extends Computer{
    private String brand;

    public PC(String cpu, String memory, String harddisk, String brand) {
        super(cpu, memory, harddisk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void print(){
        System.out.println(getDetails() + "\t" + brand);
    }
}
