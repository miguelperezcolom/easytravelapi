package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the hotel booking confirmation response")
public class BookHotelRS extends AbstractRS {

    @ApiModelProperty(value = "The booking id")
    private String bookingId;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
