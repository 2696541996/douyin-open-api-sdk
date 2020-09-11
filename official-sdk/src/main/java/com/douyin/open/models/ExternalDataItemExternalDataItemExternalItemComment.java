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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ExternalDataItemExternalDataItemExternalItemComment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:48.688040+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataItemExternalDataItemExternalItemComment {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("comment")
  private Integer comment = null;

  public ExternalDataItemExternalDataItemExternalItemComment date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  @Schema(example = "yyyy-MM-dd", description = "日期")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExternalDataItemExternalDataItemExternalItemComment comment(Integer comment) {
    this.comment = comment;
    return this;
  }

   /**
   * 每日评论数
   * @return comment
  **/
  @Schema(example = "200", description = "每日评论数")
  public Integer getComment() {
    return comment;
  }

  public void setComment(Integer comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataItemExternalDataItemExternalItemComment externalItemComment = (ExternalDataItemExternalDataItemExternalItemComment) o;
    return Objects.equals(this.date, externalItemComment.date) &&
        Objects.equals(this.comment, externalItemComment.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataItemExternalDataItemExternalItemComment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
