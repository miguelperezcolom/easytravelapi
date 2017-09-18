package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A country inside our portfolio. The first level in our product hierarchy
 */
@ApiModel(description = "A country inside our portfolio. The first level in our product hierarchy")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class Country {
  @SerializedName("resourceId")
  private String resourceId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("urlFriendlyName")
  private String urlFriendlyName = null;

  @SerializedName("states")
  private List<State> states = new ArrayList<State>();

  public Country resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * This country resource id
   * @return resourceId
  **/
  @ApiModelProperty(value = "This country resource id")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public Country name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This country name
   * @return name
  **/
  @ApiModelProperty(value = "This country name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Country urlFriendlyName(String urlFriendlyName) {
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

  public Country states(List<State> states) {
    this.states = states;
    return this;
  }

  public Country addStatesItem(State statesItem) {
    this.states.add(statesItem);
    return this;
  }

   /**
   * List of contained states
   * @return states
  **/
  @ApiModelProperty(value = "List of contained states")
  public List<State> getStates() {
    return states;
  }

  public void setStates(List<State> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.resourceId, country.resourceId) &&
        Objects.equals(this.name, country.name) &&
        Objects.equals(this.urlFriendlyName, country.urlFriendlyName) &&
        Objects.equals(this.states, country.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, name, urlFriendlyName, states);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlFriendlyName: ").append(toIndentedString(urlFriendlyName)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

