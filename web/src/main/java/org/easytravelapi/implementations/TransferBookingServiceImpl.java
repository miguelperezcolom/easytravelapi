package org.easytravelapi.implementations;

import org.easytravelapi.TransferBookingService;
import org.easytravelapi.activity.PaymentMethod;
import org.easytravelapi.common.Amount;
import org.easytravelapi.common.CancellationCost;
import org.easytravelapi.common.Remark;
import org.easytravelapi.hotel.BestDeal;
import org.easytravelapi.transfer.*;

import javax.ws.rs.FormParam;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by miguel on 27/7/17.
 */
public class TransferBookingServiceImpl implements TransferBookingService {

    @Override
    public GetAvailableTransfersRS getAvailabeTransfers(String token, String fromTransferPointId, String toTransferPointId, int pax, int bikes, int golfBaggages, int skis, int bigLuggages, int wheelChairs, int incomingDate, int outgoingDate) {
        GetAvailableTransfersRS rs = new GetAvailableTransfersRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 transfers found. It consumed 24 ms in the server.");

        Random r = new Random();

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlwefhwe");
            t.setType("SHUTTLE");
            t.setDescription("Shuttle transfer from PMI airport");
            t.setVehicle("Shuttle bus");

            BestDeal bd;
            t.setTotal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }
        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlwefhwe");
            t.setType("SHUTTLE");
            t.setDescription("Shuttle transfer from Palma port");
            t.setVehicle("Shuttle bus");

            BestDeal bd;
            t.setTotal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlweedewfhwe");
            t.setType("PRIVATE");
            t.setDescription("Private taxi from PMI airport");
            t.setVehicle("TAXI 1-4");
            BestDeal bd;
            t.setTotal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlweedewfhwe");
            t.setType("PRIVATE");
            t.setDescription("Private taxi from Palma port");
            t.setVehicle("TAXI 1-4");
            BestDeal bd;
            t.setTotal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("egfoerf8etrf834b34f6");
            t.setType("LUXURY");
            t.setDescription("Mercedes Benz limousine w/chofer from PMI airport");
            t.setVehicle("MB1-4");
            BestDeal bd;
            t.setTotal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("egfoerf8etrf834b34f6");
            t.setType("LUXURY");
            t.setDescription("Mercedes Benz limousine w/chofer from Palma port");
            t.setVehicle("MB1-4");
            BestDeal bd;
            t.setTotal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        return rs;
    }

    @Override
    public GetTransferPriceDetailsRS getTransferPriceDetails(String token, String key) {

        GetTransferPriceDetailsRS rs = new GetTransferPriceDetailsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price details");

        Random rand = new Random();


        ArrayList<PaymentMethod> pms;
        rs.setPaymentMethods(pms = new ArrayList<>());
        {
            PaymentMethod pm;
            pms.add(pm = new PaymentMethod());
            pm.setKey("1");
            pm.setName("Cash");
            pm.setCurrencyIsoCode("EUR");
        }
        {
            PaymentMethod pm;
            pms.add(pm = new PaymentMethod());
            pm.setKey("1");
            pm.setName("Cash");
            pm.setCurrencyIsoCode("USD");
        }
        {
            PaymentMethod pm;
            pms.add(pm = new PaymentMethod());
            pm.setKey("1");
            pm.setName("Cash");
            pm.setCurrencyIsoCode("GBP");
        }
        {
            PaymentMethod pm;
            pms.add(pm = new PaymentMethod());
            pm.setKey("1");
            pm.setName("VISA");
            pm.setCurrencyIsoCode("EUR");
        }
        {
            PaymentMethod pm;
            pms.add(pm = new PaymentMethod());
            pm.setKey("1");
            pm.setName("VISA");
            pm.setCurrencyIsoCode("USD");
        }

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
            r.setText("Pick up at Hotel Cala Marsal reception next April 27th at 12:30. Please be puntual.");
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
    public BookTransferRS bookTransfer(String token, BookTransferRQ rq) {

        BookTransferRS rs = new BookTransferRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking confirmed ok");

        rs.setBookingId("5643135431");

        return rs;
    }


}
