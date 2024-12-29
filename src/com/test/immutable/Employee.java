package com.test.immutable;

import java.util.*;

public final class Employee {
    private final String name;
    private final Date obj;//mutable
    private final List<String> mobile ;

    public Employee(String name, Date obj, List<String> mobile) {
        this.name = name;
        this.obj = obj;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public Date getObj() {
        return (Date) obj.clone();
    }

    public List<String> getMobile() {
//        return Collections.unmodifiableList(mobile);
        return new ArrayList<>(mobile);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", obj=" + obj +
                ", mobile=" + mobile +
                '}';
    }

    public static void main(String[] args) {
        Date date=new Date();
        List<String> mobile=new ArrayList<>();
        mobile.add("41424");
        mobile.add("424242");
        Employee employee1= new Employee("sandeep",date,mobile);
        System.out.println(employee1);
        employee1.getObj().setTime(10);
        employee1.getMobile().add("421412442");
        System.out.println(employee1);

    }

}
