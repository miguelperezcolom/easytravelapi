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

    @ApiModelProperty(value = "Retail price for this activity")
    private Amount retailPrice;
    @ApiModelProperty(value = "Net price for this activity")
    private Amount netPrice;
    @ApiModelProperty(value = "Your commission for this activity")
    private Amount commission;



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
