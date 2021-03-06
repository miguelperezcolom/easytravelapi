package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An available room and board combination the fits your occupancy")
public class Option {

    @ApiModelProperty(value = "This room type id")
    private String roomId;
    @ApiModelProperty(value = "This room type name")
    private String roomName;
    @ApiModelProperty(value = "This room description")
    private String roomDescription;
    @ApiModelProperty(value = "This room main image")
    private String image;

    @ApiModelProperty(value = "List of available board basis and prices for each board")
    private List<OptionBoardPrice> prices = new ArrayList<OptionBoardPrice>();

    @ApiModelProperty(value = "Number of available rooms. Check if you plan to use the same room several times")
    private int allotment;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<OptionBoardPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<OptionBoardPrice> prices) {
        this.prices = prices;
    }

    public int getAllotment() {
        return allotment;
    }

    public void setAllotment(int allotment) {
        this.allotment = allotment;
    }
}
