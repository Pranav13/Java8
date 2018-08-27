package com.java8.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodAndYear {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1992,8,28);
        LocalDate today = LocalDate.now();
        Period period  = Period.between(birthday,today);
        System.out.printf("Age is %d years %d Months %d Days", period.getYears(), period.getMonths(), period.getDays());

    }
}
