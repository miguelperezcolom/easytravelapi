package org.easytravelapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.common.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("/{authtoken}/commons/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Set of generic operations which do not fit any other place")
public interface CommonsService {

    @GET
    @Path("/portfolio")
    @ApiOperation(value = "Method to get the whole product tree")
    public GetPortfolioRS getPortfolio(@PathParam("authtoken") String token);

    @GET
    @Path("/datasheet/{resourceid}")
    @ApiOperation(value = "Method to get a resource data sheet. E.g. descriptions, images, features")
    public GetDataSheetRS getDataSheet(
            @PathParam("authtoken") String token,
            @PathParam("resourceid") String resourceId);

    @POST
    @Path("/bookings")
    @ApiOperation(value = "Method to get a list of bookings")
    public GetBookingsRS getBookings(
            @PathParam("authtoken") String token,
            @ApiParam(value = "Starting date you want service bookings confirmed from. In YYYYMMDD format")
            @QueryParam("confirmedfrom") int fromConfirmationDate,
            @ApiParam(value = "Ending date you want service bookings confirmed to. In YYYYMMDD format")
            @QueryParam("confirmedto") int toConfirmationDate,
            @ApiParam(value = "Starting date you want service bookings starting from. In YYYYMMDD format")
            @QueryParam("startingfrom") int fromStartDate,
            @ApiParam(value = "Ending date you want service bookings starting from. In YYYYMMDD format")
            @QueryParam("startingto") int toStartDate
    );

    @DELETE
    @Path("/booking/{bookingid}")
    @ApiOperation(value = "Method to cancel a service booking")
    public CancelBookingRS cancelBooking(@PathParam("authtoken") String token,
                                         @ApiParam(value = "The service booking id you want to cancel")
                                         @QueryParam("bookingid") String bookingId);


    @GET
    @Path("/getToken")
    @ApiOperation(value = "Use this method to get or renew your authentication token")
    public String getToken(@QueryParam("user") String user, @QueryParam("password") String password);


}
