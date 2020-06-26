package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.easytravelapi.channelManager.*;
import org.easytravelapi.ingestion.HotelRQ;
import org.easytravelapi.ingestion.HotelsIngestionRS;
import org.easytravelapi.ingestion.TransferRQ;
import org.easytravelapi.ingestion.TransfersIngestionRS;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("{authtoken}/ingestion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Operations related to the ingestion of bookings")
public interface BookingIngestionService {

    @POST
    @Path("/transfers")
    @ApiOperation(value = "Use this method to upload a list of transfer bookings")
    public TransfersIngestionRS ingestTransfers(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "List of transfers requests")
            TransferRQ[] rqs
    ) throws Throwable;

    @POST
    @Path("/hotels")
    @ApiOperation(value = "Use this method to upload a list of hotel (and transfer) bookings")
    public HotelsIngestionRS ingestHotels(
            @ApiParam(value = "Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method") @PathParam("authtoken") String token,
            @ApiParam(value = "List of hotel requests")
                    HotelRQ[] rqs
    ) throws Throwable;

}
