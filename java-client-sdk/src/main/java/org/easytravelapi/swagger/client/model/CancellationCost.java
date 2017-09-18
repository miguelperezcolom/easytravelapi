package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * CancellationCost
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class CancellationCost {
  @SerializedName("retail")
  private Amount retail = null;

  @SerializedName("commission")
  private Amount commission = null;

  @SerializedName("net")
  private Amount net = null;

  @SerializedName("gmttime")
  private String gmttime = null;

  public CancellationCost retail(Amount retail) {
    this.retail = retail;
    return this;
  }

   /**
   * Get retail
   * @return retail
  **/
  @ApiModelProperty(value = "")
  public Amount getRetail() {
    return retail;
  }

  public void setRetail(Amount retail) {
    this.retail = retail;
  }

  public CancellationCost commission(Amount commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @ApiModelProperty(value = "")
  public Amount getCommission() {
    return commission;
  }

  public void setCommission(Amount commission) {
    this.commission = commission;
  }

  public CancellationCost net(Amount net) {
    this.net = net;
    return this;
  }

   /**
   * Get net
   * @return net
  **/
  @ApiModelProperty(value = "")
  public Amount getNet() {
    return net;
  }

  public void setNet(Amount net) {
    this.net = net;
  }

  public CancellationCost gmttime(String gmttime) {
    this.gmttime = gmttime;
    return this;
  }

   /**
   * Get gmttime
   * @return gmttime
  **/
  @ApiModelProperty(value = "")
  public String getGmttime() {
    return gmttime;
  }

  public void setGmttime(String gmttime) {
    this.gmttime = gmttime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationCost cancellationCost = (CancellationCost) o;
    return Objects.equals(this.retail, cancellationCost.retail) &&
        Objects.equals(this.commission, cancellationCost.commission) &&
        Objects.equals(this.net, cancellationCost.net) &&
        Objects.equals(this.gmttime, cancellationCost.gmttime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retail, commission, net, gmttime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationCost {\n");
    
    sb.append("    retail: ").append(toIndentedString(retail)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    gmttime: ").append(toIndentedString(gmttime)).append("\n");
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

