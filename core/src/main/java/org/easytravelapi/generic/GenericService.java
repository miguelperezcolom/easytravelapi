package org.easytravelapi.generic;

import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.MultilingualText;

public class GenericService {
    @ApiModelProperty(value = "This   service type ID")
    private String typeId;
    @ApiModelProperty(value = "The name of this service type. Usually multi-language")
    private MultilingualText name;
    @ApiModelProperty(value = "The description of this service type. Usually multi-language")
    private MultilingualText description;
    @ApiModelProperty(value = "The main image for service type activity")
    private String image;

    public String getTypeId() { return typeId; }

    public void setTypeId(String typeId) { this.typeId = typeId; }

    public MultilingualText getName() { return name; }

    public void setName(MultilingualText name) { this.name = name; }

    public MultilingualText getDescription() { return description; }

    public void setDescription(MultilingualText description) { this.description = description; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }
}
