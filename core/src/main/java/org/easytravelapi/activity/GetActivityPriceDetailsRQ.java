package org.easytravelapi.activity;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;
import org.easytravelapi.common.AbstractAuthenticatedRQ;

/**
 * Created by miguel on 26/7/17.
 */
public class GetActivityPriceDetailsRQ extends AbstractAuthenticatedRQ {


    @ApiModelProperty(value = "The activity price key, as provided in the /activities/getavailable step")
    private String key;


    public static GetActivityPriceDetailsRQ fromString(String json) {
        return Helper.fromString(GetActivityPriceDetailsRQ.class, json);
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
