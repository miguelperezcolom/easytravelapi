package org.easytravelapi.hotel;

import org.easytravelapi.common.AbstractRS;

/**
 * Created by miguel on 26/7/17.
 */
public class BookHotelRS extends AbstractRS {

    private String bookingId;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
