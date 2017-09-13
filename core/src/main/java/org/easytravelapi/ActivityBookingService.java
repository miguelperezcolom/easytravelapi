package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(description = "Operations related to the activity booking process")
public interface ActivityBookingService {

    @POST
    @Path("/getavailable")
    @ApiOperation(value = "Get available activities", notes = "By passing a resort and holidays dates you get a list of the available activities")
    public GetAvailableActivitiesRS getAvailableActivities(GetAvailableActivitiesRQ rq);

    @POST
    @Path("/pricedetails")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetActivityPriceDetailsRS getActivityPriceDetails(GetActivityPriceDetailsRQ rq);

    @POST
    @Path("/book")
    @ApiOperation(value = "Book an activity", notes = "Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)")
    public BookActivityRS bookActivity(BookActivityRQ rq);

}
