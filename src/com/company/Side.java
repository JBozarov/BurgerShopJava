package com.company;

public class Side {
    private String sideNme;
    private double sidePrice;

    public Side(String sideNme, double sidePrice) {
        this.sideNme = sideNme;
        this.sidePrice = sidePrice;
    }

    public String getSideName() {
        return sideNme;
    }

    public double getSidePrice() {
        return sidePrice;
    }
}
