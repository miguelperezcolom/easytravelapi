package org.easytravelapi.flight;

public class FlightBestPrice {

    private String formattedDate;

    private String date;

    private double price;

    private boolean current;

    public FlightBestPrice(String formattedDate, String date, double price, boolean current) {
        this.formattedDate = formattedDate;
        this.date = date;
        this.price = price;
        this.current = current;
    }

    public FlightBestPrice() {
    }

    public String getFormattedDate() {
        return formattedDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }
}
