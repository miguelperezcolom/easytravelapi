package io.mateu.easytravelapi;

import io.mateu.easytravelapi.transfer.*;

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
public interface TransferBookingService {

    @POST
    @Path("/getavailable")
    public GetAvailableTransfersRS getAvailabeTransfers(@FormParam("rq") GetAvailableTransfersRQ rq);

    @POST
    @Path("/pricedetails")
    public GetTransferPriceDetailsRS getTransferPriceDetails(@FormParam("rq") GetTransferPriceDetailsRQ rq);

    @POST
    @Path("/book")
    public BookTransferRS bookTransfer(@FormParam("rq") BookTransferRQ rq);

}
