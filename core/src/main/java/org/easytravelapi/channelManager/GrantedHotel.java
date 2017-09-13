package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Contains hotel information like rooms ids, etc")
public class GrantedHotel {

    @ApiModelProperty(value = "Thid hotel id")
    private String hotelId;
    @ApiModelProperty(value = "This hotel name")
    private String hotelName;

    @ApiModelProperty(value = "List of room ids valid for this hotel")
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
