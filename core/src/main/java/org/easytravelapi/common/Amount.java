package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "A currency - value pair")
public class Amount {

    @ApiModelProperty(value = "The currency ISO code")
    private String currencyIsoCode;
    @ApiModelProperty(value = "The amount value, expressed in this currency")
    private double value;

    public Amount() {
    }

    public Amount(String currencyIsoCode, double value) {
        this.currencyIsoCode = currencyIsoCode;
        this.value = value;
    }

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
