package com.test.oop;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

public class StringReader {

    public static void main(String[] args) {
        // how many object create here
        String s1=new String("javatech");
        // 1 object is created due to new keyword in heap memory
        // 2 object is created string literal in SCP(String constant pool)
        String s2="javatech";  //does not create new object
        //total object created till here 2

        //itern method is used to get reference from SCP
        System.out.println(s1.intern());
        System.out.println(s2.intern());
        System.out.println(s1.intern().hashCode()==s2.hashCode());
    }
}
