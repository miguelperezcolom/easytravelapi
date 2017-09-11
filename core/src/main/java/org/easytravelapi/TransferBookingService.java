package org.easytravelapi;


import io.swagger.annotations.Api;
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
@Api
public interface TransferBookingService {

    @POST
    @Path("/getavailable")
    public GetAvailableTransfersRS getAvailabeTransfers(GetAvailableTransfersRQ rq);

    @POST
    @Path("/pricedetails")
    public GetTransferPriceDetailsRS getTransferPriceDetails(GetTransferPriceDetailsRQ rq);

    @POST
    @Path("/book")
    public BookTransferRS bookTransfer(BookTransferRQ rq);

}
