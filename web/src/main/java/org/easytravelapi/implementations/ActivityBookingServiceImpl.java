package org.easytravelapi.implementations;

import org.easytravelapi.ActivityBookingService;
import org.easytravelapi.activity.*;
import org.easytravelapi.circuit.Label;
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
        rs.setMaxPrice(1000d);
        rs.setMinPrice(1d);
        Label lb;
        rs.getLabels().add(lb = new Label());
        lb.setId("1");
        lb.setName("costa");
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
            bd.setOffer(true);
            bd.setBeforeOfferPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOfferText("Special offer for this activity");


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
    public GetActivityRatesRS getActivityRates(String token, String activityId, int date, String language) throws Throwable {
        GetActivityRatesRS rs = new GetActivityRatesRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Done");

        System.out.println("activity rates. token = " + token);

        long t0 = System.currentTimeMillis();

        try {

            rs.setVariants(new ArrayList<>());
            ActivityVariant av;
            rs.getVariants().add(av = new ActivityVariant());
            av.setKey("23");
            av.setName("Variante 1");
            av.setDescription("Descripción de la variante 1");
            av.setBestDeal(new BestDeal());
            av.getBestDeal().setRetailPrice(new Amount("EUR", 200.34));

            rs.setShifts(new ArrayList<>());
            ActivityShift s;
            rs.getShifts().add(s = new ActivityShift());
            s.setId("11");
            s.setName("Turno único");

            {
                ActivityLanguage l;
                s.getLanguages().add(l = new ActivityLanguage());
                l.setId("es");
                l.setName("Español");
            }
            {
                ActivityLanguage l;
                s.getLanguages().add(l = new ActivityLanguage());
                l.setId("en");
                l.setName("English");
            }

            s.setPickups(new ArrayList<>());
            ActivityPickupPoint p;
            s.getPickups().add(p = new ActivityPickupPoint());
            p.setId("54");
            p.setName("En punto de recogida 1 a las 10:30");



        } catch (Throwable e) {
            rs.setStatusCode(500);
            rs.setMsg("" + e.getClass().getSimpleName() + ": " + e.getMessage());
            e.printStackTrace();
        }

        return rs;
    }

    @Override
    public CheckActivityRS check(String token, String key, int date, String language, int adults, int children, String variant, String shift, String pickup, String activityLanguage) throws Throwable {
        CheckActivityRS rs = new CheckActivityRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Done");


        rs.setAvailable(true);
        rs.setKey("2098347238472398047239734");
        rs.setValue(new Amount("EUR", 200.34));

        return rs;
    }

    @Override
    public GetActivityPriceDetailsRS getActivityPriceDetails(String token, String key, String language, String supplements, String coupon) throws Throwable {
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
            c.setGMTtime(LocalDateTime.of(2019, 06, 05, 12, 00).format(DateTimeFormatter.ISO_DATE_TIME));
            Amount a;
            c.setRetail(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(250.32);
        }

        {
            CancellationCost c;
            rs.getCancellationCosts().add(c = new CancellationCost());
            c.setGMTtime(LocalDateTime.of(2019, 07, 01, 12, 00).format(DateTimeFormatter.ISO_DATE_TIME));
            Amount a;
            c.setRetail(a = new Amount());
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
        if(coupon != null && coupon != ""){
            {
                PriceLine pc;
                rs.getPriceLines().add(pc = new PriceLine());
                {
                    Amount a;
                    pc.setRetailPrice(a = new Amount());
                    a.setCurrencyIsoCode("EUR");
                    a.setValue(-750.16);
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
            l.setDate("2019-12-01");
            l.setPaymentMethod("WEB");
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
        rs.setTerms("<span>He leído y acepto los <a href=\"http://google.es\"> terminos y condiciones de uso</a></span > ");
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
        rs.getAvailableServices().add(new String("traslado"));
        rs.getAvailableServices().add(new String("hotel"));

        rs.setPaymentUrl("<form name=f action='https://localhost:8080' method='post'>" +
                "<input type='hidden' name=amount value='100'> "+
                "</form>");

        return rs;
    }

    @Override
    public GetAvailableActivitiesRS getFilteredActivities(String token, int start, String resourceId, String language, double minPrice, double maxPrice) throws Throwable {
        return getAvailableActivities(token, start, resourceId, language);
    }


}
