package org.easytravelapi.generic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.BestDeal;
import org.easytravelapi.common.MultilingualText;

@ApiModel(description = "An available Generic product")
public class AvailableGeneric {
    @ApiModelProperty(value = "This product ID")
    private String genericId;
    @ApiModelProperty(value = "The name of this product. Usually multi-language")
    private MultilingualText name;
    @ApiModelProperty(value = "The description of this product. Usually multi-language")
    private MultilingualText description;
    @ApiModelProperty(value = "The main image for this product")
    private String image;
    @ApiModelProperty(value = "The type of product")
    private String type;

    private BestDeal bestDeal;

    public String getGenericId() { return genericId; }

    public void setGenericId(String genericId) { this.genericId = genericId; }

    public MultilingualText getName() { return name; }

    public void setName(MultilingualText name) { this.name = name; }

    public MultilingualText getDescription() { return description; }

    public void setDescription(MultilingualText description) { this.description = description; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public BestDeal getBestDeal() { return bestDeal; }

    public void setBestDeal(BestDeal bestDeal) { this.bestDeal = bestDeal; }
}
