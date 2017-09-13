package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An occupied room and the available board basis")
public class Allocation extends Occupancy {

    @ApiModelProperty(value = "This room type id")
    private String roomId;
    @ApiModelProperty(value = "This room type name")
    private String roomName;
    @ApiModelProperty(value = "Number of rooms")
    private int numberOfRooms;
    @ApiModelProperty(value = "Pax per room")
    private int paxPerRoom;
    @ApiModelProperty(value = "Ages. If not present we will assume the pax is an adult")
    private int[] ages;

    @ApiModelProperty(value = "List of available board basis and prices for each board")
    private List<BoardPrice> prices = new ArrayList<BoardPrice>();


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

    public List<BoardPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<BoardPrice> prices) {
        this.prices = prices;
    }
}
