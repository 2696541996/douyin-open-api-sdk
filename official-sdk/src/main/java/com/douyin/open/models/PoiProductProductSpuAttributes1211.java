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
 * 出行提示
 */
@Schema(description = "出行提示")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiProductProductSpuAttributes1211 {
  @JsonProperty("check_in_time")
  private String checkInTime = null;

  @JsonProperty("check_out_time")
  private String checkOutTime = null;

  @JsonProperty("extra")
  private String extra = null;

  public PoiProductProductSpuAttributes1211 checkInTime(String checkInTime) {
    this.checkInTime = checkInTime;
    return this;
  }

   /**
   * 入住时间(HH:mm)
   * @return checkInTime
  **/
  @Schema(example = "12:00", required = true, description = "入住时间(HH:mm)")
  public String getCheckInTime() {
    return checkInTime;
  }

  public void setCheckInTime(String checkInTime) {
    this.checkInTime = checkInTime;
  }

  public PoiProductProductSpuAttributes1211 checkOutTime(String checkOutTime) {
    this.checkOutTime = checkOutTime;
    return this;
  }

   /**
   * 离店时间(HH:mm)
   * @return checkOutTime
  **/
  @Schema(example = "12:00", required = true, description = "离店时间(HH:mm)")
  public String getCheckOutTime() {
    return checkOutTime;
  }

  public void setCheckOutTime(String checkOutTime) {
    this.checkOutTime = checkOutTime;
  }

  public PoiProductProductSpuAttributes1211 extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * 出行提示自定义内容
   * @return extra
  **/
  @Schema(description = "出行提示自定义内容")
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
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
    PoiProductProductSpuAttributes1211 spuAttributes1211 = (PoiProductProductSpuAttributes1211) o;
    return Objects.equals(this.checkInTime, spuAttributes1211.checkInTime) &&
        Objects.equals(this.checkOutTime, spuAttributes1211.checkOutTime) &&
        Objects.equals(this.extra, spuAttributes1211.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInTime, checkOutTime, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSpuAttributes1211 {\n");
    
    sb.append("    checkInTime: ").append(toIndentedString(checkInTime)).append("\n");
    sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
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
