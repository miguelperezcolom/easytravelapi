package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A resource inside our portfolio. E.g. a hotel, an activity, a car rental office, ...
 */
@ApiModel(description = "A resource inside our portfolio. E.g. a hotel, an activity, a car rental office, ...")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class Resource {
  @SerializedName("resourceId")
  private String resourceId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("description")
  private String description = null;

  public Resource resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * This resouce id
   * @return resourceId
  **/
  @ApiModelProperty(value = "This resouce id")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public Resource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This resource name
   * @return name
  **/
  @ApiModelProperty(value = "This resource name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Resource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of resource. E.g. HOTEL, ACTIVITY, TICKET, CARRENTALOFFICE, ...
   * @return type
  **/
  @ApiModelProperty(value = "Type of resource. E.g. HOTEL, ACTIVITY, TICKET, CARRENTALOFFICE, ...")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Resource longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Resource longitude accorging to google maps
   * @return longitude
  **/
  @ApiModelProperty(value = "Resource longitude accorging to google maps")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Resource latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Resource latitude accorging to google maps
   * @return latitude
  **/
  @ApiModelProperty(value = "Resource latitude accorging to google maps")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Resource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Resource description
   * @return description
  **/
  @ApiModelProperty(value = "Resource description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.resourceId, resource.resourceId) &&
        Objects.equals(this.name, resource.name) &&
        Objects.equals(this.type, resource.type) &&
        Objects.equals(this.longitude, resource.longitude) &&
        Objects.equals(this.latitude, resource.latitude) &&
        Objects.equals(this.description, resource.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, name, type, longitude, latitude, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

