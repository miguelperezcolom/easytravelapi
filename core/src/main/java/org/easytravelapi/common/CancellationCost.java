package org.easytravelapi.common;

/**
 * Created by miguel on 26/7/17.
 */
public class CancellationCost {

    private String GMTtime;

    private Amount gross;
    private Amount commission;
    private Amount net;


    public String getGMTtime() {
        return GMTtime;
    }

    public void setGMTtime(String GMTtime) {
        this.GMTtime = GMTtime;
    }

    public Amount getGross() {
        return gross;
    }

    public void setGross(Amount gross) {
        this.gross = gross;
    }

    public Amount getCommission() {
        return commission;
    }

    public void setCommission(Amount commission) {
        this.commission = commission;
    }

    public Amount getNet() {
        return net;
    }

    public void setNet(Amount net) {
        this.net = net;
    }
}
