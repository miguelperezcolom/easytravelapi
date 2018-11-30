package org.easytravelapi.hotel;

public class GetHotelPriceDetailsRQ {
    private String ratekeys;
    private String coupon;

    public String getRatekeys() { return ratekeys; }

    public void setRatekeys(String ratekeys) { this.ratekeys = ratekeys; }

    public String getCoupon() { return coupon; }

    public void setCoupon(String coupon) { this.coupon = coupon; }
}
