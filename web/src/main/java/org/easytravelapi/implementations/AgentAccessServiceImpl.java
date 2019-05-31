package org.easytravelapi.implementations;

import org.easytravelapi.AgentAccessService;
import org.easytravelapi.activity.*;
import org.easytravelapi.agent.*;
import org.easytravelapi.cms.*;
import org.easytravelapi.common.Amount;
import org.easytravelapi.common.BestDeal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Currency;
import java.util.List;

public class AgentAccessServiceImpl implements AgentAccessService {

    @Override
    public GetLoginRS login(String token, GetLoginRQ login) throws Throwable {
        GetLoginRS rs = new GetLoginRS();

        System.out.println("user :" + login.getUser());
        System.out.println("password :" + login.getPassword());

        if(login.getUser() != null && login.getPassword() != null )
        {

            byte[] decodedBytes = Base64.getDecoder().decode(login.getPassword());
            String decodedString = new String(decodedBytes);


            if (login.getUser().toString().equals("admin") && decodedString.equals("1")){
                rs.setLogged(true);
                rs.setAuthUser("123-user");
            }else{
                if (login.getUser().toString().equals("repres") && decodedString.equals("1")){
                    rs.setLogged(true);
                    rs.setAuthUser("321-user");
                }else{
                    rs.setLogged(false);
                    rs.setMessage("User or password not valid");
                }
            }
        }else{
            rs.setLogged(false);
            rs.setMessage("User and password is required");
        }

        return rs;
    }

    @Override
    public GetPlainListRS getPlainList(String token, int agentId) throws Throwable {
        GetPlainListRS plrs = new GetPlainListRS();


        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1111");
            ci.setName("Tour bus turístico Barcelona");
            ci.setDescription("descripcion del bus turistico");
            ci.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-31rl_KYcaOEA4ULVSNBzXjpqeY1jgKiaej-U8AIwoZiYPGxt_Q");

            plrs.getActivity().add(ci);
        }

        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1112");
            ci.setName("Ruta en barco costa brava");
            ci.setDescription("descripcion Ruta en barco costa brava");

            plrs.getActivity().add(ci);
        }

        {
            ActivityCheckItem ci = new ActivityCheckItem();
            ci.setActivityId("1113");
            ci.setName("Parque de atracciones ");
            ci.setDescription("descripcion parque de atracciones");
            ci.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBGE7aFclGbvEaIFgtmqzroe3vTJuem0ZT8Bv3mL-tbbMX7OH-TQ");

            plrs.getActivity().add(ci);
        }

        {

            List<PlainActivityItem> pl = new ArrayList<>();

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta Arriba, 10:30 mañana, recogida Hotel Gran Park, Idioma inglés , Adulto");
                pi.setId("123450");
                Amount a = new Amount();
                a.setValue(100.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);
                pi.setGroupReference("111");
                pi.setGroupDescription("Grupo excursiones 111");

                pl.add(pi);
            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta Arriba, 10:30 mañana, recogida Hotel Gran Park, Idioma inglés , Niño");
                pi.setHtmlDescription("Planta Arriba, 10:30 mañana, recogida Hotel Gran Park, Idioma inglés , <i class=\"fas fa-child\"></i> ");
                pi.setId("123451");
                Amount a = new Amount();
                a.setValue(80.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);
                pi.setGroupReference("111");
                pi.setGroupDescription("Grupo excursiones 111");

                pl.add(pi);

            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta Arriba, 10:30 mañana, recogida Hotel Gran Park, Idioma español , Adulto");
                pi.setId("123452");
                Amount a = new Amount();
                a.setValue(100.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);
                pi.setGroupReference("111");
                pi.setGroupDescription("Grupo excursiones 111");

                pl.add(pi);
            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta Arriba, 10:30 mañana, recogida Hotel Gran Park, Idioma español , Niño");
                pi.setId("123453");
                Amount a = new Amount();
                a.setValue(80.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);
                pl.add(pi);
                pi.setGroupReference("222");
                pi.setGroupDescription("Grupo excursiones 222");
            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta Arriba, 10:30 mañana, recogida Hotel Gran Park, Idioma aleman , Adulto");
                pi.setId("123454");
                Amount a = new Amount();
                a.setValue(100.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);
                pi.setGroupReference("222");
                pi.setGroupDescription("Grupo excursiones 222");

                pl.add(pi);
            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta Arriba, 10:30 mañana, recogida Hotel Gran Park, Idioma aleman , Niño");
                pi.setId("123455");
                Amount a = new Amount();
                a.setValue(80.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);
                pi.setGroupReference("222");
                pi.setGroupDescription("Grupo excursiones 222");

                pl.add(pi);

            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta baja, 10:30 mañana, recogida Hotel Gran Park, Idioma inglés , Adulto");
                pi.setId("123456");
                Amount a = new Amount();
                a.setValue(100.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);
                pi.setGroupReference("222");
                pi.setGroupDescription("Grupo excursiones 222");

                pl.add(pi);
            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta baja, 10:30 mañana, recogida Hotel Gran Park, Idioma inglés , Niño");
                pi.setId("123457");
                Amount a = new Amount();
                a.setValue(80.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);
                pi.setGroupReference("222");
                pi.setGroupDescription("Grupo excursiones 222");
                pl.add(pi);

            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta baja, 10:30 mañana, recogida Hotel Gran Park, Idioma español , Adulto");
                pi.setId("123458");
                Amount a = new Amount();
                a.setValue(100.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);

                pi.setGroupReference("333");
                pi.setGroupDescription("Grupo excursiones 333");

                pl.add(pi);
            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta baja, 10:30 mañana, recogida Hotel Gran Park, Idioma español , Niño");
                pi.setId("123459");
                Amount a = new Amount();
                a.setValue(80.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);

                pi.setGroupReference("333");
                pi.setGroupDescription("Grupo excursiones 333");


                pl.add(pi);
            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta baja, 10:30 mañana, recogida Hotel Gran Park, Idioma aleman , Adulto");
                pi.setId("1234511");
                Amount a = new Amount();
                a.setValue(100.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);

                pi.setGroupReference("333");
                pi.setGroupDescription("Grupo excursiones 333");


                pl.add(pi);
            }

            {
                PlainActivityItem pi = new PlainActivityItem();
                pi.setActivityId("1111");
                pi.setDescription("Planta baja, 10:30 mañana, recogida Hotel Gran Park, Idioma aleman , Niño");
                pi.setId("1234512");
                Amount a = new Amount();
                a.setValue(80.00);
                a.setCurrencyIsoCode("Eur");
                pi.setRetailPrice(a);

                pi.setGroupReference("333");
                pi.setGroupDescription("Grupo excursiones 333");
                pl.add(pi);
            }

            plrs.setPlainActivities(pl);
        }
        {
            List<CurrencyChange> currenciesList = new ArrayList<CurrencyChange>();

            {
                CurrencyChange cr = new CurrencyChange();
                cr.setName("EUR");
                cr.setValue(1f);
                currenciesList.add(cr);
            }
            {
                CurrencyChange cr = new CurrencyChange();
                cr.setName("USD");
                cr.setValue(0.75f);
                currenciesList.add(cr);
            }
            {
                CurrencyChange cr = new CurrencyChange();
                cr.setName("JPY");
                cr.setValue(1.25f);
                currenciesList.add(cr);
            }
            plrs.setCurrencies(currenciesList);
        }

        {
            List<PaymentMethod> paymentMethodList = new ArrayList<>();

            {
                PaymentMethod pm = new PaymentMethod();
                pm.setCurrencyIsoCode("Eur");
                pm.setKey("1");
                pm.setName("Credit Card");

                paymentMethodList.add(pm);
            }
            {
                PaymentMethod pm = new PaymentMethod();
                pm.setCurrencyIsoCode("Eur");
                pm.setKey("1");
                pm.setName("Cash");

                paymentMethodList.add(pm);
            }

            plrs.setPaymentMethods(paymentMethodList);
        }

        {
            CompanyData cd = new CompanyData();

            cd.setContactEmail("contacto@quotravel.com");
            cd.setLegalText("Este es un ticket de compra de pruebas la/s entrada/s no tendran validez alguna. \n Quotravel ");
            cd.setContactPhone("666666666");
            cd.setName("Quotravel agency");

            plrs.setCompanyData(cd);
        }



        return plrs;
    }
    @Override
    public UpdateBookingRS updateBookings(String token, GetUpdatedCartsRQ cartList) throws Throwable {
        UpdateBookingRS rs = new UpdateBookingRS();
        rs.setStatusCode(200);
        rs.setMsg("Registered records");
        return rs;
    }
}
