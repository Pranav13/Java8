package com.java8.lembda.Implementation;

import java.util.*;

import static java.util.stream.Collectors.toMap;

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

    private static String characterFrequency(String s,Integer highestFrequency) {
        Map<Character,Integer> freqinces = s.chars().boxed().collect(toMap(k -> Character.valueOf((char) k.intValue()),
                v->1,
                Integer::sum));
        Map<Integer,Character> integerCharacterMap = new TreeMap<>((I1, I2)->(I1>I2)?-1:(I1<I2)?1:0);
        for(Map.Entry<Character,Integer> entry : freqinces.entrySet()){
            integerCharacterMap.put(entry.getValue(),entry.getKey());
        }
        int index=0;
        for(Map.Entry<Integer,Character> entry:integerCharacterMap.entrySet()){
            index++;
            if(index==highestFrequency){
                return entry.getValue().toString();
            }
        }
        return "-1";
    }
}
