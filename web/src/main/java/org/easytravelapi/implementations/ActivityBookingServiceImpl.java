package org.easytravelapi.implementations;

import org.easytravelapi.ActivityBookingService;
import org.easytravelapi.activity.*;
import org.easytravelapi.common.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by miguel on 27/7/17.
 */
public class ActivityBookingServiceImpl implements ActivityBookingService {


    @Override
    public GetAvailableActivitiesRS getAvailableActivities(String token, int start, String resourceId, String language) {
        GetAvailableActivitiesRS rs = new GetAvailableActivitiesRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 activities found. It consumed 24 ms in the server. xx");

        Random r = new Random();

        {
            AvailableActivity a;
            rs.getAvailableActivities().add(a = new AvailableActivity());

            a.setActivityId("act-798789");
            a.setName("Vuelta a Mallorca");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("https://cdn2.click-mallorca.com/imgdb/imagen_iex15277.jpg");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));

        }

        {
            AvailableActivity a;
            rs.getAvailableActivities().add(a = new AvailableActivity());

            a.setActivityId("act-79878e9");
            a.setName("Buceo en Cala Millor");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("https://cdn2.click-mallorca.com/imgdb/imagen_iex11965.png");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        {
            AvailableActivity a;
            rs.getAvailableActivities().add(a = new AvailableActivity());

            a.setActivityId("act-7987a89");
            a.setName("Aventuras en Jungle Park");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("https://cdn1.click-mallorca.com/imgdb/foto1_exc2210.jpg");

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
    public GetActivityRatesRS getActivityRates(String token, String key, String language) throws Throwable {
        GetActivityRatesRS rs = new GetActivityRatesRS();

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
            ArrayList<Shift> ss;
            ad.setShifts(ss = new ArrayList<>());

            if (i % 2 == 0) {
                Shift s;
                ss.add(s = new Shift());
                s.setName("Mañana");
                s.setTime(1000 + i);
            }
            if (i % 4 == 0) {
                Shift s;
                ss.add(s = new Shift());
                s.setName("Tarde");
                s.setTime(1500 + i);
            }


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
        {
            Supplement c;
            rs.getSupplements().add(c = new Supplement());
            c.setDescription("breakfast");
            c.setId("dfgbsbh488");

            {
                Amount a;
                c.setRetailPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(16.50);
            }

            {
                Amount a;
                c.setCommission(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(4);
            }

            {
                Amount a;
                c.setNetPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(12.45);
            }

        }


        return rs;
    }

    @Override
    public GetActivityPriceRS getExcursionPrice(String token, String key, String language, int adults, int children, int infants, String datekey, String variantkeykey, String shiftdate, String pickup, String supplements) throws Throwable {
        GetActivityPriceRS rs = new GetActivityPriceRS();

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
    public GetActivityPriceDetailsRS getActivityPriceDetails(String token, String key, String language, int adults, int children, int vehicles, String supplements) {
        GetActivityPriceDetailsRS rs = new GetActivityPriceDetailsRS();

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
    public BookActivityRS bookActivity(String token, BookActivityRQ rq) {
        System.out.println("rq=" + rq);

        BookActivityRS rs = new BookActivityRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking confirmed ok");

        rs.setBookingId("5643135431");
        rs.setAvailableServices(new ArrayList<String>());
        rs.getAvailableServices().add(new String("traslado/#/dispo?destino&destinoname=%20&origen=PMI&entrada=2018-11-15&salida=2018-11-16&idioma=es&specialtransport=%5Bobject%20Object%5D&pax=1"));
        rs.getAvailableServices().add(new String("hotel/#/dispo?destino=sta_6363&destinoname=Mallorca&entrada=2018-11-15&salida=2018-11-16&ocupacion=1x2"));

        rs.setPaymentUrl("https://www.paypal.com");

        return rs;
    }

    @Override
    public GetAvailableActivitiesRS getFilteredActivities(String token, int start, String resourceId, String language, String minPrice, String maxPrice) throws Throwable {
        GetAvailableActivitiesRS rs = new GetAvailableActivitiesRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 activities found. It consumed 24 ms in the server. xx");

        Random r = new Random();

        {
            AvailableActivity a;
            rs.getAvailableActivities().add(a = new AvailableActivity());

            a.setActivityId("act-798789");
            a.setName("Vuelta a Mallorca");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("https://cdn2.click-mallorca.com/imgdb/imagen_iex15277.jpg");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));

        }

        {
            AvailableActivity a;
            rs.getAvailableActivities().add(a = new AvailableActivity());

            a.setActivityId("act-79878e9");
            a.setName("Buceo en Cala Millor");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("https://cdn2.click-mallorca.com/imgdb/imagen_iex11965.png");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
        }


        {
            AvailableActivity a;
            rs.getAvailableActivities().add(a = new AvailableActivity());

            a.setActivityId("act-7987a89");
            a.setName("Aventuras en Jungle Park");
            a.setDescription("Excursión muy interesante para ver los principales puntos de interés de la isla. Muy recomendada!");
            a.setImage("https://cdn1.click-mallorca.com/imgdb/foto1_exc2210.jpg");

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
}
