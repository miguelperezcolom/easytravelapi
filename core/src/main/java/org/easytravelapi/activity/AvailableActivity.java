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

    private BestDeal bestDeal;

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

    public BestDeal getBestDeal() {
        return bestDeal;
    }

    public void setBestDeal(BestDeal bestDeal) {
        this.bestDeal = bestDeal;
    }
}
