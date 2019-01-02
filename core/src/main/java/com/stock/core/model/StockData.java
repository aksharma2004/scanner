package com.stock.core.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class StockData implements Comparable<StockData> {
    private static final DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendPattern("yyyyMMdd[ HH:mm:ss]")
            .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
            .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
            .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
            .toFormatter();

    private LocalDateTime dateTime;
    private Candle candle;

    /**
     * Bhavcopy format StockCode,Date,Open,High,Low,Close,Volume
     *
     * @param values
     */
    public StockData(String[] values) {
        dateTime = LocalDateTime.parse(values[1], formatter);
        candle = new Candle(values);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Candle getCandle() {
        return candle;
    }

    public void setCandle(Candle candle) {
        this.candle = candle;
    }

    @Override
    public int compareTo(StockData o) {
        return dateTime.compareTo(o.dateTime);
    }

    @Override
    public String toString() {
        return dateTime + candle.toString();
    }

    @Override
    public int hashCode() {
        return dateTime.hashCode();
    }
}
