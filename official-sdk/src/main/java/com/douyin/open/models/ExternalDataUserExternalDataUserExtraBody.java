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
 * ExternalDataUserExternalDataUserExtraBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:40.426937+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataUserExternalDataUserExtraBody {
  @JsonProperty("logid")
  private String logid = null;

  @JsonProperty("now")
  private Long now = null;

  public ExternalDataUserExternalDataUserExtraBody logid(String logid) {
    this.logid = logid;
    return this;
  }

   /**
   * 标识请求的唯一id
   * @return logid
  **/
  @Schema(example = "202008121419360101980821035705926A", description = "标识请求的唯一id")
  public String getLogid() {
    return logid;
  }

  public void setLogid(String logid) {
    this.logid = logid;
  }

  public ExternalDataUserExternalDataUserExtraBody now(Long now) {
    this.now = now;
    return this;
  }

   /**
   * 毫秒级时间戳
   * @return now
  **/
  @Schema(example = "1597213176393", description = "毫秒级时间戳")
  public Long getNow() {
    return now;
  }

  public void setNow(Long now) {
    this.now = now;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataUserExternalDataUserExtraBody extraBody = (ExternalDataUserExternalDataUserExtraBody) o;
    return Objects.equals(this.logid, extraBody.logid) &&
        Objects.equals(this.now, extraBody.now);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logid, now);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataUserExternalDataUserExtraBody {\n");
    
    sb.append("    logid: ").append(toIndentedString(logid)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
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
