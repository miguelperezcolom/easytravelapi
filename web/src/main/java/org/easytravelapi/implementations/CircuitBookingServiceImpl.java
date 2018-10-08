package org.easytravelapi.implementations;

import org.easytravelapi.CircuitBookingService;
import org.easytravelapi.circuit.AvailableDate;
import org.easytravelapi.circuit.BookCircuitRS;
import org.easytravelapi.circuit.PaymentMethod;
import org.easytravelapi.circuit.Supplement;
import org.easytravelapi.circuit.Variant;
import org.easytravelapi.circuit.*;
import org.easytravelapi.common.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by miguel on 27/7/17.
 */
public class CircuitBookingServiceImpl implements CircuitBookingService {

    @Override
    public GetAvailableCircuitsRS getAvailableCircuits(String token, int start, int end, String resourceId, String language) throws Throwable {
        GetAvailableCircuitsRS rs = new GetAvailableCircuitsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 circuits found. It consumed 24 ms in the server. xx");

        Random r = new Random();

        {
            AvailableCircuit a;
            rs.getAvailableCircuits().add(a = new AvailableCircuit());

            a.setCircuitId("act-798789");
            a.setName("Vuelta a Mallorca");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("http://www.click-mallorca.com/imgdb/mapa_are1945.jpg");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));

        }

        {
            AvailableCircuit a;
            rs.getAvailableCircuits().add(a = new AvailableCircuit());

            a.setCircuitId("act-79878e9");
            a.setName("Buceo en Cala Millor");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("http://www.click-mallorca.com/imgdb/imagen_listado_exc10309.png");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        {
            AvailableCircuit a;
            rs.getAvailableCircuits().add(a = new AvailableCircuit());

            a.setCircuitId("act-7987a89");
            a.setName("Aventuras en Jungle Park");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("http://www.click-mallorca.com/imgdb/imagen_listado_exc9234.png");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        return rs;
    }

    @Override
    public GetCircuitRatesRS getCircuitRates(String token, String key, String language) throws Throwable {
        GetCircuitRatesRS rs = new GetCircuitRatesRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price details");

        Random rand = new Random();

        ArrayList<AvailableDate> ads;
        rs.setAvailableDates(ads = new ArrayList<>());

        for (int i = 0; i < 7; i++) {
            AvailableDate ad;
            ads.add(ad = new AvailableDate());
            ad.setDate(20180715 + i);

            ArrayList<Variant> vs;
            ad.setVariants(vs = new ArrayList<>());

            if (i % 3 == 0) for (int j = 0; j < 3; j++) {
                Variant v;
                vs.add(v = new Variant());
                v.setId("qswq");
                v.setName("Variante " + j);
                v.setDescription("Opción VIP, con acceso a todas las atracciones sin restricción");

                v.setPricePer("PAX");

                BestDeal bd;
                v.setPrice(bd = new BestDeal());

                double rp;
                double x = rand.nextDouble();
                bd.setRetailPrice(new Amount("EUR", rp = Math.round(100d + x * 900d) / 100d));
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNetPrice(new Amount("EUR", Math.round(rp * 85d) / 100d));
            }

            if (vs.size() == 0) {
                BestDeal bd;
                ad.setPrice(bd = new BestDeal());

                ad.setPricePer("PAX");

                double rp;
                double x = rand.nextDouble();
                bd.setRetailPrice(new Amount("EUR", rp = Math.round(100d + x * 900d) / 100d));
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNetPrice(new Amount("EUR", Math.round(rp * 85d) / 100d));
            }

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

            rs.getLanguages().add("Español");
            rs.getLanguages().add("Inglés");
            rs.getLanguages().add("Alemán");

        }
        {

            rs.getPickups().add("Hotel 1");
            rs.getPickups().add("Hotel 2");
            rs.getPickups().add("Hotel 3");


        }
        {
            Supplement c;
            rs.getSupplements().add(c = new Supplement());
            c.setDescription("Continental Buffet");
            c.setId("deiuwed8ewud890u23");

            {
                Amount a;
                c.setRetailPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(30.45);
            }

            {
                Amount a;
                c.setCommission(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(5);
            }

            {
                Amount a;
                c.setNetPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(25.45);
            }

        }


        return rs;
    }

    @Override
    public GetCircuitPriceRS getCircuitPrice(String token, String key, String language, int adults, int children, int infants, String datekey, String variantkeykey, String pickup, String supplements) throws Throwable {
        GetCircuitPriceRS rs = new GetCircuitPriceRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price total");

        Random rand = new Random();

        rs.setAvailable(rand.nextBoolean());

        BestDeal bd;
        rs.setTotal(bd = new BestDeal());


        double rp;
        double x = rand.nextDouble();
        bd.setRetailPrice(new Amount("EUR", rp = Math.round(100d + x * 900d) / 100d));
        System.out.println("x=" + x + ", rp=" + rp);
        bd.setNetPrice(new Amount("EUR", Math.round(rp * 85d) / 100d));

        return rs;
    }

    @Override
    public GetCircuitPriceDetailsRS getCircuitPriceDetails(String token, String key, String language, int adults, int children, int vehicles, String supplements) throws Throwable {
        GetCircuitPriceDetailsRS rs = new GetCircuitPriceDetailsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price details xx");

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
            BestDeal tot;
            rs.setTotal(tot = new BestDeal());
            {
                Amount a;
                tot.setRetailPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(1500.32);
            }

            {
                Amount a;
                tot.setCommission(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(250.31);
            }

            {
                Amount a;
                tot.setNetPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(1250.01);
            }


        }
        {
            PriceLine pc;
            rs.getPriceLines().add(pc = new PriceLine());
            {
                Amount a;
                pc.setRetailPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(1500.32);
            }

            {
                Amount a;
                pc.setCommission(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(250.31);
            }

            {
                Amount a;
                pc.setNetPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(1250.01);
            }

            pc.setType("AT_WEB");
            pc.setDescription("detailed price");



        }
        {
            PaymentLine l;
            rs.getPaymentLines().add(l = new PaymentLine());
            Amount a;
            l.setAmount(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(30.45);
            l.setDate(20180601);
            l.setPaymentMethod("WEB");
        }

        return rs;
    }

    @Override
    public BookCircuitRS bookCircuit(String token, BookCircuitRQ rq) throws Throwable {
        System.out.println("rq=" + rq);

        BookCircuitRS rs = new BookCircuitRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking confirmed ok");

        rs.setBookingId("5643135431");


        return rs;
    }

}