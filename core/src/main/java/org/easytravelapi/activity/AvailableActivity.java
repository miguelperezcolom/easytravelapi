package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An available activity")
public class AvailableActivity {

    @ApiModelProperty(value = "This activity ID")
    private String activityId;
    @ApiModelProperty(value = "The name of this activity. Usually multi-language")
    private String name;
    @ApiModelProperty(value = "The description of this activity. Usually multi-language")
    private String description;
    @ApiModelProperty(value = "The main image for this activity")
    private String image;

    @ApiModelProperty(value = "List of available dates (and hours) for this activity. Here you will find prices")
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
