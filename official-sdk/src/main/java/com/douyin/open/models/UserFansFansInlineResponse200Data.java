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
import com.douyin.open.models.UserFansFansUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * UserFansFansInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:19.503914+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserFansFansInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("cursor")
  private Long cursor = null;

  @JsonProperty("has_more")
  private Boolean hasMore = null;

  @JsonProperty("list")
  private List<UserFansFansUser> list = null;

  @JsonProperty("total")
  private Integer total = null;

  public UserFansFansInlineResponse200Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public UserFansFansInlineResponse200Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserFansFansInlineResponse200Data cursor(Long cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @Schema(description = "")
  public Long getCursor() {
    return cursor;
  }

  public void setCursor(Long cursor) {
    this.cursor = cursor;
  }

  public UserFansFansInlineResponse200Data hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @Schema(description = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public UserFansFansInlineResponse200Data list(List<UserFansFansUser> list) {
    this.list = list;
    return this;
  }

  public UserFansFansInlineResponse200Data addListItem(UserFansFansUser listItem) {
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
  public List<UserFansFansUser> getList() {
    return list;
  }

  public void setList(List<UserFansFansUser> list) {
    this.list = list;
  }

  public UserFansFansInlineResponse200Data total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * 粉丝总数
   * @return total
  **/
  @Schema(description = "粉丝总数")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFansFansInlineResponse200Data inlineResponse200Data = (UserFansFansInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.cursor, inlineResponse200Data.cursor) &&
        Objects.equals(this.hasMore, inlineResponse200Data.hasMore) &&
        Objects.equals(this.list, inlineResponse200Data.list) &&
        Objects.equals(this.total, inlineResponse200Data.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, cursor, hasMore, list, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFansFansInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
