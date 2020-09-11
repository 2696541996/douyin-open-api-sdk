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
 * ExternalDataPoiExternalDataPoiExternalPoiBillboard
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:15.723137+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataPoiExternalDataPoiExternalPoiBillboard {
  @JsonProperty("poi_id")
  private String poiId = null;

  @JsonProperty("poi_name")
  private String poiName = null;

  @JsonProperty("score")
  private String score = null;

  @JsonProperty("rank")
  private Integer rank = null;

  public ExternalDataPoiExternalDataPoiExternalPoiBillboard poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * poi id
   * @return poiId
  **/
  @Schema(description = "poi id")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public ExternalDataPoiExternalDataPoiExternalPoiBillboard poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * poi名称
   * @return poiName
  **/
  @Schema(description = "poi名称")
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public ExternalDataPoiExternalDataPoiExternalPoiBillboard score(String score) {
    this.score = score;
    return this;
  }

   /**
   * 得分
   * @return score
  **/
  @Schema(description = "得分")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public ExternalDataPoiExternalDataPoiExternalPoiBillboard rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * 排名
   * @return rank
  **/
  @Schema(description = "排名")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataPoiExternalDataPoiExternalPoiBillboard externalPoiBillboard = (ExternalDataPoiExternalDataPoiExternalPoiBillboard) o;
    return Objects.equals(this.poiId, externalPoiBillboard.poiId) &&
        Objects.equals(this.poiName, externalPoiBillboard.poiName) &&
        Objects.equals(this.score, externalPoiBillboard.score) &&
        Objects.equals(this.rank, externalPoiBillboard.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiId, poiName, score, rank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataPoiExternalDataPoiExternalPoiBillboard {\n");
    
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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
