package com.test.java8;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

//
//        Runnable runnable=new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//
//        Runnable run = () -> {
//        };


//       MyFunction myFunction = ( i) -> System.out.println("functional interface method is called");
//       myFunction.test(10);

//        MyFunction myFunction =( i)->i*10;
//        System.out.println(myFunction.test(15));

        Function<Integer,String> function= (t)-> "output"+t;
        System.out.println(function.apply(88));

//       MyFunction myFunction= ( s1, s2) -> s1+":"+s2;
//
//        System.out.println(myFunction.test("sandeep","sanjay"));

    }
}
