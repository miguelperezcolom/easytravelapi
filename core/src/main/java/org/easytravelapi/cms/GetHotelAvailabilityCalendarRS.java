package org.easytravelapi.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.hotel.AvailableHotel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getavailability response")
public class GetHotelAvailabilityCalendarRS extends AbstractRS {

    @ApiModelProperty(value = "List of available hotels, including prices")
    private List<HotelAvailabilityCalendarMonth> months = new ArrayList<HotelAvailabilityCalendarMonth>();

    public List<HotelAvailabilityCalendarMonth> getMonths() {
        return months;
    }

    public void setMonths(List<HotelAvailabilityCalendarMonth> months) {
        this.months = months;
    }
}
