package com.edu.OOPHomework;

public class HW02 {
    public static void main(String[] args) {
        Teacher p1 = new Professor("n1", 20, "p1", 3000, 1.3);
        Teacher p2 = new PrePro("n2", 23, "p2", 5000, 1.2);
        Teacher p3 = new NormTea("n3", 25, "p3", 8000, 1.1);

        p1.introduce();
        p2.introduce();
        p3.introduce();

    }

}

class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    private double level;

    public Teacher(String name, int age, String post, double salary, double level) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.level = level;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", level=" + level +
                '}';
    }

    public void introduce() {
        System.out.println(this.name + this.age + this.post + this.salary + this.level);
    }
}

class Professor extends Teacher{

    public Professor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}

class PrePro extends Teacher {

    public PrePro(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}

class NormTea extends Teacher{
    public NormTea(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }

    public void introduce() {
        super.introduce();
    }

}