package org.easytravelapi.cms;

import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

public class CartCompletionRS extends AbstractRS {

    private List<AdditionalServiceLink> additionalServicesLinks = new ArrayList<>();

    private TravelInsuranceData travelInsurance;

    //todo: añadir parámetros por defecto buscadores




    public List<AdditionalServiceLink> getAdditionalServicesLinks() {
        return additionalServicesLinks;
    }

    public void setAdditionalServicesLinks(List<AdditionalServiceLink> additionalServicesLinks) {
        this.additionalServicesLinks = additionalServicesLinks;
    }

    public TravelInsuranceData getTravelInsurance() {
        return travelInsurance;
    }

    public void setTravelInsurance(TravelInsuranceData travelInsurance) {
        this.travelInsurance = travelInsurance;
    }
}
