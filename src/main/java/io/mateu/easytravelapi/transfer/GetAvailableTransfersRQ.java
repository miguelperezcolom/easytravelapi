package io.mateu.easytravelapi.transfer;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetAvailableTransfersRQ extends AbstractAuthenticatedRQ {

    private String fromTransferPointId;
    private String toTransferPointId;

    private int pax;
    private List<Integer> ages = new ArrayList<Integer>();

    private int bikes;
    private int golfBaggages;
    private int bigLuggages;
    private int wheelChairs;

    private int incomingDate;
    private int outgoingDate;


    public static GetAvailableTransfersRQ fromString(String json) {
        return Helper.fromString(GetAvailableTransfersRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
