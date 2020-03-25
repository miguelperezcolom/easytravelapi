package org.easytravelapi.activity;

import io.swagger.annotations.ApiModel;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.Price;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the activity price details")
public class GetActivityPriceRS extends AbstractRS {

    private Price total;

    private boolean available;

    public Price getTotal() {
        return total;
    }

    public void setTotal(Price total) {
        this.total = total;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
