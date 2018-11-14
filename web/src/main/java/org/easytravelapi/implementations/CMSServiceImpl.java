package org.easytravelapi.implementations;

import org.easytravelapi.CMSService;
import org.easytravelapi.cms.GetHotelAvailabilityCalendarRS;
import org.easytravelapi.cms.HotelAvailabilityCalendarDay;
import org.easytravelapi.cms.HotelAvailabilityCalendarMonth;
import org.easytravelapi.cms.HotelAvailabilityCalendarWeek;

public class CMSServiceImpl implements CMSService {
    @Override
    public GetHotelAvailabilityCalendarRS getHotelAvailabilityCalendar(String token, String resorts, int checkIn, int checkout, String occupancies) throws Throwable {
        GetHotelAvailabilityCalendarRS cal = new GetHotelAvailabilityCalendarRS();

        for (int j=1 ;j<12;j++) {
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
}
