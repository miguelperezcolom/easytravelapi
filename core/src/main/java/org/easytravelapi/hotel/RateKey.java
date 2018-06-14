package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "RateKey, rate data and occupation combination for booking confirm")
public class RateKey {
    @ApiModelProperty(value = "RateKey code")
    private String key;
    @ApiModelProperty(value = "Pax per room of rateKey")
    private int paxPerRoom;
    @ApiModelProperty(value = "Name of room of rateKey")
    private String roomName;
    @ApiModelProperty(value = "type of payment")
    private String paymentType;

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

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
