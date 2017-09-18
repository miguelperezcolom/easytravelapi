package org.easytravelapi.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Container for the update request parameters
 */
@ApiModel(description = "Container for the update request parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-18T08:43:59.135Z")
public class UpdateRQ {
  @SerializedName("operations")
  private List<UpdateOperation> operations = new ArrayList<UpdateOperation>();

  public UpdateRQ operations(List<UpdateOperation> operations) {
    this.operations = operations;
    return this;
  }

  public UpdateRQ addOperationsItem(UpdateOperation operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * List of operations you want to perform on hote inventories
   * @return operations
  **/
  @ApiModelProperty(value = "List of operations you want to perform on hote inventories")
  public List<UpdateOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<UpdateOperation> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRQ updateRQ = (UpdateRQ) o;
    return Objects.equals(this.operations, updateRQ.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRQ {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

