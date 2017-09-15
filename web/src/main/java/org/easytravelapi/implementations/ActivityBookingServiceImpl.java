package org.easytravelapi.implementations;

import org.easytravelapi.ActivityBookingService;
import org.easytravelapi.activity.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class ActivityBookingServiceImpl implements ActivityBookingService {

    public GetAvailableActivitiesRS getAvailableActivities(GetAvailableActivitiesRQ rq) {
        System.out.println("rq = " + rq);
        return new GetAvailableActivitiesRS();
    }

    public GetActivityPriceDetailsRS getActivityPriceDetails(GetActivityPriceDetailsRQ rq) {
        System.out.println("rq = " + rq);
        return new GetActivityPriceDetailsRS();
    }

    public BookActivityRS bookActivity(BookActivityRQ rq) {
        System.out.println("rq = " + rq);
        return new BookActivityRS();
    }
}
