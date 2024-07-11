package com.edu.OOPHomework;

public class HW01 {
    public static void main(String[] args) {
        Person[] p = new Person[5];
        p[0] = new Person("1", 20, "w1");
        p[1] = new Person("2", 40, "w2");
        p[2] = new Person("3", 30, "w3");
        p[3] = new Person("3", 17, "w3");
        p[4] = new Person("3", 39, "w3");

        for (int i = 0; i < p.length ; i++) {
            System.out.println(p[i]);
        }

        //冒泡法排序
        Person temp = null;//临时变量
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() < p[j+1].getAge()) {
                    temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
                }
            }
        }

        System.out.println("________________________");
        for (int i = 0; i < p.length ; i++) {
            System.out.println(p[i]);
        }

    }

}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
