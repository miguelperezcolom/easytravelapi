package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.circuit.Label;
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

    private List<Label> labels = new ArrayList<>();

    private double minPrice;

    private double maxPrice;


    public List<AvailableHotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<AvailableHotel> hotels) {
        this.hotels = hotels;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
