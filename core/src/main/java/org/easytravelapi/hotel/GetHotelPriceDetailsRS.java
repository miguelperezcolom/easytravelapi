package org.easytravelapi.hotel;

import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.CancellationCost;

import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetHotelPriceDetailsRS extends AbstractRS {

    private List<CancellationCost> costs;


    public List<CancellationCost> getCosts() {
        return costs;
    }

    public void setCosts(List<CancellationCost> costs) {
        this.costs = costs;
    }
}
