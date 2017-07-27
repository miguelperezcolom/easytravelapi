package io.mateu.easytravelapi.channelManager;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class GetRoomingListRQ extends AbstractAuthenticatedRQ {

    private int fromConfirmationDate;
    private int toConfirmationDate;

    private int fromStartDate;
    private int toStartDate;


    public static GetRoomingListRQ fromString(String json) {
        return Helper.fromString(GetRoomingListRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
