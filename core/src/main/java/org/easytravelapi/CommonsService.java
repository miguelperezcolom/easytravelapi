package org.easytravelapi;

import io.swagger.annotations.Api;
import org.easytravelapi.common.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("/commons/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api
public interface CommonsService {

    @POST
    @Path("/getportfolio")
    public GetWorldRS getPortfolio(GetWorldRQ rq);

    @POST
    @Path("/getdatasheet")
    public GetDataSheetRS getDataSheet(GetDataSheetRQ rq);

    @POST
    @Path("/getbookings")
    public GetBookingsRS getBookings(GetBookingsRQ rq);

    @POST
    @Path("/cancelbooking")
    public CancelBookingRS cancelBooking(CancelBookingRQ rq);



}
