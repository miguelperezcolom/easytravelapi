package io.mateu.easytravelapi.activity;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class GetActivityPriceDetailsRQ extends AbstractAuthenticatedRQ {

    private String key;


    public static GetActivityPriceDetailsRQ fromString(String json) {
        return Helper.fromString(GetActivityPriceDetailsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
