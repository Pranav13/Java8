package com.java8.lembda.Implementation;

import java.util.TreeMap;

public class SortingTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        treeMap.put(100,"a");
        treeMap.put(600,"b");
        treeMap.put(300,"c");
        treeMap.put(200,"d");
        treeMap.put(700,"e");
        treeMap.put(400,"f");

        System.out.println(treeMap);
    }
}
