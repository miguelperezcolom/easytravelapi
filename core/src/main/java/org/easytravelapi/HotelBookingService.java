package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.hotel.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("{authtoken}/hotel")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Here you will find the booking service related methods")
public interface HotelBookingService {

    @GET
    @Path("/available")
    @ApiOperation(value = "Get available hotels", notes = "Use this method to know which hotels are available and their prices")
    public GetAvailableHotelsRS getAvailableHotels(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "2 chars language iso code")
            @QueryParam("language") String language,
            @ApiParam(value = "The comma separated list of resorts you are interested in")
            @QueryParam("resorts") String resorts,
            @ApiParam(value = "The locale checkin date in YYYYMMDD format")
            @QueryParam("checkin") int checkIn,
            @ApiParam(value = "The locale checkout date in YYYYMMDD format")
            @QueryParam("checkout") int checkout,
            @ApiParam(value = "List comma separated list of occupancies you need in <nr of rooms>x<pax>[-<age>]* format. E.g.: 2x4-10-6-2,1x2 means 2 rooms occupied by 4 pax where 3 of them are 10, 6 and 2 years old and 1 room occupied by 2 pax")
            @QueryParam("occupancies") String occupancies,
            @ApiParam(value = "Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter")
            @QueryParam("includestaticinfo") boolean includeStaticInfo
    ) throws Throwable;

    @POST
    @Path("/rates")
    @ApiOperation(value = "Get available hotel rates", notes = "Use this method to get available room rates for a hotel")
    public GetHotelRatesRS getRates(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "All the info needed to retrieve all available rates for a hotel and occupancies")GetHotelRatesRQ rq
    ) throws Throwable;

    @POST
    @Path("/pricedetails")
    @ApiOperation(value = "Get hotel price details", notes = "Use this methos to guess cancellation costs and important remarks regarding a price")
    public GetHotelPriceDetailsRS getHotelPriceDetails(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "All the info needed to retrieve ")GetHotelPriceDetailsRQ rq
    ) throws Throwable;

    @PUT
    @Path("/booking")
    @ApiOperation(value = "Confirm hotel booking", notes = "Use this method to confirm a hotel service")
    public BookHotelRS bookHotel(@ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
                                 BookHotelRQ rq) throws Throwable;

    @GET
    @Path("/filter")
    @ApiOperation(value = "Get available hotels filtered", notes = "Use this method to filter hotels available and their prices")
    public GetAvailableHotelsRS getFilteredHotels(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "2 chars language iso code")
            @QueryParam("language") String language,
            @ApiParam(value = "The comma separated list of resorts you are interested in")
            @QueryParam("resorts") String resorts,
            @ApiParam(value = "The locale checkin date in YYYYMMDD format")
            @QueryParam("checkin") int checkIn,
            @ApiParam(value = "The locale checkout date in YYYYMMDD format")
            @QueryParam("checkout") int checkout,
            @ApiParam(value = "List comma separated list of occupancies you need in <nr of rooms>x<pax>[-<age>]* format")
            @QueryParam("occupancies") String occupancies,
            @ApiParam(value = "List of categories selected to filter")
            @QueryParam("categories") String categories,
            @ApiParam(value = "Min price range to filter")
            @QueryParam("minprice") double minPrice,
            @ApiParam(value = "Max price range to filter")
            @QueryParam("maxprice") double maxPrice

    ) throws Throwable;

}
