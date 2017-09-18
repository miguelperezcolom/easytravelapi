package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Amount;

/**
 * HolderForAnActivityDate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class HolderForAnActivityDate {
  @SerializedName("date")
  private Integer date = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("retailPrice")
  private Amount retailPrice = null;

  @SerializedName("netPrice")
  private Amount netPrice = null;

  @SerializedName("commission")
  private Amount commission = null;

  public HolderForAnActivityDate date(Integer date) {
    this.date = date;
    return this;
  }

   /**
   * Local date for the activity
   * @return date
  **/
  @ApiModelProperty(value = "Local date for the activity")
  public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public HolderForAnActivityDate time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Local time for the activity
   * @return time
  **/
  @ApiModelProperty(value = "Local time for the activity")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public HolderForAnActivityDate key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Id for this price
   * @return key
  **/
  @ApiModelProperty(value = "Id for this price")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public HolderForAnActivityDate retailPrice(Amount retailPrice) {
    this.retailPrice = retailPrice;
    return this;
  }

   /**
   * Get retailPrice
   * @return retailPrice
  **/
  @ApiModelProperty(value = "")
  public Amount getRetailPrice() {
    return retailPrice;
  }

  public void setRetailPrice(Amount retailPrice) {
    this.retailPrice = retailPrice;
  }

  public HolderForAnActivityDate netPrice(Amount netPrice) {
    this.netPrice = netPrice;
    return this;
  }

   /**
   * Get netPrice
   * @return netPrice
  **/
  @ApiModelProperty(value = "")
  public Amount getNetPrice() {
    return netPrice;
  }

  public void setNetPrice(Amount netPrice) {
    this.netPrice = netPrice;
  }

  public HolderForAnActivityDate commission(Amount commission) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HolderForAnActivityDate holderForAnActivityDate = (HolderForAnActivityDate) o;
    return Objects.equals(this.date, holderForAnActivityDate.date) &&
        Objects.equals(this.time, holderForAnActivityDate.time) &&
        Objects.equals(this.key, holderForAnActivityDate.key) &&
        Objects.equals(this.retailPrice, holderForAnActivityDate.retailPrice) &&
        Objects.equals(this.netPrice, holderForAnActivityDate.netPrice) &&
        Objects.equals(this.commission, holderForAnActivityDate.commission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, time, key, retailPrice, netPrice, commission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HolderForAnActivityDate {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    retailPrice: ").append(toIndentedString(retailPrice)).append("\n");
    sb.append("    netPrice: ").append(toIndentedString(netPrice)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
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

