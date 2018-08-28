package com.java8.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIDJava8 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(la);

        System.out.println(zonedDateTime);

    }
}
