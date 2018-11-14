package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.Resource;


import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Container for the Airports response")
public class GetAirportsRS extends AbstractRS {

    @ApiModelProperty(value = "List of Airports.")
    private List<Resource> airports = new ArrayList<Resource>();

    public List<Resource> getAirports() { return airports; }

    public void setAirports(List<Resource> airports) { this.airports = airports; }
}
