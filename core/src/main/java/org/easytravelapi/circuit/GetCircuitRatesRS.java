package org.easytravelapi.circuit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.Remark;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the circuit price details")
public class GetCircuitRatesRS extends AbstractRS {

    private List<AvailableDate> availableDates = new ArrayList<>();

    @ApiModelProperty(value = "Remarks which should be visible for the customer")
    private List<Remark> remarks = new ArrayList<Remark>();

    private List<Supplement> supplements = new ArrayList<Supplement>();

    private List<String> languages = new ArrayList<String>();

    private List<String> pickups = new ArrayList<String>();

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


    public List<Supplement> getSupplements() {
        return supplements;
    }

    public void setSupplements(List<Supplement> supplements) {
        this.supplements = supplements;
    }

    public List<String> getLanguages() { return languages; }

    public void setLanguages(List<String> languages) { this.languages = languages; }

    public List<String> getPickups() { return pickups; }

    public void setPickups(List<String> pickups) { this.pickups = pickups; }
}