package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset{
    private int pillowMoney;

    public Cash(String description, int yearAcquired, BigDecimal originalCost, int pillowMoney) {
        super(description, yearAcquired, originalCost);
        this.pillowMoney = pillowMoney;
    }
    @Override
    public BigDecimal getValue(){
        return BigDecimal.valueOf(pillowMoney);
    }

}
