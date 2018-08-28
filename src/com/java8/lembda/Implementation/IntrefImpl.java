package com.java8.lembda.Implementation;

import com.java8.lembda.Interface.Intref;

public class IntrefImpl{

    public static void main(String[] args) {
        Intref intref = () -> System.out.println("This is hello method");
        intref.sayhello();
    }

}
