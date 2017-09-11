package org.easytravelapi.hotel;

import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class AvailableHotel {

    private String hotelId;
    private String hotelName;
    private String hotelCategoryId;
    private String hotelCategoryName;
    private String longitude;
    private String latitude;

    private List<Option> options;


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
}
