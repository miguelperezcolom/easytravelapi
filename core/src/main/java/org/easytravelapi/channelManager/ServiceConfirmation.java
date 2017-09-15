package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Service confirmation data")
public class ServiceConfirmation {

    @ApiModelProperty(value = "Service booking id, as provided by the getroominglist method")
    private String bookingId;
    @ApiModelProperty(value = "True if this service is OK. False if this service is not accepted")
    private boolean confirmed;
    @ApiModelProperty(value = "Comments you want to supply. E.g. the reason to reject the service request")
    private String comments;

    public static ServiceConfirmation fromString(String json) {
        return Helper.fromString(ServiceConfirmation.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
