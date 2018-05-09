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

    private List<AvailableDate> availableDates = new ArrayList<>();

    private List<Option> options = new ArrayList<>();


    @ApiModelProperty(value = "Cancellation costs for this activity")
    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();


    public List<CancellationCost> getCancellationCosts() {
        return cancellationCosts;
    }

    public void setCancellationCosts(List<CancellationCost> cancellationCosts) {
        this.cancellationCosts = cancellationCosts;
    }

    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }

    public List<AvailableDate> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<AvailableDate> availableDates) {
        this.availableDates = availableDates;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
