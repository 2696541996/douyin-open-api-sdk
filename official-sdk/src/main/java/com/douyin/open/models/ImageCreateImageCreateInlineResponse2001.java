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
import com.douyin.open.models.ImageCreateImageCreateExtraBody;
import com.douyin.open.models.ImageCreateImageCreateInlineResponse2001Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ImageCreateImageCreateInlineResponse2001
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:03:50.245158+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ImageCreateImageCreateInlineResponse2001 {
  @JsonProperty("extra")
  private ImageCreateImageCreateExtraBody extra = null;

  @JsonProperty("data")
  private ImageCreateImageCreateInlineResponse2001Data data = null;

  public ImageCreateImageCreateInlineResponse2001 extra(ImageCreateImageCreateExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public ImageCreateImageCreateExtraBody getExtra() {
    return extra;
  }

  public void setExtra(ImageCreateImageCreateExtraBody extra) {
    this.extra = extra;
  }

  public ImageCreateImageCreateInlineResponse2001 data(ImageCreateImageCreateInlineResponse2001Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public ImageCreateImageCreateInlineResponse2001Data getData() {
    return data;
  }

  public void setData(ImageCreateImageCreateInlineResponse2001Data data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageCreateImageCreateInlineResponse2001 inlineResponse2001 = (ImageCreateImageCreateInlineResponse2001) o;
    return Objects.equals(this.extra, inlineResponse2001.extra) &&
        Objects.equals(this.data, inlineResponse2001.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageCreateImageCreateInlineResponse2001 {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
