package org.easytravelapi.channelManager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Room data to be used by the channel manager")
public class RoomId {

    @ApiModelProperty(value = "This room id")
    private String id;
    @ApiModelProperty(value = "This room description")
    private String description;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
