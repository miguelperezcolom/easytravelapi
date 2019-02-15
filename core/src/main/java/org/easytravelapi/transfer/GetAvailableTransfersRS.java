package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.circuit.Label;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getavailabletransfers response")
public class GetAvailableTransfersRS extends AbstractRS {

    private List<Label> labels = new ArrayList<>();

    private double minPrice;

    private double maxPrice;

    @ApiModelProperty(value = "List of available transfers and their prices")
    private List<AvailableTransfer> availableTransfers = new ArrayList<AvailableTransfer>();


    public List<AvailableTransfer> getAvailableTransfers() {
        return availableTransfers;
    }

    public void setAvailableTransfers(List<AvailableTransfer> availableTransfers) {
        this.availableTransfers = availableTransfers;
    }

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
