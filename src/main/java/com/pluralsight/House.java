package com.pluralsight;


import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    private int squareFeet;
    private int lotSize;

    public House(String description, int yearAcquired, BigDecimal
            originalCost, String address, int squareFeet, int lotSize) {
        super(description, yearAcquired, originalCost);
        this.address = address;
        this.squareFeet = squareFeet;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getLotSize() {
        return lotSize;
    }

    @Override
    public BigDecimal getValue() {
        return BigDecimal.valueOf(100).multiply(BigDecimal.valueOf(squareFeet)).add(new BigDecimal(("o.25")).multiply(BigDecimal.valueOf(lotSize)));

    }
}
