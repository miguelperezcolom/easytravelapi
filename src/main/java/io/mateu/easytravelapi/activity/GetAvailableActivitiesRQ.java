package io.mateu.easytravelapi.activity;

import io.mateu.easytravelapi.common.AbstractAuthenticatedRQ;
import io.mateu.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class GetAvailableActivitiesRQ extends AbstractAuthenticatedRQ {

    private int start;
    private int end;

    private String resourceId;

    public static GetAvailableActivitiesRQ fromString(String json) {
        return Helper.fromString(GetAvailableActivitiesRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

}
