package org.easytravelapi.cms;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "A calendar day")
public class ActivityAvailabilityCalendarDay {

    private int id;

    private int posInWeek;

    private int day;

    private String date;

    private String styleName;

    private boolean blank;

    public ActivityAvailabilityCalendarDay() {

    }

    public ActivityAvailabilityCalendarDay(int id, int posInWeek, int day, String date, String styleName) {
        this.id = id;
        this.posInWeek = posInWeek;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosInWeek() {
        return posInWeek;
    }

    public void setPosInWeek(int posInWeek) {
        this.posInWeek = posInWeek;
    }

    public boolean isBlank() {
        return blank;
    }

    public void setBlank(boolean blank) {
        this.blank = blank;
    }
}
