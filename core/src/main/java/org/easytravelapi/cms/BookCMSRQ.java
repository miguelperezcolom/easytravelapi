package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class BookCMSRQ {
    Map<String,Object> [] bookings;

    @ApiModelProperty(value = "Token for server validation captcha")
    private String captchaToken;

    @ApiModelProperty(value = "User language")
    private String language;

    private boolean mailingUnwanted;

    private String  travelAssuranceId;

    public Map<String, Object>[] getBookings() {
        return bookings;
    }

    public void setBookings(Map<String, Object>[] bookings) {
        this.bookings = bookings;
    }

    public String getCaptchaToken() { return captchaToken; }

    public void setCaptchaToken(String captchaToken) { this.captchaToken = captchaToken; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public boolean isMailingUnwanted() {
        return mailingUnwanted;
    }

    public void setMailingUnwanted(boolean mailingUnwanted) {
        this.mailingUnwanted = mailingUnwanted;
    }

    public String getTravelAssuranceId() {
        return travelAssuranceId;
    }

    public void setTravelAssuranceId(String travelAssuranceId) {
        this.travelAssuranceId = travelAssuranceId;
    }
}
