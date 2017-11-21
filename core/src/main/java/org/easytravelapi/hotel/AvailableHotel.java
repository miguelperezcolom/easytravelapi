package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An available hotel, including prices")
public class AvailableHotel {

    @ApiModelProperty(value = "The hotel id")
    private String hotelId;
    @ApiModelProperty(value = "The hotel name")
    private String hotelName;
    @ApiModelProperty(value = "The hotel category id")
    private String hotelCategoryId;
    @ApiModelProperty(value = "The hotel category name")
    private String hotelCategoryName;
    @ApiModelProperty(value = "Google longitude")
    private String longitude;
    @ApiModelProperty(value = "Google latitude")
    private String latitude;
    @ApiModelProperty(value = "Best available rate. E.g. 153.45 EUR. NOTAVAILABLE when this hotel is not available.")
    private String bestDeal;

    @ApiModelProperty(value = "List of available options")
    private List<Option> options = new ArrayList<Option>();


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

    public String getHotelCategoryId() {
        return hotelCategoryId;
    }

    public void setHotelCategoryId(String hotelCategoryId) {
        this.hotelCategoryId = hotelCategoryId;
    }

    public String getHotelCategoryName() {
        return hotelCategoryName;
    }

    public void setHotelCategoryName(String hotelCategoryName) {
        this.hotelCategoryName = hotelCategoryName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getBestDeal() {
        return bestDeal;
    }

    public void setBestDeal(String bestDeal) {
        this.bestDeal = bestDeal;
    }
}
