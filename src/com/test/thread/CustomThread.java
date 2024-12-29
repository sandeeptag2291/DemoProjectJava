package com.test.thread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CustomThread extends Thread{
//    static Map<Integer,String> map=new HashMap<>();
    static Map<Integer,String> map=new ConcurrentHashMap<Integer, String>();
    public void run() {
        try {
            Thread.sleep(1000);
            map.put(103, "D");
        } catch (InterruptedException e) {
            System.out.println("Child thread going to add element");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        CustomThread customThread=new CustomThread();
        customThread.start();

        for(Object o : map.entrySet())
        {
            Object s=o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }

}
