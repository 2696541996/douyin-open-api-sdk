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
 * PoiSupplierSupplierMatchResultData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiSupplierSupplierMatchResultData {
  @JsonProperty("supplier_ext_id")
  private String supplierExtId = null;

  @JsonProperty("poi_id")
  private String poiId = null;

  @JsonProperty("poi_name")
  private String poiName = null;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("address")
  private String address = null;

  /**
   * 匹配状态，0-等待匹配，1-正在匹配，2-匹配成功，3-匹配失败
   */
  public enum MatchStatusEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3);

    private Integer value;

    MatchStatusEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static MatchStatusEnum fromValue(String text) {
      for (MatchStatusEnum b : MatchStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("match_status")
  private MatchStatusEnum matchStatus = null;

  @JsonProperty("match_status_desc")
  private String matchStatusDesc = null;

  public PoiSupplierSupplierMatchResultData supplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
    return this;
  }

   /**
   * 第三方商户ID
   * @return supplierExtId
  **/
  @Schema(required = true, description = "第三方商户ID")
  public String getSupplierExtId() {
    return supplierExtId;
  }

  public void setSupplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
  }

  public PoiSupplierSupplierMatchResultData poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * 抖音POI ID
   * @return poiId
  **/
  @Schema(required = true, description = "抖音POI ID")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public PoiSupplierSupplierMatchResultData poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * POI名称
   * @return poiName
  **/
  @Schema(required = true, description = "POI名称")
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public PoiSupplierSupplierMatchResultData province(String province) {
    this.province = province;
    return this;
  }

   /**
   * POI所在省份
   * @return province
  **/
  @Schema(required = true, description = "POI所在省份")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public PoiSupplierSupplierMatchResultData city(String city) {
    this.city = city;
    return this;
  }

   /**
   * POI所在城市
   * @return city
  **/
  @Schema(required = true, description = "POI所在城市")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PoiSupplierSupplierMatchResultData address(String address) {
    this.address = address;
    return this;
  }

   /**
   * POI地址
   * @return address
  **/
  @Schema(required = true, description = "POI地址")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PoiSupplierSupplierMatchResultData matchStatus(MatchStatusEnum matchStatus) {
    this.matchStatus = matchStatus;
    return this;
  }

   /**
   * 匹配状态，0-等待匹配，1-正在匹配，2-匹配成功，3-匹配失败
   * @return matchStatus
  **/
  @Schema(required = true, description = "匹配状态，0-等待匹配，1-正在匹配，2-匹配成功，3-匹配失败")
  public MatchStatusEnum getMatchStatus() {
    return matchStatus;
  }

  public void setMatchStatus(MatchStatusEnum matchStatus) {
    this.matchStatus = matchStatus;
  }

  public PoiSupplierSupplierMatchResultData matchStatusDesc(String matchStatusDesc) {
    this.matchStatusDesc = matchStatusDesc;
    return this;
  }

   /**
   * 匹配状态描述
   * @return matchStatusDesc
  **/
  @Schema(required = true, description = "匹配状态描述")
  public String getMatchStatusDesc() {
    return matchStatusDesc;
  }

  public void setMatchStatusDesc(String matchStatusDesc) {
    this.matchStatusDesc = matchStatusDesc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierMatchResultData matchResultData = (PoiSupplierSupplierMatchResultData) o;
    return Objects.equals(this.supplierExtId, matchResultData.supplierExtId) &&
        Objects.equals(this.poiId, matchResultData.poiId) &&
        Objects.equals(this.poiName, matchResultData.poiName) &&
        Objects.equals(this.province, matchResultData.province) &&
        Objects.equals(this.city, matchResultData.city) &&
        Objects.equals(this.address, matchResultData.address) &&
        Objects.equals(this.matchStatus, matchResultData.matchStatus) &&
        Objects.equals(this.matchStatusDesc, matchResultData.matchStatusDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierExtId, poiId, poiName, province, city, address, matchStatus, matchStatusDesc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierMatchResultData {\n");
    
    sb.append("    supplierExtId: ").append(toIndentedString(supplierExtId)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    matchStatus: ").append(toIndentedString(matchStatus)).append("\n");
    sb.append("    matchStatusDesc: ").append(toIndentedString(matchStatusDesc)).append("\n");
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
