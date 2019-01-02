package com.stock.core.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Candle {
    private BigDecimal open;
    private BigDecimal close;
    private BigDecimal high;
    private BigDecimal low;
    private Long volume;

    /**
     * Bhavcopy format of input data
     * StockName,Date,Open,High,Low,Close,Volume
     * @param inputValues
     */
    public Candle(String[] inputValues) {
        if(inputValues == null || inputValues.length < 7)
            throw new RuntimeException("Invalid input parameters");
        open = new BigDecimal(inputValues[2]);
        open.setScale(2, RoundingMode.HALF_EVEN);
        high = new BigDecimal(inputValues[3]);
        high.setScale(2, RoundingMode.HALF_EVEN);
        low = new BigDecimal(inputValues[4]);
        low.setScale(2, RoundingMode.HALF_EVEN);
        close = new BigDecimal(inputValues[5]);
        close.setScale(2, RoundingMode.HALF_EVEN);
        volume = Long.parseLong(inputValues[6].replaceAll(",", ""));
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return " [O H L C V] :: " + open + ", " + high + ", " + low + ", " + close + ", " + volume;
    }
}
