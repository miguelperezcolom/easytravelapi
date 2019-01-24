package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.circuit.Label;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Response with the list of available activities")
public class GetAvailableActivitiesRS extends AbstractRS {

    private List<Label> labels = new ArrayList<>();

    private double minPrice;

    private double maxPrice;

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

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
