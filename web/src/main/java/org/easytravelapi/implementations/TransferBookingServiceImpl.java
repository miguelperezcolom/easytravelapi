package org.easytravelapi.implementations;

import org.easytravelapi.TransferBookingService;
import org.easytravelapi.activity.PaymentMethod;
import org.easytravelapi.circuit.Label;
import org.easytravelapi.common.Supplement;
import org.easytravelapi.common.*;
import org.easytravelapi.transfer.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by miguel on 27/7/17.
 */
public class TransferBookingServiceImpl implements TransferBookingService {

    @Override
    public GetAvailableTransfersRS getAvailabeTransfers(String token, String fromTransferPointId, String toTransferPointId, int pax, int bikes, int golfBaggages, int skis, int bigLuggages, int wheelChairs, int incomingDate, int outgoingDate, String language) {
        GetAvailableTransfersRS rs = new GetAvailableTransfersRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 transfers found. It consumed 24 ms in the server.");
        rs.setMaxPrice(1000d);
        rs.setMinPrice(1d);
        Label a;
        rs.getLabels().add(a = new Label());
        a.setId("1");
        a.setName("costa");
        Random r = new Random();

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlwefhwe");
            t.setType("SHUTTLE");
            t.setDescription("Shuttle transfer from PMI airport");
            t.setVehicle("Shuttle bus");
            t.setImage("https://www.oregonexpressshuttle.com/wp-content/uploads/2017/05/DSC_4191.jpg");

            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOffer(true);
            bd.setBeforeOffer(new Amount("EUR",rp + 50));
            bd.setOfferText("Special 30% off");
        }
        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlwefhwe");
            t.setType("SHUTTLE");
            t.setDescription("Shuttle transfer from Palma port");
            t.setVehicle("Shuttle bus");
            t.setImage("https://www.oregonexpressshuttle.com/wp-content/uploads/2017/05/DSC_4191.jpg");

            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
        }

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlweedewfhwe");
            t.setType("PRIVATE");
            t.setDescription("Private taxi from PMI airport");
            t.setVehicle("TAXI 1-4");
            t.setImage("https://www.aeropuertomadrid-barajas.com/images/madrid-taxi.jpg");
            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
        }

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlweedewfhwe");
            t.setType("PRIVATE");
            t.setDescription("Private taxi from Palma port");
            t.setVehicle("TAXI 1-4");
            t.setImage("https://www.aeropuertomadrid-barajas.com/images/madrid-taxi.jpg");
            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("egfoerf8etrf834b34f6");
            t.setType("LUXURY");
            t.setDescription("Mercedes Benz limousine w/chofer from PMI airport");
            t.setVehicle("MB1-4");
            t.setImage("https://caranddriver.ru/wp-content/uploads/2017/03/Mercedes-Benz-V-Class-0-800x445.jpg");
            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
        }

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("egfoerf8etrf834b34f6");
            t.setType("LUXURY");
            t.setDescription("Mercedes Benz limousine w/chofer from Palma port");
            t.setVehicle("MB1-4");
            t.setImage("https://caranddriver.ru/wp-content/uploads/2017/03/Mercedes-Benz-V-Class-0-800x445.jpg");
            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        return rs;
    }


    @Override
    public GetTransferPriceDetailsRS getTransferPriceDetails(String token, String key, String language, String supplements, String coupon) throws Throwable {

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

        {
            Price tot;
            rs.setTotal(tot = new Price());
            {
                Amount a;
                tot.setRetail(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(1500.32);
            }

            {
                Amount a;
                tot.setNet(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(1250.01);
            }


        }
        {
            PriceLine pc;
            rs.getPriceLines().add(pc = new PriceLine());
            {
                Amount a;
                pc.setTotal(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(1500.32);
            }

            pc.setDescription("detailed price");


        }
        {
            Supplement sp;
            rs.getSupplements().add(sp = new Supplement() );
            sp.setId("22");
            sp.setName("buffet incluido" );
            sp.setDescription("buffet incluido durante toda la estancia, incluye desayuno, almuerzo y cena");
            Amount a;
            sp.setRetailPrice(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(130.99);
            sp.setPriceType("PAX");


        }
        {
            Supplement sp;
            rs.getSupplements().add(sp = new Supplement() );
            sp.setId("33");
            sp.setName("Paquetes extras" );
            sp.setDescription("Paquetes extras que incluyen varias ofertas de nuesstros mejores servicios" );
            Amount a;
            sp.setRetailPrice(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(350.00);
            sp.setPriceType("ROOM");


        }
        if(coupon != null && coupon != ""){
            {
                PriceLine pc;
                rs.getPriceLines().add(pc = new PriceLine());
                {
                    Amount a;
                    pc.setTotal(a = new Amount());
                    a.setCurrencyIsoCode("EUR");
                    a.setValue(-750.16);
                }

                pc.setDescription("Coupon discount 50%");


            }
        }
        {
            PaymentLine l;
            rs.getPaymentLines().add(l = new PaymentLine());
            Amount a;
            l.setAmount(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(30.45);
            l.setDate("2018-06-01");
            l.setPaymentMethod("WEB");
        }

        rs.setTerms("<span>He leído y acepto los <a href=\"http://google.es\"> terminos y condiciones de uso</a></span > ");
        return rs;
    }

    @Override
    public BookTransferRS bookTransfer(String token, BookTransferRQ rq) {

        BookTransferRS rs = new BookTransferRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking confirmed ok");

        rs.setBookingId("5643135431");
        rs.setAvailableServices(new ArrayList<String>());
        rs.getAvailableServices().add(new String("hotel"));
        rs.getAvailableServices().add(new String("circuito"));
        rs.getAvailableServices().add(new String("excursion"));

        rs.setPaymentUrl("<form name=f action='https://localhost:8080' method='post'>" +
                "<input type='hidden' name=amount value='100'> "+
                "</form>");

        return rs;
    }

    @Override
    public GetAirportsRS getAirports(String token) throws Throwable {
        GetAirportsRS rs = new GetAirportsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("5654 resouces found");

        {
            Resource a;

            rs.getAirports().add(a = new Resource());

            a.setResourceId("PMI");
            a.setDescription(new MultilingualText("es", "Aeropuerto de Palma", "en", "Palma Airport"));
            a.setName(new MultilingualText("es", "Aeropuerto de Palma", "en", "Palma Airport"));
            a.setLatitude("12.56789");
            a.setLongitude("32.56789");
        }

        {
            Resource a;

            rs.getAirports().add(a = new Resource());

            a.setResourceId("XRY");
            a.setDescription(new MultilingualText("es", "Aeropuerto de Jerez", "en", "Xerez Airport"));
            a.setName(new MultilingualText("es", "Aeropuerto de Jerez", "en", "Xerez Airport"));
            a.setLatitude("12.56789");
            a.setLongitude("32.56789");
        }

        return rs;
    }

    @Override
    public GetDestinationRS getDestinationsForAirport(String token, String airportId) throws Throwable {
        GetDestinationRS rs = new GetDestinationRS();

        Resource d;

        rs.getDestination().add(d = new Resource());

        d.setDescription(new MultilingualText("es", "Hotel Palma1", "en", "Palma1 Hotel"));
        d.setLatitude("12.85859");
        d.setLongitude("24.52123");
        d.setName(new MultilingualText("es", "Hotel Palma1", "en", "Palma1 Hotel"));
        d.setResourceId("1");

        rs.getDestination().add(d = new Resource());

        d.setDescription(new MultilingualText("es", "Hotel Palma2", "en", "Palma2 Hotel"));
        d.setLatitude("12.85459");
        d.setLongitude("24.59123");
        d.setName(new MultilingualText("es", "Hotel Palma2", "en", "Palma2 Hotel"));
        d.setResourceId("2");

        rs.getDestination().add(d = new Resource());

        d.setDescription(new MultilingualText("es", "Hotel Palma2", "en", "Palma2 Hotel"));
        d.setLatitude("12.85459");
        d.setLongitude("24.59123");
        d.setName(new MultilingualText("es", "Hotel Palma2", "en", "Palma2 Hotel"));
        d.setResourceId("2");

        return rs;
    }

    @Override
    public GetAvailableTransfersRS getFilteredTransfers(String token, String fromTransferPointId, String toTransferPointId, int pax, int bikes, int golfBaggages, int skis, int bigLuggages, int wheelChairs, int incomingDate, int outgoingDate, String transfertypes, double minPrice, double maxPrice, String language) throws Throwable {
        GetAvailableTransfersRS rs = new GetAvailableTransfersRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 transfers found. It consumed 24 ms in the server.");

        rs.setMaxPrice(1000d);
        rs.setMinPrice(1d);
        Random r = new Random();

        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlwefhwe");
            t.setType("SHUTTLE");
            t.setDescription("Shuttle transfer from PMI airport");
            t.setVehicle("Shuttle bus");
            t.setImage("https://www.oregonexpressshuttle.com/wp-content/uploads/2017/05/DSC_4191.jpg");

            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOffer(true);
            bd.setBeforeOffer(new Amount("EUR", rp+50));
            bd.setOfferText("Special offer filtered");

        }
        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("iwgfwe7t23ygdfywenuqlwefhwe");
            t.setType("SHUTTLE");
            t.setDescription("Shuttle transfer from Palma port");
            t.setVehicle("Shuttle bus");
            t.setImage("https://www.oregonexpressshuttle.com/wp-content/uploads/2017/05/DSC_4191.jpg");

            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOffer(true);
            bd.setBeforeOffer(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOfferText("Special offer for this transfer");

        }



        {
            AvailableTransfer t;
            rs.getAvailableTransfers().add(t = new AvailableTransfer());
            t.setKey("egfoerf8etrf834b34f6");
            t.setType("LUXURY");
            t.setDescription("Mercedes Benz limousine w/chofer from Palma port");
            t.setVehicle("MB1-4");
            t.setImage("https://caranddriver.ru/wp-content/uploads/2017/03/Mercedes-Benz-V-Class-0-800x445.jpg");
            Price bd;
            t.setTotal(bd = new Price());

            double rp;
            double x = r.nextDouble();
            bd.setRetail(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        return rs;
    }

    @Override
    public GetDestinationRS getDestinations(String token) throws Throwable {
        return null;
    }
}
