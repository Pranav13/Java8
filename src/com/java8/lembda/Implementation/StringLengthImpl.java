package com.java8.lembda.Implementation;

import com.java8.lembda.Interface.IstringLength;

public class StringLengthImpl {
    public static void main(String[] args) {
        IstringLength istringLength = (s) -> s.length();
        System.out.println("Given String Length is "+istringLength.getStringLength("pranav"));
    }
}
