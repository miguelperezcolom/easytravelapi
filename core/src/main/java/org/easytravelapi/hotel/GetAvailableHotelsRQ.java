package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the hotel availability request")
public class GetAvailableHotelsRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "The list of resorts you are interested in")
    private List<String> resorts = new ArrayList<String>();

    @ApiModelProperty(value = "The locale checkin date in YYYYMMDD format")
    private int checkIn;
    @ApiModelProperty(value = "The locale checkout date in YYYYMMDD format")
    private int checkout;

    @ApiModelProperty(value = "List of occupancies you need")
    private List<Occupancy> occupancies = new ArrayList<Occupancy>();

    @ApiModelProperty(value = "Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter")
    private boolean includeStaticInfo;


    public static GetAvailableHotelsRQ fromString(String json) {
        return Helper.fromString(GetAvailableHotelsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public List<String> getResorts() {
        return resorts;
    }

    public void setResorts(List<String> resorts) {
        this.resorts = resorts;
    }

    public int getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(int checkIn) {
        this.checkIn = checkIn;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public List<Occupancy> getOccupancies() {
        return occupancies;
    }

    public void setOccupancies(List<Occupancy> occupancies) {
        this.occupancies = occupancies;
    }

    public boolean isIncludeStaticInfo() {
        return includeStaticInfo;
    }

    public void setIncludeStaticInfo(boolean includeStaticInfo) {
        this.includeStaticInfo = includeStaticInfo;
    }
}
