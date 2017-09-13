package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.common.CancellationCost;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the gethotelpricedetails request")
public class GetHotelPriceDetailsRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "The price id, as we got it when we asked for available hotels")
    private String key;


    public static GetHotelPriceDetailsRQ fromString(String json) {
        return Helper.fromString(GetHotelPriceDetailsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
