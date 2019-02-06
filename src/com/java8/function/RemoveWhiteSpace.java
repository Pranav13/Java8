package com.java8.function;

import java.util.function.Function;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Pranav Shukla";
        Function<String,String> removewhitespace = s -> s.replace(" ","");
        System.out.println(removewhitespace.apply(str));

        Function<String,Integer> countnumberofspaces = s -> s.length() - s.replaceAll(" ","").length();
        System.out.println(countnumberofspaces.apply(str));

    }
}
