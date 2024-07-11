package com.edu.smallChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSYS {

    /*
    1. 显示菜单，可以选择菜单，给出对应的提示
    2. 完成零钱通明细：拼接detail
    3. 完成收益入账：
        新增变量：金额，时间，余额
    4. 完成消费：
        新增变量：消费类型（数组）
     */

    public static void main(String[] args) {
        String detail = "-----------------零钱通明细------------------";
        double moneyChange=0;
        String time;
        double balance=0;
        String[] consumpType = {"0吃", "1喝", "2玩", "3乐"};
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Boolean flag = true;
        do {
            System.out.println("\n-----------------零钱通菜单------------------");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退出");
            System.out.println("请选择(1-4)：");
            Scanner s = new Scanner(System.in);
            String i = s.next();

            switch (i){
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
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
                            break;
                        }
                        balance += moneyChange;
                        date = new Date();
                        detail += "\n收益入账\t+" + moneyChange + "\t" + sdf.format(date) + "\t余额：" + balance ;
                        System.out.println("收益入账\t+" + moneyChange + "\t" + sdf.format(date) + "\t余额：" + balance );
                    }while (moneyEnd);
                    break;
                case "3":
                    moneyEnd = true;
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
                            break;
                        }
                        balance -= moneyChange;
                        date = new Date();
                        detail += "\n" + consumpType[t] + "\t-" + moneyChange + "\t" + sdf.format(date) + "\t余额：" + balance ;
                        System.out.println(consumpType[t] + "\t-" + moneyChange + "\t" + sdf.format(date) + "\t余额：" + balance);
                    }while (moneyEnd);
                    System.out.println("余额：" + balance);
                    break;
                case "4":
                    String endflag = "n";
                    do {
                        System.out.println("确定要退出吗？y/n");
                        endflag = s.next();
                    }while (!( "y".equals(endflag) || "n".equals(endflag)));
                    if ( "y".equals(endflag) ){
                        flag = false;
                        System.out.println("-----------------溜了------------------");
                    }
                    break;
                default:
                    System.out.println("请输入正确的数字");
            }

        }while (flag);

    }

}
