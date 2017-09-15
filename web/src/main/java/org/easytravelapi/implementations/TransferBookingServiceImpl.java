package org.easytravelapi.implementations;

import org.easytravelapi.TransferBookingService;
import org.easytravelapi.transfer.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class TransferBookingServiceImpl implements TransferBookingService {
    public GetAvailableTransfersRS getAvailabeTransfers(GetAvailableTransfersRQ rq) {
        System.out.println("rq = " + rq);
        return new GetAvailableTransfersRS();
    }

    public GetTransferPriceDetailsRS getTransferPriceDetails(GetTransferPriceDetailsRQ rq) {
        System.out.println("rq = " + rq);
        return new GetTransferPriceDetailsRS();
    }

    public BookTransferRS bookTransfer(BookTransferRQ rq) {
        System.out.println("rq = " + rq);
        return new BookTransferRS();
    }
}
