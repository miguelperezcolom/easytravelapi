package io.mateu.easytravelapi.channelManager;

import io.mateu.easytravelapi.common.Amount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class HotelBooking {

    private String bookingId;
    private String created;
    private String createdBy;
    private String modified;

    private String serviceType;
    private String serviceDescription;

    private String start;
    private String end;

    private String status;

    private String leadName;

    private Amount grossValue;
    private Amount netValue;
    private Amount commissionValue;

    private String commentsToProvider;
    private String privateComments;

    private List<Stay> stays = new ArrayList<Stay>();

}
