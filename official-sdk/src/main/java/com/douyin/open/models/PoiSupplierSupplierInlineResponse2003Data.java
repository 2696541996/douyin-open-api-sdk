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
import com.douyin.open.models.PoiSupplierSupplierMatchResultData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PoiSupplierSupplierInlineResponse2003Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiSupplierSupplierInlineResponse2003Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("match_result_list")
  private List<PoiSupplierSupplierMatchResultData> matchResultList = new ArrayList<>();

  public PoiSupplierSupplierInlineResponse2003Data errorCode(Integer errorCode) {
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

  public PoiSupplierSupplierInlineResponse2003Data description(String description) {
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

  public PoiSupplierSupplierInlineResponse2003Data matchResultList(List<PoiSupplierSupplierMatchResultData> matchResultList) {
    this.matchResultList = matchResultList;
    return this;
  }

  public PoiSupplierSupplierInlineResponse2003Data addMatchResultListItem(PoiSupplierSupplierMatchResultData matchResultListItem) {
    this.matchResultList.add(matchResultListItem);
    return this;
  }

   /**
   * 匹配的结果
   * @return matchResultList
  **/
  @Schema(required = true, description = "匹配的结果")
  public List<PoiSupplierSupplierMatchResultData> getMatchResultList() {
    return matchResultList;
  }

  public void setMatchResultList(List<PoiSupplierSupplierMatchResultData> matchResultList) {
    this.matchResultList = matchResultList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierInlineResponse2003Data inlineResponse2003Data = (PoiSupplierSupplierInlineResponse2003Data) o;
    return Objects.equals(this.errorCode, inlineResponse2003Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2003Data.description) &&
        Objects.equals(this.matchResultList, inlineResponse2003Data.matchResultList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, matchResultList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierInlineResponse2003Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    matchResultList: ").append(toIndentedString(matchResultList)).append("\n");
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
