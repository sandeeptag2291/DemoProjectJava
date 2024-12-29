package com.test.collection;

import java.util.*;

public class Student implements Comparable{
    private int id;
    private String name;

    public Student() {

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (id == s.id) {
            return 0;
        } else if (id > s.id) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Student s1= new Student(101,"Sandeep");
        Student s2= new Student(109,"Shweta");
        Student s3= new Student(105,"Amu");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        Collections.sort(students,new NameComparator());
        System.out.println(students);

    }


}
