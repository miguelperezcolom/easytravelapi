package org.easytravelapi.activity;

public class Variant {

    private String id;

    private String name;

    private String description;

    private String pricePer;

    private BestDeal price;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    public BestDeal getPrice() {
        return price;
    }

    public void setPrice(BestDeal price) {
        this.price = price;
    }

    public String getPricePer() {
        return pricePer;
    }

    public void setPricePer(String pricePer) {
        this.pricePer = pricePer;
    }
}
