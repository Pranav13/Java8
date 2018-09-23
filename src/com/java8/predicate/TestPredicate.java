package com.java8.predicate;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p = I -> I >10;
        System.out.println(p.test(5));
        System.out.println(p.test(100));
    }

}
