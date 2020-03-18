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
@ApiModel(description = "Container for the hotel booking confirmation request")
public class BookHotelRQ {

    @ApiModelProperty(value = "The price id, as we got it when we asked for available hotels")
    public List<BookingKey> rateKeys = new ArrayList<BookingKey>();

    @ApiModelProperty(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
    private String bookingReference;

    @ApiModelProperty(value = "The lead name")
    private String leadName;

    @ApiModelProperty(value = "User Email. Used to locate your bookings")
    private String email;

    @ApiModelProperty(value = "Comments from the customer which should arrive to the activity provider")
    private String commentsToProvider;

    @ApiModelProperty(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
    private String privateComments;

    @ApiModelProperty(value = "Token for server validation captcha")
    private String captchaToken;
    @ApiModelProperty(value = "User language")
    private String language;
    @ApiModelProperty(value = "Booking coupon discount")
    private String coupon;

    private boolean mailingUnwanted;

    public static BookHotelRQ fromString(String json) {
        return Helper.fromString(BookHotelRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

    public List<BookingKey> getRateKeys() {
        return rateKeys;
    }

    public void setRateKeys(List<BookingKey> rateKeys) {
        this.rateKeys = rateKeys;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public String getCommentsToProvider() {
        return commentsToProvider;
    }

    public void setCommentsToProvider(String commentsToProvider) {
        this.commentsToProvider = commentsToProvider;
    }

    public String getPrivateComments() {
        return privateComments;
    }

    public void setPrivateComments(String privateComments) {
        this.privateComments = privateComments;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getCaptchaToken() { return captchaToken; }

    public void setCaptchaToken(String captchaToken) { this.captchaToken = captchaToken; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public String getCoupon() { return coupon; }

    public void setCoupon(String coupon) { this.coupon = coupon; }

    public boolean isMailingUnwanted() { return mailingUnwanted; }

    public void setMailingUnwanted(boolean mailingUnwanted) { this.mailingUnwanted = mailingUnwanted; }
}
