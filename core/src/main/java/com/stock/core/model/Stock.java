package com.stock.core.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Stock {
    private String stockCode;
    private Map<StockProperties, Object> properties;
    private Set<StockData> stockData;

    public Stock(String stockCode) {
        this.stockCode = stockCode;
        properties = new HashMap<>();
        stockData = new TreeSet<>();
    }

    public void addProperty(StockProperties property, Object value) {
        properties.put(property, value);
    }

    public void addStockData(StockData stockData) {
        this.stockData.add(stockData);
    }

    public Object getProperty(StockProperties prop) {
        return properties.get(prop);
    }

    public Set<StockData> getStockData() {
        return stockData;
    }
}
