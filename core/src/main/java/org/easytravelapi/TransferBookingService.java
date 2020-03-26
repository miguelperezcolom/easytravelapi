package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.transfer.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("{authtoken}/transfer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Set of available operations related to transfer booking process")
public interface TransferBookingService {

    @GET
    @Path("/available")
    @ApiOperation(value = "Get available transfers", notes = "Use this method to know which transfers are available and their prices")
    public GetAvailableTransfersRS getAvailabeTransfers(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Transfer origin, as got in the getportfolio response")
            @QueryParam("from") String fromTransferPointId,
            @ApiParam(value = "Transfer destination, as got in the getportfolio response")
            @QueryParam("to") String toTransferPointId,
            @ApiParam(value = "Number of pax")
            @QueryParam("pax") int pax,
            @ApiParam(value = "Number of bikes")
            @QueryParam("bikes") int bikes,
            @ApiParam(value = "Number of golf baggages")
            @QueryParam("golfs") int golfBaggages,
            @ApiParam(value = "Number of skis")
            @QueryParam("skis") int skis,
            @ApiParam(value = "Number of big luggages not bikes neither golf baggages")
            @QueryParam("bigs") int bigLuggages,
            @ApiParam(value = "Number of wheel chairs")
            @QueryParam("wheelchairs") int wheelChairs,
            @ApiParam(value = "Locale date for the incoming side of the transfer, in YYYYMMDD format")
            @QueryParam("incomingdate") int incomingDate,
            @ApiParam(value = "Locale date for the outgoing / return side of the transfer, in YYYYMMDD format")
            @QueryParam("outgoingdate") int outgoingDate,
            @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/pricedetails/{key}")
    @ApiOperation(value = "Get transfer price details", notes = "Use this method to guess cancellation costs and important remarks")
    public GetTransferPriceDetailsRS getTransferPriceDetails(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The hotel price key, as provided in the /transfer/available step")
            @PathParam("key") String key,
            @QueryParam("language") String language,
            @QueryParam("supplements") String supplements,
            @ApiParam(value = "Discount coupons")
            @QueryParam("coupon") String coupon
    ) throws Throwable;

    @PUT
    @Path("/booking")
    @ApiOperation(value = "Confirm transfer booking", notes = "Use this method to confirm a transfer service booking")
    public BookTransferRS bookTransfer(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            BookTransferRQ rq

    ) throws Throwable;

    @GET
    @Path("/airports")
    @ApiOperation(value = "Get airports list", notes = "Use this method to get all available airports")
    public GetAirportsRS getAirports(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token

    ) throws Throwable;

    @GET
    @Path("/airports/{airportId}/destinations")
    @ApiOperation(value = "Get destinations for airport", notes = "Use this method to get all available destinations from an airport key")
    public GetDestinationRS getDestinationsForAirport(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
             @ApiParam(value = "The airport key to get destinations")
             @PathParam("airportId") String airportId

    ) throws Throwable;

    @GET
    @Path("/destinations")
    @ApiOperation(value = "Get all destinations", notes = "Use this method to get all available destinations from an airport key")
    public GetDestinationRS getDestinations(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token
    ) throws Throwable;

    @GET
    @Path("/filter")
    @ApiOperation(value = "Aget available transfers filtered", notes = "Use this method to filter transfers wich are available and their prices")
    public GetAvailableTransfersRS getFilteredTransfers(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Transfer origin, as got in the getportfolio response")
            @QueryParam("from") String fromTransferPointId,
            @ApiParam(value = "Transfer destination, as got in the getportfolio response")
            @QueryParam("to") String toTransferPointId,
            @ApiParam(value = "Number of pax")
            @QueryParam("pax") int pax,
            @ApiParam(value = "Number of bikes")
            @QueryParam("bikes") int bikes,
            @ApiParam(value = "Number of golf baggages")
            @QueryParam("golfs") int golfBaggages,
            @ApiParam(value = "Number of skis")
            @QueryParam("skis") int skis,
            @ApiParam(value = "Number of big luggages not bikes neither golf baggages")
            @QueryParam("bigs") int bigLuggages,
            @ApiParam(value = "Number of wheel chairs")
            @QueryParam("wheelchairs") int wheelChairs,
            @ApiParam(value = "Locale date for the incoming side of the transfer, in YYYYMMDD format")
            @QueryParam("incomingdate") int incomingDate,
            @ApiParam(value = "Locale date for the outgoing / return side of the transfer, in YYYYMMDD format")
            @QueryParam("outgoingdate") int outgoingDate,
            @QueryParam("transfertype") String transfertypes,
            @ApiParam(value = "Min price range to filter")
            @QueryParam("minprice") double minPrice,
            @ApiParam(value = "Max price range to filter")
            @QueryParam("maxprice") double maxPrice,
            @QueryParam("language") String language
    ) throws Throwable;


}
