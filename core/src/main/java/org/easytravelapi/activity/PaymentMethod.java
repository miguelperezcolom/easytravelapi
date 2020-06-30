package org.easytravelapi.activity;

public class PaymentMethod {

    private String key;

    private String name;

    private String currencyIsoCode;

    private double exchangeRateToLcy;

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

    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }

    public double getExchangeRateToLcy() {
        return exchangeRateToLcy;
    }

    public void setExchangeRateToLcy(double exchangeRateToLcy) {
        this.exchangeRateToLcy = exchangeRateToLcy;
    }
}
