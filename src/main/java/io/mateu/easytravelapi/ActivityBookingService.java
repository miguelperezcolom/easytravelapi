package io.mateu.easytravelapi;

import io.mateu.easytravelapi.activity.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("/activities/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ActivityBookingService {

    @POST
    @Path("/getavailable")
    public GetAvailableActivitiesRS getAvailableActivities(@FormParam("rq") GetAvailableActivitiesRQ rq);

    @POST
    @Path("/pricedetails")
    public GetActivityPriceDetailsRS getActivityPriceDetails(@FormParam("rq") GetActivityPriceDetailsRQ rq);

    @POST
    @Path("/book")
    public BookActivityRS bookActivity(@FormParam("rq") BookActivityRQ rq);

}
