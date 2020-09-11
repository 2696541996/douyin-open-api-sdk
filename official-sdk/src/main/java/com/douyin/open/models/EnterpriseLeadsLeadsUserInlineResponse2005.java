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
import com.douyin.open.models.EnterpriseLeadsLeadsUserExtraBody;
import com.douyin.open.models.EnterpriseLeadsLeadsUserInlineResponse2005Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnterpriseLeadsLeadsUserInlineResponse2005
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:36.469880+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseLeadsLeadsUserInlineResponse2005 {
  @JsonProperty("extra")
  private EnterpriseLeadsLeadsUserExtraBody extra = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("data")
  private EnterpriseLeadsLeadsUserInlineResponse2005Data data = null;

  public EnterpriseLeadsLeadsUserInlineResponse2005 extra(EnterpriseLeadsLeadsUserExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public EnterpriseLeadsLeadsUserExtraBody getExtra() {
    return extra;
  }

  public void setExtra(EnterpriseLeadsLeadsUserExtraBody extra) {
    this.extra = extra;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2005 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(example = "success", description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public EnterpriseLeadsLeadsUserInlineResponse2005 data(EnterpriseLeadsLeadsUserInlineResponse2005Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public EnterpriseLeadsLeadsUserInlineResponse2005Data getData() {
    return data;
  }

  public void setData(EnterpriseLeadsLeadsUserInlineResponse2005Data data) {
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
    EnterpriseLeadsLeadsUserInlineResponse2005 inlineResponse2005 = (EnterpriseLeadsLeadsUserInlineResponse2005) o;
    return Objects.equals(this.extra, inlineResponse2005.extra) &&
        Objects.equals(this.message, inlineResponse2005.message) &&
        Objects.equals(this.data, inlineResponse2005.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, message, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseLeadsLeadsUserInlineResponse2005 {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
