package org.easytravelapi.transfer;

import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.CancellationCost;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetTransferPriceDetailsRS extends AbstractRS {

    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();


    public List<CancellationCost> getCancellationCosts() {
        return cancellationCosts;
    }

    public void setCancellationCosts(List<CancellationCost> cancellationCosts) {
        this.cancellationCosts = cancellationCosts;
    }
}
