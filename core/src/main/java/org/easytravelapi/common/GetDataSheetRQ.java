package org.easytravelapi.common;

import org.easytravelapi.util.Helper;

/**
 * Created by miguel on 26/7/17.
 */
public class GetDataSheetRQ extends AbstractAuthenticatedRQ {

    private String resourceId;


    public static GetDataSheetRQ fromString(String json) {
        return Helper.fromString(GetDataSheetRQ.class, json);
    }

    @Override
    public String toString() {
        return Helper.toJson(this);
    }


    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
