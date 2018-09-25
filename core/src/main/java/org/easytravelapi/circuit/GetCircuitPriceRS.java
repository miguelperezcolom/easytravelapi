package org.easytravelapi.circuit;

import io.swagger.annotations.ApiModel;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.BestDeal;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the circuit price details")
public class GetCircuitPriceRS extends AbstractRS {

    private BestDeal total;

    private boolean available;

    public BestDeal getTotal() {
        return total;
    }

    public void setTotal(BestDeal total) {
        this.total = total;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
