package com.java8.lembda.Implementation;

import com.java8.lembda.entity.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CustomSorting {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee(200,"a"));
        employeeArrayList.add(new Employee(400,"b"));
        employeeArrayList.add(new Employee(300,"c"));
        employeeArrayList.add(new Employee(100,"d"));
        Collections.sort(employeeArrayList,(e1,e2)->(e1.getEid()<e2.getEid())?-1:(e1.getEid()>e2.getEid())?1:0);
        System.out.println(employeeArrayList);
    }
}
