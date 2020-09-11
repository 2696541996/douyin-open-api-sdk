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
import com.douyin.open.models.VideoCreateAwemeCreateExtra;
import com.douyin.open.models.VideoCreateAwemeCreateInlineResponse200Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * VideoCreateAwemeCreateInlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-19T14:21:48.922886+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class VideoCreateAwemeCreateInlineResponse200 {
  @JsonProperty("data")
  private VideoCreateAwemeCreateInlineResponse200Data data = null;

  @JsonProperty("extra")
  private VideoCreateAwemeCreateExtra extra = null;

  public VideoCreateAwemeCreateInlineResponse200 data(VideoCreateAwemeCreateInlineResponse200Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public VideoCreateAwemeCreateInlineResponse200Data getData() {
    return data;
  }

  public void setData(VideoCreateAwemeCreateInlineResponse200Data data) {
    this.data = data;
  }

  public VideoCreateAwemeCreateInlineResponse200 extra(VideoCreateAwemeCreateExtra extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public VideoCreateAwemeCreateExtra getExtra() {
    return extra;
  }

  public void setExtra(VideoCreateAwemeCreateExtra extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoCreateAwemeCreateInlineResponse200 inlineResponse200 = (VideoCreateAwemeCreateInlineResponse200) o;
    return Objects.equals(this.data, inlineResponse200.data) &&
        Objects.equals(this.extra, inlineResponse200.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCreateAwemeCreateInlineResponse200 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
