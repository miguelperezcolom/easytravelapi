package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.activity.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("/{authtoken}/activity/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Operations related to the activity booking process")
public interface ActivityBookingService {

    @GET
    @Path("/available")
    @ApiOperation(value = "Get available activities", notes = "By passing a resort and holidays dates you get a list of the available activities")
    public GetAvailableActivitiesRS getAvailableActivities(
            @PathParam("authtoken") String token,
            @ApiParam(value = "Holidays start date in YYYYMMDD format")
            int start,
            @ApiParam(value = "Holidays end date in YYYYMMDD format")
            int end,
            @ApiParam(value = "Resort ID. You can get it from commons/getportfolio")
            String resourceId,
            @ApiParam(value = "Number of pax")
            int pax,
            @ApiParam(value = "Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults")
            int[] ages
            );

    @GET
    @Path("/pricedetails")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetActivityPriceDetailsRS getActivityPriceDetails(
            @PathParam("authtoken") String token,
            @ApiParam(value = "The activity price key, as provided in the /activity/available step")
            String key
    );

    @PUT
    @Path("/booking")
    @ApiOperation(value = "Book an activity", notes = "Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)")
    public BookActivityRS bookActivity(
            @PathParam("authtoken") String token,
            @ApiParam(value = "The activity price key, as provided in the /activities/getavailable step")
            @FormParam("key") String key,
            @ApiParam(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
            @FormParam("bookingreference") String bookingReference,
            @ApiParam(value = "The lead name")
            @FormParam("leadname") String leadName,
            @ApiParam(value = "Comments from the customer which should arrive to the activity provider")
            @FormParam("commentstoprovider") String commentsToProvider,
            @ApiParam(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
            @FormParam("privatecomments") String privateComments
    );

}
