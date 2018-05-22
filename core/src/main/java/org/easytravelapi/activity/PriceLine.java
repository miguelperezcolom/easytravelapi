package org.easytravelapi.activity;

import org.easytravelapi.common.Amount;

public class PriceLine {

    private String id;

    private String description;

    private Amount retailPrice;

    private Amount commission;

    private Amount netPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Amount getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Amount retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Amount getCommission() {
        return commission;
    }

    public void setCommission(Amount commission) {
        this.commission = commission;
    }

    public Amount getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Amount netPrice) {
        this.netPrice = netPrice;
    }
}
