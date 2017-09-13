package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "A country inside our portfolio. The first level in our product hierarchy")
public class Country {

    @ApiModelProperty(value = "This country resource id")
    private String resourceId;
    @ApiModelProperty(value = "This country name")
    private String name;
    @ApiModelProperty(value = "The name in a url friendly manner")
    private String urlFriendlyName;

    @ApiModelProperty(value = "List of contained states")
    private List<State> states = new ArrayList<State>();


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

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public String getUrlFriendlyName() {
        return urlFriendlyName;
    }

    public void setUrlFriendlyName(String urlFriendlyName) {
        this.urlFriendlyName = urlFriendlyName;
    }
}
