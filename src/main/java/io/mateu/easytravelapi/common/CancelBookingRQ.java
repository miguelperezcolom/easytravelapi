package io.mateu.easytravelapi.common;

import io.mateu.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class CancelBookingRQ extends AbstractAuthenticatedRQ {

    private String bookingId;


    public static CancelBookingRQ fromString(String json) {
        return Helper.fromString(CancelBookingRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
