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
import com.douyin.open.models.ExternalDataPoiExternalDataPoiExternalPoiUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ExternalDataPoiExternalDataPoiInlineResponse2001Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:15.723137+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataPoiExternalDataPoiInlineResponse2001Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("gender_list")
  private List<ExternalDataPoiExternalDataPoiExternalPoiUser> genderList = null;

  @JsonProperty("age_list")
  private List<ExternalDataPoiExternalDataPoiExternalPoiUser> ageList = null;

  @JsonProperty("city_list")
  private List<ExternalDataPoiExternalDataPoiExternalPoiUser> cityList = null;

  public ExternalDataPoiExternalDataPoiInlineResponse2001Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2001Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2001Data genderList(List<ExternalDataPoiExternalDataPoiExternalPoiUser> genderList) {
    this.genderList = genderList;
    return this;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2001Data addGenderListItem(ExternalDataPoiExternalDataPoiExternalPoiUser genderListItem) {
    if (this.genderList == null) {
      this.genderList = new ArrayList<>();
    }
    this.genderList.add(genderListItem);
    return this;
  }

   /**
   * Get genderList
   * @return genderList
  **/
  @Schema(description = "")
  public List<ExternalDataPoiExternalDataPoiExternalPoiUser> getGenderList() {
    return genderList;
  }

  public void setGenderList(List<ExternalDataPoiExternalDataPoiExternalPoiUser> genderList) {
    this.genderList = genderList;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2001Data ageList(List<ExternalDataPoiExternalDataPoiExternalPoiUser> ageList) {
    this.ageList = ageList;
    return this;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2001Data addAgeListItem(ExternalDataPoiExternalDataPoiExternalPoiUser ageListItem) {
    if (this.ageList == null) {
      this.ageList = new ArrayList<>();
    }
    this.ageList.add(ageListItem);
    return this;
  }

   /**
   * Get ageList
   * @return ageList
  **/
  @Schema(description = "")
  public List<ExternalDataPoiExternalDataPoiExternalPoiUser> getAgeList() {
    return ageList;
  }

  public void setAgeList(List<ExternalDataPoiExternalDataPoiExternalPoiUser> ageList) {
    this.ageList = ageList;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2001Data cityList(List<ExternalDataPoiExternalDataPoiExternalPoiUser> cityList) {
    this.cityList = cityList;
    return this;
  }

  public ExternalDataPoiExternalDataPoiInlineResponse2001Data addCityListItem(ExternalDataPoiExternalDataPoiExternalPoiUser cityListItem) {
    if (this.cityList == null) {
      this.cityList = new ArrayList<>();
    }
    this.cityList.add(cityListItem);
    return this;
  }

   /**
   * Get cityList
   * @return cityList
  **/
  @Schema(description = "")
  public List<ExternalDataPoiExternalDataPoiExternalPoiUser> getCityList() {
    return cityList;
  }

  public void setCityList(List<ExternalDataPoiExternalDataPoiExternalPoiUser> cityList) {
    this.cityList = cityList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataPoiExternalDataPoiInlineResponse2001Data inlineResponse2001Data = (ExternalDataPoiExternalDataPoiInlineResponse2001Data) o;
    return Objects.equals(this.errorCode, inlineResponse2001Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2001Data.description) &&
        Objects.equals(this.genderList, inlineResponse2001Data.genderList) &&
        Objects.equals(this.ageList, inlineResponse2001Data.ageList) &&
        Objects.equals(this.cityList, inlineResponse2001Data.cityList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, genderList, ageList, cityList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataPoiExternalDataPoiInlineResponse2001Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    genderList: ").append(toIndentedString(genderList)).append("\n");
    sb.append("    ageList: ").append(toIndentedString(ageList)).append("\n");
    sb.append("    cityList: ").append(toIndentedString(cityList)).append("\n");
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
