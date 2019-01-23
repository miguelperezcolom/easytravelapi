package org.easytravelapi;


import io.swagger.annotations.Api;
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
@Path("{authtoken}/activity")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Operations related to the activity booking process")
public interface ActivityBookingService {

    @GET
    @Path("/available")
    @ApiOperation(value = "Get available activities", notes = "By passing a resort and holidays dates you get a list of the available activities")
    public GetAvailableActivitiesRS getAvailableActivities(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Holidays start date in YYYYMMDD format")
            @QueryParam("start") int start,
            @ApiParam(value = "Resort ID. You can get it from commons/getportfolio")
            @QueryParam("resorts") String resorts,
            @QueryParam("language") String language
            ) throws Throwable;


    @GET
    @Path("/rates/{activityId}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetActivityRatesRS getActivityRates(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The activity price key, as provided in the /activity/available step")
            @PathParam("activityId") String activityId,
            @QueryParam("date") int date,
            @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/check/{key}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public CheckActivityRS check(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The activity price key, as provided in the /activity/available step")
            @PathParam("key") String key,
            @QueryParam("date") int date,
            @QueryParam("language") String language,
            @QueryParam("adults") int adults,
            @QueryParam("children")int children,
            @QueryParam("variant")String variant,
            @QueryParam("shift")String shift,
            @QueryParam("pickup")String pickup,
            @QueryParam("activityLanguage")String activityLanguage
    ) throws Throwable;

    @GET
    @Path("/pricedetails/{key}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetActivityPriceDetailsRS getActivityPriceDetails(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The activity price key, as provided in the /activity/available step")
            @PathParam("key") String key,
            @QueryParam("language") String language,
            @QueryParam("supplements")String supplements,
            @ApiParam(value = "Discount coupons")
            @QueryParam("coupon") String coupon
    ) throws Throwable;



    @PUT
    @Path("/booking")
    @ApiOperation(value = "Book an activity", notes = "Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)")
    public BookActivityRS bookActivity(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            BookActivityRQ rq
    ) throws Throwable;

    @GET
    @Path("/filter")
    @ApiOperation(value = "Get available activities filtered", notes = "By passing a resort and holidays dates you get a list of the available activities")
    public GetAvailableActivitiesRS getFilteredActivities(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Holidays start date in YYYYMMDD format")
            @QueryParam("start") int start,
            @ApiParam(value = "Resort ID. You can get it from commons/getportfolio")
            @QueryParam("resourceid") String resourceId,
            @QueryParam("language") String language,
            @ApiParam(value = "Min price range to filter")
            @QueryParam("minprice") double minPrice,
            @ApiParam(value = "Max price range to filter")
            @QueryParam("maxprice") double maxPrice
    ) throws Throwable;


}
