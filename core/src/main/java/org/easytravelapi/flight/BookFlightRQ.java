package org.easytravelapi.flight;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.PaxDetails;
import org.easytravelapi.transfer.BookTransferRQ;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

public class BookFlightRQ {

    private String fileId;

    public String departureKey;

    public String returnKey;

    @ApiModelProperty(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
    private String bookingReference;

    @ApiModelProperty(value = "The lead name")
    private String leadName;

    @ApiModelProperty(value = "Comments from the customer which should arrive to the activity provider")
    private String commentsToProvider;

    @ApiModelProperty(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
    private String privateComments;

    @ApiModelProperty(value = "Contact telephone number")
    private String contactPhone;
    @ApiModelProperty(value = "User Email. Used to locate your bookings")
    private String email;

    @ApiModelProperty(value = "Token for server validation captcha")
    private String captchaToken;
    @ApiModelProperty(value = "User language")
    private String language;
    @ApiModelProperty(value = "Booking extras")
    private String supplements;
    @ApiModelProperty(value = "Booking promo code for discount")
    private String promoCode;

    private boolean mailingUnwanted;

    @ApiModelProperty(value = "Passengers info. Applies only when confirming")
    private List<PaxDetails> pax  = new ArrayList<>();


    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getDepartureKey() {
        return departureKey;
    }

    public void setDepartureKey(String departureKey) {
        this.departureKey = departureKey;
    }

    public String getReturnKey() {
        return returnKey;
    }

    public void setReturnKey(String returnKey) {
        this.returnKey = returnKey;
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

    public String getCaptchaToken() {
        return captchaToken;
    }

    public void setCaptchaToken(String captchaToken) {
        this.captchaToken = captchaToken;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSupplements() {
        return supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public boolean isMailingUnwanted() {
        return mailingUnwanted;
    }

    public void setMailingUnwanted(boolean mailingUnwanted) {
        this.mailingUnwanted = mailingUnwanted;
    }

    public List<PaxDetails> getPax() {
        return pax;
    }

    public void setPax(List<PaxDetails> pax) {
        this.pax = pax;
    }

    public static BookTransferRQ fromString(String json) {
        return Helper.fromString(BookTransferRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

}
