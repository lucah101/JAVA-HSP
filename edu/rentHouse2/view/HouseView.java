package com.edu.rentHouse2.view;

import Project.houserent.utils.Utility;
import com.edu.rentHouse2.domain.House;
import com.edu.rentHouse2.service.HouseService;

/*
    1.显示界面
    2.接收用户的输入
    3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(10);


    //修改
    public void update() {
        System.out.println("==============修改房屋信息=============");
        System.out.println("选择房屋编号（-1退出）：");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("放弃");
            return;
        }

        //返回引用类型，就会修改HouseService中houses数组的元素
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("没有该房屋");
            return;
        }

        System.out.print("姓名（" + house.getName() + "）：");
        String name = Utility.readString(8, "");//回车不修改信息，默认""
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.print("电话（" + house.getPhone() + "）：");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.print("地址（" + house.getAddress() + "）：");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.print("租金（" + house.getRent() + "）：");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.print("状态（" + house.getState() + "）：");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }

        System.out.println("==============修改房屋信息成功=============");


    }


    //查找
    public void findHouse() {
        System.out.println("==============查找房屋信息=============");
        System.out.print("请输入要查找的id：");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("==============查找房屋信息id不存在=============");
        }
    }


    //完成退出确认
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }


    //delHouse()接收输入的id，调用service的del方法
    public void delHouse() {
        System.out.println("==============删除房屋信息=============");
        System.out.print("请输入待删除房屋的编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("放弃删除房屋信息");
            return;
        }
        //该方法本身有循环判断的逻辑，必须输入Y/N
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("==============删除房屋信息成功=============");
            } else {
                System.out.println("==============删除房屋信息失败=============");
            }
        } else {
            System.out.println("==============放弃房屋信息=============");
        }
    }


    //addHouse()接收输入，创建house对象，调用add方法
    public void addHouse() {
        System.out.println("==============添加房屋=============");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象，id是系统分配的，用户不能输入
        House newhouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newhouse)) {
            System.out.println("==============添加房屋成功=============");
        } else {
            System.out.println("==============添加房屋失败=============");
        }

    }


    //编写listhouse()显示房屋列表
    public void listHouses() {
        System.out.println("==============房屋列表=============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==============房屋列表显示完毕=============");
    }


    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\t==============房屋出租系统菜单=============");
            System.out.println("\t\t\t1 新增房屋");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退出");
            System.out.println("请输入你的选择1-6：");
            key = Project.houserent.utils.Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);


    }

}
