package org.easytravelapi.activity;

import org.easytravelapi.common.AbstractRS;

/**
 * Created by miguel on 26/7/17.
 */
public class BookActivityRS extends AbstractRS {

    private String bookingId;


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
