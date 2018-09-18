package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the transfer availability request")
public class GetAvailableTransfersRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "Transfer origin, as got in the getportfolio response")
    private String fromTransferPointId;
    @ApiModelProperty(value = "Transfer destination, as got in the getportfolio response")
    private String toTransferPointId;

    @ApiModelProperty(value = "Number of pax")
    private int pax;

    @ApiModelProperty(value = "Number of bikes")
    private int bikes;
    @ApiModelProperty(value = "Number of golf baggages")
    private int golfBaggages;
    @ApiModelProperty(value = "Number of ski baggages")
    private int skis;
    @ApiModelProperty(value = "Number of big luggages not bikes neither golf baggages")
    private int bigLuggages;
    @ApiModelProperty(value = "Number of wheel chairs")
    private int wheelChairs;

    @ApiModelProperty(value = "Locale date for the incoming side of the transfer, in YYYYMMDD format")
    private int incomingDate;
    @ApiModelProperty(value = "Locale date for the outgoing / return side of the transfer, in YYYYMMDD format")
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

    public int getSkis() {
        return skis;
    }

    public void setSkis(int skis) {
        this.skis = skis;
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
