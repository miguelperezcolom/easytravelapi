package io.mateu.implementations;

import io.mateu.easytravelapi.HotelBookingService;
import io.mateu.easytravelapi.hotel.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class HotelBookingServiceImpl implements HotelBookingService {
    public GetAvailableHotelsRS getAvailabeHotels(@FormParam("rq") GetAvailableHotelsRQ rq) {
        return null;
    }

    public GetHotelPriceDetailsRS getHotelPriceDetails(@FormParam("rq") GetHotelPriceDetailsRQ rq) {
        return null;
    }

    public BookHotelRS bookHotel(@FormParam("rq") BookHotelRQ rq) {
        return null;
    }
}
