package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.City;
import java.util.ArrayList;
import java.util.List;

/**
 * An state inside our portfolio. This is the second level in our product hierarchy
 */
@ApiModel(description = "An state inside our portfolio. This is the second level in our product hierarchy")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class State {
  @SerializedName("resourceId")
  private String resourceId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("urlFriendlyName")
  private String urlFriendlyName = null;

  @SerializedName("cities")
  private List<City> cities = new ArrayList<City>();

  public State resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * This state resource id
   * @return resourceId
  **/
  @ApiModelProperty(value = "This state resource id")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public State name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This state name
   * @return name
  **/
  @ApiModelProperty(value = "This state name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public State urlFriendlyName(String urlFriendlyName) {
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

  public State cities(List<City> cities) {
    this.cities = cities;
    return this;
  }

  public State addCitiesItem(City citiesItem) {
    this.cities.add(citiesItem);
    return this;
  }

   /**
   * List of cities included in this state
   * @return cities
  **/
  @ApiModelProperty(value = "List of cities included in this state")
  public List<City> getCities() {
    return cities;
  }

  public void setCities(List<City> cities) {
    this.cities = cities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.resourceId, state.resourceId) &&
        Objects.equals(this.name, state.name) &&
        Objects.equals(this.urlFriendlyName, state.urlFriendlyName) &&
        Objects.equals(this.cities, state.cities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, name, urlFriendlyName, cities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlFriendlyName: ").append(toIndentedString(urlFriendlyName)).append("\n");
    sb.append("    cities: ").append(toIndentedString(cities)).append("\n");
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

