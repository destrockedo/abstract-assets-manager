package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Asset asset = new Asset("90 inch TV", 2022, new BigDecimal("3500.00"));

        House house = new House("5 bedroom", 2023, new BigDecimal("400000.00"),
                "123 El Street", 5000, 5);
    }
}
