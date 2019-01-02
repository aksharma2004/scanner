package com.stock.core.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Temp {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(28.2533);
        bd.setScale(3, RoundingMode.HALF_EVEN);

        bd = bd.divide(new BigDecimal(2));
        System.out.println(bd.doubleValue());

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("yyyyMMdd[ HH:mm:ss]")
                .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
                .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
                .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
                .toFormatter();

        LocalDateTime d = LocalDateTime.parse("20180203", formatter);
        System.out.println(d);
    }
}
