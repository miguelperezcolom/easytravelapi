package org.easytravelapi.circuit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Parameters needed to confirm an circuit booking")
public class BookCircuitRQ {

    private String key;

    private int date;

    private String language;

    private String shiftId;

    private String variantId;

    private int adults;
    private int children;
    private int infants;

    private String supplementIds;

    @ApiModelProperty(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
    private String bookingReference;

    @ApiModelProperty(value = "The lead name")
    private String leadName;

    @ApiModelProperty(value = "Comments from the customer which should arrive to the circuit provider")
    private String commentsToProvider;

    @ApiModelProperty(value = "Your comments for us. They will not be visible to the customer neither to the circuit provider")
    private String privateComments;

    @ApiModelProperty(value = "Your phone number to contact with you")
    private String phoneNumber;

    @ApiModelProperty(value = "User Email. Used to locate your bookings")
    private String email;

    @ApiModelProperty(value = "Token for server validation captcha")
    private String captchaToken;

    public static BookCircuitRQ fromString(String json) {
        return Helper.fromString(BookCircuitRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
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

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId;
    }

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
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

    public int getInfants() { return infants; }

    public void setInfants(int infants) { this.infants = infants; }

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

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getKey() { return key; }

    public void setKey(String key) { this.key = key; }

    public String getCaptchaToken() { return captchaToken; }

    public void setCaptchaToken(String captchaToken) { this.captchaToken = captchaToken; }
}
