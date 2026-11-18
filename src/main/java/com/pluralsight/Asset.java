
package com.pluralsight;

import java.math.BigDecimal;
//Cannot creat oibject from abstract class
//Used When
public abstract class Asset {
    private String description;
    private int yearAcquired;
    private BigDecimal originalCost;

    public Asset(String description, int yearAcquired, BigDecimal originalCost) {
        this.description = description;
        this.yearAcquired = yearAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public int getYearAcquired() {
        return yearAcquired;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    //Now child classes are forced to use getvalue
    public abstract BigDecimal getValue();

    public void printMessage() {
        System.out.println("");
    }
}
