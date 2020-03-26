package org.easytravelapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.cms.*;
import org.easytravelapi.generic.BookGenericRQ;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("{authtoken}/cms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "CMS related methods")
public interface CMSService {

    @GET
    @Path("/initialconfig")
    @ApiOperation(value = "Use this method to know which hotels are available and their prices")
    public GetInitialConfigRS getInitialConfig(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token
    ) throws Throwable;

    @GET
    @Path("/hotelavailabilitycalendar")
    @ApiOperation(value = "Use this method to know which hotels are available and their prices")
    public GetHotelAvailabilityCalendarRS getHotelAvailabilityCalendar(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The comma separated list of resorts you are interested in")
            @QueryParam("resorts") String resorts,
            @ApiParam(value = "The locale checkin date in YYYYMMDD format")
            @QueryParam("checkin") int checkin,
            @ApiParam(value = "The locale checkout date in YYYYMMDD format")
            @QueryParam("checkout") int checkout,
            @ApiParam(value = "List comma separated list of occupancies you need in <nr of rooms>x<pax>[-<age>]* format")
            @QueryParam("occupancies") String occupancies
    ) throws Throwable;

    @GET
    @Path("/activityavailabilitycalendar")
    @ApiOperation(value = "Use this method to know which hotels are available and their prices")
    public GetActivityAvailabilityCalendarRS getActivityAvailabilityCalendar(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The comma separated list of resorts you are interested in")
            @QueryParam("resorts") String activityId
    ) throws Throwable;

    @GET
    @Path("/circuitavailabilitycalendar")
    @ApiOperation(value = "Use this method to know which hotels are available and their prices")
    public GetActivityAvailabilityCalendarRS getCircuitAvailabilityCalendar(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The comma separated list of resorts you are interested in")
            @QueryParam("circuit") String circuitId
    ) throws Throwable;


    @GET
    @Path("/genericavailabilitycalendar")
    @ApiOperation(value = "Use this method to know which hotels are available and their prices")
    public GetActivityAvailabilityCalendarRS getGenericAvailabilityCalendar(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The comma separated list of resorts you are interested in")
            @QueryParam("product") String productId
    ) throws Throwable;

    @GET
    @Path("/activitychecklist")
    @ApiOperation(value = "Use this method to get  all lists of available activities in a given date")
    public GetActivityCheckListRS getActivityCheckList(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Date of activities ")
            @QueryParam("date") int date
    ) throws Throwable;

    @GET
    @Path("/eventchecklist")
    @ApiOperation(value = "Use this method to get  all lists of available events in a given excursion date")
    public GetEventCheckListRS getEventCheckList(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Activity Date")
            @QueryParam("date") int date,
            @ApiParam(value = "Activity Id")
            @QueryParam("activityId") String activityId

    ) throws Throwable;

    @GET
    @Path("/ticketchecklist")
    @ApiOperation(value = "Use this method to get list of tickets for an event")
    public GetTicketCheckListRS getTicketCheckList(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Event Id")
            @QueryParam("eventId") String eventId

    ) throws Throwable;

    @GET
    @Path("/checkticket")
    @ApiOperation(value = "Use this method to validate a ticket QR code with an activity's event")
    public CheckTicketRS checkTicket(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "Event Id")
            @QueryParam("eventId") String eventId,
            @ApiParam(value = "ticket's QR Code ")
            @QueryParam("qrcode") String qrcode

    ) throws Throwable;

    @POST
    @Path("/login")
    @ApiOperation(value = "Use this method to login the tickets app")
    public GetLoginRS loginToTicketsApp(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            GetLoginRQ login

    ) throws Throwable;

    @GET
    @Path("/offlinechecklist")
    @ApiOperation(value = "Use this method to get  all lists of available activities in a given date")
    public GetOfflineCheckListRS getOfflineCheckList(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token
          /*  @ApiParam(value = "The comma separated list of resorts you are interested in")
            @QueryParam("date") int date*/
    ) throws Throwable;


    @POST
    @Path("/updatetickets")
    @ApiOperation(value = "Use this method to syncronize data from offline tickets app")
    public GeUpdatedTicketsRS updateTickets(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            GetUpdatedTicketsRQ tickets

    ) throws Throwable;

    @PUT
    @Path("/cartbooking")
    @ApiOperation(value = "Use this method to syncronize data from offline tickets app")
    public BookCMSRS cartBooking(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            BookCMSRQ rq

    ) throws Throwable;

    @GET
    @Path("/terms")
    @ApiOperation(value = "Use this method to get  terms and conditions from backoffice")
    public GetTermsRS getTerms(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @QueryParam("language") String language
    ) throws Throwable;

}
