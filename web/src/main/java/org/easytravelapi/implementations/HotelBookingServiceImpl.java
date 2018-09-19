package org.easytravelapi.implementations;

import org.easytravelapi.HotelBookingService;
import org.easytravelapi.common.*;
import org.easytravelapi.hotel.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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


        String[] nombres = {"Java", "Javascript", ".Net", "Scala", "Go", "Kotlin"};

        Random r = new Random();

        for (int i = 0; i < 215; i++) {

            AvailableHotel h;
            rs.getHotels().add(h = new AvailableHotel());

            h.setHotelId("hot_" + i);
            h.setHotelName("Hotel " + nombres[i % nombres.length] + " " + i);

            h.setHotelKey("ied987yde9h29deb238eyb2389ev239evt2ed76f1329d");

            h.setHotelCategoryId("4s");
            h.setHotelCategoryName("****");

            h.setLatitude("39.6359261");
            h.setLongitude("2.629556");

            BestDeal bd;
            h.setBestDeal(bd = new BestDeal());

            double rp;
            double x = r.nextDouble();
            bd.setRetailPrice(new Amount("EUR", rp = Math.round(100 + x * 900) / 100));
            System.out.println("x=" + x + ", rp=" + rp);
            bd.setNetPrice(new Amount("EUR", Math.round(rp * 85) / 100));

        }


        return rs;
    }


    @Override
    public GetHotelRatesRS getRates(String token, String hotelkey) throws Throwable {
        GetHotelRatesRS rs = new GetHotelRatesRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("4 rates returned. It took 15 ms in the server.");

        {
            Allocation a;
            rs.getRates().add(a = new Allocation());
            Option o;
            a.getOptions().add(o = new Option());
            o.setRoomId("DBL");
            o.setRoomName("Double Room");
            a.setNumberOfRooms(1);
            a.setPaxPerRoom(2);
            {
                BoardPrice p;
                o.getPrices().add(p = new BoardPrice());
                p.setKey("5454646546542ECXSAEWUOIDWOEIDGWEDBWIED732732E");
                p.setBoardBasisId("HB");
                p.setBoardBasisName("Half board");
                Amount n;
                p.setNetPrice(n = new Amount());
                n.setCurrencyIsoCode("EUR");
                n.setValue(200.35);
            }
            {
                BoardPrice p;
                o.getPrices().add(p = new BoardPrice());
                p.setKey("87893723idcyw8723879NKHDKBQEWBDEQW92394023DWFEW");
                p.setBoardBasisId("FB");
                p.setBoardBasisName("Full board");
                Amount n;
                p.setNetPrice(n = new Amount());
                n.setCurrencyIsoCode("EUR");
                n.setValue(500.15);
                p.setOffer(true);
                p.setOfferText("SPECIAL OFFER -30%");
                p.setNonRefundable(true);
            }

            a.getOptions().add(o = new Option());
            o.setRoomId("SUI");
            o.setRoomName("Suite");
            a.setNumberOfRooms(1);
            a.setPaxPerRoom(2);
            {
                BoardPrice p;
                o.getPrices().add(p = new BoardPrice());
                p.setKey("5454646546542ECXSAEWUOIDWOEIDGWEDBWIED732732E");
                p.setBoardBasisId("HB");
                p.setBoardBasisName("Half board");
                Amount n;
                p.setNetPrice(n = new Amount());
                n.setCurrencyIsoCode("EUR");
                n.setValue(230.35);
            }
            {
                BoardPrice p;
                o.getPrices().add(p = new BoardPrice());
                p.setKey("87893723idcyw8723879NKHDKBQEWBDEQW92394023DWFEW");
                p.setBoardBasisId("FB");
                p.setBoardBasisName("Full board");
                Amount n;
                p.setNetPrice(n = new Amount());
                n.setCurrencyIsoCode("EUR");
                n.setValue(610.15);
                p.setOffer(true);
                p.setOfferText("SPECIAL OFFER -30%");
                p.setNonRefundable(true);
            }
        }


        {
            Allocation a;
            rs.getRates().add(a = new Allocation());
            Option o;
            a.getOptions().add(o = new Option());
            o.setRoomId("DBL");
            o.setRoomName("Double Room");
            a.setNumberOfRooms(1);
            a.setPaxPerRoom(3);
            a.setAges(new int[]{4});
            {
                BoardPrice p;
                o.getPrices().add(p = new BoardPrice());
                p.setKey("5454646546542ECXSAEWUOIDWOEIDGWEDBWIED732732E");
                p.setBoardBasisId("HB");
                p.setBoardBasisName("Half board");
                Amount n;
                p.setNetPrice(n = new Amount());
                n.setCurrencyIsoCode("EUR");
                n.setValue(260.35);
            }
            {
                BoardPrice p;
                o.getPrices().add(p = new BoardPrice());
                p.setKey("87893723idcyw8723879NKHDKBQEWBDEQW92394023DWFEW");
                p.setBoardBasisId("FB");
                p.setBoardBasisName("Full board");
                Amount n;
                p.setNetPrice(n = new Amount());
                n.setCurrencyIsoCode("EUR");
                n.setValue(570.15);
                p.setOffer(true);
                p.setOfferText("SPECIAL OFFER -30%");
                p.setNonRefundable(true);
            }

            a.getOptions().add(o = new Option());
            o.setRoomId("SUI");
            o.setRoomName("Suite");
            a.setNumberOfRooms(1);
            a.setPaxPerRoom(2);
            {
                BoardPrice p;
                o.getPrices().add(p = new BoardPrice());
                p.setKey("5454646546542ECXSAEWUOIDWOEIDGWEDBWIED732732E");
                p.setBoardBasisId("HB");
                p.setBoardBasisName("Half board");
                Amount n;
                p.setNetPrice(n = new Amount());
                n.setCurrencyIsoCode("EUR");
                n.setValue(320.35);
            }
            {
                BoardPrice p;
                o.getPrices().add(p = new BoardPrice());
                p.setKey("87893723idcyw8723879NKHDKBQEWBDEQW92394023DWFEW");
                p.setBoardBasisId("FB");
                p.setBoardBasisName("Full board");
                Amount n;
                p.setNetPrice(n = new Amount());
                n.setCurrencyIsoCode("EUR");
                n.setValue(1020.15);
                p.setOffer(true);
                p.setOfferText("SPECIAL OFFER -30%");
                p.setNonRefundable(true);
            }
        }





        return rs;
    }

    @Override
    public GetHotelPriceDetailsRS getHotelPriceDetails(String token, String key) {

        GetHotelPriceDetailsRS rs = new GetHotelPriceDetailsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price details");

        {
            PriceLine pc;
            rs.getPrices().add(pc = new PriceLine());
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
            Service c;
            rs.getAvailableServices().add(c = new Service());
            c.setDescription("Continental Buffet");
            c.setId("deiuwed8ewud890u23");

            {
                PaymentLine l;
                c.getPaymentLines().add(l = new PaymentLine());
                Amount a;
                l.setAmount(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(30.45);
                l.setDate(20180601);
                l.setPaymentMethod("WEB");
            }

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
            Service c;
            rs.getAvailableServices().add(c = new Service());
            c.setDescription("Spa");
            c.setId("deiuwed8ewud890u23");

            {
                PaymentLine l;
                c.getPaymentLines().add(l = new PaymentLine());
                Amount a;
                l.setAmount(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(130.45);
                l.setDate(20180601);
                l.setPaymentMethod("WEB");
            }

            {
                Amount a;
                c.setRetailPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(130.45);
            }

            {
                Amount a;
                c.setCommission(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(15);
            }

            {
                Amount a;
                c.setNetPrice(a = new Amount());
                a.setCurrencyIsoCode("EUR");
                a.setValue(215.45);
            }

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
            r.setText("This service must be paid in 24 hors. Otherwise it will be automatically cancelled and you may loose your rooms.");
        }
        {
            Remark r;
            rs.getRemarks().add(r = new Remark());
            r.setType("WARNING");
            r.setText("You will have to pay 3 euros per pax and night for the Ecotasa local tax in any hotel at Illes Balears.");
        }        {
            Remark r;
            rs.getRemarks().add(r = new Remark());
            r.setType("INFO");
            r.setText("Reception closed at night hours.");
        }

        {
            RateKey rk;
            rs.getRateKeys().add(rk = new RateKey());
            rk.setRequestPaymentData(true);
            rk.setRoomName("DBL STANDART");
            rk.setPaxPerRoom(2);
            rk.setKey("xxx");
        }


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

        return rs;
    }

}
