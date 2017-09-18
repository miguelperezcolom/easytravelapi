package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Option;
import java.util.ArrayList;
import java.util.List;

/**
 * An available hotel, including prices
 */
@ApiModel(description = "An available hotel, including prices")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class AvailableHotel {
  @SerializedName("hotelId")
  private String hotelId = null;

  @SerializedName("hotelName")
  private String hotelName = null;

  @SerializedName("hotelCategoryId")
  private String hotelCategoryId = null;

  @SerializedName("hotelCategoryName")
  private String hotelCategoryName = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("options")
  private List<Option> options = new ArrayList<Option>();

  public AvailableHotel hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

   /**
   * The hotel id
   * @return hotelId
  **/
  @ApiModelProperty(value = "The hotel id")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public AvailableHotel hotelName(String hotelName) {
    this.hotelName = hotelName;
    return this;
  }

   /**
   * The hotel name
   * @return hotelName
  **/
  @ApiModelProperty(value = "The hotel name")
  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public AvailableHotel hotelCategoryId(String hotelCategoryId) {
    this.hotelCategoryId = hotelCategoryId;
    return this;
  }

   /**
   * The hotel category id
   * @return hotelCategoryId
  **/
  @ApiModelProperty(value = "The hotel category id")
  public String getHotelCategoryId() {
    return hotelCategoryId;
  }

  public void setHotelCategoryId(String hotelCategoryId) {
    this.hotelCategoryId = hotelCategoryId;
  }

  public AvailableHotel hotelCategoryName(String hotelCategoryName) {
    this.hotelCategoryName = hotelCategoryName;
    return this;
  }

   /**
   * The hotel category name
   * @return hotelCategoryName
  **/
  @ApiModelProperty(value = "The hotel category name")
  public String getHotelCategoryName() {
    return hotelCategoryName;
  }

  public void setHotelCategoryName(String hotelCategoryName) {
    this.hotelCategoryName = hotelCategoryName;
  }

  public AvailableHotel longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Google longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "Google longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public AvailableHotel latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Google latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "Google latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public AvailableHotel options(List<Option> options) {
    this.options = options;
    return this;
  }

  public AvailableHotel addOptionsItem(Option optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * List of available options
   * @return options
  **/
  @ApiModelProperty(value = "List of available options")
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableHotel availableHotel = (AvailableHotel) o;
    return Objects.equals(this.hotelId, availableHotel.hotelId) &&
        Objects.equals(this.hotelName, availableHotel.hotelName) &&
        Objects.equals(this.hotelCategoryId, availableHotel.hotelCategoryId) &&
        Objects.equals(this.hotelCategoryName, availableHotel.hotelCategoryName) &&
        Objects.equals(this.longitude, availableHotel.longitude) &&
        Objects.equals(this.latitude, availableHotel.latitude) &&
        Objects.equals(this.options, availableHotel.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelId, hotelName, hotelCategoryId, hotelCategoryName, longitude, latitude, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableHotel {\n");
    
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    hotelName: ").append(toIndentedString(hotelName)).append("\n");
    sb.append("    hotelCategoryId: ").append(toIndentedString(hotelCategoryId)).append("\n");
    sb.append("    hotelCategoryName: ").append(toIndentedString(hotelCategoryName)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

