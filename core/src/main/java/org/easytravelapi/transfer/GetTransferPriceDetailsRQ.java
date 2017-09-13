package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the gettransferpricedetails request")
public class GetTransferPriceDetailsRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "The price id, as we got it when we asked for available transfers")
    private String key;


    public static GetTransferPriceDetailsRQ fromString(String json) {
        return Helper.fromString(GetTransferPriceDetailsRQ.class, json);
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
