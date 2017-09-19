package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;
import org.easytravelapi.common.AbstractAuthenticatedRQ;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the transfer service confirmation request")
public class BookTransferRQ {

    @ApiModelProperty(value = "The price id, as we got it when we asked for available hotels")
    public String key;

    @ApiModelProperty(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
    private String bookingReference;

    @ApiModelProperty(value = "The lead name")
    private String leadName;

    @ApiModelProperty(value = "Comments from the customer which should arrive to the activity provider")
    private String commentsToProvider;

    @ApiModelProperty(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
    private String privateComments;

    @ApiModelProperty(value = "Incoming flight number")
    private String incomingFlightNumber;
    @ApiModelProperty(value = "Locale incoming flight time in YYYYMMDDHHMM format")
    private int incomingFlightTime;
    @ApiModelProperty(value = "Incoming flight origin")
    private String incomingFlightOrigin;

    @ApiModelProperty(value = "Outgoing flight number")
    private String outgoingFlightNumber;
    @ApiModelProperty(value = "Locale outgoing flight time in YYYYMMDDHHMM format")
    private int outgoingFlightTime;
    @ApiModelProperty(value = "Outgoing flight origin")
    private String outgoingFlightDestination;


    public static BookTransferRQ fromString(String json) {
        return Helper.fromString(BookTransferRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getIncomingFlightNumber() {
        return incomingFlightNumber;
    }

    public void setIncomingFlightNumber(String incomingFlightNumber) {
        this.incomingFlightNumber = incomingFlightNumber;
    }

    public int getIncomingFlightTime() {
        return incomingFlightTime;
    }

    public void setIncomingFlightTime(int incomingFlightTime) {
        this.incomingFlightTime = incomingFlightTime;
    }

    public String getIncomingFlightOrigin() {
        return incomingFlightOrigin;
    }

    public void setIncomingFlightOrigin(String incomingFlightOrigin) {
        this.incomingFlightOrigin = incomingFlightOrigin;
    }

    public String getOutgoingFlightNumber() {
        return outgoingFlightNumber;
    }

    public void setOutgoingFlightNumber(String outgoingFlightNumber) {
        this.outgoingFlightNumber = outgoingFlightNumber;
    }

    public int getOutgoingFlightTime() {
        return outgoingFlightTime;
    }

    public void setOutgoingFlightTime(int outgoingFlightTime) {
        this.outgoingFlightTime = outgoingFlightTime;
    }

    public String getOutgoingFlightDestination() {
        return outgoingFlightDestination;
    }

    public void setOutgoingFlightDestination(String outgoingFlightDestination) {
        this.outgoingFlightDestination = outgoingFlightDestination;
    }
}
