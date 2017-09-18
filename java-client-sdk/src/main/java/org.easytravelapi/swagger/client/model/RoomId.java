package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Room data to be used by the channel manager
 */
@ApiModel(description = "Room data to be used by the channel manager")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class RoomId {
  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  public RoomId id(String id) {
    this.id = id;
    return this;
  }

   /**
   * This room id
   * @return id
  **/
  @ApiModelProperty(value = "This room id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RoomId description(String description) {
    this.description = description;
    return this;
  }

   /**
   * This room description
   * @return description
  **/
  @ApiModelProperty(value = "This room description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomId roomId = (RoomId) o;
    return Objects.equals(this.id, roomId.id) &&
        Objects.equals(this.description, roomId.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomId {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

