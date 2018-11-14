package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModelProperty;

public class GetHotelRatesRQ {
    @ApiModelProperty(value = "Key for using in next step (get hotel rates)")
    private String hotelKey;
    private int checkin;
    private int checkout;

    public String getHotelKey() { return hotelKey; }

    public void setHotelKey(String hotelKey) { this.hotelKey = hotelKey; }

    public int getCheckin() { return checkin; }

    public void setCheckin(int checkin) { this.checkin = checkin; }

    public int getCheckout() { return checkout; }

    public void setCheckout(int checkout) { this.checkout = checkout; }
}
