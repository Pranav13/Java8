package com.java8.lembda.Implementation;

import java.util.Collections;
import java.util.TreeSet;

public class SortingTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        integerTreeSet.add(10);
        integerTreeSet.add(0);
        integerTreeSet.add(15);
        integerTreeSet.add(25);
        integerTreeSet.add(5);
        integerTreeSet.add(20);
        System.out.println("After Sorting"+integerTreeSet);


    }
}
