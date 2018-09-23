package com.java8.predicate;

import java.util.function.Predicate;

public class TestStringWithPredicate {
    public static void main(String[] args) {
        //Programme to display names start with 'K' by using predicate
        String [] names = {"Sunny","Kajal","malika","Katrina","Kareena"};
        checkifStringSTartsWithK(names);
    }

    public static void checkifStringSTartsWithK(String[] names){
        Predicate<String> startsWithk = s -> s.charAt(0)=='K';
        for(String name:names){
            if(startsWithk.test(name)){
                System.out.println(name);
            }
        }
    }
}
