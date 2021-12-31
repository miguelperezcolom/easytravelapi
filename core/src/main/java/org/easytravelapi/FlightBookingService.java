package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.flight.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("{authtoken}/flight")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Set of available operations related to transfer booking process")
public interface FlightBookingService {

    @GET
    @Path("/available")
    @ApiOperation(value = "Get available transfers", notes = "Use this method to know which transfers are available and their prices")
    public GetAvailableFlightsRS getAvailableFlights(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Flight origin, airport IATA code")
            @QueryParam("origin") String originAirportId,
            @ApiParam(value = "Flight destination, airport IATA code")
            @QueryParam("destination") String destinationAirportId,
            @ApiParam(value = "Number of adults")
            @QueryParam("adults") int adults,
            @ApiParam(value = "Number of children")
            @QueryParam("children") int children,
            @ApiParam(value = "Number of infants")
            @QueryParam("infants") int infants,
            @ApiParam(value = "Locale date for the departure, in YYYYMMDD format")
            @QueryParam("departuredate") int departureDate,
            @ApiParam(value = "Locale date for the return, in YYYYMMDD format")
            @QueryParam("returndate") int returnDate,
            @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/pricedetails/{departurekey}/{returnkey}")
    @ApiOperation(value = "Get transfer price details", notes = "Use this method to guess cancellation costs and important remarks")
    public GetFlightPriceDetailsRS getFlightPriceDetails(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The hotel price key, as provided in the /transfer/available step")
            @PathParam("departurekey") String departureKey,
            @PathParam("returnkey") String returnKey,
            @QueryParam("language") String language,
            @ApiParam(value = "Discount coupons")
            @QueryParam("promoCode") String promoCode
    ) throws Throwable;

    @POST
    @Path("/booking")
    @ApiOperation(value = "Confirm transfer booking", notes = "Use this method to confirm a transfer service booking")
    public BookFlightRS bookFlight(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            BookFlightRQ rq
    ) throws Throwable;

    @GET
    @Path("/originairports")
    @ApiOperation(value = "Get airports list", notes = "Use this method to get all available airports")
    public GetAirportsRS getOriginAirports(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The airport id to get destinations")
            @QueryParam("destinationAirportId") String destinationAirportId
            , @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/destinationairports")
    @ApiOperation(value = "Get airports list", notes = "Use this method to get all available airports")
    public GetAirportsRS getDestinationAirports(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The airport id to get destinations")
            @QueryParam("originAirportId") String originAirportId
            , @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/airportsbyname")
    @ApiOperation(value = "Get airports list", notes = "Use this method to get all available airports")
    public GetAirportsRS getAirportsByName(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The airport id to get destinations")
            @QueryParam("text") String text
            , @QueryParam("language") String language
    ) throws Throwable;

}
