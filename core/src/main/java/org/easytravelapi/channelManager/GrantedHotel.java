package org.easytravelapi.channelManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GrantedHotel {

    private String hotelId;
    private String hotelName;

    private List<RoomId> roomIds = new ArrayList<RoomId>();


    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<RoomId> getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(List<RoomId> roomIds) {
        this.roomIds = roomIds;
    }
}
