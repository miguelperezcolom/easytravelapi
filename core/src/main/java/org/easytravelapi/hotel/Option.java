package org.easytravelapi.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class Option {

    private List<Allocation> distribution = new ArrayList<Allocation>();


    public List<Allocation> getDistribution() {
        return distribution;
    }

    public void setDistribution(List<Allocation> distribution) {
        this.distribution = distribution;
    }
}
