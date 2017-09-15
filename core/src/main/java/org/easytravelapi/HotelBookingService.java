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
@Path("/{authtoken}/hotel")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_FORM_URLENCODED, MediaType.MULTIPART_FORM_DATA})
@Api(description = "Here you will find the booking service related methods")
public interface HotelBookingService {

    @GET
    @Path("/available")
    @ApiOperation(value = "Use this method to know which hotels are available and their prices")
    public GetAvailableHotelsRS getAvailableHotels(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The list of resorts you are interested in")
            @QueryParam("resorts") List<String> resorts,
            @ApiParam(value = "The locale checkin date in YYYYMMDD format")
            @QueryParam("checkin") int checkIn,
            @ApiParam(value = "The locale checkout date in YYYYMMDD format")
            @QueryParam("checkout") int checkout,
            @ApiParam(value = "List of occupancies you need")
            @QueryParam("occupancies") List<Occupancy> occupancies,
            @ApiParam(value = "Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter")
            @QueryParam("includestaticinfo") boolean includeStaticInfo
    );

    @GET
    @Path("/pricedetails")
    @ApiOperation(value = "Use this methos to guess cancellation costs and important remarks regarding a price")
    public GetHotelPriceDetailsRS getHotelPriceDetails(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The hotel price key, as provided in the /hotel/available step")
                    String key
    );

    @PUT
    @Path("/booking")
    @ApiOperation(value = "Use this method to confirm a hotel service")
    public BookHotelRS bookHotel(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "The activity price key, as provided in the /activities/getavailable step")
            @FormParam("key") String key,
            @ApiParam(value = "A free text reference you want to appear in the final invoice, so you can match it when validating our invoices")
            @FormParam("bookingreference") String bookingReference,
            @ApiParam(value = "The lead name")
            @FormParam("leadname") String leadName,
            @ApiParam(value = "Comments from the customer which should arrive to the activity provider")
            @FormParam("commentstoprovider") String commentsToProvider,
            @ApiParam(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
            @FormParam("privatecomments") String privateComments
    );

}
