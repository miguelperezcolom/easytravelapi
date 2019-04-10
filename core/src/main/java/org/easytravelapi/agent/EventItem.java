package org.easytravelapi.agent;

import org.easytravelapi.activity.ActivityShift;
import org.easytravelapi.activity.ActivityVariant;

import java.util.ArrayList;
import java.util.List;

public class EventItem {
    private String ActivityId;

    private List<ActivityVariant> variants = new ArrayList<>();

    private List<ActivityShift> shifts = new ArrayList<>();

    public String getActivityId() {
        return ActivityId;
    }

    public void setActivityId(String activityId) {
        ActivityId = activityId;
    }

    public List<ActivityVariant> getVariants() {
        return variants;
    }

    public void setVariants(List<ActivityVariant> variants) {
        this.variants = variants;
    }

    public List<ActivityShift> getShifts() {
        return shifts;
    }

    public void setShifts(List<ActivityShift> shifts) {
        this.shifts = shifts;
    }
}
