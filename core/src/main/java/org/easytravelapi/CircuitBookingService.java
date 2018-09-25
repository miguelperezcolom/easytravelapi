package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.circuit.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("{authtoken}/circuit")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Operations related to the circuit booking process")
public interface CircuitBookingService {

    @GET
    @Path("/available")
    @ApiOperation(value = "Get available circuits", notes = "By passing a resort and holidays dates you get a list of the available circuits")
    public GetAvailableCircuitsRS getAvailableCircuits(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Holidays start date in YYYYMMDD format")
            @QueryParam("start") int start,
            @ApiParam(value = "Holidays end date in YYYYMMDD format")
            @QueryParam("end") int end,
            @ApiParam(value = "Resort ID. You can get it from commons/getportfolio")
            @QueryParam("resourceid") String resourceId,
            @QueryParam("language") String language
    ) throws Throwable;


    @GET
    @Path("/rates/{key}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetCircuitRatesRS getCircuitRates(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The circuit price key, as provided in the /circuit/available step")
            @PathParam("key") String key,
            @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/price/{key}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetCircuitPriceRS getCircuitPrice(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The circuit price key, as provided in the /circuit/available step")
            @PathParam("key") String key,
            @QueryParam("language") String language,
            @QueryParam("adults") int adults,
            @QueryParam("children") int children,
            @QueryParam("infants") int infants,
            @QueryParam("datekey") String datekey,
            @QueryParam("variantkey") String variantkeykey,
            @QueryParam("pickup") String pickup,
            @QueryParam("supplements") String supplements
    ) throws Throwable;


    @GET
    @Path("/pricedetails/{key}")
    @ApiOperation(value = "Get extra info", notes = "By passing a price key you get extra info")
    public GetCircuitPriceDetailsRS getCircuitPriceDetails(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The circuit price key, as provided in the /circuit/available step")
            @PathParam("key") String key,
            @QueryParam("language") String language,
            @QueryParam("adults") int adults,
            @QueryParam("ages") int children,
            @QueryParam("vehicles") int vehicles,
            @QueryParam("supplements") String supplements
    ) throws Throwable;



    @PUT
    @Path("/booking")
    @ApiOperation(value = "Book an circuit", notes = "Here you can confirm a circuit booking. You must provide a price key and some additional data (lead name, comments, ...)")
    public BookCircuitRS bookCircuit(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            BookCircuitRQ rq
    ) throws Throwable;

}
