package org.easytravelapi.implementations;

import org.easytravelapi.CircuitBookingService;
import org.easytravelapi.activity.ActivityLanguage;
import org.easytravelapi.activity.ActivityPickupPoint;
import org.easytravelapi.activity.ActivityShift;
import org.easytravelapi.activity.ActivityVariant;
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
    public GetAvailableCircuitsRS getAvailableCircuits(String token, String language) throws Throwable {
        GetAvailableCircuitsRS rs = new GetAvailableCircuitsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 circuits found. It consumed 24 ms in the server. xx");

        Random r = new Random();

        {
            AvailableCircuit a;
            rs.getAvailableCircuits().add(a = new AvailableCircuit());

            a.setCircuitId("act-798789");
            a.setName("Avance Japón");
            a.setDescription("Visita las principales ciudades japonesas y conoce su cultura");
            a.setImage("http://bookingfaxnavia.com/catalogo/ambassadortours/2018/10/1560/page1.jpg");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOffer(true);
            bd.setBeforeOfferPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOfferText(" offer");

        }

        {
            AvailableCircuit a;
            rs.getAvailableCircuits().add(a = new AvailableCircuit());

            a.setCircuitId("act-79878e9");
            a.setName("Monográfico India");
            a.setDescription("Conoce la India desde dentro con verdaderos expertos");
            a.setImage("http://bookingfaxnavia.com/catalogo/dimensionesclub/2018/04/1516/page1.jpg");

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
            a.setName("Cruceros fluviales");
            a.setDescription("Los mejores cruceros fluviales por Europa");
            a.setImage("http://bookingfaxnavia.com/catalogo/politours/2017/11/1428/page1.jpg");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOffer(true);
            bd.setBeforeOfferPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOfferText(" offer");
        }
        {
            AvailableCircuit a;
            rs.getAvailableCircuits().add(a = new AvailableCircuit());

            a.setCircuitId("act-798789");
            a.setName("Avance Japón");
            a.setDescription("Visita las principales ciudades japonesas y conoce su cultura");
            a.setImage("http://bookingfaxnavia.com/catalogo/ambassadortours/2018/10/1560/page1.jpg");

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
            a.setName("Monográfico India");
            a.setDescription("Conoce la India desde dentro con verdaderos expertos");
            a.setImage("http://bookingfaxnavia.com/catalogo/dimensionesclub/2018/04/1516/page1.jpg");

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
            a.setName("Cruceros fluviales");
            a.setDescription("Los mejores cruceros fluviales por Europa");
            a.setImage("http://bookingfaxnavia.com/catalogo/politours/2017/11/1428/page1.jpg");

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
    public GetCircuitRatesRS getCircuitRates(String token, String key, int date, String language) throws Throwable {
        GetCircuitRatesRS rs = new GetCircuitRatesRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price details");

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


        } catch (Throwable e) {
            rs.setStatusCode(500);
            rs.setMsg("" + e.getClass().getSimpleName() + ": " + e.getMessage());
            e.printStackTrace();
        }



        return rs;
    }

    @Override
    public CheckCircuitRS check(String token, String key, int date, String language, int adults, int children, String variant) throws Throwable {
        CheckCircuitRS rs = new CheckCircuitRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Done");


        rs.setAvailable(true);
        rs.setKey("2098347238472398047239734");
        rs.setValue(new Amount("EUR", 200.34));

        return rs;
    }

    @Override
    public GetCircuitPriceDetailsRS getCircuitPriceDetails(String token, String key, String language, String supplements, String coupon) throws Throwable {

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
            l.setDate(20181201);
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
        rs.setAvailableServices(new ArrayList<String>());
        rs.getAvailableServices().add(new String("traslado"));

        rs.setPaymentUrl("https://www.paypal.com");

        return rs;
    }

    @Override
    public GetAvailableCircuitsRS getFilteredCircuits(String token, String labels, String language, double minPrice, double maxPrice) throws Throwable {
        GetAvailableCircuitsRS rs = new GetAvailableCircuitsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 circuits found. It consumed 24 ms in the server. xx");

        Random r = new Random();


        {
            AvailableCircuit a;
            rs.getAvailableCircuits().add(a = new AvailableCircuit());

            a.setCircuitId("act-798789");
            a.setName("Avance Japón");
            a.setDescription("Visita las principales ciudades japonesas y conoce su cultura");
            a.setImage("http://bookingfaxnavia.com/catalogo/ambassadortours/2018/10/1560/page1.jpg");

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
            a.setName("Monográfico India");
            a.setDescription("Conoce la India desde dentro con verdaderos expertos");
            a.setImage("http://bookingfaxnavia.com/catalogo/dimensionesclub/2018/04/1516/page1.jpg");

            BestDeal bd;
            a.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOffer(true);
            bd.setBeforeOfferPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOfferText("Special Offer ");

        }


        {
            AvailableCircuit a;
            rs.getAvailableCircuits().add(a = new AvailableCircuit());

            a.setCircuitId("act-7987a89");
            a.setName("Cruceros fluviales");
            a.setDescription("Los mejores cruceros fluviales por Europa");
            a.setImage("http://bookingfaxnavia.com/catalogo/politours/2017/11/1428/page1.jpg");

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



        return rs;
    }


}
