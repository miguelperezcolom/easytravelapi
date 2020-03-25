package org.easytravelapi.generic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;
import org.easytravelapi.util.Helper;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Response with the list of available services types ")
public class GetServicesRS extends AbstractRS {
    @ApiModelProperty(value = "List of the available products")
    private List<GenericService> genericsServices = new ArrayList<GenericService>();

    @Override
    public String toString() {
        return Helper.toJson(this);
    }

    public List<GenericService> getGenericsServices() {
        return genericsServices;
    }

    public void setGenericsServices(List<GenericService> genericsServices) {
        this.genericsServices = genericsServices;
    }
}
