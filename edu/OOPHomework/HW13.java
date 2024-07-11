package com.edu.OOPHomework;

public class HW13 {
    public static void main(String[] args) {
        Student13[] s13 = new Student13[2];
        Teacher13[] t13 = new Teacher13[2];
        s13[0] = new Student13("s1", '男', 12, 322);
        s13[1] = new Student13("s2", '女', 10, 2);
        t13[0] = new Teacher13("t1", 'f', 42, 23);
        t13[1] = new Teacher13("t2", 'f', 32, 13);

        s13[0].print13(s13[0]);
        System.out.println("--------------------");
        t13[1].print13(t13[1]);

    }


}


class Person13{
    private String name;
    private char sex;
    private int age;

    public Person13(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play(){
        return name + "爱玩" ;
    }

    public void p13(Person13 p){
        if (p instanceof Student13){
            ((Student13) p).study();
        }else if (p instanceof Teacher13){
            ((Teacher13) p).work();
        }
    }

    public void print13(Person13 p){
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + sex);

    }
}


class Student13 extends Person13{

    private int stu_id;

    public Student13(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public void print13(Person13 p) {
        super.print13(p);
        System.out.println("学号：" + stu_id);
        ((Student13) p).study();
        System.out.println(((Student13) p).play());

    }
}


class Teacher13 extends Person13{

    private int work_age;

    public Teacher13(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void work(){
        System.out.println("认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    @Override
    public void print13(Person13 p) {
        super.print13(p);
        System.out.println("工龄：" + work_age);
        ((Teacher13) p).work();
        System.out.println(((Teacher13) p).play());

    }
}




























