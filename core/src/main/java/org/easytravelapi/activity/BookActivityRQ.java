package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;
import org.easytravelapi.common.AbstractAuthenticatedRQ;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Parameters needed to confirm an activity booking")
public class BookActivityRQ {

    private String fileId;

    private String key;

    private String pickup;

    private int date;

    private String language;

    private String activityLanguage;

    private String shiftId;


    private int adults;
    private int children;
    private int infants;

    private String supplementIds;

    private boolean mailingUnwanted;

    @ApiModelProperty(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
    private String bookingReference;

    @ApiModelProperty(value = "The lead name")
    private String leadName;

    @ApiModelProperty(value = "Comments from the customer which should arrive to the activity provider")
    private String commentsToProvider;

    @ApiModelProperty(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
    private String privateComments;

    @ApiModelProperty(value = "Your room number to contact with you")
    private String roomNumber;

    @ApiModelProperty(value = "Your phone number to contact with you")
    private String phoneNumber;

    @ApiModelProperty(value = "Your email to contact with tou")
    private String email;

    @ApiModelProperty(value = "Token for server validation captcha")
    private String captchaToken;

    @ApiModelProperty(value = "Booking extras")
    private String supplements;
    @ApiModelProperty(value = "Booking coupon discount")
    private String coupon;

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

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getActivityLanguage() {
        return activityLanguage;
    }

    public void setActivityLanguage(String activityLanguage) {
        this.activityLanguage = activityLanguage;
    }

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getInfants() {
        return infants;
    }

    public void setInfants(int infants) {
        this.infants = infants;
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

    public String getPrivateComments() {
        return privateComments;
    }

    public void setPrivateComments(String privateComments) {
        this.privateComments = privateComments;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
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

    public String getSupplements() { return supplements; }

    public void setSupplements(String supplements) { this.supplements = supplements; }

    public String getCoupon() { return coupon; }

    public void setCoupon(String coupon) { this.coupon = coupon; }

    public boolean isMailingUnwanted() { return mailingUnwanted; }

    public void setMailingUnwanted(boolean mailingUnwanted) { this.mailingUnwanted = mailingUnwanted; }
}
