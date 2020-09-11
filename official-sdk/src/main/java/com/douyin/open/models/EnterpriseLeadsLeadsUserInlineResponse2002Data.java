/*
 * 企业号意向用户管理
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
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse2002DataList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseLeadsLeadsUserInlineResponse2002Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:36.469880+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseLeadsLeadsUserInlineResponse2002Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("has_more")
  private Boolean hasMore = null;

  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("list")
  private List<EnterpriseLeadsLeadsUserInlineResponse2002DataList> list = null;

  public EnterpriseLeadsLeadsUserInlineResponse2002Data errorCode(Integer errorCode) {
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

  public EnterpriseLeadsLeadsUserInlineResponse2002Data description(String description) {
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

  public EnterpriseLeadsLeadsUserInlineResponse2002Data hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @Schema(required = true, description = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2002Data cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @Schema(required = true, description = "")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2002Data list(List<EnterpriseLeadsLeadsUserInlineResponse2002DataList> list) {
    this.list = list;
    return this;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2002Data addListItem(EnterpriseLeadsLeadsUserInlineResponse2002DataList listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Schema(description = "")
  public List<EnterpriseLeadsLeadsUserInlineResponse2002DataList> getList() {
    return list;
  }

  public void setList(List<EnterpriseLeadsLeadsUserInlineResponse2002DataList> list) {
    this.list = list;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseLeadsLeadsUserInlineResponse2002Data inlineResponse2002Data = (EnterpriseLeadsLeadsUserInlineResponse2002Data) o;
    return Objects.equals(this.errorCode, inlineResponse2002Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2002Data.description) &&
        Objects.equals(this.hasMore, inlineResponse2002Data.hasMore) &&
        Objects.equals(this.cursor, inlineResponse2002Data.cursor) &&
        Objects.equals(this.list, inlineResponse2002Data.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, hasMore, cursor, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsLeadsUserInlineResponse2002Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
