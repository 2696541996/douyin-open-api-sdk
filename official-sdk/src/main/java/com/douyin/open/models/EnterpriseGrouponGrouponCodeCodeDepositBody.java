/*
 * 自定义卷码预存
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
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseGrouponGrouponCodeCodeDepositBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:30.227238+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseGrouponGrouponCodeCodeDepositBody {
  @JsonProperty("groupon_id")
  private String grouponId = null;

  @JsonProperty("codes")
  private List<String> codes = new ArrayList<>();

  @JsonProperty("discard")
  private Boolean discard = null;

  public EnterpriseGrouponGrouponCodeCodeDepositBody grouponId(String grouponId) {
    this.grouponId = grouponId;
    return this;
  }

   /**
   * 团购活动的Id
   * @return grouponId
  **/
  @Schema(example = "0da22181-d833-447f-995f-1beefea5bef3", required = true, description = "团购活动的Id")
  public String getGrouponId() {
    return grouponId;
  }

  public void setGrouponId(String grouponId) {
    this.grouponId = grouponId;
  }

  public EnterpriseGrouponGrouponCodeCodeDepositBody codes(List<String> codes) {
    this.codes = codes;
    return this;
  }

  public EnterpriseGrouponGrouponCodeCodeDepositBody addCodesItem(String codesItem) {
    this.codes.add(codesItem);
    return this;
  }

   /**
   * 券码的列表
   * @return codes
  **/
  @Schema(required = true, description = "券码的列表")
  public List<String> getCodes() {
    return codes;
  }

  public void setCodes(List<String> codes) {
    this.codes = codes;
  }

  public EnterpriseGrouponGrouponCodeCodeDepositBody discard(Boolean discard) {
    this.discard = discard;
    return this;
  }

   /**
   * 是否废弃：默认false
   * @return discard
  **/
  @Schema(example = "false", description = "是否废弃：默认false")
  public Boolean isDiscard() {
    return discard;
  }

  public void setDiscard(Boolean discard) {
    this.discard = discard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponCodeCodeDepositBody body = (EnterpriseGrouponGrouponCodeCodeDepositBody) o;
    return Objects.equals(this.grouponId, body.grouponId) &&
        Objects.equals(this.codes, body.codes) &&
        Objects.equals(this.discard, body.discard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grouponId, codes, discard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponCodeCodeDepositBody {\n");
    
    sb.append("    grouponId: ").append(toIndentedString(grouponId)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    discard: ").append(toIndentedString(discard)).append("\n");
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
