package org.easytravelapi.generic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.circuit.Label;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Response with the list of available products")
public class GetAvailableGenericsRS extends AbstractRS {

    private List<Label> labels = new ArrayList<>();

    private double minPrice;

    private double maxPrice;

    @ApiModelProperty(value = "List of the available products")
    private List<AvailableGeneric> availableGenerics = new ArrayList<AvailableGeneric>();

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

    public List<AvailableGeneric> getAvailableGenerics() { return availableGenerics; }

    public void setAvailableGenerics(List<AvailableGeneric> availableGenerics) { this.availableGenerics = availableGenerics; }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
