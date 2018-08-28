package com.java8.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class PeriodAndYear {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1992,8,28);
        LocalDate today = LocalDate.now();
        Period period  = Period.between(birthday,today);
        System.out.printf("Age is %d years %d Months %d Days", period.getYears(), period.getMonths(), period.getDays());

        int givenYear = 2018;
        Year year = Year.of(givenYear);
        if(year.isLeap()){
            System.out.printf("%d is leap year",givenYear);
        }
        else{
            System.out.printf("%d is not leap year",givenYear);
        }

    }
}
