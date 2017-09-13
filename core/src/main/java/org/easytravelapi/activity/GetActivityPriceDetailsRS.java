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
public class GetActivityPriceDetailsRS extends AbstractRS {

    @ApiModelProperty(value = "Cancellation costs for this activity")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

}
