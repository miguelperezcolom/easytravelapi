package io.mateu.easytravelapi;

import io.mateu.easytravelapi.hotel.*;

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
public interface HotelBookingService {

    @POST
    @Path("/getavailable")
    public GetAvailableHotelsRS getAvailabeHotels(@FormParam("rq") GetAvailableHotelsRQ rq);

    @POST
    @Path("/pricedetails")
    public GetHotelPriceDetailsRS getHotelPriceDetails(@FormParam("rq") GetHotelPriceDetailsRQ rq);

    @POST
    @Path("/book")
    public BookHotelRS bookHotel(@FormParam("rq") BookHotelRQ rq);

}
