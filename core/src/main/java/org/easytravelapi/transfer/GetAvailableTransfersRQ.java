package org.easytravelapi.transfer;

import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

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


    public String getFromTransferPointId() {
        return fromTransferPointId;
    }

    public void setFromTransferPointId(String fromTransferPointId) {
        this.fromTransferPointId = fromTransferPointId;
    }

    public String getToTransferPointId() {
        return toTransferPointId;
    }

    public void setToTransferPointId(String toTransferPointId) {
        this.toTransferPointId = toTransferPointId;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public List<Integer> getAges() {
        return ages;
    }

    public void setAges(List<Integer> ages) {
        this.ages = ages;
    }

    public int getBikes() {
        return bikes;
    }

    public void setBikes(int bikes) {
        this.bikes = bikes;
    }

    public int getGolfBaggages() {
        return golfBaggages;
    }

    public void setGolfBaggages(int golfBaggages) {
        this.golfBaggages = golfBaggages;
    }

    public int getBigLuggages() {
        return bigLuggages;
    }

    public void setBigLuggages(int bigLuggages) {
        this.bigLuggages = bigLuggages;
    }

    public int getWheelChairs() {
        return wheelChairs;
    }

    public void setWheelChairs(int wheelChairs) {
        this.wheelChairs = wheelChairs;
    }

    public int getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(int incomingDate) {
        this.incomingDate = incomingDate;
    }

    public int getOutgoingDate() {
        return outgoingDate;
    }

    public void setOutgoingDate(int outgoingDate) {
        this.outgoingDate = outgoingDate;
    }
}
