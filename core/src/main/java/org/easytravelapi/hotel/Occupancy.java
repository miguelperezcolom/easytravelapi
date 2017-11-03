package org.easytravelapi.hotel;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.channelManager.UpdateOperation;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

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

    public Occupancy(int numberOfRooms, int paxPerRoom, int[] ages) {
        this.numberOfRooms = numberOfRooms;
        this.paxPerRoom = paxPerRoom;
        this.ages = ages;
    }

    public Occupancy() {
    }

    public Occupancy(String s) {

        //1x4-4-8

        System.out.println("occ=" + s);

        setPaxPerRoom(Integer.parseInt(s.split("x")[1].split("-")[0]));
        setNumberOfRooms(Integer.parseInt(s.split("x")[0]));

        String[] sas = s.split("-");
        List<Integer> edades = new ArrayList<Integer>();
        if (sas.length > 1) {
            for (int i = 1; i < sas.length; i++) {
                int edad = Integer.parseInt(sas[i]);
                if (edad < 20) {
                    edades.add(edad);
                }
            }
        }

        int[] edadesx = new int[edades.size()];
        for (int i = 0; i < edadesx.length; i++) edadesx[i] = edades.get(i);
        setAges(edadesx);
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
