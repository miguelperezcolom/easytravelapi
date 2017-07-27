package io.mateu.easytravelapi.transfer;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class BookTransferRQ extends AbstractAuthenticatedRQ {

    private String key;

    private String leadName;

    private String commentsToProvider;
    private String privateComments;

    private String incomingFlightNumber;
    private int incomingFlightTime;
    private String incomingFlightOrigin;

    private String outgoingFlightNumber;
    private int outgoingFlightTime;
    private String outgoingFlightDestination;


    public static BookTransferRQ fromString(String json) {
        return Helper.fromString(BookTransferRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
