package io.mateu.easytravelapi;

import io.mateu.easytravelapi.common.*;

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
public interface CommonsService {

    @POST
    @Path("/getportfolio")
    public GetWorldRS getPortfolio(@FormParam("rq") GetWorldRQ rq);

    @POST
    @Path("/getdatasheet")
    public GetDataSheetRS getDataSheet(@FormParam("rq") GetDataSheetRQ rq);

    @POST
    @Path("/getbookings")
    public GetBookingsRS getBookings(@FormParam("rq") GetBookingsRQ rq);

    @POST
    @Path("/cancelbooking")
    public CancelBookingRS cancelBooking(@FormParam("rq") CancelBookingRQ rq);



}
