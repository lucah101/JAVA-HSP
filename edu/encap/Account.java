package com.edu.encap;

public class Account {

    private String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("名字长度不正确，自动修改为默认名称：abc");
            this.name = "abc";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20.0){
            this.balance = balance;
        }else {
            System.out.println("余额数量不正确，自动修改为：20");
            this.balance = 20.0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码必须为6位，自动修改为：123456");
            this.password = "123456";
        }

    }

    public void show(Account account){
        System.out.println(account.name + "\t" + account.balance + "\t" + account.password);
    }
}
