package org.easytravelapi.implementations;

import org.easytravelapi.CommonsService;
import org.easytravelapi.common.*;

/**
 * Created by miguel on 27/7/17.
 */
public class CommonsServiceImpl implements CommonsService {
    public GetPortfolioRS getPortfolio(GetPortfolioRQ rq) {
        System.out.println("rq = " + rq);
        return new GetPortfolioRS();
    }

    public GetDataSheetRS getDataSheet(GetDataSheetRQ rq) {
        System.out.println("rq = " + rq);
        return new GetDataSheetRS();
    }

    public GetBookingsRS getBookings(GetBookingsRQ rq) {
        System.out.println("rq = " + rq);
        return new GetBookingsRS();
    }

    public CancelBookingRS cancelBooking(CancelBookingRQ rq) {
        System.out.println("rq = " + rq);

        CancelBookingRS rs = new CancelBookingRS();



        return rs;
    }
}
