package org.easytravelapi.implementations;

import org.easytravelapi.CMSService;
import org.easytravelapi.cms.*;

public class CMSServiceImpl implements CMSService {
    @Override
    public GetInitialConfigRS getInitialConfig(String token) throws Throwable {
        return null;
    }

    @Override
    public GetHotelAvailabilityCalendarRS getHotelAvailabilityCalendar(String token, String resorts, int checkIn, int checkout, String occupancies) throws Throwable {
        GetHotelAvailabilityCalendarRS cal = new GetHotelAvailabilityCalendarRS();

        for (int j=1 ;j<13;j++) {
            HotelAvailabilityCalendarMonth month;
            cal.getMonths().add(month = new HotelAvailabilityCalendarMonth());
            month.setMonth(j);
            month.setTitle("hotel 1");
            month.setYear(2018);

            HotelAvailabilityCalendarWeek week;
            month.getWeeks().add(week = new HotelAvailabilityCalendarWeek());

            for (int i = 1; i < 29; i++) {

                HotelAvailabilityCalendarDay day;
                week.getDays().add(day = new HotelAvailabilityCalendarDay());
                day.setDate("2018-"+j+ "-" + i);
            }
        }

        return cal;
    }

    @Override
    public GetActivityAvailabilityCalendarRS getActivityAvailabilityCalendar(String token, String activityId) throws Throwable {
        GetActivityAvailabilityCalendarRS cal = new GetActivityAvailabilityCalendarRS();

        for (int j=1 ;j<13;j++) {
            ActivityAvailabilityCalendarMonth month;
            cal.getMonths().add(month = new ActivityAvailabilityCalendarMonth());
            month.setMonth(j);
            month.setTitle("Activity 1");
            month.setYear(2018);

            ActivityAvailabilityCalendarWeek week;
            month.getWeeks().add(week = new ActivityAvailabilityCalendarWeek());

            for (int i = 1; i < 29; i++) {

                ActivityAvailabilityCalendarDay day;
                week.getDays().add(day = new ActivityAvailabilityCalendarDay());
                day.setDate("2018-"+j+ "-" + i);
            }
        }

        return cal;
    }

    @Override
    public GetActivityAvailabilityCalendarRS getCircuitAvailabilityCalendar(String token, String circuitId) throws Throwable {
        GetActivityAvailabilityCalendarRS cal = new GetActivityAvailabilityCalendarRS();

        for (int j=1 ;j<13;j++) {
            ActivityAvailabilityCalendarMonth month;
            cal.getMonths().add(month = new ActivityAvailabilityCalendarMonth());
            month.setMonth(j);
            month.setTitle("Activity 1");
            month.setYear(2018);

            ActivityAvailabilityCalendarWeek week;
            month.getWeeks().add(week = new ActivityAvailabilityCalendarWeek());

            for (int i = 1; i < 29; i++) {

                ActivityAvailabilityCalendarDay day;
                week.getDays().add(day = new ActivityAvailabilityCalendarDay());
                day.setDate("2018-"+j+ "-" + i);
            }
        }

        return cal;
    }

    @Override
    public GetActivityAvailabilityCalendarRS getGenericAvailabilityCalendar(String token, String productId) throws Throwable {
        GetActivityAvailabilityCalendarRS cal = new GetActivityAvailabilityCalendarRS();

        for (int j=1 ;j<13;j++) {
            ActivityAvailabilityCalendarMonth month;
            cal.getMonths().add(month = new ActivityAvailabilityCalendarMonth());
            month.setMonth(j);
            month.setTitle("Activity 1");
            month.setYear(2018);

            ActivityAvailabilityCalendarWeek week;
            month.getWeeks().add(week = new ActivityAvailabilityCalendarWeek());

            for (int i = 1; i < 29; i++) {

                ActivityAvailabilityCalendarDay day;
                week.getDays().add(day = new ActivityAvailabilityCalendarDay());
                day.setDate("2018-"+j+ "-" + i);
            }
        }

        return cal;
    }

    @Override
    public GetActivityCheckListRS getActivityCheckList(String token, int date) throws Throwable {
        GetActivityCheckListRS ac = new GetActivityCheckListRS();

        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1111");
            ci.setName("Tour bus turístico Barcelona");
            ci.setDescription("descripcion del bus turistico");

            ac.getActivity().add(ci);
        }

        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1112");
            ci.setName("Ruta en barco costa brava");
            ci.setDescription("descripcion Ruta en barco costa brava");

            ac.getActivity().add(ci);
        }

        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1113");
            ci.setName("Parque de atracciones ");
            ci.setDescription("descripcion parque de atracciones");

            ac.getActivity().add(ci);
        }

        return ac;
    }

    @Override
    public GetEventCheckListRS getEventCheckList(String token, int date, String activityId) throws Throwable {

        GetEventCheckListRS ec = new GetEventCheckListRS();

        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("1");
            ei.setName("evento1");


            ec.getEvent().add(ei);
        }

        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("2");
            ei.setName("evento2");


            ec.getEvent().add(ei);
        }
        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("2");
            ei.setName("evento2");


            ec.getEvent().add(ei);
        }


        return ec;
    }

    @Override
    public GetTicketCheckListRS getTicketCheckList(String token, String eventId) throws Throwable {
        GetTicketCheckListRS tc = new GetTicketCheckListRS();
        TicketListItem tl = new TicketListItem();

        {
            TicketCheckItem ti = new TicketCheckItem();
            ti.setId("14534567457856879");
            ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwerfvjasnv");
            ti.setChecked(Boolean.TRUE);
            ti.setCheckedDate(20190202);
            ti.setCheckedTime(103325);
            ti.setPax(5);
            ti.setLeadname("sr. perez perez");
            ti.setComments("comentarios sobre el ticket");

            tl.getTicket().add(ti);
        }
        {
            TicketCheckItem ti = new TicketCheckItem();
            ti.setId("123452345234567");
            ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwerfvjasnv");
            ti.setChecked(Boolean.TRUE);
            ti.setCheckedDate(20190202);
            ti.setCheckedTime(103325);
            ti.setPax(5);
            ti.setLeadname("sr. rodriguez perez");
            ti.setComments("comentarios sobre el ticket");

            tl.getTicket().add(ti);
        }
        {
            TicketCheckItem ti = new TicketCheckItem();
            ti.setId("2456745674567");
            ti.setQrcode("26AF4TL4HAXOY1W");
            ti.setChecked(Boolean.FALSE);
           // ti.setCheckedDate(20190202);
            //ti.setCheckedTime(103325);
            ti.setPax(1);
            ti.setLeadname("sr. garcia garcia");
            ti.setComments("comentarios sobre el ticket");

            tl.getTicket().add(ti);
        }{
            TicketCheckItem ti = new TicketCheckItem();
            ti.setId("3456745674567456");
            ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwedfghdfghdfgh345nv");
            ti.setChecked(Boolean.TRUE);
            ti.setCheckedDate(20190202);
            ti.setCheckedTime(103325);
            ti.setPax(5);
            ti.setLeadname("sr. garcia perez");
            ti.setComments("comentarios sobre el ticket");

            tl.getTicket().add(ti);
        }
        {
            TicketCheckItem ti = new TicketCheckItem();
            ti.setId("2456745674567");
            ti.setQrcode("26AF4TZ4HAIFV4R");
            ti.setChecked(Boolean.FALSE);
            // ti.setCheckedDate(20190202);
            //ti.setCheckedTime(103325);
            ti.setPax(1);
            ti.setLeadname("sr. garcia garcia");
            ti.setComments("comentarios sobre el ticket");

            tl.getTicket().add(ti);
        }
        tl.setTotalTickets(4);
        tl.setCheckedTickets(3);
        tl.setRemainingTickets(1);
        tl.setTotalPax(16);
        tl.setCheckedPax(15);
        tl.setRemainingPax(1);

        tc.setTicket(tl);
        return tc;
    }

    @Override
    public CheckTicketRS checkTicket(String token, String eventId, String qrcode) throws Throwable {
        CheckTicketRS ct = new  CheckTicketRS();

        {
            TicketCheckItem ti = new TicketCheckItem();
            ti.setLeadname("sr. Romero de la Rosa");
            ti.setComments("Comentario especial para el ticket");
            ti.setPax(1);
            ti.setChecked(true);
            ti.setCheckedDate(20190101);
            ti.setCheckedTime(103300);
            ti.setQrcode(qrcode);
            ti.setId("123123123123");
            ct.setTicket(ti);
        }
        switch (qrcode){
            case "26AF4TL4HAXOY1W":
                ct.setValid(true);
                break;
            case "26AF4TZ4HAIFV4R":
                ct.setValid(false);
                ct.setValidationMessage("Este ticket corresponde a otra excursion / dia / evento ");
                break;
            default:
                ct.setValid(false);
                ct.setValidationMessage("Código no válido");
                break;

        }

        return ct;
    }

    @Override
    public GetLoginRS loginToTicketsApp(String token, GetLoginRQ login) throws Throwable {
        GetLoginRS rs = new GetLoginRS();

        System.out.println("user :" + login.getUser());
        System.out.println("password :" + login.getPassword());

        if(login.getUser() != null && login.getPassword() != null )
        {


            if (login.getUser().toString().equals("admin") && login.getPassword().toString().equals("1")){
                rs.setLogged(true);
                rs.setAuthUser("123-user");
            }else{
                rs.setLogged(false);
                rs.setMessage("User or password not valid");
            }
        }else{
            rs.setLogged(false);
            rs.setMessage("User and password is required");
        }

        return rs;
    }

    @Override
    public GetOfflineCheckListRS getOfflineCheckList(String token) throws Throwable {

        GetOfflineCheckListRS off = new GetOfflineCheckListRS();


        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1111");
            ci.setName("OFF Tour bus turístico Barcelona");
            ci.setDescription("descripcion del bus turistico");
            ci.setDate(20190313);

            off.getActivity().add(ci);
        }

        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1112");
            ci.setName("OFF Ruta en barco costa brava");
            ci.setDescription("descripcion Ruta en barco costa brava");
            ci.setDate(20190314);

            off.getActivity().add(ci);
        }

        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1113");
            ci.setName("OFF Parque de atracciones ");
            ci.setDescription("descripcion parque de atracciones");
            ci.setDate(20190314);

            off.getActivity().add(ci);
        }


        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("1");
            ei.setName("evento1 ex 1");
            ei.setActivityId("1111");

            off.getEvent().add(ei);
        }

        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("2");
            ei.setName("evento2 ex 1");
            ei.setActivityId("1111");

            off.getEvent().add(ei);
        }
        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("3");
            ei.setName("evento3 ex 1");
            ei.setActivityId("1111");

            off.getEvent().add(ei);
        }



        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("4");
            ei.setName("evento1 ex 2");
            ei.setActivityId("1112");

            off.getEvent().add(ei);
        }

        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("5");
            ei.setName("evento2 ex 2");
            ei.setActivityId("1112");

            off.getEvent().add(ei);
        }
        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("6");
            ei.setName("evento3 ex 2");
            ei.setActivityId("1112");

            off.getEvent().add(ei);
        }


        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("7");
            ei.setName("evento1 ex 3");
            ei.setActivityId("1113");

            off.getEvent().add(ei);
        }

        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("8");
            ei.setName("evento2 ex 3");
            ei.setActivityId("1113");

            off.getEvent().add(ei);
        }
        {
            EventCheckItem ei = new EventCheckItem();
            ei.setId("9");
            ei.setName("evento3 ex 3");
            ei.setActivityId("1113");

            off.getEvent().add(ei);
        }


        /*****lista de tickets*****/
        {
            TicketListItem tl = new TicketListItem();

            {
                TicketCheckItem ti = new TicketCheckItem();
                ti.setId("14534567457856879");
                ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwerfvjasnv");
                ti.setChecked(Boolean.TRUE);
                ti.setCheckedDate(20190202);
                ti.setCheckedTime(103325);
                ti.setPax(5);
                ti.setLeadname("sr. perez perez");
                ti.setComments("comentarios sobre el ticket");

                tl.getTicket().add(ti);
            }
            {
                TicketCheckItem ti = new TicketCheckItem();
                ti.setId("123452345234567");
                ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwerfvjasnv");
                ti.setChecked(Boolean.TRUE);
                ti.setCheckedDate(20190202);
                ti.setCheckedTime(103325);
                ti.setPax(5);
                ti.setLeadname("sr. rodriguez perez");
                ti.setComments("comentarios sobre el ticket");

                tl.getTicket().add(ti);
            }
            {
                TicketCheckItem ti = new TicketCheckItem();
                ti.setId("2456745674567");
                ti.setQrcode("26AF4TL4HAXOY1W");
                ti.setChecked(Boolean.FALSE);
                // ti.setCheckedDate(20190202);
                //ti.setCheckedTime(103325);
                ti.setPax(1);
                ti.setLeadname("sr. garcia garcia");
                ti.setComments("comentarios sobre el ticket");

                tl.getTicket().add(ti);
            }{
            TicketCheckItem ti = new TicketCheckItem();
            ti.setId("3456745674567456");
            ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwedfghdfghdfgh345nv");
            ti.setChecked(Boolean.TRUE);
            ti.setCheckedDate(20190202);
            ti.setCheckedTime(103325);
            ti.setPax(5);
            ti.setLeadname("sr. garcia perez");
            ti.setComments("comentarios sobre el ticket");

            tl.getTicket().add(ti);
        }
            {
                TicketCheckItem ti = new TicketCheckItem();
                ti.setId("2456745674567");
                ti.setQrcode("26AF4TZ4HAIFV4R");
                ti.setChecked(Boolean.FALSE);
                // ti.setCheckedDate(20190202);
                //ti.setCheckedTime(103325);
                ti.setPax(1);
                ti.setLeadname("sr. garcia garcia");
                ti.setComments("comentarios sobre el ticket");

                tl.getTicket().add(ti);
            }
            tl.setTotalTickets(4);
            tl.setCheckedTickets(3);
            tl.setRemainingTickets(1);
            tl.setTotalPax(16);
            tl.setCheckedPax(15);
            tl.setRemainingPax(1);
            tl.setEventId("1");

            off.getTicketList().add(tl);
        }

        {
            TicketListItem tl = new TicketListItem();

            {
                TicketCheckItem ti = new TicketCheckItem();
                ti.setId("14534567457856879");
                ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwerfvjasnv");
                ti.setChecked(Boolean.TRUE);
                ti.setCheckedDate(20190202);
                ti.setCheckedTime(103325);
                ti.setPax(5);
                ti.setLeadname("sr. perez perez");
                ti.setComments("comentarios sobre el ticket");

                tl.getTicket().add(ti);
            }
            {
                TicketCheckItem ti = new TicketCheckItem();
                ti.setId("123452345234567");
                ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwerfvjasnv");
                ti.setChecked(Boolean.TRUE);
                ti.setCheckedDate(20190202);
                ti.setCheckedTime(103325);
                ti.setPax(5);
                ti.setLeadname("sr. rodriguez perez");
                ti.setComments("comentarios sobre el ticket");

                tl.getTicket().add(ti);
            }
            {
                TicketCheckItem ti = new TicketCheckItem();
                ti.setId("2456745674567");
                ti.setQrcode("26AF4TL4HAXOY1W");
                ti.setChecked(Boolean.FALSE);
                // ti.setCheckedDate(20190202);
                //ti.setCheckedTime(103325);
                ti.setPax(1);
                ti.setLeadname("sr. garcia garcia");
                ti.setComments("comentarios sobre el ticket");

                tl.getTicket().add(ti);
            }{
            TicketCheckItem ti = new TicketCheckItem();
            ti.setId("3456745674567456");
            ti.setQrcode("erhwpeorhvsdjnfvskjdfnviuwedfghdfghdfgh345nv");
            ti.setChecked(Boolean.TRUE);
            ti.setCheckedDate(20190202);
            ti.setCheckedTime(103325);
            ti.setPax(5);
            ti.setLeadname("sr. garcia perez");
            ti.setComments("comentarios sobre el ticket");

            tl.getTicket().add(ti);
        }
            {
                TicketCheckItem ti = new TicketCheckItem();
                ti.setId("2456745674567");
                ti.setQrcode("26AF4TZ4HAIFV4R");
                ti.setChecked(Boolean.FALSE);
                // ti.setCheckedDate(20190202);
                //ti.setCheckedTime(103325);
                ti.setPax(1);
                ti.setLeadname("sr. garcia garcia");
                ti.setComments("comentarios sobre el ticket");

                tl.getTicket().add(ti);
            }
            tl.setTotalTickets(4);
            tl.setCheckedTickets(3);
            tl.setRemainingTickets(1);
            tl.setTotalPax(16);
            tl.setCheckedPax(15);
            tl.setRemainingPax(1);
            tl.setEventId("2");

            off.getTicketList().add(tl);
        }

        return off;
    }

    @Override
    public GeUpdatedTicketsRS updateTickets(String token, GetUpdatedTicketsRQ tickets) throws Throwable {
        System.out.println(tickets.getUserId());
        for (TicketCheckItem ti : tickets.getTickets())
        {
            System.out.println("ticket: " + ti.getId() + " " + ti.getCheckedDate() + " - " + ti.getCheckedTime());

        }
        GeUpdatedTicketsRS rs = new GeUpdatedTicketsRS();
                rs.setStatusCode(200);
        return rs;
    }

    @Override
    public BookCMSRS cartBooking(String token, BookCMSRQ rq) throws Throwable {
        BookCMSRS up = new BookCMSRS();
        up.setPaymentUrl("<form name=f action='https://localhost:8080' method='post'>" +
                "<input type='hidden' name=amount value='100'> "+
                "</form>");
        up.setBookingId("123-tt-56657");
        up.setStatusCode(200);
        up.setMsg("ok");
        return up;
    }

    @Override
    public CartCompletionRS cartCompletion(String token, CartCompletionRQ rq) throws Throwable {
        CartCompletionRS rs = new CartCompletionRS();
        rs.setStatusCode(200);

        {
            AdditionalServiceLink l;
            rs.getAdditionalServicesLinks().add(l = new AdditionalServiceLink());
            l.setType("hotel");
            l.setUri("#/dispo?iddestino=cou_es&destino=España&entrada=2020-07-06&salida=2020-07-09&ocupacion=1x2");
        }


        {
            AdditionalServiceLink l;
            rs.getAdditionalServicesLinks().add(l = new AdditionalServiceLink());
            l.setType("transfer");
            l.setUri("#/dispo?destino=tp_3424234&destinoname=Hotel%20Valparaiso&origen=tp_213&origenname=Hotel%20Playa%20de%20Palma&entrada=2020-07-06&salida=2020-08-06&idioma=es&bike=0&golf=0&ski=0&wheelchair=0&bigluggage=0&pax=1");
        }

        {
            AdditionalServiceLink l;
            rs.getAdditionalServicesLinks().add(l = new AdditionalServiceLink());
            l.setType("flight");
            l.setUri("#/dispo?destino=MAD&destinoname=Adolfo%20Suárez&origen=PMI&origenname=Palma%20de%20Mallorca&trayecto=roundtrip&entrada=2020-07-06&salida=2020-07-09&idioma=es&adult=1&child=0&infant=0");
        }

        {
            AdditionalServiceLink l;
            rs.getAdditionalServicesLinks().add(l = new AdditionalServiceLink());
            l.setType("excursion");
            l.setUri("#/dispo?destino=cou_es&entrada=2020-07-06&destinoname=España");
        }

        {
            AdditionalServiceLink l;
            rs.getAdditionalServicesLinks().add(l = new AdditionalServiceLink());
            l.setType("circuit");
            l.setUri("#/");
        }

        {
            AdditionalServiceLink l;
            rs.getAdditionalServicesLinks().add(l = new AdditionalServiceLink());
            l.setType("generic");
            l.setUri("#/dispo?destino=cou_es&destinoname=España");
        }

        TravelInsuranceData d;
        rs.setTravelInsurance(d = new TravelInsuranceData());
        d.setId("654qd64ewd");
        d.setName("Seguro viaje todo riesgo");
        d.setDescription("La presente cobertura otorga seguro de viaje a los Beneficiarios respecto de aquellos viajes realizados fuera del País de \n" +
                "residencia del Beneficiario que se hubieran reservado durante el Periodo de seguro siempre que al menos el 50% de\n" +
                "todos los costes del viaje y alojamiento hubieran sido pagados con la Tarjeta asegurada. Los viajes realizados en un\n" +
                "vehículo privado quedarán cubiertos cuando al menos el 50% de todos los gastos de alojamiento hubieran sido pagados\n" +
                "con la Tarjeta asegurada con anterioridad al inicio del viaje desde el País de residencia del Beneficiario. Los viajes\n" +
                "dentro del País de residencia del Beneficiario quedarán cubiertos cuando al menos se hubieran reservado con\n" +
                "antelación 2 noches de alojamiento con la Tarjeta asegurada y el destino se encontrara a más de 150 km de la\n" +
                "residencia del Beneficiario. El viaje deberá haberse reservado y haber finalizado durante el Periodo de Seguro, y su\n" +
                "duración total no podrá ser superior a 90 días");
        d.setCurrency("EUR");
        d.setIcon("https://segurosonline.eu/wp-content/uploads/2013/01/Fenix-Directo.jpg");
        d.setValue(250.6);
        d.setTotalIfIncluded(1230.45);

        return rs;
    }

    @Override
    public GetTermsRS getTerms(String token, String language) throws Throwable {
        GetTermsRS rs = new GetTermsRS();
        rs.setTerms("Acepto los <a href=\"http:\\www.google.es\"> términinos y condiciones </a>");
        rs.setMsg("terms returned");
        rs.setStatusCode(200);

        return rs;
    }
}
