package com.edu.Object_s;

public class equalsT {
    public static void main(String[] args) {
        Person p1 = new Person("Jake", 20, '女');
        Person p2 = new Person("Jake", 20, '女');
        System.out.println(p1.equals(p2));
    }
}

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            Person p =(Person) obj;
            return this.name.equals(p.name) && this.gender == p.getGender() &&
                        this.age == p.getAge();
        }
        return false;
    }
}

