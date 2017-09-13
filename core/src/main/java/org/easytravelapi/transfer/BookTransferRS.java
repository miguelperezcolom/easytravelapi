package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the tranfer booking confirmation response")
public class BookTransferRS extends AbstractRS {

    @ApiModelProperty(value = "Resultant booking id")
    private String bookingId;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
