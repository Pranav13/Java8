package com.java8.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullFromList {
    public static void main(String[] args) {
        String[] names = {"ads","",null,"bsfdsf","cdfs","ddsf","esdfsf"};
        System.out.println(createListWithNotNullValues(names));

    }

    public static List<String> createListWithNotNullValues(String [] names){
        Predicate<String> checkIfStringisNotNullAndNotEmpty =  s -> s != null && s.length()>0;
        List<String> listWithNonEmptyValues = new ArrayList<>();
        for(String name:names){
            if(checkIfStringisNotNullAndNotEmpty.test(name)){
                listWithNonEmptyValues.add(name);
            }
        }
        return listWithNonEmptyValues;
    }
}
