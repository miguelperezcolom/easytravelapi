package io.mateu.easytravelapi.transfer;

import io.mateu.easytravelapi.common.AbstractRS;
import io.mateu.easytravelapi.common.CancellationCost;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
public class GetTransferPriceDetailsRS extends AbstractRS {

    private List<CancellationCost> cancellationCosts = new ArrayList<CancellationCost>();
}
