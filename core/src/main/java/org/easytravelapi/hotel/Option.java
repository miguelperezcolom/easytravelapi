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
    private Allocation allocation;

    @ApiModelProperty(value = "List of available board basis and prices for each board")
    private List<BoardPrice> prices = new ArrayList<BoardPrice>();

    public Allocation getAllocation() {
        return allocation;
    }

    public void setAllocation(Allocation allocation) {
        this.allocation = allocation;
    }

    public List<BoardPrice> getPrices() {
        return prices;
    }

    public void setPrices(List<BoardPrice> prices) {
        this.prices = prices;
    }
}
