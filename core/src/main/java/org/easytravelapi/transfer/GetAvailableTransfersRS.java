package org.easytravelapi.transfer;

import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetAvailableTransfersRS extends AbstractRS {

    private List<AvailableTransfer> availableTransfers = new ArrayList<AvailableTransfer>();


    public List<AvailableTransfer> getAvailableTransfers() {
        return availableTransfers;
    }

    public void setAvailableTransfers(List<AvailableTransfer> availableTransfers) {
        this.availableTransfers = availableTransfers;
    }
}
