package com.java8.date;

import java.time.LocalDateTime;

public class LocalDateTimeRepresentation {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(1995,05,28,12,45);
        System.out.println(localDateTime);
        System.out.println("After six momnth"+localDateTime.plusMonths(6));
        System.out.println("Befofre six month"+localDateTime.minusMonths(6));
    }
}
