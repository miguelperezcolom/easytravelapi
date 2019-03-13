package org.easytravelapi.generic;

import io.swagger.annotations.ApiModel;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the activity price details")
public class GetGenericRatesRS extends AbstractRS {

    private boolean dateDependant;

    private boolean datesRangeDependant;

    private boolean unitsDependant;

    private boolean adultsDependant;

    private boolean childrenDependant;

    private boolean variantDependant;

    private List<GenericVariant> variants = new ArrayList<>();



    public boolean isDateDependant() {
        return dateDependant;
    }

    public void setDateDependant(boolean dateDependant) {
        this.dateDependant = dateDependant;
    }

    public boolean isDatesRangeDependant() {
        return datesRangeDependant;
    }

    public void setDatesRangeDependant(boolean datesRangeDependant) {
        this.datesRangeDependant = datesRangeDependant;
    }

    public boolean isUnitsDependant() {
        return unitsDependant;
    }

    public void setUnitsDependant(boolean unitsDependant) {
        this.unitsDependant = unitsDependant;
    }

    public boolean isAdultsDependant() {
        return adultsDependant;
    }

    public void setAdultsDependant(boolean adultsDependant) {
        this.adultsDependant = adultsDependant;
    }

    public boolean isChildrenDependant() {
        return childrenDependant;
    }

    public void setChildrenDependant(boolean childrenDependant) {
        this.childrenDependant = childrenDependant;
    }

    public boolean isVariantDependant() {
        return variantDependant;
    }

    public void setVariantDependant(boolean variantDependant) {
        this.variantDependant = variantDependant;
    }

    public List<GenericVariant> getVariants() {
        return variants;
    }

    public void setVariants(List<GenericVariant> variants) {
        this.variants = variants;
    }
}
