package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Container for the confirm services request
 */
@ApiModel(description = "Container for the confirm services request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class ConfirmServicesRQ {
  @SerializedName("serviceConfirmations")
  private List<ServiceConfirmation> serviceConfirmations = new ArrayList<ServiceConfirmation>();

  public ConfirmServicesRQ serviceConfirmations(List<ServiceConfirmation> serviceConfirmations) {
    this.serviceConfirmations = serviceConfirmations;
    return this;
  }

  public ConfirmServicesRQ addServiceConfirmationsItem(ServiceConfirmation serviceConfirmationsItem) {
    this.serviceConfirmations.add(serviceConfirmationsItem);
    return this;
  }

   /**
   * List of service confirmations (or rejections)
   * @return serviceConfirmations
  **/
  @ApiModelProperty(value = "List of service confirmations (or rejections)")
  public List<ServiceConfirmation> getServiceConfirmations() {
    return serviceConfirmations;
  }

  public void setServiceConfirmations(List<ServiceConfirmation> serviceConfirmations) {
    this.serviceConfirmations = serviceConfirmations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmServicesRQ confirmServicesRQ = (ConfirmServicesRQ) o;
    return Objects.equals(this.serviceConfirmations, confirmServicesRQ.serviceConfirmations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceConfirmations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmServicesRQ {\n");
    
    sb.append("    serviceConfirmations: ").append(toIndentedString(serviceConfirmations)).append("\n");
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

