package org.easytravelapi.generic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.circuit.Label;
import org.easytravelapi.common.BestDeal;
import org.easytravelapi.common.MultilingualText;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "An available Generic product")
public class AvailableGeneric {
    @ApiModelProperty(value = "This product ID")
    private String genericId;
    @ApiModelProperty(value = "The name of this product. Usually multi-language")
    private String name;
    @ApiModelProperty(value = "The description of this product. Usually multi-language")
    private String description;
    @ApiModelProperty(value = "The main image for this product")
    private String image;
    @ApiModelProperty(value = "The type of product")
    private String type;

    private BestDeal bestDeal;

    private List<Label> labels = new ArrayList<>();


    public String getGenericId() {
        return genericId;
    }

    public void setGenericId(String genericId) {
        this.genericId = genericId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BestDeal getBestDeal() {
        return bestDeal;
    }

    public void setBestDeal(BestDeal bestDeal) {
        this.bestDeal = bestDeal;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }
}
