package org.easytravelapi.implementations;

import org.easytravelapi.TransferBookingService;
import org.easytravelapi.common.Amount;
import org.easytravelapi.common.CancellationCost;
import org.easytravelapi.common.Remark;
import org.easytravelapi.transfer.*;

import javax.ws.rs.FormParam;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by miguel on 27/7/17.
 */
public class TransferBookingServiceImpl implements TransferBookingService {

    @Override
    public GetAvailableTransfersRS getAvailabeTransfers(String token, String fromTransferPointId, String toTransferPointId, int pax, List<Integer> ages, int bikes, int golfBaggages, int bigLuggages, int wheelChairs, int incomingDate, int outgoingDate) {
        GetAvailableTransfersRS rs = new GetAvailableTransfersRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 transfers found. It consumed 24 ms in the server.");

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlwefhwe");
            t.setType("SHUTTLE");
            t.setDescription("Shuttle transfer");
            t.setVehicle("Shuttle bus");
            Amount a;
            t.setNetPrice(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(18.3);
        }

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlweedewfhwe");
            t.setType("PRIVATE");
            t.setDescription("Private taxi");
            t.setVehicle("TAXI 1-4");
            Amount a;
            t.setNetPrice(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(58);
        }

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("egfoerf8etrf834b34f6");
            t.setType("LUXURY");
            t.setDescription("Mercedes Benz limousine w/chofer");
            t.setVehicle("MB1-4");
            Amount a;
            t.setNetPrice(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(130.5);
        }

        return rs;
    }

    @Override
    public GetTransferPriceDetailsRS getTransferPriceDetails(String token, String key) {

        GetTransferPriceDetailsRS rs = new GetTransferPriceDetailsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price details");

        {
            CancellationCost c;
            rs.getCancellationCosts().add(c = new CancellationCost());
            c.setGMTtime(LocalDateTime.of(2018, 06, 05, 12, 00).format(DateTimeFormatter.ISO_DATE_TIME));
            Amount a;
            c.setNet(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(250.32);
        }

        {
            CancellationCost c;
            rs.getCancellationCosts().add(c = new CancellationCost());
            c.setGMTtime(LocalDateTime.of(2018, 07, 01, 12, 00).format(DateTimeFormatter.ISO_DATE_TIME));
            Amount a;
            c.setNet(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(400);
        }

        {
            Remark r;
            rs.getRemarks().add(r = new Remark());
            r.setType("IMPORTANT");
            r.setText("This service must be paid in 24 hors. Otherwise it will be automatically cancelled.");
        }
        {
            Remark r;
            rs.getRemarks().add(r = new Remark());
            r.setType("WARNING");
            r.setText("You must present the voucher that you will receive by email, after payment.");
        }        {
            Remark r;
            rs.getRemarks().add(r = new Remark());
            r.setType("INFO");
            r.setText("Have a nice day");
        }

        return rs;
    }

    @Override
    public BookTransferRS bookTransfer(String token, String key, String bookingReference, String leadName, String commentsToProvider, String privateComments, String incomingFlightNumber, int incomingFlightTime, String incomingFlightOrigin, String outgoingFlightNumber, int outgoingFlightTime, String outgoingFlightDestination) {

        BookTransferRS rs = new BookTransferRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking confirmed ok");

        rs.setBookingId("5643135431");

        return rs;
    }


}
