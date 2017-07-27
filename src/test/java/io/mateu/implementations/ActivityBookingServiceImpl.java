package io.mateu.implementations;

import io.mateu.easytravelapi.ActivityBookingService;
import io.mateu.easytravelapi.activity.*;

import javax.ws.rs.FormParam;

/**
 * Created by miguel on 27/7/17.
 */
public class ActivityBookingServiceImpl implements ActivityBookingService {

    public GetAvailableActivitiesRS getAvailableActivities(@FormParam("rq") GetAvailableActivitiesRQ rq) {
        return null;
    }

    public GetActivityPriceDetailsRS getActivityPriceDetails(@FormParam("rq") GetActivityPriceDetailsRQ rq) {
        return null;
    }

    public BookActivityRS bookActivity(@FormParam("rq") BookActivityRQ rq) {
        return null;
    }
}
