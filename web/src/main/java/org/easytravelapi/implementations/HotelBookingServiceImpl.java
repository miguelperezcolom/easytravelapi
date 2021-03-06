package org.easytravelapi.implementations;

import org.easytravelapi.HotelBookingService;
import org.easytravelapi.circuit.Label;
import org.easytravelapi.common.*;
import org.easytravelapi.hotel.*;
import org.easytravelapi.hotel.Supplement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by miguel on 27/7/17.
 */
public class HotelBookingServiceImpl implements HotelBookingService {


    @Override
    public GetAvailableHotelsRS getAvailableHotels(String token, String language, String resorts, int checkIn, int checkout, String occupancies, boolean includeStaticInfo) throws Throwable {

        GetAvailableHotelsRS rs = new GetAvailableHotelsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("215 hotels returned. It took 34 ms in the server.");
        rs.setMaxPrice(1000d);
        rs.setMinPrice(1d);

        {
            Label a;
            rs.getLabels().add(a = new Label());
            a.setId("1");
            a.setName("Playa");
        }

        {
            Label a;
            rs.getLabels().add(a = new Label());
            a.setId("2");
            a.setName("Montaña");
        }
        {
            Label a;
            rs.getLabels().add(a = new Label());
            a.setId("3");
            a.setName("Gran Lujo");
        }
        String[] nombres = {"Java", "Javascript", ".Net", "Scala", "Go", "Kotlin"};

        Random r = new Random();

        for (int i = 0; i < 215; i++) {

            AvailableHotel h;
            rs.getHotels().add(h = new AvailableHotel());

            h.setHotelId("hot_" + i);
            h.setHotelName("Hotel " + nombres[i % nombres.length] + " " + i);

            h.setHotelCategoryId("4s");
            h.setHotelCategoryName("****");

            h.setAddress("Avda. principal nª 5, Palma, España");

            h.setLatitude( "39.6"+ (i%5) + "59261");
            h.setLongitude("2.6"+ (i%5) + "556");
            h.setMainImage("https://hi-cdn.t-rp.co.uk/images/hotels/225146/" + i%9 +"?width=870&height=480&crop=false");
            Price bd;
            h.setBestDeal(bd = new Price());
            System.out.println(i%4);

            double rp;
            double x = r.nextDouble();
            bd.setCurrencyIsoCode("EUR");
            bd.setRetail(rp = Math.round(100 + x * 900) / 100);
            if (i%4 ==0){
                bd.setOffer(true);
                bd.setOfferText("30% Descuento al contratar mas de 3 días en temporada baja, habitación doble");
                bd.setBeforeOffer(rp + 100);
            }
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet(Math.round(rp * 85) / 100d);


        }


        return rs;
    }

    @Override
    public GetHotelRatesRS getRates(String token, GetHotelRatesRQ ratesRQ) throws Throwable {

        GetHotelRatesRS rs = new GetHotelRatesRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("4 rates returned. It took 15 ms in the server.");

        rs.setCurrencyIsoCode("EUR");

        {
            Allocation a;
            rs.getRates().add(a = new Allocation());
            Option o;
            a.getOptions().add(o = new Option());
            o.setAllotment(3);
            o.setRoomId("DBL");
            o.setRoomName("Double Room");
            o.setImage("https://hi-cdn.t-rp.co.uk/images/hotels/225146/1?width=870&height=480&crop=false");
            o.setRoomDescription("habitacion doble, cama de matrimonio vistas al mar, tv, wifi, mini-bar");
            a.setNumberOfRooms(1);
            a.setPaxPerRoom(2);
            {
                OptionBoardPrice p;
                o.getPrices().add(p = new OptionBoardPrice());
                p.setRateId("5454646546542ECXSAEWUOIDWOEIDGWEDBWIED732732A");
                p.setBoardBasisId("HB");
                p.setBoardBasisName("Half board");
                p.setRetailPrice(200.35);
            }
            {
                OptionBoardPrice p;
                o.getPrices().add(p = new OptionBoardPrice());
                p.setRateId("87893723idcyw8723879NKHDKBQEWBDEQW92394023DWFEW");
                p.setBoardBasisId("FB");
                p.setBoardBasisName("Full board");
                p.setRetailPrice(500.15);
                p.setOffer(true);
                p.setOfferText("SPECIAL OFFER -30%");
                p.setNonRefundable(true);
            }

            a.getOptions().add(o = new Option());
            o.setRoomId("SUI");

            o.setRoomName("Suite");
            o.setImage("https://hi-cdn.t-rp.co.uk/images/hotels/225146/2?width=870&height=480&crop=false");
            o.setRoomDescription("habitacion Suite, cama king size,balcón privado vistas al mar, tv, wifi, mini-bar, jacuzzi en baño");
            a.setNumberOfRooms(1);
            a.setPaxPerRoom(2);
            {
                OptionBoardPrice p;
                o.getPrices().add(p = new OptionBoardPrice());
                p.setRateId("5454646546542ECXSAEWUOIDWOEIDGWEDBWIED732732E");
                p.setBoardBasisId("HB");
                p.setBoardBasisName("Half board");
                p.setRetailPrice(230.35);
            }
            {
                OptionBoardPrice p;
                o.getPrices().add(p = new OptionBoardPrice());
                p.setRateId("87893723idcyw8723879NKHDKBQEWBDEQW92394023DWFET");
                p.setBoardBasisId("FB");
                p.setBoardBasisName("Full board");
                p.setRetailPrice(610.15);
                p.setOffer(true);
                p.setOfferText("SPECIAL OFFER -30%");
                p.setOnRequest(true);
                p.setOnRequestText("This option must be confirmed by hotel");

                p.setNonRefundable(true);
            }
        }


        {
            Allocation a;
            rs.getRates().add(a = new Allocation());
            Option o;
            a.getOptions().add(o = new Option());
            o.setRoomId("DBL");
            o.setAllotment(5);
            o.setRoomName("Double Room");
            o.setImage("https://hi-cdn.t-rp.co.uk/images/hotels/225146/1?width=870&height=480&crop=false");
            o.setRoomDescription("habitacion doble, cama de matrimonio vistas al mar, tv, wifi, mini-bar");
            a.setNumberOfRooms(1);
            a.setPaxPerRoom(3);
            a.setAges(new int[]{4});
            {
                OptionBoardPrice p;
                o.getPrices().add(p = new OptionBoardPrice());
                p.setRateId("5454646546542ECXSAEWUOIDWOEIDGWEDBWIED7327321");
                p.setBoardBasisId("HB");
                p.setBoardBasisName("Half board");
                p.setRetailPrice(260.35);
            }
            {
                OptionBoardPrice p;
                o.getPrices().add(p = new OptionBoardPrice());
                p.setRateId("87893723idcyw8723879NKHDKBQEWBDEQW92394023DWFE2");
                p.setBoardBasisId("FB");
                p.setBoardBasisName("Full board");
                p.setRetailPrice(570.15);
                p.setOffer(true);
                p.setOfferText("SPECIAL OFFER -30%");
                p.setNonRefundable(true);
            }

            a.getOptions().add(o = new Option());
            o.setAllotment(10);
            o.setRoomId("SUI");
            o.setRoomName("Suite");
            o.setImage("https://hi-cdn.t-rp.co.uk/images/hotels/225146/2?width=870&height=480&crop=false");
            o.setRoomDescription("habitacion Suite, cama king size,balcón privado vistas al mar, tv, wifi, mini-bar, jacuzzi en baño");
            a.setNumberOfRooms(1);
            a.setPaxPerRoom(2);
            {
                OptionBoardPrice p;
                o.getPrices().add(p = new OptionBoardPrice());
                p.setRateId("5454646546542ECXSAEWUOIDWOEIDGWEDBWIED7327323");
                p.setBoardBasisId("HB");
                p.setBoardBasisName("Half board");
                p.setRetailPrice(320.35);
            }
            {
                OptionBoardPrice p;
                o.getPrices().add(p = new OptionBoardPrice());
                p.setRateId("87893723idcyw8723879NKHDKBQEWBDEQW92394023DWFE4");
                p.setBoardBasisId("FB");
                p.setBoardBasisName("Full board");
                p.setRetailPrice(1020.15);
                p.setOffer(true);
                p.setOfferText("SPECIAL OFFER -30%");
                p.setNonRefundable(true);
            }
        }





        return rs;
    }

    @Override
    public GetHotelPriceDetailsRS getHotelPriceDetails(String token, GetHotelPriceDetailsRQ rq) throws Throwable {

        GetHotelPriceDetailsRS rs = new GetHotelPriceDetailsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price details");

        if (rq.getStays() != null) for (Stay stay : rq.getStays()) {
            PricedStay ps;
            rs.getStays().add(ps = new PricedStay());
            ps.setOccupancy(stay.getOccupancy());
            ps.setRoomId(stay.getRoomId());
            ps.setRoomName("Habitación doble");
            ps.setBoardId(stay.getBoardId());
            ps.setBoardName("Media pensión");
            ps.setNetPrice(1232.32);
            ps.setRetailPrice( 1524.12);
            ps.setNonRefundable(true);
            ps.setOffer(true);
            ps.setOfferText("30% descuento");
            ps.setOnRequest(false);
            ps.setOnRequestText("");
            ps.setPax(stay.getPax());
            ps.setSupplements(stay.getSupplements());
            ps.setRateId(stay.getRateId());
            ps.setAvailableSupplements(List.of(new Supplement("324", "Vista mar", 234.21), new Supplement("546", "Desayuno continental", 456.22)));
        }

        {
            PriceLine pc;
            rs.getPriceBreakdown().add(pc = new PriceLine());
            {
                pc.setTotal(600.00);
            }

            pc.setDescription("Room double Standard");
        }


        if(rq.getPromoCode() != null && rq.getPromoCode() != ""){
            if (rq.getPromoCode().length() > 5)
            {


            {
                PriceLine pc;
                rs.getPriceBreakdown().add(pc = new PriceLine());
                {
                    pc.setTotal(-750.16);
                }

                pc.setDescription("Coupon discount 50%");

            }
            }
            else{
                rs.setPromoCodeMsg("Cupon no válido");
            }
        }
        for (Stay stay : rq.getStays()) if(stay.getSupplements() != null && stay.getSupplements() != "") {
            {

                String[] parts = stay.getSupplements().split(";");
                System.out.println(stay.getSupplements());
                System.out.println(parts.length);
                System.out.println(parts);
                String[] parts2 = parts[0].split("#");
                System.out.println(parts2.length);
                System.out.println(parts);

                PriceLine pc;
                rs.getPriceBreakdown().add(pc = new PriceLine());
                {
                    pc.setTotal(-750.16);
                }

                pc.setDescription(parts2[1] + " x suplemento " + parts2[0]);


            }
        }
        {
            PriceLine pc;
            rs.getPriceBreakdown().add(pc = new PriceLine());
            {
                pc.setTotal(300.32);
            }

            pc.setDescription("Taxes");


        }
        {
            PriceLine pc;
            rs.getPriceBreakdown().add(pc = new PriceLine());
            {
                pc.setTotal(600.32);
            }

            pc.setDescription("Supplements ");


        }
        {
            Price tot;
            rs.setTotal(tot = new Price());
            {
                tot.setRetail(1500.64);
            }

            {
                tot.setNet(1250.01);
            }
            {
                tot.setCurrencyIsoCode("EUR");
            }


        }
        {
            PaymentLine l;
            rs.getPaymentLines().add(l = new PaymentLine());
            Amount a;
            l.setAmount(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(600.45);
            l.setDate("2018-12-01");
            l.setPaymentMethod("WEB");
        }
        {
            PaymentLine l;
            rs.getPaymentLines().add(l = new PaymentLine());
            Amount a;
            l.setAmount(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(600.45);
            l.setDate("2018-12-15");
            l.setPaymentMethod("WEB");
        }
        {
            PaymentLine l;
            rs.getPaymentLines().add(l = new PaymentLine());
            Amount a;
            l.setAmount(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(300.45);
            l.setDate("2018-12-01");
            l.setPaymentMethod("WEB");
        }



        {
            CancellationCost c;
            rs.getCancellationCosts().add(c = new CancellationCost());
            c.setGMTtime(LocalDateTime.of(2018, 06, 05, 12, 00).format(DateTimeFormatter.ISO_DATE_TIME));
            c.setRetail(250.32);
        }

        {
            CancellationCost c;
            rs.getCancellationCosts().add(c = new CancellationCost());
            c.setGMTtime(LocalDateTime.of(2018, 07, 01, 12, 00).format(DateTimeFormatter.ISO_DATE_TIME));
            c.setRetail(400d);
        }

        {
            Remark r;
            rs.getRemarks().add(r = new Remark());
            r.setType("IMPORTANT");
            r.setText("This service must be paid in 24 hors. Otherwise it will be automatically cancelled and you may loose your rooms.");
        }
        {
            Remark r;
            rs.getRemarks().add(r = new Remark());
            r.setType("WARNING");
            r.setText("You will have to pay 3 euros per pax and night for the Ecotasa local tax in any hotel at Illes Balears.");
        }
        {
            Remark r;
            rs.getRemarks().add(r = new Remark());
            r.setType("INFO");
            r.setText("Reception closed at night hours.");
        }

        rs.setTerms("<span>He leído y acepto los <a href=\"http://google.es\"> terminos y condiciones de uso</a></span > ");
        return rs;
    }

    @Override
    public BookHotelRS bookHotel(String token, BookHotelRQ rq) {

        System.out.println("rq=" + rq);

        BookHotelRS rs = new BookHotelRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking confirmed ok");

        rs.setBookingId("5643135431");
        rs.setFileId("5654646");
        rs.setAvailableServices(new ArrayList<String>());
        rs.getAvailableServices().add(new String("traslado"));
        rs.getAvailableServices().add(new String("excursion"));

        rs.setPaymentUrl("<form name=f action='https://localhost:8080' method='post'>" +
                "<input type='hidden' name=amount value='100'> "+
                "</form>");

        return rs;
    }

    @Override
    public GetAvailableHotelsRS getFilteredHotels(String token, String language, String resorts, int checkIn, int checkout, String occupancies, String categories, double minPrice, double maxPrice) throws Throwable {
        GetAvailableHotelsRS rs = new GetAvailableHotelsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("215 hotels returned. It took 34 ms in the server.");


        String[] nombres = {"Java", "Javascript", ".Net", "Scala", "Go", "Kotlin"};

        Random r = new Random();

        for (int i = 0; i < 30; i++) {

            AvailableHotel h;
            rs.setMaxPrice(1000d);
            rs.setMinPrice(1d);
            rs.getHotels().add(h = new AvailableHotel());

            h.setHotelId("hot_" + i);
            h.setHotelName("Hotel " + nombres[i % nombres.length] + " " + i);

            h.setHotelCategoryId("4s");
            h.setHotelCategoryName("****");

            h.setAddress("Avda. principal nª 5, Palma, España");

            h.setLatitude( "39.6"+ (i%5) + "59261");
            h.setLongitude("2.6"+ (i%5) + "556");
            h.setMainImage("https://hi-cdn.t-rp.co.uk/images/hotels/225146/" + i%9 +"?width=870&height=480&crop=false");
            Price bd;
            h.setBestDeal(bd = new Price());
            System.out.println(i%4);
            if (i%4 ==0){
                bd.setOffer(true);
            }
            double rp;
            double x = r.nextDouble();
            bd.setRetail(rp = Math.round(100 + x * 900) / 100);
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNet( Math.round(rp * 85) / 100d);
            bd.setCurrencyIsoCode("EUR");


        }


        return rs;
    }

}
