package com.java8.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class StringPredicate {
    public static void main(String[] args) {
        System.out.println(checkifLengthGreaterThen5("pranav"));
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        System.out.println(checkifCollectionIsEmpty(integerArrayList));
    }

    public static boolean checkifLengthGreaterThen5(String s){
        Predicate<String> stringPredicate = s1 -> s1.length()>5;
         return stringPredicate.test(s);
    }

    public static boolean checkifCollectionIsEmpty(Collection c){
        Predicate<Collection> collectionPredicate = c1 -> !c.isEmpty();
        return collectionPredicate.test(c);
    }
}
