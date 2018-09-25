package org.easytravelapi.circuit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.Amount;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(value = "Holder for an circuit date")
public class CircuitDate {

    @ApiModelProperty(value = "Local date for the circuit")
    private int date;
    @ApiModelProperty(value = "Local time for the circuit")
    private int time;

    @ApiModelProperty(value = "Id for this price")
    private String key;

    private Amount retailPrice;
    private Amount netPrice;
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
