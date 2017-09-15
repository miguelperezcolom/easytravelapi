package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.channelManager.UpdateOperation;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Number of rooms you need and how many pax per room")
public class Occupancy {

    @ApiModelProperty(value = "Number of rooms")
    private int numberOfRooms;
    @ApiModelProperty(value = "Pax per room")
    private int paxPerRoom;
    @ApiModelProperty(value = "Ages for each pax. If not stated the pax will be assumed to be an adult")
    private int[] ages;


    public static Occupancy fromString(String json) {
        return Helper.fromString(Occupancy.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getPaxPerRoom() {
        return paxPerRoom;
    }

    public void setPaxPerRoom(int paxPerRoom) {
        this.paxPerRoom = paxPerRoom;
    }

    public int[] getAges() {
        return ages;
    }

    public void setAges(int[] ages) {
        this.ages = ages;
    }
}
