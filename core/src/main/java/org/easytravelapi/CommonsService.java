package org.easytravelapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.easytravelapi.common.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("/commons/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Set of generic operations which do not fit any other place")
public interface CommonsService {

    @POST
    @Path("/getportfolio")
    @ApiOperation(value = "Method to get the whole product tree")
    public GetPortfolioRS getPortfolio(GetPortfolioRQ rq);

    @POST
    @Path("/getdatasheet")
    @ApiOperation(value = "Method to get a resource data sheet. E.g. descriptions, images, features")
    public GetDataSheetRS getDataSheet(GetDataSheetRQ rq);

    @POST
    @Path("/getbookings")
    @ApiOperation(value = "Method to get a list of bookings")
    public GetBookingsRS getBookings(GetBookingsRQ rq);

    @POST
    @Path("/cancelbooking")
    @ApiOperation(value = "Method to cancel a service booking")
    public CancelBookingRS cancelBooking(CancelBookingRQ rq);



}
