package org.easytravelapi.circuit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.BestDeal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "An available circuit")
public class AvailableCircuit {

    @ApiModelProperty(value = "This circuit ID")
    private String circuitId;
    @ApiModelProperty(value = "The name of this circuit. Usually multi-language")
    private String name;
    @ApiModelProperty(value = "The description of this circuit. Usually multi-language")
    private String description;
    @ApiModelProperty(value = "The main image for this circuit")
    private String image;

    private BestDeal bestDeal;

    private List<Label> labels = new ArrayList<>();

    public String getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
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
