package com.java8.date;

import java.time.LocalDateTime;

public class LocalDateTimeJava8 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        int DayOfMonth = localDateTime.getDayOfMonth();
        int monthOfYear = localDateTime.getMonthValue();
        int year = localDateTime.getYear();

        System.out.printf("Date:%d-%d-%d",DayOfMonth,monthOfYear,year);

        int hour = localDateTime.getHour();
        int minute= localDateTime.getMinute();
        int second = localDateTime.getSecond();
        int nanoSecond =  localDateTime.getNano();

        System.out.printf("Time:%d:%d:%d:%d",hour,minute,second,nanoSecond);
    }

}
