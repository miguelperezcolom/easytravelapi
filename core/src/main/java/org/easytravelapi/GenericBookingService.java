package org.easytravelapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.activity.GetActivityRatesRS;
import org.easytravelapi.circuit.CheckCircuitRS;
import org.easytravelapi.generic.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@WebService
@Path("{authtoken}/generic")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Operations related to generics products booking process")
public interface GenericBookingService {
    @GET
    @Path("/available")
    @ApiOperation(value = "Get available generic products", notes = "you get a list of the available generic products by type")
    public GetAvailableGenericsRS getAvailableGenerics(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @QueryParam("destination") String  destination,
            @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/rates/{productId}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetGenericRatesRS getGenericRates(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The activity price key, as provided in the /activity/available step")
            @PathParam("productId") String productId,
            @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/check/{key}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public CheckGenericRS check(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The activity price key, as provided in the /activity/available step")
            @PathParam("key") String productId,
            @QueryParam("adults") int adults,
            @QueryParam("children")int children,
            @QueryParam("units")int units,
            @QueryParam("start") int start,
            @QueryParam("end") int end,
            @QueryParam("language") String language,
            @QueryParam("variant") String variant
    ) throws Throwable;

    @GET
    @Path("/pricedetails/{key}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetGenericPriceDetailsRS getGenericPriceDetails(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The generic product price key, as provided in the /genericty/available step")
            @PathParam("key") String key,
            @QueryParam("language") String language,
            @QueryParam("supplements")String supplements,
            @ApiParam(value = "Discount Coupon code")
            @QueryParam("coupon") String coupon

    ) throws Throwable;



    @PUT
    @Path("/booking")
    @ApiOperation(value = "Book a Generic Product", notes = "Here you can confirm Generic booking. You must provide a price key and some additional data (lead name, comments, ...)")
    public BookGenericRS bookGeneric(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            BookGenericRQ rq
    ) throws Throwable;

    @GET
    @Path("/filter")
    @ApiOperation(value = "Get available generic filtered", notes = "By passing a resort and holidays dates you get a list of the available generic products")
    public GetAvailableGenericsRS getFilteredGeneric(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "List of type of product to filter by separated by ,")
            @QueryParam("destination") String destination,
            @QueryParam("language") String language,
            @QueryParam("labels") String labels,
            @ApiParam(value = "Min price range to filter")
            @QueryParam("minprice") double minPrice,
            @ApiParam(value = "Max price range to filter")
            @QueryParam("maxprice") double maxPrice
    ) throws Throwable;

}
