package org.easytravelapi.cms;

import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "A calendar week")
public class ActivityAvailabilityCalendarWeek {

    private List<ActivityAvailabilityCalendarDay> days = new ArrayList<ActivityAvailabilityCalendarDay>();

    public List<ActivityAvailabilityCalendarDay> getDays() {
        return days;
    }

    public void setDays(List<ActivityAvailabilityCalendarDay> days) {
        this.days = days;
    }
}
