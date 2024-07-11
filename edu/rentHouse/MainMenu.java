package com.edu.rentHouse;

import java.util.Scanner;

public class MainMenu {

    Scanner scanner = new Scanner(System.in);
    private String house[][] = new String[5][5];
    private int houseNumber = 0;
    private int id = 0;
    private Boolean exit = true;
    private String ifexit;
    private String ifdelete;

    public void mainmenu(){
        do {System.out.println("--------------房屋出租系统---------------");
            System.out.println("1 新增房屋");
            System.out.println("2 查找房屋");
            System.out.println("3 删除房屋");
            System.out.println("4 修改房屋信息");
            System.out.println("5 房屋列表");
            System.out.println("6 退出");

            System.out.print("请输入数字：");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    addhouse();
                    break;
                case 2:
                    findhouse();
                    break;
                case 3:
                    deletehouse();
                    break;
                case 4:
                    changehouse();
                    break;
                case 5:
                    list();
                    break;
                case 6:
                    exit();
                    break;
                default:
                    System.out.println("请输入1-6的数字");
                    break;

            }

        }while (exit);

    }


    public void addhouse(){
        int housenull = 0;
        for (int i = 0; i < house.length; i++) {
            if (house[i][0] == null){
                houseNumber = i;
                housenull = 1;
                break;
            }
        }
        if (housenull == 0) {
            System.out.println("房屋已满，请删除多余房屋");
        }else{
            System.out.println("--------------添加房屋---------------");
            System.out.print("姓名：");
            house[houseNumber][0] = scanner.next();
            System.out.print("电话：");
            house[houseNumber][1] = scanner.next();
            System.out.print("地址：");
            house[houseNumber][2] = scanner.next();
            System.out.print("月租：");
            house[houseNumber][3] = scanner.next();
            System.out.print("状态：");
            house[houseNumber][4] = scanner.next();
            System.out.println("--------------添加完成---------------");
        }
    }


    public void findhouse(){
        System.out.println("--------------查找房屋---------------");
        System.out.print("请输入要查找的ID：");
        id = scanner.nextInt();
        id --;
        if (house[id][0] == null){
            System.out.println("没有该房屋");
        }else {
            System.out.println("ID号" + "\t" + "姓名"  + "\t" + "电话" + "\t" + "地址"
                    + "\t" + "月租"  + "\t" + "状态");
            for (int i = 0; i < house[id].length; i++) {
                System.out.println(house[id][i]+ "\t");
            }
        }

    }

    public void deletehouse(){

        System.out.println("--------------删除房屋---------------");
        System.out.print("请输入要删除的ID：");
        id = scanner.nextInt();
        id --;
        if (house[id][0] == null){
            System.out.println("没有该房屋");
        }else {
            do {
                System.out.println("确认是否删除y/n");
                ifdelete = scanner.next();
                if (ifdelete.equals("y")){
                    for (int i = 0; i < house[id].length; i++) {
                        house[id][i] = null;
                    }
                    System.out.println("--------------删除完成---------------");
                    break;
                }else if (ifdelete.equals("n")){
                    break;
                }
                System.out.println("请输入正确的内容");
            }while (true);

        }

    }


    public void changehouse(){
        System.out.println("--------------修改房屋---------------");
        System.out.print("请输入要修改的ID：");
        id = scanner.nextInt();
        id --;
        if (house[id][0] == null){
            System.out.println("没有该房屋");
        }else {
            for (int i = 0; i < house[id].length; i++) {
                System.out.println(house[id][i] + "\t");
            }
            System.out.print("请输入修改后的内容：");
            System.out.print("姓名：");
            house[id][0] = scanner.next();
            System.out.print("电话：");
            house[id][1] = scanner.next();
            System.out.print("地址：");
            house[id][2] = scanner.next();
            System.out.print("月租：");
            house[id][3] = scanner.next();
            System.out.print("状态：");
            house[id][4] = scanner.next();
            System.out.println("--------------修改完成---------------");
        }


    }


    public void list(){
        System.out.println("--------------房屋列表---------------");
        System.out.println("ID号" + "\t" + "姓名"  + "\t" + "电话" + "\t" + "地址"
                + "\t" + "月租"  + "\t" + "状态");
        for (int i = 0; i < house.length; i++) {
            System.out.print(( i + 1 ) + "\t");
            for (int j = 0; j < house[i].length; j++) {
                System.out.print(house[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("--------------房屋列表完成---------------");



    }


    public void exit(){

        do {
            System.out.println("确定要退出吗？y/n");
            ifexit = scanner.next();
            if ( ifexit.equals("y") ){
                exit = false;
                break;
            }else if ( ifexit.equals("n")){
                break;
            }
            System.out.println("请输入正确的内容");
        }while (true);
    }

}
