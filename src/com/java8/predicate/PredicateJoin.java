package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateJoin {
    public static void main(String[] args) {
        int [] x={0,5,10,15,20,25,30};
        Predicate<Integer> numbergraterthan10Predicate = i->i>10;
        Predicate<Integer> evenNumberPredicate =i->i%2==0;
        System.out.println("The number greater than 10 are");
        checkPredicate(numbergraterthan10Predicate,x);
        System.out.println("The Even number are");
        checkPredicate(evenNumberPredicate,x);
        System.out.println("The number not greater than 10 are");
        checkPredicate(numbergraterthan10Predicate.negate(),x);
        System.out.println("The number grater than 10 and even are");
        checkPredicate(numbergraterthan10Predicate.and(evenNumberPredicate),x);
        System.out.println("The number grater than 10 or even are");
        checkPredicate(numbergraterthan10Predicate.or(evenNumberPredicate),x);
    }

    public static void checkPredicate(Predicate<Integer> integerPredicate, int[] x){
        for(int x1:x){
            if(integerPredicate.test(x1)){
                System.out.println(x1);
            }

        }
    }

}
