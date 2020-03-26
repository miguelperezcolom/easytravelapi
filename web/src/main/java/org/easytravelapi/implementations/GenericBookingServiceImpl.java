package org.easytravelapi.implementations;

import org.easytravelapi.GenericBookingService;

import org.easytravelapi.activity.PaymentMethod;
import org.easytravelapi.circuit.Label;
import org.easytravelapi.common.Supplement;
import org.easytravelapi.common.*;
import org.easytravelapi.generic.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class GenericBookingServiceImpl implements GenericBookingService {

    @Override
    public GetGenericPriceDetailsRS getGenericPriceDetails(String token, String key, String language, String supplements, String coupon) throws Throwable {
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
            Price tot;
            rs.setTotal(tot = new Price());
            tot.setCurrencyIsoCode("EUR");
            {
                Amount a;
                tot.setRetail(1500.32);
            }

            {
                Amount a;
                tot.setNet(1250.01);
            }


        }
        {
            PriceLine pc;
            rs.getPriceLines().add(pc = new PriceLine());
            {
                Amount a;
                pc.setTotal(1500.32);
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
            if (coupon.length() > 5)
            {


                {
                    PriceLine pc;
                    rs.getPriceLines().add(pc = new PriceLine());
                    {
                        Amount a;
                        pc.setTotal(-750.16);
                    }

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
            l.setDate("2018-06-01");
            l.setPaymentMethod("WEB");
        }

        rs.setTerms("<span>He leído y acepto los <a href=\"http://google.es\"> terminos y condiciones de uso</a></span > ");
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

        rs.setPaymentUrl("<form name=f action='https://localhost:8080' method='post'>" +
                "<input type='hidden' name=amount value='100'> "+
                "</form>");

        return rs;

    }

    @Override
    public GetAvailableGenericsRS getAvailableGenerics(String token, String serviceType, String language) throws Throwable {

        GetAvailableGenericsRS rs = new GetAvailableGenericsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("availables generics");
        rs.setMaxPrice(1000d);
        rs.setMinPrice(1d);
        Label a;
        rs.getLabels().add(a = new Label());
        a.setId("1");
        a.setName("Alquiler coche");
        Random r = new Random();
        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric());

            Price bd;
            g.setBestDeal(bd = new Price());
            bd.setCurrencyIsoCode("EUR");
            double rp;
            double x = r.nextDouble();
            bd.setRetail(rp = Math.round(100 + x * 900) / 100);
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(Math.round(rp * 85) / 100);
            g.setDescription("Moto tipo scooter de 49 c.c.");
            g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
            g.setName("Moto scooter");
            g.setType("rentbike");
            g.setGenericId("moto1");
        }

        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric()) ;

            Price bd;
            g.setBestDeal(bd = new Price());
            bd.setCurrencyIsoCode("EUR");
            double rp;
            double x = r.nextDouble();
            bd.setRetail(rp = Math.round(100 + x * 900) / 100);
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(Math.round(rp * 85) / 100);
            bd.setOffer(true);
            bd.setBeforeOffer(Math.round(rp * 85) / 100);
            bd.setOfferText("Special offer for this activity");

            g.setDescription("Moto tipo scooter electrica");
            g.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
            g.setName("Moto electrica");
            g.setType("rentbike");
            g.setGenericId("moto2");

        }
        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric());

            Price bd;
            g.setBestDeal(bd = new Price());
            bd.setCurrencyIsoCode("EUR");
            double rp;
            double x = r.nextDouble();
            bd.setRetail(rp = Math.round(100 + x * 900) / 100);
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(Math.round(rp * 85) / 100);
            g.setDescription("Moto tipo scooter de 49 c.c.");
            g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
            g.setName("Moto scooter");
            g.setType("rentbike");
            g.setGenericId("moto3");
        }

        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric()) ;

            Price bd;
            g.setBestDeal(bd = new Price());
            bd.setCurrencyIsoCode("EUR");
            double rp;
            double x = r.nextDouble();
            bd.setRetail(rp = Math.round(100 + x * 900) / 100);
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(Math.round(rp * 85) / 100);
            g.setDescription("Moto tipo scooter electrica");
            g.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
            g.setName("Moto electrica");
            g.setType("rentbike");
            g.setGenericId("moto4");

        }
        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric());

            Price bd;
            g.setBestDeal(bd = new Price());
            bd.setCurrencyIsoCode("EUR");
            double rp;
            double x = r.nextDouble();
            bd.setRetail(rp = Math.round(100 + x * 900) / 100);
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(Math.round(rp * 85) / 100);
            g.setDescription("Moto tipo scooter de 49 c.c.");
            g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
            g.setName("Moto scooter");
            g.setType("rentbike");
            g.setGenericId("moto5");
        }

        {
            AvailableGeneric g;
            rs.getAvailableGenerics().add(g = new AvailableGeneric()) ;

            Price bd;
            g.setBestDeal(bd = new Price());
            bd.setCurrencyIsoCode("EUR");
            double rp;
            double x = r.nextDouble();
            bd.setRetail(rp = Math.round(100 + x * 900) / 100);
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(Math.round(rp * 85) / 100);
            g.setDescription("Moto tipo scooter electrica");
            g.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
            g.setName("Moto electrica");
            g.setType("rentbike");
            g.setGenericId("moto6");

        }


        return rs;
    }

    @Override
    public GetGenericRatesRS getGenericRates(String token, String productId, String language) throws Throwable {
        GetGenericRatesRS rs = new GetGenericRatesRS();
        rs.setAdultsDependant(true);
        rs.setChildrenDependant(true);
        rs.setDateDependant(true);
        rs.setVariantDependant(true);
        rs.setUnitsDependant(true);
        GenericVariant v;
        rs.getVariants().add(v = new GenericVariant());
        v.setName("vip");
        v.setDescription("variante vip");
        v.setKey("11");
        Price bd;
        v.setBestDeal(bd = new Price());
        bd.setRetail(12d);
        bd.setCurrencyIsoCode("EUR");
        v.setPricePer("Unit");


        return rs;
    }

    @Override
    public CheckGenericRS checkGeneric(String token, String key, int adults, int children, int units, int start, int end, String language, String variant) throws Throwable {
        CheckGenericRS rs = new CheckGenericRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Done");


        rs.setAvailable(true);
        rs.setKey("2098347238472398047239734");
        rs.setValue(new Amount("EUR", 200.34));


        return rs;
    }


    @Override
    public GetAvailableGenericsRS getFilteredGeneric(String token, String language, String destination, String labels, double minPrice, double maxPrice) throws Throwable {
        GetAvailableGenericsRS rs = new GetAvailableGenericsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("availables generics");
        Random r = new Random();
        System.out.println("contains nada" + labels.toString());
        String[] servicesArray =  labels.split(",");
        if(labels != null){
        for (String service : servicesArray) {
            System.out.println("service " +service );
            if(service.equals("1")){

                System.out.println("contains rentabike"  );

            {
                AvailableGeneric g;
                rs.getAvailableGenerics().add(g = new AvailableGeneric());

                Price bd;
                g.setBestDeal(bd = new Price());
                bd.setCurrencyIsoCode("EUR");
                double rp;
                double x = r.nextDouble();
                bd.setRetail(rp = Math.round(100 + x * 900) / 100);
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNet(Math.round(rp * 85) / 100);
                bd.setOffer(true);
                bd.setBeforeOffer(Math.round(rp * 85) / 100);
                bd.setOfferText("Special offer for this activity");

                g.setDescription("Moto tipo scooter de 49 c.c.");
                g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
                g.setName("Moto scooter");
                g.setType("rentbike");
                g.setGenericId("moto1");
            }

            {
                AvailableGeneric g;
                rs.getAvailableGenerics().add(g = new AvailableGeneric()) ;

                Price bd;
                g.setBestDeal(bd = new Price());
                bd.setCurrencyIsoCode("EUR");
                double rp;
                double x = r.nextDouble();
                bd.setRetail(rp = Math.round(100 + x * 900) / 100);
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNet(Math.round(rp * 85) / 100);
                g.setDescription("Moto tipo scooter electrica");
                g.setImage("https://sc02.alicdn.com/kf/HTB1W3yaRVXXXXbwapXXq6xXFXXXA/2017-FIRE-STAR-electric-motorcycle-moto-electric.jpg");
                g.setName("Moto electrica");
                g.setType("rentbike");
                g.setGenericId("moto2");

            }
            {
                AvailableGeneric g;
                rs.getAvailableGenerics().add(g = new AvailableGeneric());

                Price bd;
                g.setBestDeal(bd = new Price());
                bd.setCurrencyIsoCode("EUR");
                double rp;
                double x = r.nextDouble();
                bd.setRetail(rp = Math.round(100 + x * 900) / 100);
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNet(Math.round(rp * 85) / 100);
                g.setDescription("Moto tipo scooter de 49 c.c.");
                g.setImage("https://www.electromotos.net/wp-content/uploads/2017/11/Askoll-eS1-600x400.jpg");
                g.setName("Moto scooter");
                g.setType("rentbike");
                g.setGenericId("moto3");
            }
        }
        if(service.equals("2")){
            {
                System.out.println("contains rentabike"  );
                AvailableGeneric g;
                rs.getAvailableGenerics().add(g = new AvailableGeneric());

                Price bd;
                g.setBestDeal(bd = new Price());
                bd.setCurrencyIsoCode("EUR");
                double rp;
                double x = r.nextDouble();
                bd.setRetail(rp = Math.round(100 + x * 900) / 100);
                System.out.println("x=" + x + ", rp=" + rp);
                bd.setNet(Math.round(rp * 85) / 100);
                g.setDescription("Entrada concierto Rock");
                g.setImage("https://ep01.epimg.net/verne/imagenes/2015/10/18/articulo/1445171361_981733_1445201957_noticia_normal.jpg");
                g.setName("Entrada Concierto");
                g.setType("rentbike");
                g.setGenericId("moto3");
            }

        }
        }
        }
        return rs;
    }
}
