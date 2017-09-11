package org.easytravelapi.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetBookingsRS extends AbstractRS {

    private List<Booking> bookings = new ArrayList<Booking>();


    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
