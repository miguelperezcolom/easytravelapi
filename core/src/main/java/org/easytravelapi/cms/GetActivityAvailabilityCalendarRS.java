package org.easytravelapi.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getavailability response")
public class GetActivityAvailabilityCalendarRS extends AbstractRS {

    @ApiModelProperty(value = "List of available hotels, including prices")
    private List<ActivityAvailabilityCalendarMonth> months = new ArrayList<ActivityAvailabilityCalendarMonth>();

    public List<ActivityAvailabilityCalendarMonth> getMonths() {
        return months;
    }

    public void setMonths(List<ActivityAvailabilityCalendarMonth> months) {
        this.months = months;
    }
}
