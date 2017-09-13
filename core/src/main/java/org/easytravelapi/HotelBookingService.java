package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(description = "Here you will find the booking service related methods")
public interface HotelBookingService {

    @POST
    @Path("/getavailable")
    @ApiOperation(value = "Use this method to know which hotels are available and their prices")
    public GetAvailableHotelsRS getAvailableHotels(GetAvailableHotelsRQ rq);

    @POST
    @Path("/pricedetails")
    @ApiOperation(value = "Use this methos to guess cancellation costs and important remarks regarding a price")
    public GetHotelPriceDetailsRS getHotelPriceDetails(GetHotelPriceDetailsRQ rq);

    @POST
    @Path("/book")
    @ApiOperation(value = "Use this method to confirm a hotel service")
    public BookHotelRS bookHotel(BookHotelRQ rq);

}
