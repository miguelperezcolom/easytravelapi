package io.mateu.easytravelapi.hotel;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class BookHotelRQ extends AbstractAuthenticatedRQ {

    private String key;

    private String leadName;

    private String commentsToProvider;
    private String privateComments;


    public static BookHotelRQ fromString(String json) {
        return Helper.fromString(BookHotelRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
