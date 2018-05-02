package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An available room combination the fits your occcupation")
public class Allocation {

    private int numberOfRooms;
    @ApiModelProperty(value = "Pax per room")
    private int paxPerRoom;
    @ApiModelProperty(value = "Ages. If not present we will assume the pax is an adult")
    private int[] ages;

    @ApiModelProperty(value = "List of available board basis and prices for each board")
    private List<Option> options = new ArrayList<Option>();


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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
