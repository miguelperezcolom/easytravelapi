package org.easytravelapi;


import io.swagger.annotations.Api;
import org.easytravelapi.activity.*;

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
@Api
public interface ActivityBookingService {

    @POST
    @Path("/getavailable")
    public GetAvailableActivitiesRS getAvailableActivities(GetAvailableActivitiesRQ rq);

    @POST
    @Path("/pricedetails")
    public GetActivityPriceDetailsRS getActivityPriceDetails(GetActivityPriceDetailsRQ rq);

    @POST
    @Path("/book")
    public BookActivityRS bookActivity(BookActivityRQ rq);

}
