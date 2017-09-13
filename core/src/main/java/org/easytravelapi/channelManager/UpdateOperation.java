package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Describes an update operation, like modifying allotment, prices or stop sales")
public class UpdateOperation {

    @ApiModelProperty(value = "Hotel id you got when you called the getgrantedhotels method")
    private String hotelId;

    @ApiModelProperty(value = "Room id you got when you called the getgrantedhotels method")
    private String roomId;

    //todo: completar lista operaciones disponibles
    @ApiModelProperty(value = "Action you want to perform. E.g. STOPSALES, OPENSALES, SETPRICE, SETALLOTMENT, ...")
    private String action;

    @ApiModelProperty(value = "Locale date this data starts appliance. In format YYYMMDD")
    private int startDate;

    @ApiModelProperty(value = "Locale date this data ends appliance. In format YYYMMDD")
    private int endDate;

    @ApiModelProperty(value = "New value to be set")
    private String newValue;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
}
