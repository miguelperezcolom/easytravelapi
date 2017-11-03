package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An occupied room and the available board basis")
public class Allocation {

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

    public Allocation(int numberOfRooms, int paxPerRoom, int[] ages, String roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.numberOfRooms = numberOfRooms;
        this.paxPerRoom = paxPerRoom;
        this.ages = ages;
    }

    public Allocation() {
    }

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
