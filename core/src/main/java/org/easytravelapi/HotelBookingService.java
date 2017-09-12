package org.easytravelapi;


import io.swagger.annotations.Api;
import org.easytravelapi.hotel.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("/hotel/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api
public interface HotelBookingService {

    @POST
    @Path("/getavailable")
    public GetAvailableHotelsRS getAvailableHotels(GetAvailableHotelsRQ rq);

    @POST
    @Path("/pricedetails")
    public GetHotelPriceDetailsRS getHotelPriceDetails(GetHotelPriceDetailsRQ rq);

    @POST
    @Path("/book")
    public BookHotelRS bookHotel(BookHotelRQ rq);

}
