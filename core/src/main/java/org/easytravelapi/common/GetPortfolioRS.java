package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getportfolio response")
public class GetPortfolioRS extends AbstractRS {

    @ApiModelProperty(value = "List of countries. This is the first level in the portfolio hierarchy")
    private List<Country> countries = new ArrayList<Country>();


    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
