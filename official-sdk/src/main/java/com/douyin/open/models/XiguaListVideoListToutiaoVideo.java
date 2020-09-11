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
import com.douyin.open.models.XiguaListVideoListToutiaoVideoStatistics;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * XiguaListVideoListToutiaoVideo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:04:58.534257+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class XiguaListVideoListToutiaoVideo {
  @JsonProperty("item_id")
  private String itemId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("cover")
  private String cover = null;

  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("statistics")
  private XiguaListVideoListToutiaoVideoStatistics statistics = null;

  public XiguaListVideoListToutiaoVideo itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频id
   * @return itemId
  **/
  @Schema(example = "@8hxdhauTCMppanGnM4ltGM780mDqPP+KPpR0qQOmLVAXb/T060zdRmYqig357zEBq6CZRp4NVe6qLIJW/V/x1w==", required = true, description = "视频id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public XiguaListVideoListToutiaoVideo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 视频标题
   * @return title
  **/
  @Schema(example = "测试视频 #测试话题 @抖音小助手", required = true, description = "视频标题")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public XiguaListVideoListToutiaoVideo cover(String cover) {
    this.cover = cover;
    return this;
  }

   /**
   * 视频封面
   * @return cover
  **/
  @Schema(example = "https://p3-dy.byteimg.com/img/tos-cn-p-0015/cfa0d6421bdc4580876cb16974539ff6~c5_300x400.jpeg", required = true, description = "视频封面")
  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public XiguaListVideoListToutiaoVideo createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 视频创建时间戳
   * @return createTime
  **/
  @Schema(example = "1571075129", required = true, description = "视频创建时间戳")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public XiguaListVideoListToutiaoVideo statistics(XiguaListVideoListToutiaoVideoStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @Schema(required = true, description = "")
  public XiguaListVideoListToutiaoVideoStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(XiguaListVideoListToutiaoVideoStatistics statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XiguaListVideoListToutiaoVideo toutiaoVideo = (XiguaListVideoListToutiaoVideo) o;
    return Objects.equals(this.itemId, toutiaoVideo.itemId) &&
        Objects.equals(this.title, toutiaoVideo.title) &&
        Objects.equals(this.cover, toutiaoVideo.cover) &&
        Objects.equals(this.createTime, toutiaoVideo.createTime) &&
        Objects.equals(this.statistics, toutiaoVideo.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, title, cover, createTime, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XiguaListVideoListToutiaoVideo {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
