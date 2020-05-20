package org.easytravelapi.flight;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.Resource;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Container for the Airports response")
public class GetAirportsRS extends AbstractRS {

    @ApiModelProperty(value = "List of Airports.")
    private List<Airport> airports = new ArrayList<>();

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}
