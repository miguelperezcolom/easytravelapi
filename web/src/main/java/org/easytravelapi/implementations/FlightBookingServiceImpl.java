package org.easytravelapi.implementations;

import org.easytravelapi.FlightBookingService;
import org.easytravelapi.common.*;
import org.easytravelapi.flight.*;
import org.easytravelapi.transfer.BookTransferRS;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class FlightBookingServiceImpl implements FlightBookingService {
    @Override
    public GetAvailableFlightsRS getAvailableFlights(String token, String originAirportId, String destinationAirportId, int adults, int children, int infants, int departureDate, int returnDate, String language) throws Throwable {
        GetAvailableFlightsRS rs = new GetAvailableFlightsRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("3 flights found. It consumed 24 ms in the server.");

        rs.setCurrency("EUR");

        rs.getDepartureBestPrices().add(new FlightBestPrice("Sat 20", 30.89, false));
        rs.getDepartureBestPrices().add(new FlightBestPrice("Sun 21", 40.89, false));
        rs.getDepartureBestPrices().add(new FlightBestPrice("Mon 22", 50.01, false));
        rs.getDepartureBestPrices().add(new FlightBestPrice("Tue 23", 20.66, false));
        rs.getDepartureBestPrices().add(new FlightBestPrice("Wed 24", 30.89, true));
        rs.getDepartureBestPrices().add(new FlightBestPrice("Thu 25", 60.98, false));
        rs.getDepartureBestPrices().add(new FlightBestPrice("Fri 26", 70.10, false));
        rs.getDepartureBestPrices().add(new FlightBestPrice("Sat 27", 60.14, false));
        rs.getDepartureBestPrices().add(new FlightBestPrice("Sun 28", 30.89, false));

        {
            AvailableFlight f;
            rs.getDepartureFlights().add(f = new AvailableFlight());
            f.setOrigin("PMI");
            f.setDestination("XRY");
            f.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            f.setArrivalDate("");
            f.setArrivalTime("08:30");
            f.setBusinessPrice(60.15);
            f.setCompany("IB");
            f.setDepartureDate("");
            f.setDepartureTime("07:15");
            f.setDuration("01:15");
            f.setEconomyPrice(31.48);
            f.setOperatedBy("Iberia");
            FlightSegment s;
            f.getSegments().add(s = new FlightSegment());
            s.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            s.setAirplane("Airbus-A320");
            s.setArrivalDate("Dom. 23 Diciembre");
            s.setArrivalTime("08:30");
            s.setCompany("IB");
            s.setDepartureDate("Dom. 23 Diciembre");
            s.setDepartureTime("07:15");
            s.setDestinationDescription("Madrid (MAD) - Spain");
            s.setDestinationId("MAD");
            s.setDuration("01:15");
            s.setFlightNumber("IB4567");
            s.setOriginDescription("Palma de Mallorca (PMI) - Spain");
            s.setOriginId("PMI");
        }

        {
            AvailableFlight f;
            rs.getDepartureFlights().add(f = new AvailableFlight());
            f.setOrigin("PMI");
            f.setDestination("XRY");
            f.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            f.setArrivalDate("");
            f.setArrivalTime("10:30");
            f.setBusinessPrice(60.15);
            f.setCompany("IB");
            f.setDepartureDate("");
            f.setDepartureTime("09:15");
            f.setDuration("01:15");
            f.setEconomyPrice(31.48);
            f.setOperatedBy("Iberia");
            FlightSegment s;
            f.getSegments().add(s = new FlightSegment());
            s.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            s.setAirplane("Airbus-A320");
            s.setArrivalDate("Dom. 23 Diciembre");
            s.setArrivalTime("10:30");
            s.setCompany("IB");
            s.setDepartureDate("Dom. 23 Diciembre");
            s.setDepartureTime("09:15");
            s.setDestinationDescription("Madrid (MAD) - Spain");
            s.setDestinationId("MAD");
            s.setDuration("01:15");
            s.setFlightNumber("IB4568");
            s.setOriginDescription("Palma de Mallorca (PMI) - Spain");
            s.setOriginId("PMI");
        }

        {
            AvailableFlight f;
            rs.getDepartureFlights().add(f = new AvailableFlight());
            f.setOrigin("PMI");
            f.setDestination("XRY");
            f.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_BA.svg");
            f.setArrivalDate("");
            f.setArrivalTime("18:30");
            f.setBusinessPrice(60.15);
            f.setCompany("IB");
            f.setDepartureDate("");
            f.setDepartureTime("17:15");
            f.setDuration("01:15");
            f.setEconomyPrice(31.48);
            f.setOperatedBy("Iberia");
            FlightSegment s;
            f.getSegments().add(s = new FlightSegment());
            s.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            s.setAirplane("Airbus-A320");
            s.setArrivalDate("Dom. 23 Diciembre");
            s.setArrivalTime("18:30");
            s.setCompany("IB");
            s.setDepartureDate("Dom. 23 Diciembre");
            s.setDepartureTime("17:15");
            s.setDestinationDescription("Madrid (MAD) - Spain");
            s.setDestinationId("MAD");
            s.setDuration("01:15");
            s.setFlightNumber("IB4567");
            s.setOriginDescription("Palma de Mallorca (PMI) - Spain");
            s.setOriginId("PMI");
        }





        rs.getReturnBestPrices().add(new FlightBestPrice("Sat 20", 30.89, false));
        rs.getReturnBestPrices().add(new FlightBestPrice("Sun 21", 40.89, false));
        rs.getReturnBestPrices().add(new FlightBestPrice("Mon 22", 50.01, false));
        rs.getReturnBestPrices().add(new FlightBestPrice("Tue 23", 20.66, false));
        rs.getReturnBestPrices().add(new FlightBestPrice("Wed 24", 30.89, true));
        rs.getReturnBestPrices().add(new FlightBestPrice("Thu 25", 60.98, false));
        rs.getReturnBestPrices().add(new FlightBestPrice("Fri 26", 70.10, false));
        rs.getReturnBestPrices().add(new FlightBestPrice("Sat 27", 60.14, false));
        rs.getReturnBestPrices().add(new FlightBestPrice("Sun 28", 30.89, false));

        {
            AvailableFlight f;
            rs.getReturnFlights().add(f = new AvailableFlight());
            f.setOrigin("PMI");
            f.setDestination("XRY");
            f.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            f.setArrivalDate("");
            f.setArrivalTime("08:30");
            f.setBusinessPrice(60.15);
            f.setCompany("IB");
            f.setDepartureDate("");
            f.setDepartureTime("07:15");
            f.setDuration("01:15");
            f.setEconomyPrice(31.48);
            f.setOperatedBy("Iberia");
            FlightSegment s;
            f.getSegments().add(s = new FlightSegment());
            s.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            s.setAirplane("Airbus-A320");
            s.setArrivalDate("Dom. 23 Diciembre");
            s.setArrivalTime("08:30");
            s.setCompany("IB");
            s.setDepartureDate("Dom. 23 Diciembre");
            s.setDepartureTime("07:15");
            s.setDestinationDescription("Madrid (MAD) - Spain");
            s.setDestinationId("MAD");
            s.setDuration("01:15");
            s.setFlightNumber("IB4567");
            s.setOriginDescription("Palma de Mallorca (PMI) - Spain");
            s.setOriginId("PMI");
        }

        {
            AvailableFlight f;
            rs.getReturnFlights().add(f = new AvailableFlight());
            f.setOrigin("PMI");
            f.setDestination("XRY");
            f.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_AA.svg");
            f.setArrivalDate("");
            f.setArrivalTime("10:30");
            f.setBusinessPrice(60.15);
            f.setCompany("IB");
            f.setDepartureDate("");
            f.setDepartureTime("09:15");
            f.setDuration("01:15");
            f.setEconomyPrice(31.48);
            f.setOperatedBy("Iberia");
            FlightSegment s;
            f.getSegments().add(s = new FlightSegment());
            s.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            s.setAirplane("Airbus-A320");
            s.setArrivalDate("Dom. 23 Diciembre");
            s.setArrivalTime("10:30");
            s.setCompany("IB");
            s.setDepartureDate("Dom. 23 Diciembre");
            s.setDepartureTime("09:15");
            s.setDestinationDescription("Madrid (MAD) - Spain");
            s.setDestinationId("MAD");
            s.setDuration("01:15");
            s.setFlightNumber("IB4568");
            s.setOriginDescription("Palma de Mallorca (PMI) - Spain");
            s.setOriginId("PMI");
        }

        {
            AvailableFlight f;
            rs.getReturnFlights().add(f = new AvailableFlight());
            f.setOrigin("PMI");
            f.setDestination("XRY");
            f.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            f.setArrivalDate("");
            f.setArrivalTime("18:30");
            f.setBusinessPrice(60.15);
            f.setCompany("IB");
            f.setDepartureDate("");
            f.setDepartureTime("17:15");
            f.setDuration("01:15");
            f.setEconomyPrice(31.48);
            f.setOperatedBy("Iberia");
            FlightSegment s;
            f.getSegments().add(s = new FlightSegment());
            s.setCompanyLogo("https://test.easytravelapi.com/images/logo_pos_IB.svg");
            s.setAirplane("Airbus-A320");
            s.setArrivalDate("Dom. 23 Diciembre");
            s.setArrivalTime("18:30");
            s.setCompany("IB");
            s.setDepartureDate("Dom. 23 Diciembre");
            s.setDepartureTime("17:15");
            s.setDestinationDescription("Madrid (MAD) - Spain");
            s.setDestinationId("MAD");
            s.setDuration("01:15");
            s.setFlightNumber("IB4567");
            s.setOriginDescription("Palma de Mallorca (PMI) - Spain");
            s.setOriginId("PMI");
        }

        return rs;
    }

    @Override
    public GetFlightPriceDetailsRS getFlightPriceDetails(String token, String departureKey, String returnKey, String language, String promoCode) throws Throwable {
        GetFlightPriceDetailsRS rs = new GetFlightPriceDetailsRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Price details");

        Random rand = new Random();

        {
            CancellationCost c;
            rs.getCancellationCosts().add(c = new CancellationCost());
            c.setGMTtime(LocalDateTime.of(2018, 06, 05, 12, 00).format(DateTimeFormatter.ISO_DATE_TIME));
            c.setNet(250.32);
        }

        {
            CancellationCost c;
            rs.getCancellationCosts().add(c = new CancellationCost());
            c.setGMTtime(LocalDateTime.of(2018, 07, 01, 12, 00).format(DateTimeFormatter.ISO_DATE_TIME));
            c.setNet(400d);
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
                tot.setNet(1250.01);
            }


        }
        {
            PriceLine pc;
            rs.getPriceBreakdown().add(pc = new PriceLine());
            {
                Amount a;
                pc.setTotal(1500.32);
            }

            pc.setDescription("detailed price");


        }
        {
            Supplement sp;
            rs.getAvailableSupplements().add(sp = new Supplement() );
            sp.setId("22");
            sp.setName("buffet incluido" );
            sp.setDescription("buffet incluido durante toda la estancia, incluye desayuno, almuerzo y cena");
            sp.setRetailPrice(130.99);
            sp.setPriceType("PAX");


        }
        {
            Supplement sp;
            rs.getAvailableSupplements().add(sp = new Supplement() );
            sp.setId("33");
            sp.setName("Paquetes extras" );
            sp.setDescription("Paquetes extras que incluyen varias ofertas de nuesstros mejores servicios" );
            sp.setRetailPrice(350.0);
            sp.setPriceType("ROOM");


        }
        if(promoCode != null && promoCode != ""){
            {
                PriceLine pc;
                rs.getPriceBreakdown().add(pc = new PriceLine());
                {
                    Amount a;
                    pc.setTotal(-750.16);
                }

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
            l.setDate("2018-06-01");
            l.setPaymentMethod("WEB");
        }

        rs.setTerms("<span>He leído y acepto los <a href=\"http://google.es\"> terminos y condiciones de uso</a></span > ");
        return rs;
    }

    @Override
    public BookFlightRS bookFlight(String token, BookFlightRQ rq) throws Throwable {
        BookFlightRS rs = new BookFlightRS();

        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("Booking confirmed ok");

        rs.setBookingId("5643135431");
        rs.setFileId("54654");
        rs.setAvailableServices(new ArrayList<String>());
        rs.getAvailableServices().add(new String("hotel"));
        rs.getAvailableServices().add(new String("circuito"));
        rs.getAvailableServices().add(new String("excursion"));

        rs.setPaymentUrl("<form name=f action='https://localhost:8080' method='post'>" +
                "<input type='hidden' name=amount value='100'> "+
                "</form>");

        return rs;
    }


    @Override
    public GetAirportsRS getAirportsByName(String token, String text, String language) throws Throwable {
        GetAirportsRS rs = new GetAirportsRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("done");

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("PMI");
            a.setName("Palma de Mallorca");
            a.setCity("Palma de Mallorca");
            a.setState("Baleares");
            a.setCountry("España");
        }

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("MAD");
            a.setName("Adolfo Suárez");
            a.setCity("Madrid");
            a.setState("Madrid");
            a.setCountry("España");
        }

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("XRY");
            a.setName("Jerez");
            a.setCity("Jerez de la frontera");
            a.setState("Andalucía");
            a.setCountry("España");
        }

        return rs;
    }

    @Override
    public GetAirportsRS getOriginAirports(String token, String destinationAirportId, String language) throws Throwable {
        GetAirportsRS rs = new GetAirportsRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("done");

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("PMI");
            a.setName("Palma de Mallorca");
            a.setCity("Palma de Mallorca");
            a.setState("Baleares");
            a.setCountry("España");
        }

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("MAD");
            a.setName("Adolfo Suárez");
            a.setCity("Madrid");
            a.setState("Madrid");
            a.setCountry("España");
        }

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("XRY");
            a.setName("Jerez");
            a.setCity("Jerez de la frontera");
            a.setState("Andalucía");
            a.setCountry("España");
        }

        return rs;
    }

    @Override
    public GetAirportsRS getDestinationAirports(String token, String originAirportId, String language) throws Throwable {
        GetAirportsRS rs = new GetAirportsRS();
        rs.setSystemTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        rs.setStatusCode(200);
        rs.setMsg("done");

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("PMI");
            a.setName("Palma de Mallorca");
            a.setCity("Palma de Mallorca");
            a.setState("Baleares");
            a.setCountry("España");
        }

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("MAD");
            a.setName("Adolfo Suárez");
            a.setCity("Madrid");
            a.setState("Madrid");
            a.setCountry("España");
        }

        {
            Airport a;
            rs.getAirports().add(a = new Airport());
            a.setId("XRY");
            a.setName("Jerez");
            a.setCity("Jerez de la frontera");
            a.setState("Andalucía");
            a.setCountry("España");
        }

        return rs;
    }
}
