package org.easytravelapi.common;

/**
 * Created by miguel on 26/7/17.
 */
public class CancellationCost {

    private String GMTtime;

    private Double retail;
    private Double net;


    public String getGMTtime() {
        return GMTtime;
    }

    public void setGMTtime(String GMTtime) {
        this.GMTtime = GMTtime;
    }

    public Double getRetail() {
        return retail;
    }

    public void setRetail(Double retail) {
        this.retail = retail;
    }

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
    }
}
