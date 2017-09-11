package org.easytravelapi.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class Allocation extends Occupancy {

    private String roomId;
    private String roomName;

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
