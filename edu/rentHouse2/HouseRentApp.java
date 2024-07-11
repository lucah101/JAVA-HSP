package com.edu.rentHouse2;

import com.edu.rentHouse2.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单，是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("=============退出了房屋出租系统==============");

    }
}
