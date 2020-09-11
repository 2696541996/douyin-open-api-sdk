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
 * ExternalDataItemExternalDataItemExternalItemBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:48.688040+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ExternalDataItemExternalDataItemExternalItemBase {
  @JsonProperty("total_play")
  private Integer totalPlay = null;

  @JsonProperty("total_like")
  private Integer totalLike = null;

  @JsonProperty("total_comment")
  private Integer totalComment = null;

  @JsonProperty("total_share")
  private Integer totalShare = null;

  @JsonProperty("avg_play_duration")
  private Double avgPlayDuration = null;

  public ExternalDataItemExternalDataItemExternalItemBase totalPlay(Integer totalPlay) {
    this.totalPlay = totalPlay;
    return this;
  }

   /**
   * 30天播放次数
   * @return totalPlay
  **/
  @Schema(example = "200", description = "30天播放次数")
  public Integer getTotalPlay() {
    return totalPlay;
  }

  public void setTotalPlay(Integer totalPlay) {
    this.totalPlay = totalPlay;
  }

  public ExternalDataItemExternalDataItemExternalItemBase totalLike(Integer totalLike) {
    this.totalLike = totalLike;
    return this;
  }

   /**
   * 30天点赞数
   * @return totalLike
  **/
  @Schema(example = "200", description = "30天点赞数")
  public Integer getTotalLike() {
    return totalLike;
  }

  public void setTotalLike(Integer totalLike) {
    this.totalLike = totalLike;
  }

  public ExternalDataItemExternalDataItemExternalItemBase totalComment(Integer totalComment) {
    this.totalComment = totalComment;
    return this;
  }

   /**
   * 30天评论数
   * @return totalComment
  **/
  @Schema(example = "200", description = "30天评论数")
  public Integer getTotalComment() {
    return totalComment;
  }

  public void setTotalComment(Integer totalComment) {
    this.totalComment = totalComment;
  }

  public ExternalDataItemExternalDataItemExternalItemBase totalShare(Integer totalShare) {
    this.totalShare = totalShare;
    return this;
  }

   /**
   * 30天分享数
   * @return totalShare
  **/
  @Schema(example = "200", description = "30天分享数")
  public Integer getTotalShare() {
    return totalShare;
  }

  public void setTotalShare(Integer totalShare) {
    this.totalShare = totalShare;
  }

  public ExternalDataItemExternalDataItemExternalItemBase avgPlayDuration(Double avgPlayDuration) {
    this.avgPlayDuration = avgPlayDuration;
    return this;
  }

   /**
   * 30天平均播放时长
   * @return avgPlayDuration
  **/
  @Schema(example = "200", description = "30天平均播放时长")
  public Double getAvgPlayDuration() {
    return avgPlayDuration;
  }

  public void setAvgPlayDuration(Double avgPlayDuration) {
    this.avgPlayDuration = avgPlayDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataItemExternalDataItemExternalItemBase externalItemBase = (ExternalDataItemExternalDataItemExternalItemBase) o;
    return Objects.equals(this.totalPlay, externalItemBase.totalPlay) &&
        Objects.equals(this.totalLike, externalItemBase.totalLike) &&
        Objects.equals(this.totalComment, externalItemBase.totalComment) &&
        Objects.equals(this.totalShare, externalItemBase.totalShare) &&
        Objects.equals(this.avgPlayDuration, externalItemBase.avgPlayDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPlay, totalLike, totalComment, totalShare, avgPlayDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataItemExternalDataItemExternalItemBase {\n");
    
    sb.append("    totalPlay: ").append(toIndentedString(totalPlay)).append("\n");
    sb.append("    totalLike: ").append(toIndentedString(totalLike)).append("\n");
    sb.append("    totalComment: ").append(toIndentedString(totalComment)).append("\n");
    sb.append("    totalShare: ").append(toIndentedString(totalShare)).append("\n");
    sb.append("    avgPlayDuration: ").append(toIndentedString(avgPlayDuration)).append("\n");
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
