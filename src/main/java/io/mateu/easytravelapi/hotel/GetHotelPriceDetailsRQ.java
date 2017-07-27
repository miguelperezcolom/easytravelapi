package io.mateu.easytravelapi.hotel;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.common.CancellationCost;
import io.mateu.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetHotelPriceDetailsRQ extends AbstractAuthenticatedRQ {

    private String key;

    private List<CancellationCost> cancellationsCosts = new ArrayList<CancellationCost>();


    public static GetHotelPriceDetailsRQ fromString(String json) {
        return Helper.fromString(GetHotelPriceDetailsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
