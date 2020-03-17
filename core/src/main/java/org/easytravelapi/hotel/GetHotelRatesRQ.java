package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModelProperty;

public class GetHotelRatesRQ {
    @ApiModelProperty(value = "Key for using in next step (get hotel rates)")
    private String language;
    private String hotelId;
    private String hotelKey;
    private int checkin;
    private int checkout;
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

    public String getHotelKey() {
        return hotelKey;
    }

    public void setHotelKey(String hotelKey) {
        this.hotelKey = hotelKey;
    }
}
