package org.easytravelapi.activity;

import java.util.ArrayList;
import java.util.List;

public class AvailableDate {

    private int date;

    private List<Variant> variants = new ArrayList<>();

    private List<Shift> shifts = new ArrayList<>();

    private String pricePer;

    private BestDeal price;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public String getPricePer() {
        return pricePer;
    }

    public void setPricePer(String pricePer) {
        this.pricePer = pricePer;
    }

    public BestDeal getPrice() {
        return price;
    }

    public void setPrice(BestDeal price) {
        this.price = price;
    }
}
