package com.test.oop;

public class Child extends Parent {

//    @Override
//    public void m1()
//    {
//      System.out.println("in child class m1");
//    }

    public static void main(String[] args) {
      Parent parent=new Child();
        try {
            parent.m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
