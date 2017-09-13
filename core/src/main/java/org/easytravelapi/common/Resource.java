package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "A resource inside our portfolio. E.g. a hotel, an activity, a car rental office, ...")
public class Resource {

    @ApiModelProperty(value = "This resouce id")
    private String resourceId;
    @ApiModelProperty(value = "This resource name")
    private String name;
    //todo: revisar la lista
    @ApiModelProperty(value = "Type of resource. E.g. HOTEL, ACTIVITY, TICKET, CARRENTALOFFICE, ...")
    private String type;
    @ApiModelProperty(value = "Resource longitude accorging to google maps")
    private String longitude;
    @ApiModelProperty(value = "Resource latitude accorging to google maps")
    private String latitude;
    @ApiModelProperty(value = "Resource description")
    private String description;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
