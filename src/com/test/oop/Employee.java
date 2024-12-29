package com.test.oop;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
    private int id;
    private String name;

    public Employee() {

    }

    public Employee(int id, String name) {
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

//    @Override
//    public int hashCode()
//    {
//        return id;
//    }
//
//    @Override
//    public boolean equals(Object obj)
//    {
//        Employee employee = (Employee) obj;
//        return this.id==employee.getId() && this.name.equals(employee.getName());
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString()
    {
        return "Employee{"+
                "id= "+id+ ", name= "+name+'\''+'}';
    }

    public static void main(String[] args) {
        Employee employee1= new Employee(101,"Santosh");
        Employee employee2= new Employee(101,"Santosh");
        System.out.println("is hashcode()  same: "+(employee1.hashCode()==employee2.hashCode()));
        System.out.println("is equals()  same: "+(employee1.equals(employee2)));

        Set<Employee> employees=new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        System.out.println("set employee"+employees);
    }

}
