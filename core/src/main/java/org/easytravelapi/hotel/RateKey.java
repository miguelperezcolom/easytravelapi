package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "RateKey, rate data and occupation combination for booking confirm")
public class RateKey {
    @ApiModelProperty(value = "RateKey code")
    private String key;
    @ApiModelProperty(value = "Pax per room of rateKey")
    private int paxPerRoom;
    @ApiModelProperty(value = "Name of room of rateKey")
    private String roomName;
    @ApiModelProperty(value = "type of payment")
    private Boolean requestPaymentData;

    private List<Service> availableServices = new ArrayList<Service>();

    public String getKey() {
        return key;
    }

    public void setKey(String key) { this.key = key; }

    public int getPaxPerRoom() {
        return paxPerRoom;
    }

    public void setPaxPerRoom(int paxPerRoom) {
        this.paxPerRoom = paxPerRoom;
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

    public List<Service> getAvailableServices() {
        return availableServices;
    }

    public void setAvailableServices(List<Service> availableServices) {
        this.availableServices = availableServices;
    }
}
