package org.easytravelapi;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.easytravelapi.transfer.*;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by miguel on 26/7/17.
 */
@WebService
@Path("/transfer/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(description = "Set of available operations related to transfer booking process")
public interface TransferBookingService {

    @POST
    @Path("/getavailable")
    @ApiOperation(value = "Use this method to know which transfers are available and their prices")
    public GetAvailableTransfersRS getAvailabeTransfers(GetAvailableTransfersRQ rq);

    @POST
    @Path("/pricedetails")
    @ApiOperation(value = "Use this method to guess cancellation costs and important remarks")
    public GetTransferPriceDetailsRS getTransferPriceDetails(GetTransferPriceDetailsRQ rq);

    @POST
    @Path("/book")
    @ApiOperation(value = "Use this method to confirm a transfer service booking")
    public BookTransferRS bookTransfer(BookTransferRQ rq);

}
