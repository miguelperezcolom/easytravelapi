package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the cancelbooking request")
public class CancelBookingRQ extends AbstractAuthenticatedRQ {

    @ApiModelProperty(value = "The service booking id you want to cancel")
    private String bookingId;


    public static CancelBookingRQ fromString(String json) {
        return Helper.fromString(CancelBookingRQ.class, json);
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
}
