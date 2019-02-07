package com.java8.function;

import com.java8.function.entity.Employee;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SumOfEmployeeSalary {

    public static void main(String[] args) {
        ArrayList<Employee> employeeArraList = new ArrayList<>();
        populate(employeeArraList);
        Function<ArrayList<Employee>,Double> sumofEmployeeSalary = e ->{
                    double total = 0;
                    for(Employee employee : employeeArraList){
                        total = total + employee.getSalary();
                    }
                    return total;
        };
        System.out.println("The sum of employee salary is"+sumofEmployeeSalary.apply(employeeArraList));

        Predicate<Employee> employeeslarylessyhen3500 = e -> e.getSalary() < 3500;
        Function<Employee,Employee> incrementSalaryBy477 = e -> {
            e.setSalary( e.getSalary() + 477 )  ;
            return e;
        };

        System.out.println(employeeArraList);
        for(Employee employee:employeeArraList){
            if(employeeslarylessyhen3500.test(employee)){
                incrementSalaryBy477.apply(employee);
            }
        }

        System.out.println("After Incrementing"+employeeArraList);
    }

    private static void populate(ArrayList<Employee> employeeArraList) {
        employeeArraList.add(new Employee("A",1000));
        employeeArraList.add(new Employee("B",2000));
        employeeArraList.add(new Employee("C",3000));
        employeeArraList.add(new Employee("D",4000));
        employeeArraList.add(new Employee("E",5000));
    }
}
