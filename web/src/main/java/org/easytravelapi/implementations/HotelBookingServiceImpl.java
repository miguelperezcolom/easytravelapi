package org.easytravelapi.implementations;

import org.easytravelapi.HotelBookingService;
import org.easytravelapi.hotel.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class HotelBookingServiceImpl implements HotelBookingService {
    public GetAvailableHotelsRS getAvailableHotels(GetAvailableHotelsRQ rq) {
        System.out.println("rq = " + rq);
        return new GetAvailableHotelsRS();
    }

    public GetHotelPriceDetailsRS getHotelPriceDetails(GetHotelPriceDetailsRQ rq) {
        return null;
    }

    public BookHotelRS bookHotel(BookHotelRQ rq) {
        return null;
    }
}
