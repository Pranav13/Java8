package com.java8.lembda.Implementation;

import com.java8.lembda.entity.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        employeeArrayList.add(new Employee(200,"a"));
        employeeArrayList.add(new Employee(400,"b"));
        employeeArrayList.add(new Employee(300,"c"));
        employeeArrayList.add(new Employee(100,"d"));
        employeeArrayList.add(new Employee(500,"e"));
        System.out.println("Before Sorting Employee List"+employeeArrayList);

        Collections.sort(employeeArrayList,(e1,e2)->(e1.getEid() < e2.getEid() )?-1:(e1.getEid() > e2.getEid())?1:0);

        System.out.println("After Sorting"+employeeArrayList);


    }
}
