package org.easytravelapi.generic;

import io.swagger.annotations.ApiModel;
import org.easytravelapi.activity.ActivityShift;
import org.easytravelapi.activity.ActivityVariant;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.common.BestDeal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the activity price details")
public class GetGenericRatesRS extends AbstractRS {

    private String key;

    private BestDeal price;


    private boolean dateDependant;

    private boolean datesRangeDependant;

    private boolean unitsDependant;

    private boolean adultsDependant;

    private boolean childrenDependant;



    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BestDeal getPrice() {
        return price;
    }

    public void setPrice(BestDeal price) {
        this.price = price;
    }

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
}
