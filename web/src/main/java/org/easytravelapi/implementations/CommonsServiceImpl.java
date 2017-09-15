package org.easytravelapi.implementations;

import org.easytravelapi.CommonsService;
import org.easytravelapi.common.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by miguel on 27/7/17.
 */
public class CommonsServiceImpl implements CommonsService {
    public GetPortfolioRS getPortfolio(GetPortfolioRQ rq) {
        System.out.println("rq = " + rq);
        GetPortfolioRS rs = new GetPortfolioRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("5654 resouces found");

        {
            Country c;
            rs.getCountries().add(c = new Country());

            c.setResourceId("cou_es");
            c.setName("Spain");
            c.setUrlFriendlyName("spain");
            
            {
                State s;
                c.getStates().add(s = new State());

                s.setResourceId("sta_6363");
                s.setName("Majorca");
                s.setUrlFriendlyName("majorca");

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_2843");
                    l.setName("Palma");
                    l.setUrlFriendlyName("palma");

                    completar(l);

                }

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_2842");
                    l.setName("Alcudia");
                    l.setUrlFriendlyName("alcudia");

                    completar(l);

                }

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_2813");
                    l.setName("Cala Millor");
                    l.setUrlFriendlyName("cala-millor");

                    completar(l);

                }

            }

            {
                State s;
                c.getStates().add(s = new State());

                s.setResourceId("sta_6163");
                s.setName("Ibiza");
                s.setUrlFriendlyName("ibiza");

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_28x43");
                    l.setName("Ibiza");
                    l.setUrlFriendlyName("ibiza");

                    completar(l);

                }

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_28412");
                    l.setName("San Antonio");
                    l.setUrlFriendlyName("san-antonio");

                    completar(l);

                }
            }
        }


        {
            Country c;
            rs.getCountries().add(c = new Country());

            c.setResourceId("cou_gb");
            c.setName("Great Britain");
            c.setUrlFriendlyName("great-britain");

            {
                State s;
                c.getStates().add(s = new State());

                s.setResourceId("sta_63e63");
                s.setName("London");
                s.setUrlFriendlyName("london");

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_28d43");
                    l.setName("London City");
                    l.setUrlFriendlyName("london-city");

                    completar(l);

                }

            }
        }


        return rs;
    }

    private void completar(City l) {
        for (int i = 0; i < 100; i++)
        {
            Resource r;
            l.getResources().add(r = new Resource());
            r.setResourceId("hot_376472" + i);
            r.setName("Hotel Quonext " + i);
            r.setLatitude("39.6359261");
            r.setLongitude("2.629556");
            r.setType("hotel");
            r.setDescription("City hotel. 4 stars");
        }

        for (int i = 0; i < 80; i++)
        {
            Resource r;
            l.getResources().add(r = new Resource());
            r.setResourceId("tp_1212" + i);
            r.setName("Hotel Quonext " + i);
            r.setLatitude("39.6359261");
            r.setLongitude("2.629556");
            r.setType("transferpoint");
            r.setDescription("Transfer point for Hotel Quonext " + i);
        }
    }

    public GetDataSheetRS getDataSheet(GetDataSheetRQ rq) {
        System.out.println("rq = " + rq);

        GetDataSheetRS rs = new GetDataSheetRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Resouce id 171273127 found");

        String[][] data = {
                {"name", "Hotel Quonext"}
                , {"address", "Blaise Pascal s/n, Ed W, 07121"}
                , {"city", "Palma de Mallorca"}
                , {"country", "Spain"}
                , {"category", "4 stars"}
                , {"description", "Quonext Turismo es la empresa del grupo Quonext especializada en soluciones de gestión para el sector turístico: hoteles, aeropuertos, aerolíneas y empresas de ocio, parques temáticos, agencias de viajes receptivas… desarrolladas sobre Microsoft Dynamics NAV, siendo líderes en el mercado con más de 600 instalaciones."}
                , {"features/aircondition", ""}
                , {"features/elevator", ""}
                , {"features/bar", ""}
                , {"features/supermarket", ""}
                , {"features/telephone", ""}
                , {"features/childrenspool", ""}
                , {"features/pool", ""}
                , {"features/safe", ""}
                , {"features/balcony", ""}
                , {"features/tv", ""}
                , {"features/wifi", "Free"}
                , {"features/hairdryer", ""}
                , {"distance/center", "300 m"}
                , {"distance/airport", "25 km"}
                , {"distance/beach", "200 m"}
                , {"images/main", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/0?width=870&height=480&crop=false"}
                , {"images/image", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/1?width=870&height=480&crop=false"}
                , {"images/image", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/2?width=870&height=480&crop=false"}
                , {"images/image", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/3?width=870&height=480&crop=false"}
                , {"images/image", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/4?width=870&height=480&crop=false"}
                , {"images/image", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/5?width=870&height=480&crop=false"}
                , {"images/image", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/6?width=870&height=480&crop=false"}
                , {"images/image", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/7?width=870&height=480&crop=false"}
                , {"images/image", "https://hi-cdn.t-rp.co.uk/images/hotels/225146/8?width=870&height=480&crop=false"}
                , {"", ""}
                , {"", ""}
                , {"", ""}
                , {"", ""}
        };

        for (String[] d : data) {
            Pair p;
            rs.getValues().add(p = new Pair());
            p.setKey(d[0]);
            p.setValue(d[1]);
        }

        return rs;
    }

    public GetBookingsRS getBookings(GetBookingsRQ rq) {
        System.out.println("rq = " + rq);

        GetBookingsRS rs = new GetBookingsRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("120 bookings found.");

        String[] nombres = {"Java", "Javascript", ".Net", "Scala", "Go", "Kotlin"};

        for (int i = 0; i < 120; i++) {

            Booking b;
            rs.getBookings().add(b = new Booking());

            b.setBookingId("878997" + i);
            b.setCreated(LocalDateTime.of(2017, 03, 14, 23, 34, 15).format(DateTimeFormatter.ISO_DATE_TIME));
            b.setCreatedBy("MATEU");
            b.setModified(LocalDateTime.of(2017, 03, 14, 23, 34, 15).format(DateTimeFormatter.ISO_DATE_TIME));
            b.setLeadName("Sr " + nombres[i % nombres.length]);
            b.setStart("20180106");
            b.setEnd("20180112");
            b.setBookingId("9866230462GGWED76");
            Amount a;
            b.setNetValue(a = new Amount());
            a.setCurrencyIsoCode("EUR");
            a.setValue(750.42);
            b.setServiceType("HOTEL");
            b.setServiceDescription("Hotel " + nombres[i % nombres.length]);
            b.setStatus((i % 4 == 0)?"CANCELLED":"OK");
        }

        return rs;
    }

    public CancelBookingRS cancelBooking(CancelBookingRQ rq) {
        System.out.println("rq = " + rq);

        CancelBookingRS rs = new CancelBookingRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking has been cancelled");


        return rs;
    }
}
