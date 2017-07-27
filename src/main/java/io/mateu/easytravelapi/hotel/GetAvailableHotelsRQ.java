package io.mateu.easytravelapi.hotel;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetAvailableHotelsRQ extends AbstractAuthenticatedRQ {

    private List<String> resorts = new ArrayList<String>();

    private int checkIn;
    private int checkout;

    private List<Occupancy> occupancies = new ArrayList<Occupancy>();

    private boolean includeStaticInfo;


    public static GetAvailableHotelsRQ fromString(String json) {
        return Helper.fromString(GetAvailableHotelsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
