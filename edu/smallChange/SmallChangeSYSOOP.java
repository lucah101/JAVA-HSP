package com.edu.smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSYSOOP {
    String detail = "-----------------零钱通明细------------------";
    double moneyChange=0;
    String time;
    double balance=0;
    String[] consumpType = {"0吃", "1喝", "2玩", "3乐"};
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Boolean flag = true;
    Scanner s = new Scanner(System.in);

    public void mainMenu() {
        do {
            System.out.println("\n-----------------零钱通菜单------------------");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退出");
            System.out.println("请选择(1-4)：");
            String i = s.next();

            switch (i){
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.money();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("请输入正确的数字");
            }

        }while (flag);


    }

    public void detail() {
        System.out.println(detail);
    }

    public  void money() {
        System.out.println("收益入账");
        Boolean moneyEnd = true;
        do{
            System.out.println("请输入入账金额，按0结束输入：");
            moneyChange = s.nextDouble();
            while (moneyChange < 0){
                System.out.println("请输入正确的数字，按0结束输入：");
                moneyChange = s.nextDouble();
            };
            if (moneyChange == 0) {
                moneyEnd = false;
                return;
            }
            balance += moneyChange;
            date = new Date();
            detail += "\n收益入账\t+" + moneyChange + "\t" + sdf.format(date) + "\t余额：" + balance ;
            System.out.println("收益入账\t+" + moneyChange + "\t" + sdf.format(date) + "\t余额：" + balance );
        }while (moneyEnd);

    }

    public void pay() {
        Boolean moneyEnd = true;
        do{
            int t = 0;
            do {
                System.out.println("请选择消费类型");
                for (int j = 0 ; j < consumpType.length ; j++ ){
                    System.out.println( consumpType[j] );
                }
                t = s.nextInt();
            } while (t < 0 || t >= consumpType.length);
            System.out.println("请输入消费金额，按0结束输入：");
            moneyChange = s.nextDouble();
            while (moneyChange < 0){
                System.out.println("请输入正确的数字，按0结束输入：");
                moneyChange = s.nextDouble();
            };
            if (moneyChange == 0) {
                moneyEnd = false;
                return;
            }
            balance -= moneyChange;
            date = new Date();
            detail += "\n" + consumpType[t] + "\t-" + moneyChange + "\t" + sdf.format(date) + "\t余额：" + balance ;
            System.out.println(consumpType[t] + "\t-" + moneyChange + "\t" + sdf.format(date) + "\t余额：" + balance);
        }while (moneyEnd);
        System.out.println("余额：" + balance);
    }

    public void exit() {
        String endflag = "n";
        do {
            System.out.println("确定要退出吗？y/n");
            endflag = s.next();
        }while (!( "y".equals(endflag) || "n".equals(endflag)));
        if ( "y".equals(endflag) ){
            flag = false;
            System.out.println("-----------------溜了------------------");
        }
    }
}
