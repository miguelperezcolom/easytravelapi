package org.easytravelapi.cms;

import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "A calendar week")
public class HotelAvailabilityCalendarWeek {

    private List<HotelAvailabilityCalendarDay> days = new ArrayList<HotelAvailabilityCalendarDay>();

    public List<HotelAvailabilityCalendarDay> getDays() {
        return days;
    }

    public void setDays(List<HotelAvailabilityCalendarDay> days) {
        this.days = days;
    }
}
