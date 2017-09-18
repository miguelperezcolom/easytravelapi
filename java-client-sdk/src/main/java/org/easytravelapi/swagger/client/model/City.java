package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A city inside our portfolio. This is the third and last level in our product hierarchy
 */
@ApiModel(description = "A city inside our portfolio. This is the third and last level in our product hierarchy")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class City {
  @SerializedName("resourceId")
  private String resourceId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("urlFriendlyName")
  private String urlFriendlyName = null;

  @SerializedName("resources")
  private List<Resource> resources = new ArrayList<Resource>();

  public City resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * This city resource id
   * @return resourceId
  **/
  @ApiModelProperty(value = "This city resource id")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public City name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This city name
   * @return name
  **/
  @ApiModelProperty(value = "This city name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public City urlFriendlyName(String urlFriendlyName) {
    this.urlFriendlyName = urlFriendlyName;
    return this;
  }

   /**
   * The name in a url friendly manner
   * @return urlFriendlyName
  **/
  @ApiModelProperty(value = "The name in a url friendly manner")
  public String getUrlFriendlyName() {
    return urlFriendlyName;
  }

  public void setUrlFriendlyName(String urlFriendlyName) {
    this.urlFriendlyName = urlFriendlyName;
  }

  public City resources(List<Resource> resources) {
    this.resources = resources;
    return this;
  }

  public City addResourcesItem(Resource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * List of resources available inside this city. E.g. hotels, activities, car rental offices, ...
   * @return resources
  **/
  @ApiModelProperty(value = "List of resources available inside this city. E.g. hotels, activities, car rental offices, ...")
  public List<Resource> getResources() {
    return resources;
  }

  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    City city = (City) o;
    return Objects.equals(this.resourceId, city.resourceId) &&
        Objects.equals(this.name, city.name) &&
        Objects.equals(this.urlFriendlyName, city.urlFriendlyName) &&
        Objects.equals(this.resources, city.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, name, urlFriendlyName, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class City {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlFriendlyName: ").append(toIndentedString(urlFriendlyName)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

