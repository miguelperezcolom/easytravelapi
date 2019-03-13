package org.easytravelapi.cms;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

public class GetActivityCheckListRS extends AbstractRS {
    @ApiModelProperty(value = "List of available excursions, to check")
    private List<ActivityCheckItem> activity = new ArrayList<ActivityCheckItem>();

    public List<ActivityCheckItem> getActivity() {
        return activity;
    }

    public void setActivity(List<ActivityCheckItem> activity) {
        this.activity = activity;
    }
}
