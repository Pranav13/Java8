package com.java8.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateAndTime {
    public static void main(String[] args) {
        LocalDate  currentDate =  LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);


        int dayOfMonth = currentDate.getDayOfMonth();
        int dateMonthValue = currentDate.getMonthValue();
        int currentDateYear = currentDate.getYear();

        System.out.printf("%d-%d-%d", dayOfMonth,dateMonthValue,currentDateYear);

        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int seconds = currentTime.getSecond();
        int nano =  currentTime.getNano();

        System.out.printf("%d:%d:%d:%d",hour,minute,seconds,nano);

    }
}
