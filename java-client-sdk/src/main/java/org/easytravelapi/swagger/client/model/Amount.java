package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * A currency - value pair
 */
@ApiModel(description = "A currency - value pair")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class Amount {
  @SerializedName("currencyIsoCode")
  private String currencyIsoCode = null;

  @SerializedName("value")
  private Double value = null;

  public Amount currencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
    return this;
  }

   /**
   * The currency ISO code
   * @return currencyIsoCode
  **/
  @ApiModelProperty(value = "The currency ISO code")
  public String getCurrencyIsoCode() {
    return currencyIsoCode;
  }

  public void setCurrencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
  }

  public Amount value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * The amount value, expressed in this currency
   * @return value
  **/
  @ApiModelProperty(value = "The amount value, expressed in this currency")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.currencyIsoCode, amount.currencyIsoCode) &&
        Objects.equals(this.value, amount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyIsoCode, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    currencyIsoCode: ").append(toIndentedString(currencyIsoCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

