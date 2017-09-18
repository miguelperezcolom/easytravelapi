package org.easytravelapi.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.*;
import io.swagger.client.model.BookActivityRQ;
import io.swagger.client.model.BookActivityRS;
import io.swagger.client.model.BookHotelRQ;
import io.swagger.client.model.BookHotelRS;
import io.swagger.client.model.BookTransferRQ;
import io.swagger.client.model.BookTransferRS;
import io.swagger.client.model.CancelBookingRS;
import io.swagger.client.model.ConfirmServicesRQ;
import io.swagger.client.model.ConfirmServicesRS;
import io.swagger.client.model.GetActivityPriceDetailsRS;
import io.swagger.client.model.GetAvailableActivitiesRS;
import io.swagger.client.model.GetAvailableHotelsRS;
import io.swagger.client.model.GetAvailableTransfersRS;
import io.swagger.client.model.GetBookingsRS;
import io.swagger.client.model.GetDataSheetRS;
import io.swagger.client.model.GetGrantedHotelsRS;
import io.swagger.client.model.GetHotelPriceDetailsRS;
import io.swagger.client.model.GetPortfolioRS;
import io.swagger.client.model.GetRoomingListRS;
import io.swagger.client.model.GetTransferPriceDetailsRS;
import io.swagger.client.model.ServiceConfirmation;
import io.swagger.client.model.UpdateRQ;
import io.swagger.client.model.UpdateRS;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();



    @Before
    public void setUp() {
        System.out.println("setting up...");
        api.getApiClient().setDebugging(true);
        System.out.println("api base path = " + api.getApiClient().getBasePath());

    }

    
    /**
     * Book an activity
     *
     * Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bookActivityTest() throws ApiException {

       String authtoken = "wdhweduwehdui";
        BookActivityRQ body = new BookActivityRQ();
        body.setKey("gyewgoyfgwe6723g32g");
        body.setLeadName("Mr Test");
        body.setCommentsToProvider("Vegan diet please");
        body.setPrivateComments("VIP");

        BookActivityRS response = api.bookActivity(authtoken, body);

        assertEquals(200, response.getStatusCode().longValue());

    }
    
    /**
     * Use this method to confirm a hotel service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bookHotelTest() throws ApiException {
        String authtoken = "oehdowehduweh";
        BookHotelRQ body = new BookHotelRQ();
        body.setKey("gyewgoyfgwe6723g32g");
        body.setLeadName("Mr Test");
        body.setCommentsToProvider("Vegan diet please");
        body.setPrivateComments("VIP");

        BookHotelRS response = api.bookHotel(authtoken, body);

        assertEquals(200, response.getStatusCode().longValue());
    }
    
    /**
     * Use this method to confirm a transfer service booking
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bookTransferTest() throws ApiException {
        String authtoken = "oehdowehduweh";
        BookTransferRQ body = new BookTransferRQ();
        body.setKey("gyewgoyfgwe6723g32g");
        body.setLeadName("Mr Test");
        body.setCommentsToProvider("Vegan diet please");
        body.setPrivateComments("VIP");
        body.setIncomingFlightNumber("IB1234");
        body.setIncomingFlightTime(2315);
        body.setIncomingFlightOrigin("Madrid");
        body.setOutgoingFlightNumber("IB1234");
        body.setOutgoingFlightTime(2315);
        body.setOutgoingFlightDestination("Madrid");

        BookTransferRS response = api.bookTransfer(authtoken, body);

        assertEquals(200, response.getStatusCode().longValue());
    }
    
    /**
     * Method to cancel a service booking
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelBookingTest() throws ApiException {
        String authtoken = "uiwfuwefewef9745873rgweiufg";
        String bookingid = "84353217643";
        CancelBookingRS response = api.cancelBooking(authtoken, bookingid);

        assertEquals(200, response.getStatusCode().longValue());
    }
    
    /**
     * Use this method to confirm or reject services
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void confirmServicesTest() throws ApiException {
        String authtoken = "grfoqeirf7643rgy34gr43y";
        ConfirmServicesRQ body = new ConfirmServicesRQ();
        {
            ServiceConfirmation c;
            body.addServiceConfirmationsItem(c = new ServiceConfirmation());
            c.setBookingId("34982734873294723");
            c.setComments("Confirmed ok by EMMY");
            c.setConfirmed(true);
        }
        {
            ServiceConfirmation c;
            body.addServiceConfirmationsItem(c = new ServiceConfirmation());
            c.setBookingId("617612783621876");
            c.setComments("We are sorry but we do not accept transfers within 12 hours release");
            c.setConfirmed(false);
        }
        ConfirmServicesRS response = api.confirmServices(authtoken, body);

        assertEquals(200, response.getStatusCode().longValue());
    }
    
    /**
     * Get extra info
     *
     * By passing a price key you get extra info
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivityPriceDetailsTest() throws ApiException {
        String authtoken = "ef78e78f6er87f6er";
        String key = "svc8gewrkuf65rew7forew";
        GetActivityPriceDetailsRS response = api.getActivityPriceDetails(authtoken, key);

        assertEquals(200, response.getStatusCode().longValue());
    }
    
    /**
     * Use this method to know which transfers are available and their prices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAvailabeTransfersTest() throws ApiException {
        String authtoken = "wefwef45we65f4we";
        String from = "TP54654";
        String to = "TPEDWED";
        Integer pax = 5;
        List<Integer> ages = null; //Arrays.asList(5,3);
        Integer bikes = null;
        Integer golfs = null;
        Integer bigs = null;
        Integer wheelchairs = null;
        Integer incomingdate = 20180501;
        Integer outgoingdate = 20180515;

        GetAvailableTransfersRS response = api.getAvailabeTransfers(authtoken, from, to, pax, ages, bikes, golfs, bigs, wheelchairs, incomingdate, outgoingdate);

        assertEquals(200, response.getStatusCode().longValue());
    }
    
    /**
     * Get available activities
     *
     * By passing a resort and holidays dates you get a list of the available activities
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAvailableActivitiesTest() throws ApiException {
        String authtoken = "diuhweiudhwe";
        Integer start = 20180501;
        Integer end = 20180515;
        String resourceid = "PMI";
        Integer pax = 5;
        List<Integer> ages = null; //Arrays.asList(5,3);
        GetAvailableActivitiesRS response = api.getAvailableActivities(authtoken, start, end, resourceid, pax, ages);

        assertEquals(200, response.getStatusCode().longValue());
    }
    
    /**
     * Use this method to know which hotels are available and their prices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAvailableHotelsTest() throws ApiException {
        String authtoken = "4WDF4WE56D4WED4";
        List<String> resorts = Arrays.asList("PMI", "IBZ");
        Integer checkin = 20180501;
        Integer checkout = 20180515;
        List<String> occupancies = null;
        Boolean includestaticinfo = false;
        GetAvailableHotelsRS response = api.getAvailableHotels(authtoken, resorts, checkin, checkout, occupancies, includestaticinfo);

        assertEquals(200, response.getStatusCode().longValue());
    }
    
    /**
     * Method to get a list of bookings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookingsTest() throws ApiException {
        String authtoken = null;
        Integer confirmedfrom = null;
        Integer confirmedto = null;
        Integer startingfrom = null;
        Integer startingto = null;
        // GetBookingsRS response = api.getBookings(authtoken, confirmedfrom, confirmedto, startingfrom, startingto);

        // TODO: test validations
    }
    
    /**
     * Method to get a resource data sheet. E.g. descriptions, images, features
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataSheetTest() throws ApiException {
        String authtoken = null;
        String resourceid = null;
        // GetDataSheetRS response = api.getDataSheet(authtoken, resourceid);

        // TODO: test validations
    }
    
    /**
     * Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGrantedHotelsTest() throws ApiException {
        String authtoken = null;
        // GetGrantedHotelsRS response = api.getGrantedHotels(authtoken);

        // TODO: test validations
    }
    
    /**
     * Use this methos to guess cancellation costs and important remarks regarding a price
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHotelPriceDetailsTest() throws ApiException {
        String authtoken = null;
        String key = null;
        // GetHotelPriceDetailsRS response = api.getHotelPriceDetails(authtoken, key);

        // TODO: test validations
    }
    
    /**
     * Method to get the whole product tree
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioTest() throws ApiException {
        String authtoken = null;
        // GetPortfolioRS response = api.getPortfolio(authtoken);

        // TODO: test validations
    }
    
    /**
     * Use this method to download the list of hotel bookings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoomingListTest() throws ApiException {
        String authtoken = null;
        Integer confirmedfrom = null;
        Integer confirmedto = null;
        Integer startingfrom = null;
        Integer startingto = null;
        // GetRoomingListRS response = api.getRoomingList(authtoken, confirmedfrom, confirmedto, startingfrom, startingto);

        // TODO: test validations
    }
    
    /**
     * Use this method to get or renew your authentication token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTokenTest() throws ApiException {
        String authtoken = null;
        String user = null;
        // String response = api.getToken(authtoken, user);

        // TODO: test validations
    }
    
    /**
     * Use this method to guess cancellation costs and important remarks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransferPriceDetailsTest() throws ApiException {
        String authtoken = null;
        String key = null;
        // GetTransferPriceDetailsRS response = api.getTransferPriceDetails(authtoken, key);

        // TODO: test validations
    }
    
    /**
     * Use this method to update hotel inventory
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String authtoken = null;
        UpdateRQ body = null;
        // UpdateRS response = api.update(authtoken, body);

        // TODO: test validations
    }
    
}
