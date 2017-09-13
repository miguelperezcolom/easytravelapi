package org.easytravelapi.transfer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getavailabletransfers response")
public class GetAvailableTransfersRS extends AbstractRS {

    @ApiModelProperty(value = "List of available transfers and their prices")
    private List<AvailableTransfer> availableTransfers = new ArrayList<AvailableTransfer>();


    public List<AvailableTransfer> getAvailableTransfers() {
        return availableTransfers;
    }

    public void setAvailableTransfers(List<AvailableTransfer> availableTransfers) {
        this.availableTransfers = availableTransfers;
    }
}
