/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.models;

import java.util.Objects;
import java.util.Arrays;
import com.douyin.open.models.ExternalDataUserExternalDataUserExternalUserItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ExternalDataUserExternalDataUserInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:40.426937+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataUserExternalDataUserInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("result_list")
  private List<ExternalDataUserExternalDataUserExternalUserItem> resultList = null;

  public ExternalDataUserExternalDataUserInlineResponse200Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ExternalDataUserExternalDataUserInlineResponse200Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExternalDataUserExternalDataUserInlineResponse200Data resultList(List<ExternalDataUserExternalDataUserExternalUserItem> resultList) {
    this.resultList = resultList;
    return this;
  }

  public ExternalDataUserExternalDataUserInlineResponse200Data addResultListItem(ExternalDataUserExternalDataUserExternalUserItem resultListItem) {
    if (this.resultList == null) {
      this.resultList = new ArrayList<>();
    }
    this.resultList.add(resultListItem);
    return this;
  }

   /**
   * Get resultList
   * @return resultList
  **/
  @Schema(description = "")
  public List<ExternalDataUserExternalDataUserExternalUserItem> getResultList() {
    return resultList;
  }

  public void setResultList(List<ExternalDataUserExternalDataUserExternalUserItem> resultList) {
    this.resultList = resultList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataUserExternalDataUserInlineResponse200Data inlineResponse200Data = (ExternalDataUserExternalDataUserInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.resultList, inlineResponse200Data.resultList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, resultList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataUserExternalDataUserInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
