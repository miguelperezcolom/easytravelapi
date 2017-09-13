package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An state inside our portfolio. This is the second level in our product hierarchy")
public class State {

    @ApiModelProperty(value = "This state resource id")
    private String resourceId;
    @ApiModelProperty(value = "This state name")
    private String name;

    @ApiModelProperty(value = "List of cities included in this state")
    private List<City> cities = new ArrayList<City>();


    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
