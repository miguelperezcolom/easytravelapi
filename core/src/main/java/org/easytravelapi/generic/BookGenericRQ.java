package org.easytravelapi.generic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.activity.BookActivityRQ;
import org.easytravelapi.util.Helper;
@ApiModel(description = "Parameters needed to confirm an generic product booking")
public class BookGenericRQ {

    private String fileId;

    private String key;
    private String supplementIds;

    @ApiModelProperty(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
    private String bookingReference;

    @ApiModelProperty(value = "The lead name")
    private String leadName;

    @ApiModelProperty(value = "Comments from the customer which should arrive to the activity provider")
    private String commentsToProvider;

    @ApiModelProperty(value = "Your phone number to contact with you")
    private String phoneNumber;

    @ApiModelProperty(value = "User Email. Used to locate your bookings")
    private String email;

    @ApiModelProperty(value = "Token for server validation captcha")
    private String captchaToken;

    @ApiModelProperty(value = "User language")
    private String language;

    @ApiModelProperty(value = "Booking extras")
    private String supplements;

    @ApiModelProperty(value = "Booking coupon discount")
    private String coupon;

    private boolean mailingUnwanted;

    public static BookActivityRQ fromString(String json) {
        return Helper.fromString(BookActivityRQ.class, json);
    }


    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSupplementIds() {
        return supplementIds;
    }

    public void setSupplementIds(String supplementIds) {
        this.supplementIds = supplementIds;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCaptchaToken() { return captchaToken; }

    public void setCaptchaToken(String captchaToken) { this.captchaToken = captchaToken; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public String getSupplements() { return supplements; }

    public void setSupplements(String supplements) { this.supplements = supplements; }

    public String getCoupon() { return coupon; }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public boolean isMailingUnwanted() { return mailingUnwanted; }

    public void setMailingUnwanted(boolean mailingUnwanted) { this.mailingUnwanted = mailingUnwanted; }
}
