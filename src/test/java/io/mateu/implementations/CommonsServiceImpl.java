package io.mateu.implementations;

import io.mateu.easytravelapi.CommonsService;
import io.mateu.easytravelapi.common.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class CommonsServiceImpl implements CommonsService {
    public GetWorldRS getPortfolio(@FormParam("rq") GetWorldRQ rq) {
        return null;
    }

    public GetDataSheetRS getDataSheet(@FormParam("rq") GetDataSheetRQ rq) {
        return null;
    }

    public GetBookingsRS getBookings(@FormParam("rq") GetBookingsRQ rq) {
        return null;
    }

    public CancelBookingRS cancelBooking(@FormParam("rq") CancelBookingRQ rq) {
        return null;
    }
}
