package com.java8.lembda.Implementation;

import com.java8.lembda.Interface.Isum;

public class SumImpl {
    public static void main(String[] args) {
        Isum sum = (a, b) -> System.out.println("The sum is "+(a+b));
        sum.add(5,6);
    }
}
