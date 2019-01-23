package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.CancellationCost;
import org.easytravelapi.common.Remark;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the activity price details")
public class GetActivityRatesRS extends AbstractRS {

    private List<ActivityVariant> variants = new ArrayList<>();

    private List<ActivityShift> shitfs = new ArrayList<>();


    public List<ActivityVariant> getVariants() {
        return variants;
    }

    public void setVariants(List<ActivityVariant> variants) {
        this.variants = variants;
    }

    public List<ActivityShift> getShitfs() {
        return shitfs;
    }

    public void setShitfs(List<ActivityShift> shitfs) {
        this.shitfs = shitfs;
    }

}
