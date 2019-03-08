package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GetEventCheckListRS {
    @ApiModelProperty(value = "List of available events in an excursions, to check")
    private List<EventCheckItem> event = new ArrayList<EventCheckItem>();

    public List<EventCheckItem> getEvent() {
        return event;
    }

    public void setEvent(List<EventCheckItem> event) {
        this.event = event;
    }
}
