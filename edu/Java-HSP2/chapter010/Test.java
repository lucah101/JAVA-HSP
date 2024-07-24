public class Test {
    public static void main(String[] args) {
//        Test child1 = new Test();
//        Stu.payFee(200);
//        Test child2 = new Test();
//        Stu.payFee(200);
//        Test child3 = new Test();
//        Stu.payFee(200);
//
//        Stu.showFee();


        new B02();
    }
}

//class Stu {
//    private String name;
//    private static double fee = 0;
//
//    public Stu(String name) {
//        this.name = name;
//    }
//    public static void payFee(double fee) {
//        Stu.fee += fee;
//    }
//    public static void showFee() {
//        System.out.println("Fee: " + Stu.fee);
//    }
//}


class A02 {
    private static int n1 = getVal01();
    static{
        System.out.println("A02的一个静态代码块");          //2
    }
    {
        System.out.println("A02的一个普通代码块");          //5
    }
    public int n3 = getVal02();
    public static int getVal01() {
        System.out.println("getVal01");                 //1
        return 10;
    }
    public int getVal02() {
        System.out.println("getVal02");                 //6
        return 10;
    }
    public A02() {  //构造器
        //隐藏：
        //super();
        //普通代码和普通属性的初始化
        System.out.println("A02的构造器");                //7
    }
}

class B02 extends A02 {
    private static int n3 = getVal03();
    static {
        System.out.println("B02的一个静态代码块");          //4
    }
    public int n4 =getVal04();
    {
        System.out.println("B02的一个普通代码块");          //9
    }
    public static int getVal03() {
        System.out.println("getVal03");                 //3
        return 10;
    }
    public int getVal04() {
        System.out.println("getVal04");                 //8
        return 10;
    }
    public B02() {
        System.out.println("B02的构造器");               //10
    }
}