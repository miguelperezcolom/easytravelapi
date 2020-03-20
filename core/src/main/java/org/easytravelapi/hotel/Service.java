package org.easytravelapi.hotel;

import org.easytravelapi.common.Amount;
import org.easytravelapi.common.PaymentLine;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private String id;

    private String description;

    private Amount retailPrice;

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

    public Amount getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Amount netPrice) {
        this.netPrice = netPrice;
    }
}
