package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getroominglist response")
public class GetRoomingListRS extends AbstractRS {

    @ApiModelProperty(value = "List of hotel bookings")
    private List<HotelBooking> bookings = new ArrayList<HotelBooking>();

    public List<HotelBooking> getBookings() {
        return bookings;
    }

    public void setBookings(List<HotelBooking> bookings) {
        this.bookings = bookings;
    }
}
