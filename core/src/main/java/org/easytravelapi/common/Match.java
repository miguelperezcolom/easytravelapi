package org.easytravelapi.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

@ApiModel(description = "Container for a portfolio match")
public class Match {

    @ApiModelProperty(value = "Id to use in the availability search")
    private String resourceId;

    @ApiModelProperty(value = "Name for this resource")
    private String name;

    @ApiModelProperty(value = "Description for this resource")
    private String description;

    @ApiModelProperty(value = "Metadata for this resource")
    private Map<String, String> metadata = new HashMap<String, String>();


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
