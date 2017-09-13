package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getavailability response")
public class GetAvailableHotelsRS extends AbstractRS {

    @ApiModelProperty(value = "List of available hotels, including prices")
    private List<AvailableHotel> hotels = new ArrayList<AvailableHotel>();


    public List<AvailableHotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<AvailableHotel> hotels) {
        this.hotels = hotels;
    }
}
