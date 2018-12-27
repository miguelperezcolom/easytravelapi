package org.easytravelapi.implementations;

import org.easytravelapi.GenericBookingService;

import org.easytravelapi.activity.BookActivityRS;
import org.easytravelapi.activity.PaymentMethod;
import org.easytravelapi.common.*;
import org.easytravelapi.generic.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenericBookingServiceImpl implements GenericBookingService {

    @Override
    public GetGenericPriceDetailsRS getGenericPriceDetails(String token, String key, String language, int adults, int children, int units, String supplements, int start, int end, String coupon) throws Throwable {
        GetGenericPriceDetailsRS rs = new GetGenericPriceDetailsRS();

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
            if (coupon.length() > 5)
            {


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
                rs.setCouponMsg("Cupón " + coupon + " aplicado");
            }
            else{
                rs.setCouponMsg("Cupón no válido");
            }
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
    public BookGenericRS bookGeneric(String token, BookGenericRQ rq) throws Throwable {
        BookGenericRS rs = new BookGenericRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking confirmed ok");

        rs.setBookingId("5643135431");
        rs.setAvailableServices(new ArrayList<String>());
        rs.getAvailableServices().add(new String("traslado"));
        rs.getAvailableServices().add(new String("hotel"));

        rs.setPaymentUrl("https://www.paypal.com");

        return rs;

    }

    @Override
    public GetAvailableGenericsRS getAvailableGenerics(String token, String serviceType, String language) throws Throwable {

        GetAvailableGenericsRS rs = new GetAvailableGenericsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("availables generics");
        Random r = new Random();
        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric());

            BestDeal bd;
            g.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            g.setDescription(new MultilingualText("es", "Moto tipo scooter de 49 c.c.", "en", "Scooter bike 49 c.c."));
            g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
            g.setName(new MultilingualText("es", "Moto scooter", "en", "Scooter bike "));
            g.setType("rentbike");
            g.setGenericId("moto1");
        }

        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric()) ;

            BestDeal bd;
            g.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOffer(true);
            bd.setBeforeOfferPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            bd.setOfferText("Special offer for this activity");

            g.setDescription(new MultilingualText("es", "Moto tipo scooter electrica", "en", "Scooter bike electrica"));
            g.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
            g.setName(new MultilingualText("es", "Moto electrica", "en", "Electric Scooter"));
            g.setType("rentbike");
            g.setGenericId("moto2");

        }
        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric());

            BestDeal bd;
            g.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            g.setDescription(new MultilingualText("es", "Moto tipo scooter de 49 c.c.", "en", "Scooter bike 49 c.c."));
            g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
            g.setName(new MultilingualText("es", "Moto scooter", "en", "Scooter bike "));
            g.setType("rentbike");
            g.setGenericId("moto3");
        }

        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric()) ;

            BestDeal bd;
            g.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            g.setDescription(new MultilingualText("es", "Moto tipo scooter electrica", "en", "Scooter bike electrica"));
            g.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
            g.setName(new MultilingualText("es", "Moto electrica", "en", "Electric Scooter"));
            g.setType("rentbike");
            g.setGenericId("moto4");

        }
        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric());

            BestDeal bd;
            g.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            g.setDescription(new MultilingualText("es", "Moto tipo scooter de 49 c.c.", "en", "Scooter bike 49 c.c."));
            g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
            g.setName(new MultilingualText("es", "Moto scooter", "en", "Scooter bike "));
            g.setType("rentbike");
            g.setGenericId("moto5");
        }

        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric()) ;

            BestDeal bd;
            g.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
            g.setDescription(new MultilingualText("es", "Moto tipo scooter electrica", "en", "Scooter bike electrica"));
            g.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
            g.setName(new MultilingualText("es", "Moto electrica", "en", "Electric Scooter"));
            g.setType("rentbike");
            g.setGenericId("moto6");

        }


        return rs;
    }

    @Override
    public GetServicesRS getServices(String token, String language) throws Throwable {
        GetServicesRS rs = new GetServicesRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("x available services");
        {
            GenericService gs;
            rs.getGenericsServices().add(gs = new GenericService());
            gs.setDescription(new MultilingualText("es", "Alquila tu moto con nosotros", "en", "You can rent a bike with us"));
            gs.setName(new MultilingualText("es", "Alquiler moto", "en", "Bike renting"));
            gs.setTypeId("rentabike");
            gs.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
        }
        {
            GenericService gs;
            rs.getGenericsServices().add(gs = new GenericService());
            gs.setDescription(new MultilingualText("es", "Compra entradas para espectaculos", "en", "Buy your tickets with us"));
            gs.setName(new MultilingualText("es", "Comprar Entradas ", "en", "Buy Tickets"));
            gs.setTypeId("tickets");
            gs.setImage("http://nlpexcellence2017.com/wp-content/uploads/ticket.jpg");
        }
        return rs;
    }



    @Override
    public GetAvailableGenericsRS getFilteredGeneric(String token, String serviceType, String language, String minPrice, String maxPrice) throws Throwable {
        GetAvailableGenericsRS rs = new GetAvailableGenericsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("availables generics");
        Random r = new Random();
        System.out.println("contains nada" + serviceType.toString());
        String[] servicesArray =  serviceType.split(",");
        for (String service : servicesArray) {
            System.out.println("service " +service );
            if(service.equals("rentabike")){

                System.out.println("contains rentabike"  );

            {
                AvailableGeneric g;
                rs.getAvailableGenerics().add(g = new AvailableGeneric());

                BestDeal bd;
                g.setBestDeal(bd = new BestDeal());

                double rp;
                double x = r.nextDouble();
                bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
                bd.setOffer(true);
                bd.setBeforeOfferPrice(new Amount("EUR", Math.round(rp * 85) / 100));
                bd.setOfferText("Special offer for this activity");

                g.setDescription(new MultilingualText("es", "Moto tipo scooter de 49 c.c.", "en", "Scooter bike 49 c.c."));
                g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
                g.setName(new MultilingualText("es", "Moto scooter", "en", "Scooter bike "));
                g.setType("rentbike");
                g.setGenericId("moto1");
            }

            {
                AvailableGeneric g;
                rs.getAvailableGenerics().add(g = new AvailableGeneric()) ;

                BestDeal bd;
                g.setBestDeal(bd = new BestDeal());

                double rp;
                double x = r.nextDouble();
                bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
                g.setDescription(new MultilingualText("es", "Moto tipo scooter electrica", "en", "Scooter bike electrica"));
                g.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
                g.setName(new MultilingualText("es", "Moto electrica", "en", "Electric Scooter"));
                g.setType("rentbike");
                g.setGenericId("moto2");

            }
            {
                AvailableGeneric g;
                rs.getAvailableGenerics().add(g = new AvailableGeneric());

                BestDeal bd;
                g.setBestDeal(bd = new BestDeal());

                double rp;
                double x = r.nextDouble();
                bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
                g.setDescription(new MultilingualText("es", "Moto tipo scooter de 49 c.c.", "en", "Scooter bike 49 c.c."));
                g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
                g.setName(new MultilingualText("es", "Moto scooter", "en", "Scooter bike "));
                g.setType("rentbike");
                g.setGenericId("moto3");
            }
        }
        if(service.equals("tickets")){
            {
                System.out.println("contains rentabike"  );
                AvailableGeneric g;
                rs.getAvailableGenerics().add(g = new AvailableGeneric());

                BestDeal bd;
                g.setBestDeal(bd = new BestDeal());

                double rp;
                double x = r.nextDouble();
                bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));
                g.setDescription(new MultilingualText("es", "Entrada concierto Rock", "en", "Rock Concert ticket"));
                g.setImage("https://ep01.epimg.net/verne/imagenes/2015/10/18/articulo/1445171361_981733_1445201957_noticia_normal.jpg");
                g.setName(new MultilingualText("es", "Entrada Concierto", "en", "Concert Ticket"));
                g.setType("rentbike");
                g.setGenericId("moto3");
            }

        }
        }
        return rs;
    }
}
