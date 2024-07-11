package com.edu.rentHouse2.service;

import com.edu.rentHouse2.domain.House;

/*
     定义House[]，保存House对象
     1.响应HouseView的调用
     2.完成对房屋信息的各种操作（增删改查）
 */
public class HouseService {
    private House[] houses;//保存house对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录id增长到那个值

    //构造器
    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //配合测试列表信息，初始化一个house对象
        houses[0] = new House(1, "jack", "112", "海定区", 2000, "未出租");
    }


    //findById，返回house对象或null
    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }


    //del方法，删除一个房屋信息
    public boolean del(int delId) {
        //先找需要删除的房屋信息对应的下标
        //下标和房屋编号id不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        //找到就删除
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        //把当前有数据的最后一个置空
        houses[--houseNums] = null;
        return true;

    }


    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加（暂时不考虑扩容问题）
        if (houseNums >= houses.length) {
            System.out.println("已满，不能再添加了");
            return false;
        }
        //把newHouse对象加入到数组，新增一个房屋
        houses[houseNums++] = newHouse;
        //id自增长的机制
        newHouse.setId(++idCounter);
        return true;
    }


    //list方法，返回houses
    public House[] list() {
        return houses;
    }


}
