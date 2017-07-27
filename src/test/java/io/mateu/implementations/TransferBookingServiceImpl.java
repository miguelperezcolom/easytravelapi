package io.mateu.implementations;

import io.mateu.easytravelapi.TransferBookingService;
import io.mateu.easytravelapi.transfer.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class TransferBookingServiceImpl implements TransferBookingService {
    public GetAvailableTransfersRS getAvailabeTransfers(@FormParam("rq") GetAvailableTransfersRQ rq) {
        return null;
    }

    public GetTransferPriceDetailsRS getTransferPriceDetails(@FormParam("rq") GetTransferPriceDetailsRQ rq) {
        return null;
    }

    public BookTransferRS bookTransfer(@FormParam("rq") BookTransferRQ rq) {
        return null;
    }
}
