package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Rq to get hotel price details")
public class GetHotelPriceDetailsRQ {

    @ApiModelProperty(value = "2 char language iso code")
    private String language;
    @ApiModelProperty(value = "hotel id, as retrieved from hote available hotels response")
    private String hotelId;
    @ApiModelProperty(value = "The locale checkin date in YYYYMMDD format")
    private int checkin;
    @ApiModelProperty(value = "The locale checkout date in YYYYMMDD format")
    private int checkout;
    @ApiModelProperty(value = "List of stays (occupancies with desired room and board)")
    public List<Stay> stays = new ArrayList<Stay>();
    @ApiModelProperty(value = "Promo code")
    private String promoCode;


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

    public List<Stay> getStays() {
        return stays;
    }

    public void setStays(List<Stay> stays) {
        this.stays = stays;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }
}
