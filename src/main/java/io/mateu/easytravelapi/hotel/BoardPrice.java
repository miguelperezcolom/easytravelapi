package io.mateu.easytravelapi.hotel;

import io.mateu.easytravelapi.common.Amount;

/**
 * Created by miguel on 26/7/17.
 */
public class BoardPrice {

    private String key;

    private String boardBasisId;
    private String boardBasisName;

    private Amount grossPrice;
    private Amount netPrice;
    private Amount commission;


    private boolean offer;
    private String offerText;

    private boolean onRequest;
    private String onRequestText;

    private boolean nonRefundable;

}
