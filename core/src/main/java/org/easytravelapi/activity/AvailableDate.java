package org.easytravelapi.activity;

import java.util.ArrayList;
import java.util.List;

public class AvailableDate {

    private int date;

    private List<Shift> shifts = new ArrayList<>();

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
}
