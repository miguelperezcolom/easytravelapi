package org.easytravelapi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.cms.GetHotelAvailabilityCalendarRS;
import org.easytravelapi.common.CancelBookingRS;
import org.easytravelapi.common.GetBookingsRS;
import org.easytravelapi.common.GetDataSheetRS;
import org.easytravelapi.common.GetPortfolioRS;
import org.easytravelapi.hotel.GetAvailableHotelsRS;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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
    @Path("/hotelavailabilitycalendar")
    @ApiOperation(value = "Use this method to know which hotels are available and their prices")
    public GetHotelAvailabilityCalendarRS getHotelAvailabilityCalendar(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The comma separated list of resorts you are interested in")
            @QueryParam("resorts") String resorts,
            @ApiParam(value = "The locale checkin date in YYYYMMDD format")
            @QueryParam("checkIn") int checkIn,
            @ApiParam(value = "The locale checkout date in YYYYMMDD format")
            @QueryParam("checkOut") int checkOut,
            @ApiParam(value = "List comma separated list of occupancies you need in <nr of rooms>x<pax>[-<age>]* format")
            @QueryParam("occupancies") String occupancies
    ) throws Throwable;
}
