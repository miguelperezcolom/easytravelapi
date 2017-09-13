package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An available room combination the fits your occcupation")
public class Option {

    @ApiModelProperty(value = "A list of occupations (pax - room pairs)")
    private List<Allocation> distribution = new ArrayList<Allocation>();


    public List<Allocation> getDistribution() {
        return distribution;
    }

    public void setDistribution(List<Allocation> distribution) {
        this.distribution = distribution;
    }
}
