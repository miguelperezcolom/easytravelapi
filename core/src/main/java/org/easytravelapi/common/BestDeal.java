package org.easytravelapi.common;

import org.easytravelapi.common.Amount;

public class BestDeal {

    private Amount retailPrice;
    private Amount netPrice;
    private Amount commission;

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

    public Amount getCommission() {
        return commission;
    }

    public void setCommission(Amount commission) {
        this.commission = commission;
    }
}
