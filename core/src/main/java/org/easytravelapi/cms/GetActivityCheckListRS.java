package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class GetActivityCheckListRS {
    @ApiModelProperty(value = "List of available excursions, to check")
    private List<ActivityCheckItem> activity = new ArrayList<ActivityCheckItem>();

    public List<ActivityCheckItem> getActivity() {
        return activity;
    }

    public void setActivity(List<ActivityCheckItem> activity) {
        this.activity = activity;
    }
}
