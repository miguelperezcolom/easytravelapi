package io.mateu.easytravelapi.channelManager;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class ConfirmServicesRQ extends AbstractAuthenticatedRQ {

    private List<ServiceConfirmation> serviceConfirmations = new ArrayList<ServiceConfirmation>();


    public static ConfirmServicesRQ fromString(String json) {
        return Helper.fromString(ConfirmServicesRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }
}
