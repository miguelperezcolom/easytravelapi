package org.easytravelapi.cms;

public class TravelInsuranceData {

    private String id;

    private String name;

    private String description;

    private String icon;

    private double value;

    private String currency;

    private double totalIfIncluded;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotalIfIncluded() {
        return totalIfIncluded;
    }

    public void setTotalIfIncluded(double totalIfIncluded) {
        this.totalIfIncluded = totalIfIncluded;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
