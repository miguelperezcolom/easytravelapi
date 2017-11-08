package org.easytravelapi.cms;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "A calendar day")
public class HotelAvailabilityCalendarDay {

    private int day;

    private String date;

    private String styleName;

    public HotelAvailabilityCalendarDay() {

    }

    public HotelAvailabilityCalendarDay(int day, String date, String styleName) {
        this.day = day;
        this.date = date;
        this.styleName = styleName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
}
