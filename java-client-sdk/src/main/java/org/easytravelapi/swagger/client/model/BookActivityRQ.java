package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Parameters needed to confirm an activity booking
 */
@ApiModel(description = "Parameters needed to confirm an activity booking")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class BookActivityRQ {
  @SerializedName("key")
  private String key = null;

  @SerializedName("leadName")
  private String leadName = null;

  @SerializedName("commentsToProvider")
  private String commentsToProvider = null;

  @SerializedName("privateComments")
  private String privateComments = null;

  public BookActivityRQ key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The activity price key, as provided in the /activities/getavailable step
   * @return key
  **/
  @ApiModelProperty(value = "The activity price key, as provided in the /activities/getavailable step")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BookActivityRQ leadName(String leadName) {
    this.leadName = leadName;
    return this;
  }

   /**
   * The lead name
   * @return leadName
  **/
  @ApiModelProperty(value = "The lead name")
  public String getLeadName() {
    return leadName;
  }

  public void setLeadName(String leadName) {
    this.leadName = leadName;
  }

  public BookActivityRQ commentsToProvider(String commentsToProvider) {
    this.commentsToProvider = commentsToProvider;
    return this;
  }

   /**
   * Comments from the customer which should arrive to the activity provider
   * @return commentsToProvider
  **/
  @ApiModelProperty(value = "Comments from the customer which should arrive to the activity provider")
  public String getCommentsToProvider() {
    return commentsToProvider;
  }

  public void setCommentsToProvider(String commentsToProvider) {
    this.commentsToProvider = commentsToProvider;
  }

  public BookActivityRQ privateComments(String privateComments) {
    this.privateComments = privateComments;
    return this;
  }

   /**
   * Your comments for us. They will not be visible to the customer neither to the activity provider
   * @return privateComments
  **/
  @ApiModelProperty(value = "Your comments for us. They will not be visible to the customer neither to the activity provider")
  public String getPrivateComments() {
    return privateComments;
  }

  public void setPrivateComments(String privateComments) {
    this.privateComments = privateComments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookActivityRQ bookActivityRQ = (BookActivityRQ) o;
    return Objects.equals(this.key, bookActivityRQ.key) &&
        Objects.equals(this.leadName, bookActivityRQ.leadName) &&
        Objects.equals(this.commentsToProvider, bookActivityRQ.commentsToProvider) &&
        Objects.equals(this.privateComments, bookActivityRQ.privateComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, leadName, commentsToProvider, privateComments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookActivityRQ {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    leadName: ").append(toIndentedString(leadName)).append("\n");
    sb.append("    commentsToProvider: ").append(toIndentedString(commentsToProvider)).append("\n");
    sb.append("    privateComments: ").append(toIndentedString(privateComments)).append("\n");
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

