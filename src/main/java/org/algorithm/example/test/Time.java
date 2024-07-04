package org.algorithm.example.test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Time {
    public static void main(String[] args) {
//        Long x = 1719230400000L;
        Long x = 1719201600000L;
        Timestamp customTimestamp = new Timestamp(x);
        System.out.println("指定时间戳: " + customTimestamp);
        System.out.println("指定时间戳: " + customTimestamp.toLocalDateTime());
        System.out.println("指定时间戳: " + customTimestamp.toLocalDateTime().toInstant(ZoneOffset.UTC));
        LocalDateTime localDateTime = customTimestamp.toLocalDateTime();
        LocalDateTime with = localDateTime.with(xx -> xx);
        System.out.println(with);
//        System.out.println("指定时间戳: " + customTimestamp.toLocalDateTime().toInstant(ZoneOffset.UTC).toString());
    }
}
