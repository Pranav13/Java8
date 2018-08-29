package com.java8.lembda.Implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(0);
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(20);
        System.out.println("Before sorting"+arrayList);

        Comparator<Integer> comparator = (I1,I2)->(I1>I2)?-1:(I1<I2)?1:0;

        Collections.sort(arrayList,comparator);

        System.out.println("Descending order"+arrayList);

    }
}
