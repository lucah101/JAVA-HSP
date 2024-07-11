package com.edu.computer;

public class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, String memory, String harddisk, String color) {
        super(cpu, memory, harddisk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print(){
        System.out.println(getDetails() + "\t" + color);
    }
}
