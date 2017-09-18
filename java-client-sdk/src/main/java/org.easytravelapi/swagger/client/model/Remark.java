package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A remoark is some important information which 
 */
@ApiModel(description = "A remoark is some important information which ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class Remark {
  @SerializedName("type")
  private String type = null;

  @SerializedName("text")
  private String text = null;

  public Remark type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of remark. Possible values are IMPORTANT, NORMAL
   * @return type
  **/
  @ApiModelProperty(value = "Type of remark. Possible values are IMPORTANT, NORMAL")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Remark text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text which should be visible for the customer
   * @return text
  **/
  @ApiModelProperty(value = "Text which should be visible for the customer")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Remark remark = (Remark) o;
    return Objects.equals(this.type, remark.type) &&
        Objects.equals(this.text, remark.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Remark {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

