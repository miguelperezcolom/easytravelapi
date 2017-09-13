package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "A city inside our portfolio. This is the third and last level in our product hierarchy")
public class City {

    @ApiModelProperty(value = "This city resource id")
    private String resourceId;
    @ApiModelProperty(value = "This city name")
    private String name;
    @ApiModelProperty(value = "The name in a url friendly manner")
    private String urlFriendlyName;

    @ApiModelProperty(value = "List of resources available inside this city. E.g. hotels, activities, car rental offices, ...")
    private List<Resource> resources = new ArrayList<Resource>();


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

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public String getUrlFriendlyName() {
        return urlFriendlyName;
    }

    public void setUrlFriendlyName(String urlFriendlyName) {
        this.urlFriendlyName = urlFriendlyName;
    }
}
