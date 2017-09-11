package org.easytravelapi.activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class AvailableActivity {

    private String activityId;
    private String name;
    private String description;
    private String image;

    private List<ActivityDate> availableDates = new ArrayList<ActivityDate>();


    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<ActivityDate> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<ActivityDate> availableDates) {
        this.availableDates = availableDates;
    }
}
