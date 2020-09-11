/*
 * 客服账号创建
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
 * EnterprisePersonaPersonaCreateBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:12.488989+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterprisePersonaPersonaCreateBody {
  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("role_name")
  private String roleName = null;

  public EnterprisePersonaPersonaCreateBody nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * 昵称
   * @return nickname
  **/
  @Schema(example = "小王", required = true, description = "昵称")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public EnterprisePersonaPersonaCreateBody roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * 角色名（暂未开放）
   * @return roleName
  **/
  @Schema(example = "客服", description = "角色名（暂未开放）")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterprisePersonaPersonaCreateBody body = (EnterprisePersonaPersonaCreateBody) o;
    return Objects.equals(this.nickname, body.nickname) &&
        Objects.equals(this.roleName, body.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickname, roleName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterprisePersonaPersonaCreateBody {\n");
    
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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
