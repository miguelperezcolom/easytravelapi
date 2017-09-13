package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Response with the list of available activities")
public class GetAvailableActivitiesRS extends AbstractRS {

    @ApiModelProperty(value = "List of the available activities for that resort and dates")
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
