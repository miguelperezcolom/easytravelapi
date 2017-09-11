package org.easytravelapi.transfer;

import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class GetTransferPriceDetailsRQ extends AbstractAuthenticatedRQ {

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
