package org.easytravelapi.common;

import org.easytravelapi.common.Amount;

public class BestDeal {

    private Amount retailPrice;
    private Amount netPrice;
    private Amount commission;
    private boolean isOffer;
    private String offerText;
    private Amount beforeOfferPrice;

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

    public boolean isOffer() { return isOffer; }

    public void setOffer(boolean offer) { isOffer = offer; }

    public String getOfferText() { return offerText; }

    public void setOfferText(String offerText) { this.offerText = offerText; }

    public Amount getBeforeOfferPrice() { return beforeOfferPrice; }

    public void setBeforeOfferPrice(Amount beforeOfferPrice) { this.beforeOfferPrice = beforeOfferPrice; }
}
