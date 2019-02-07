package com.java8.function;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthentication {
    public static void main(String[] args) {
        Function<String,String> f1 = s -> s.toLowerCase();
        Function<String,String> f2 = s -> s.substring(0,6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = scanner.next();

        System.out.println("Enter Password");
        String password = scanner.next();

        if(f1.andThen(f2).apply(username).equals("pranav") && password.equals("java")){
            System.out.println("Valid user");
        }else{
            System.out.println("Invalid user");
        }
    }
}
