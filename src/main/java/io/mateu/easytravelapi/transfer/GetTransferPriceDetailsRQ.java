package io.mateu.easytravelapi.transfer;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

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
}
