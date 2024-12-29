package com.test.collection;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        } else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {

        CustomArrayList customArrayList=new CustomArrayList();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(1);
        customArrayList.add(3);
        customArrayList.add(2);
        System.out.println(customArrayList);

        Set<Student> students=new HashSet<>();
        Student s1= new Student(101,"Sandeep");
        Student s2= new Student(101,"Sandeep");
        Student s3= new Student(105,"Amu");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);

    }
}
