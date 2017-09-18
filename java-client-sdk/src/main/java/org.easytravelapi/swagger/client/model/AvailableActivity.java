package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.HolderForAnActivityDate;
import java.util.ArrayList;
import java.util.List;

/**
 * An available activity
 */
@ApiModel(description = "An available activity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class AvailableActivity {
  @SerializedName("activityId")
  private String activityId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("availableDates")
  private List<HolderForAnActivityDate> availableDates = new ArrayList<HolderForAnActivityDate>();

  public AvailableActivity activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * This activity ID
   * @return activityId
  **/
  @ApiModelProperty(value = "This activity ID")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public AvailableActivity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this activity. Usually multi-language
   * @return name
  **/
  @ApiModelProperty(value = "The name of this activity. Usually multi-language")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AvailableActivity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of this activity. Usually multi-language
   * @return description
  **/
  @ApiModelProperty(value = "The description of this activity. Usually multi-language")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AvailableActivity image(String image) {
    this.image = image;
    return this;
  }

   /**
   * The main image for this activity
   * @return image
  **/
  @ApiModelProperty(value = "The main image for this activity")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public AvailableActivity availableDates(List<HolderForAnActivityDate> availableDates) {
    this.availableDates = availableDates;
    return this;
  }

  public AvailableActivity addAvailableDatesItem(HolderForAnActivityDate availableDatesItem) {
    this.availableDates.add(availableDatesItem);
    return this;
  }

   /**
   * List of available dates (and hours) for this activity. Here you will find prices
   * @return availableDates
  **/
  @ApiModelProperty(value = "List of available dates (and hours) for this activity. Here you will find prices")
  public List<HolderForAnActivityDate> getAvailableDates() {
    return availableDates;
  }

  public void setAvailableDates(List<HolderForAnActivityDate> availableDates) {
    this.availableDates = availableDates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableActivity availableActivity = (AvailableActivity) o;
    return Objects.equals(this.activityId, availableActivity.activityId) &&
        Objects.equals(this.name, availableActivity.name) &&
        Objects.equals(this.description, availableActivity.description) &&
        Objects.equals(this.image, availableActivity.image) &&
        Objects.equals(this.availableDates, availableActivity.availableDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, name, description, image, availableDates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableActivity {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    availableDates: ").append(toIndentedString(availableDates)).append("\n");
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

