package org.easytravelapi.activity;

import org.easytravelapi.common.AbstractAuthenticatedRQ;
import org.easytravelapi.util.Helper;

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


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
