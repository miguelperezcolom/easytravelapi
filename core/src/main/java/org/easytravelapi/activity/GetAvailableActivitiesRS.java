package org.easytravelapi.activity;

import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetAvailableActivitiesRS extends AbstractRS {

    private List<AvailableActivity> availableActivities = new ArrayList<AvailableActivity>();

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

    public List<AvailableActivity> getAvailableActivities() {
        return availableActivities;
    }

    public void setAvailableActivities(List<AvailableActivity> availableActivities) {
        this.availableActivities = availableActivities;
    }
}
