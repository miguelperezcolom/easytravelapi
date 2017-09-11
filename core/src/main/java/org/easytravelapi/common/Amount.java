package org.easytravelapi.common;

/**
 * Created by miguel on 26/7/17.
 */
public class Amount {

    private String currencyIsoCode;
    private double value;


    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
