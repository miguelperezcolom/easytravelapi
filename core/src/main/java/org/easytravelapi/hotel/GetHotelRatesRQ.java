package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Rq to get available hotel rates for each occupancy")
public class GetHotelRatesRQ {
    @ApiModelProperty(value = "2 char language iso code")
    private String language;
    @ApiModelProperty(value = "hotel id, as retrieved from hote available hotels response")
    private String hotelId;
    @ApiModelProperty(value = "The locale checkin date in YYYYMMDD format")
    private int checkin;
    @ApiModelProperty(value = "The locale checkout date in YYYYMMDD format")
    private int checkout;
    @ApiModelProperty(value = "Same as passed to the availability request. List comma separated list of occupancies you need in <nr of rooms>x<pax>[-<age>]* format. E.g.: 2x4-10-6-2,1x2 means 2 rooms occupied by 4 pax where 3 of them are 10, 6 and 2 years old and 1 room occupied by 2 pax")
    private String occupancies;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public int getCheckin() {
        return checkin;
    }

    public void setCheckin(int checkin) {
        this.checkin = checkin;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public String getOccupancies() {
        return occupancies;
    }

    public void setOccupancies(String occupancies) {
        this.occupancies = occupancies;
    }
}
