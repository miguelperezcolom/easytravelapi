package org.easytravelapi.implementations;

import org.easytravelapi.CMSService;
import org.easytravelapi.cms.*;

public class CMSServiceImpl implements CMSService {
    @Override
    public GetHotelAvailabilityCalendarRS getHotelAvailabilityCalendar(String token, String resorts, int checkIn, int checkout, String occupancies) throws Throwable {
        GetHotelAvailabilityCalendarRS cal = new GetHotelAvailabilityCalendarRS();

        for (int j=1 ;j<13;j++) {
            HotelAvailabilityCalendarMonth month;
            cal.getMonths().add(month = new HotelAvailabilityCalendarMonth());
            month.setMonth(j);
            month.setTitle("hotel 1");
            month.setYear(2018);

            HotelAvailabilityCalendarWeek week;
            month.getWeeks().add(week = new HotelAvailabilityCalendarWeek());

            for (int i = 1; i < 29; i++) {

                HotelAvailabilityCalendarDay day;
                week.getDays().add(day = new HotelAvailabilityCalendarDay());
                day.setDate("2018-"+j+ "-" + i);
            }
        }

        return cal;
    }

    @Override
    public GetActivityAvailabilityCalendarRS getActivityAvailabilityCalendar(String token, String activityId) throws Throwable {
        GetActivityAvailabilityCalendarRS cal = new GetActivityAvailabilityCalendarRS();

        for (int j=1 ;j<13;j++) {
            ActivityAvailabilityCalendarMonth month;
            cal.getMonths().add(month = new ActivityAvailabilityCalendarMonth());
            month.setMonth(j);
            month.setTitle("Activity 1");
            month.setYear(2018);

            ActivityAvailabilityCalendarWeek week;
            month.getWeeks().add(week = new ActivityAvailabilityCalendarWeek());

            for (int i = 1; i < 29; i++) {

                ActivityAvailabilityCalendarDay day;
                week.getDays().add(day = new ActivityAvailabilityCalendarDay());
                day.setDate("2018-"+j+ "-" + i);
            }
        }

        return cal;
    }

    @Override
    public GetActivityAvailabilityCalendarRS getCircuitAvailabilityCalendar(String token, String circuitId) throws Throwable {
        GetActivityAvailabilityCalendarRS cal = new GetActivityAvailabilityCalendarRS();

        for (int j=1 ;j<13;j++) {
            ActivityAvailabilityCalendarMonth month;
            cal.getMonths().add(month = new ActivityAvailabilityCalendarMonth());
            month.setMonth(j);
            month.setTitle("Activity 1");
            month.setYear(2018);

            ActivityAvailabilityCalendarWeek week;
            month.getWeeks().add(week = new ActivityAvailabilityCalendarWeek());

            for (int i = 1; i < 29; i++) {

                ActivityAvailabilityCalendarDay day;
                week.getDays().add(day = new ActivityAvailabilityCalendarDay());
                day.setDate("2018-"+j+ "-" + i);
            }
        }

        return cal;
    }

    @Override
    public GetActivityAvailabilityCalendarRS getGenericAvailabilityCalendar(String token, String productId) throws Throwable {
        GetActivityAvailabilityCalendarRS cal = new GetActivityAvailabilityCalendarRS();

        for (int j=1 ;j<13;j++) {
            ActivityAvailabilityCalendarMonth month;
            cal.getMonths().add(month = new ActivityAvailabilityCalendarMonth());
            month.setMonth(j);
            month.setTitle("Activity 1");
            month.setYear(2018);

            ActivityAvailabilityCalendarWeek week;
            month.getWeeks().add(week = new ActivityAvailabilityCalendarWeek());

            for (int i = 1; i < 29; i++) {

                ActivityAvailabilityCalendarDay day;
                week.getDays().add(day = new ActivityAvailabilityCalendarDay());
                day.setDate("2018-"+j+ "-" + i);
            }
        }

        return cal;
    }

}
