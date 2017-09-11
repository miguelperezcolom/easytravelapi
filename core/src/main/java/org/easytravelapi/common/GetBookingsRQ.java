package org.easytravelapi.common;

import org.easytravelapi.util.Helper;

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


    public int getFromConfirmationDate() {
        return fromConfirmationDate;
    }

    public void setFromConfirmationDate(int fromConfirmationDate) {
        this.fromConfirmationDate = fromConfirmationDate;
    }

    public int getToConfirmationDate() {
        return toConfirmationDate;
    }

    public void setToConfirmationDate(int toConfirmationDate) {
        this.toConfirmationDate = toConfirmationDate;
    }

    public int getFromStartDate() {
        return fromStartDate;
    }

    public void setFromStartDate(int fromStartDate) {
        this.fromStartDate = fromStartDate;
    }

    public int getToStartDate() {
        return toStartDate;
    }

    public void setToStartDate(int toStartDate) {
        this.toStartDate = toStartDate;
    }
}
