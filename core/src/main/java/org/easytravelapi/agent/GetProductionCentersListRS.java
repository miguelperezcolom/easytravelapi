package org.easytravelapi.agent;

import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

public class GetProductionCentersListRS extends AbstractRS {

    private List<ProductionCenter> productionCenters = new ArrayList<>();

    public List<ProductionCenter> getProductionCenters() {
        return productionCenters;
    }

    public void setProductionCenters(List<ProductionCenter> productionCenters) {
        this.productionCenters = productionCenters;
    }
}
