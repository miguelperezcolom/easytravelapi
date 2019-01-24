package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the activity price details")
public class GetActivityRatesRS extends AbstractRS {

    private List<ActivityVariant> variants = new ArrayList<>();

    private List<ActivityShift> shifts = new ArrayList<>();


    public List<ActivityVariant> getVariants() {
        return variants;
    }

    public void setVariants(List<ActivityVariant> variants) {
        this.variants = variants;
    }

    public List<ActivityShift> getShifts() {
        return shifts;
    }

    public void setShifts(List<ActivityShift> shifts) {
        this.shifts = shifts;
    }

}
