package org.easytravelapi.implementations;

import org.easytravelapi.CommonsService;
import org.easytravelapi.common.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by miguel on 27/7/17.
 */
public class CommonsServiceImpl implements CommonsService {

    @Override
    public GetPortfolioRS getPortfolio(String token) {
        GetPortfolioRS rs = new GetPortfolioRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("5654 resouces found");

        {
            Country c;
            rs.getCountries().add(c = new Country());

            c.setResourceId("cou_es");
            c.setName(new MultilingualText("es", "España", "en", "Spain"));
            c.setUrlFriendlyName("spain");
            
            {
                State s;
                c.getStates().add(s = new State());

                s.setResourceId("sta_6363");
                s.setName(new MultilingualText("es", "Mallorca", "en", "Majorca"));
                s.setUrlFriendlyName("majorca");

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_2843");
                    l.setName(new MultilingualText("es", "Palma de Mallorca", "en", "Palma"));
                    l.setUrlFriendlyName("palma");

                    completar(l);

                }

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_2842");
                    l.setName(new MultilingualText("es", "Alcúdia", "en", "Alcudia"));
                    l.setUrlFriendlyName("alcudia");

                    completar(l);

                }

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_2813");
                    l.setName(new MultilingualText("es", "Cala Millor", "en", "Cala Millor"));
                    l.setUrlFriendlyName("cala-millor");

                    completar(l);

                }

            }

            {
                State s;
                c.getStates().add(s = new State());

                s.setResourceId("sta_6163");
                s.setName(new MultilingualText("es", "Isla de Ibiza", "en", "Ibiza Island"));
                s.setUrlFriendlyName("ibiza");

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_28x43");
                    l.setName(new MultilingualText("es", "Ibiza", "en", "Ibiza"));
                    l.setUrlFriendlyName("ibiza");

                    completar(l);

                }

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_28412");
                    l.setName(new MultilingualText("es", "San Antonio", "en", "San Antonio"));
                    l.setUrlFriendlyName("san-antonio");

                    completar(l);

                }
            }
        }


        {
            Country c;
            rs.getCountries().add(c = new Country());

            c.setResourceId("cou_gb");
            c.setName(new MultilingualText("es", "Gran Bretaña", "en", "Great Britain"));
            c.setUrlFriendlyName("great-britain");

            {
                State s;
                c.getStates().add(s = new State());

                s.setResourceId("sta_63e63");
                s.setName(new MultilingualText("es", "Londres", "en", "London"));
                s.setUrlFriendlyName("london");

                {
                    City l;
                    s.getCities().add(l = new City());
                    l.setResourceId("cty_28d43");
                    l.setName(new MultilingualText("es", "Londres", "en", "London City"));
                    l.setUrlFriendlyName("london-city");

                    completar(l);

                }

            }
        }


        return rs;
    }

    @Override
    public SearchPortfolioRS searchPortfolio(String token, String language, String query) throws Throwable {
        SearchPortfolioRS rs = new SearchPortfolioRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("4 matches");

        List<Match> matches = new ArrayList<>();

        Match m;
        matches.add(m = new Match());
        m.setResourceId("cou_es");
        m.setName("España");
        m.setDescription("España es un país de la UE");


        matches.add(m = new Match());
        m.setResourceId("hot_213");
        m.setName("Hotel Playa de Palma");
        m.setDescription("Hotel de 4 estrellas ubicado es Palma de Mallorca, España");

        matches.add(m = new Match());
        m.setResourceId("hot_546546");
        m.setName("Hotel Bellver");
        m.setDescription("Hotel de 5 estrellas ubicado es Alcudia, Baleares");

        matches.add(m = new Match());
        m.setResourceId("hot_3424234");
        m.setName("Hotel Valparaiso");
        m.setDescription("Hotel de 2 estrellas ubicado es Palma de Mallorca, España");


        rs.getMatches().addAll(matches.stream().filter((z) -> z.getName().toLowerCase().contains(query) || z.getDescription().toLowerCase().contains(query)).collect(Collectors.toList()));

        return rs;
    }

    private void completar(City l) {
        for (int i = 0; i < 100; i++)
        {
            Resource r;
            l.getResources().add(r = new Resource());
            r.setResourceId("hot_376472" + i);
            r.setName(new MultilingualText("es", "Hotel Quonext " + i, "en", "Hotel Quonext " + i));
            r.setLatitude("39.6359261");
            r.setLongitude("2.629556");
            r.setType("hotel");
            r.setDescription(new MultilingualText("es", "Hotel de ciudad de 4 estrellas", "en", "City hotel. 4 stars"));
        }

        for (int i = 0; i < 80; i++)
        {
            Resource r;
            l.getResources().add(r = new Resource());
            r.setResourceId("tp_1212" + i);
            r.setName(new MultilingualText("es", "Hotel Quonext " + i, "en", "Hotel Quonext " + i));
            r.setLatitude("39.6359261");
            r.setLongitude("2.629556");
            r.setType("transferpoint");
            r.setDescription(new MultilingualText("es", "Recepción del Hotel Quonext " + i, "en", "Transfer point for Hotel Quonext " + i));
        }
    }

    @Override
    public GetDataSheetRS getDataSheet(String token, String resourceId, String language) {

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

    @Override
    public GetBookingsRS getBookings(String token, int fromConfirmationDate, int toConfirmationDate, int fromStartDate, int toStartDate) {

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

    @Override
    public GetBookingRS getBooking(String token, String bookingId) throws Throwable {
        GetBookingRS rs = new GetBookingRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);


        Booking b = new Booking();

        b.setBookingId("878997");
        b.setCreated(LocalDateTime.of(2017, 03, 14, 23, 34, 15).format(DateTimeFormatter.ISO_DATE_TIME));
        b.setCreatedBy("MATEU");
        b.setModified(LocalDateTime.of(2017, 03, 14, 23, 34, 15).format(DateTimeFormatter.ISO_DATE_TIME));
        b.setLeadName("Sr Nombre");
        b.setStart("20180106");
        b.setEnd("20180112");
        b.setBookingId("9866230462GGWED76");
        Amount a;
        b.setNetValue(a = new Amount());
        a.setCurrencyIsoCode("EUR");
        a.setValue(750.42);
        b.setServiceType("HOTEL");
        b.setServiceDescription("Hotel ");
        b.setStatus("OK");
        rs.setBooking(b);
        return rs;
    }

    @Override
    public CancelBookingRS cancelBooking(String token, String bookingId) {

        CancelBookingRS rs = new CancelBookingRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking has been cancelled");


        return rs;
    }

    @Override
    public String renewToken(String token, String user) {
        return "oefvoeoveo3r4ri34br34ir3b4br";
    }

    @Override
    public MealPlansListRS getMealPlans(String token) throws Throwable {
        return null;
    }
}
