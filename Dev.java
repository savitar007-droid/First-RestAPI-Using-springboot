package com.practice;

public class Dev {
//    private int age;
//    private Laptop laptop;
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    //setter
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    //getter
//    public int getAge()
//    {
//        return age;
//    }
//    //constructor 2
//    public Dev(int age) {
//        this.age=age;
//        System.out.println("Dev 1 Constructor");
//    }

    private Computer comp;
    //constructor 1
    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){

        System.out.println("Wrking on Dev class");
        comp.compile();
    }
}
