package io.mateu.easytravelapi.transfer;

import io.mateu.easytravelapi.common.Amount;

/**
 * Created by miguel on 26/7/17.
 */
public class AvailableTransfer {

    private String key;

    private String type;
    private String description;

    private Amount grossPrice;
    private Amount netPrice;
    private Amount commission;

    private boolean offer;
    private String offerText;

    private boolean onRequest;
    private String onRequestText;

    private boolean nonRefundable;


}
