package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An available room combination the fits your occcupation
 */
@ApiModel(description = "An available room combination the fits your occcupation")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class Option {
  @SerializedName("distribution")
  private List<Allocation> distribution = new ArrayList<Allocation>();

  public Option distribution(List<Allocation> distribution) {
    this.distribution = distribution;
    return this;
  }

  public Option addDistributionItem(Allocation distributionItem) {
    this.distribution.add(distributionItem);
    return this;
  }

   /**
   * A list of occupations (pax - room pairs)
   * @return distribution
  **/
  @ApiModelProperty(value = "A list of occupations (pax - room pairs)")
  public List<Allocation> getDistribution() {
    return distribution;
  }

  public void setDistribution(List<Allocation> distribution) {
    this.distribution = distribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Option option = (Option) o;
    return Objects.equals(this.distribution, option.distribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distribution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Option {\n");
    
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
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

