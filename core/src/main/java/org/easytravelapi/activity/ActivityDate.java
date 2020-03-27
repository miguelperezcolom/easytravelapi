package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.Amount;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(value = "Holder for an activity date")
public class ActivityDate {

    @ApiModelProperty(value = "Local date for the activity")
    private int date;
    @ApiModelProperty(value = "Local time for the activity")
    private int time;

    @ApiModelProperty(value = "Id for this price")
    private String key;

    private String currencyIsoCode;
    private Double retailPrice;
    private Double netPrice;


    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }
}
