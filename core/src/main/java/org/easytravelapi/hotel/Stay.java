package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class Stay {
    private List<PaxDetails> occupancy  = new ArrayList<>();
    private int roomId;
    private String rateKey;
    private String roomName;
    private Boolean requestPaymentData;
    @ApiModelProperty(value = "Booking extras")
    private String supplements;

    public String getSupplements() {
        return supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    public List<PaxDetails> getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(List<PaxDetails> occupancy) {
        this.occupancy = occupancy;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRateKey() {
        return rateKey;
    }

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Boolean getRequestPaymentData() {
        return requestPaymentData;
    }

    public void setRequestPaymentData(Boolean requestPaymentData) {
        this.requestPaymentData = requestPaymentData;
    }
}
