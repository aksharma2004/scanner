package com.stock.core.model;

public enum StockProperties {
    NAME("Name"),
    SECTOR("Sector"),
    FREE_FLOAT("FreeFloat");

    private String value;

    StockProperties(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }


}
