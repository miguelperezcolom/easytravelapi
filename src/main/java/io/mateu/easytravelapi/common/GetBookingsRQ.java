package io.mateu.easytravelapi.common;

import io.mateu.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class GetBookingsRQ extends AbstractAuthenticatedRQ {

    private int fromConfirmationDate;
    private int toConfirmationDate;

    private int fromStartDate;
    private int toStartDate;

    public static GetBookingsRQ fromString(String json) {
        return Helper.fromString(GetBookingsRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
