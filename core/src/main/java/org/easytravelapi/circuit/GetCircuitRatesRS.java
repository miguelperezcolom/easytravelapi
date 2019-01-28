package org.easytravelapi.circuit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.activity.ActivityVariant;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.Remark;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the circuit price details")
public class GetCircuitRatesRS extends AbstractRS {

    private List<ActivityVariant> variants = new ArrayList<>();

    public List<ActivityVariant> getVariants() {
        return variants;
    }

    public void setVariants(List<ActivityVariant> variants) {
        this.variants = variants;
    }
}
