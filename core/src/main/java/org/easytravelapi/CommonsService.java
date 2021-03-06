package org.easytravelapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.common.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("{authtoken}/commons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Set of generic operations which do not fit any other place")
public interface CommonsService {

    @GET
    @Path("/portfolio")
    @ApiOperation(value = "Method to get the whole product tree")
    public GetPortfolioRS getPortfolio(@ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method")
                                       @PathParam("authtoken") String token) throws Throwable;

    @GET
    @Path("/search")
    @ApiOperation(value = "Method to get the whole product tree")
    public SearchPortfolioRS searchPortfolio(@ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
                                             @ApiParam(value = "2 chars language iso code")
                                             @QueryParam("language") String language,
                                             @QueryParam("product") String product,
                                             @ApiParam(value="Search text")@QueryParam("query") String query) throws Throwable;


    @GET
    @Path("/searchtransferpoints")
    @ApiOperation(value = "Method to get the transfer points")
    public SearchPortfolioRS searchTransferPoints(@ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
                                             @ApiParam(value = "2 chars language iso code")
                                             @QueryParam("language") String language,
                                             @ApiParam(value="Search text")@QueryParam("query") String query) throws Throwable;

    @GET
    @Path("/datasheet/{resourceid}")
    @ApiOperation(value = "Method to get a resource data sheet. E.g. descriptions, images, features")
    public GetDataSheetRS getDataSheet(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @PathParam("resourceid") String resourceId,
            @QueryParam("language") String language
    ) throws Throwable;

    @GET
    @Path("/bookings")
    @ApiOperation(value = "Method to get a list of bookings")
    public GetBookingsRS getBookings(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Starting date you want service bookings confirmed from. In YYYYMMDD format")
            @QueryParam("confirmedfrom") int fromConfirmationDate,
            @ApiParam(value = "Ending date you want service bookings confirmed to. In YYYYMMDD format")
            @QueryParam("confirmedto") int toConfirmationDate,
            @ApiParam(value = "Starting date you want service bookings starting from. In YYYYMMDD format")
            @QueryParam("startingfrom") int fromStartDate,
            @ApiParam(value = "Ending date you want service bookings starting from. In YYYYMMDD format")
            @QueryParam("startingto") int toStartDate
    ) throws Throwable;

    @GET
    @Path("/bookingforweb/{email}/{bookingid}")
    @ApiOperation(value = "Method to get a booking")
    public GetBookingRS getBookingForWeb(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @PathParam("email") String email,
            @PathParam("bookingid") String bookingId) throws Throwable;

    @GET
    @Path("/booking/{bookingid}")
    @ApiOperation(value = "Method to get a booking")
    public GetBookingRS getBooking(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @PathParam("bookingid") String bookingId) throws Throwable;

    @DELETE
    @Path("/booking/{bookingid}")
    @ApiOperation(value = "Method to cancel a service booking")
    public CancelBookingRS cancelBooking(@ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
                                         @ApiParam(value = "The service booking id you want to cancel")
                                         @PathParam("bookingid") String bookingId) throws Throwable;


    @GET
    @Path("/files")
    @ApiOperation(value = "Method to get a list of files")
    public GetFilesRS getFiles(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Starting date you want service file confirmed from. In YYYYMMDD format")
            @QueryParam("confirmedfrom") int fromConfirmationDate,
            @ApiParam(value = "Ending date you want service files confirmed to. In YYYYMMDD format")
            @QueryParam("confirmedto") int toConfirmationDate,
            @ApiParam(value = "Starting date you want service files starting from. In YYYYMMDD format")
            @QueryParam("startingfrom") int fromStartDate,
            @ApiParam(value = "Ending date you want service files starting from. In YYYYMMDD format")
            @QueryParam("startingto") int toStartDate
    ) throws Throwable;

   /* @GET
    @Path("/file/{email}/{fileid}")
    @ApiOperation(value = "Method to get a file")
    public GetFileRS getFile(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @PathParam("email") String email,
            @PathParam("fileid") String fileId) throws Throwable;*/

    @GET
    @Path("/file/{fileid}")
    @ApiOperation(value = "Method to get a file")
    public GetFileRS getFile(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @PathParam("fileid") String FileId) throws Throwable;

    @GET
    @Path("/fileforweb/{email}/{fileid}")
    @ApiOperation(value = "Method to get a file")
    public GetFileRS getFileForWeb(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @PathParam("email") String email,
            @PathParam("fileid") String fileId) throws Throwable;

    @DELETE
    @Path("/file/{fileid}")
    @ApiOperation(value = "Method to cancel a service file")
    public CancelFileRS cancelFile(@ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
                                         @ApiParam(value = "The service file id you want to cancel")
                                         @PathParam("fileid") String fileId) throws Throwable;


    @GET
    @Path("/newtoken")
    @ApiOperation(value = "Use this method to get or renew your authentication token")
    public String renewToken(@ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token, @QueryParam("user") String user) throws Throwable;



    @GET
    @Path("/mealplans")
    @ApiOperation(value = "Method to get a list of board types")
    public MealPlansListRS getMealPlans(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token
    ) throws Throwable;

    @GET
    @Path("/fromlocator/{locatorid}")
    @ApiOperation(value = "get data from a Locator")
    public GetLocatorRS getFromLocator(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @PathParam("locatorid") String locatorid
    ) throws Throwable;

}
