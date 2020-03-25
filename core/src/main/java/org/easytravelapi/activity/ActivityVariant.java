package org.easytravelapi.activity;

import org.easytravelapi.common.Price;

public class ActivityVariant {

    private String key;

    private String name;

    private String description;

    private Price bestDeal;

    private String pricePer;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Price getBestDeal() {
        return bestDeal;
    }

    public void setBestDeal(Price bestDeal) {
        this.bestDeal = bestDeal;
    }

    public String getPricePer() {
        return pricePer;
    }

    public void setPricePer(String pricePer) {
        this.pricePer = pricePer;
    }
}
