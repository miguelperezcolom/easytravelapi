package org.easytravelapi.hotel;

import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetAvailableHotelsRS extends AbstractRS {

    private List<AvailableHotel> hotels = new ArrayList<AvailableHotel>();


    public List<AvailableHotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<AvailableHotel> hotels) {
        this.hotels = hotels;
    }
}
