package com.edu.poly;

public class Test {
    public static void main(String[] args) {
        Employee n = new Normal("Jake", 2000);
        Employee m = new Manager("Ally", 5000, 10000);

        Test t = new Test();
        t.showEmpAnnual(n);
        t.showEmpAnnual(m);

        t.testWork(m);
        t.testWork(n);

        "Heloo".equals("abc");
    }

    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e){
        if ( e instanceof Normal){
            ((Normal) e).work();
        }else if ( e instanceof Manager){
            ((Manager) e).mamage();
        }
    }
}
