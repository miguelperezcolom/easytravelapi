package io.mateu.easytravelapi.activity;

import io.mateu.easytravelapi.common.AbstractRS;
import io.mateu.easytravelapi.util.Helper;

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
}
