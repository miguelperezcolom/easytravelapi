package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;

public class ActivityCheckItem {
    @ApiModelProperty(value = "This activity ID")
    private String activityId;
    @ApiModelProperty(value = "The name of this activity. ")
    private String name;
    @ApiModelProperty(value = "The description of this activity. ")
    private String description;
    @ApiModelProperty(value = "The main image for this activity")
    private String image;

    @ApiModelProperty(value = "Date for this activity")
    private int date;

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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
