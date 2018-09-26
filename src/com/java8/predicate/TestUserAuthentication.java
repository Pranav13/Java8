package com.java8.predicate;

import com.java8.predicate.entrity.User;

import java.util.function.Predicate;

public class TestUserAuthentication {
    public static void main(String[] args) {

        System.out.println("user is authenticated "+checkIfUserIsAuthenticated(new User("ram","ram")));


    }
    public static boolean checkIfUserIsAuthenticated(User user){
        Predicate<User> userPredicate = p -> p.getUserName().equals("ram")&&p.getPassword().equals("ram");
        return userPredicate.test(user);
    }

}
