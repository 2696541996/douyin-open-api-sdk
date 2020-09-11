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
 * ToutiaoVideoCreateCreateInlineResponse200DataVideo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:04:22.286450+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ToutiaoVideoCreateCreateInlineResponse200DataVideo {
  @JsonProperty("video_id")
  private String videoId = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("height")
  private Integer height = null;

  public ToutiaoVideoCreateCreateInlineResponse200DataVideo videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频文件id
   * @return videoId
  **/
  @Schema(example = "v0200f450000bn8c6aa0ifki8fikg1b0", required = true, description = "视频文件id")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public ToutiaoVideoCreateCreateInlineResponse200DataVideo width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @Schema(example = "320", required = true, description = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ToutiaoVideoCreateCreateInlineResponse200DataVideo height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @Schema(example = "568", required = true, description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToutiaoVideoCreateCreateInlineResponse200DataVideo inlineResponse200DataVideo = (ToutiaoVideoCreateCreateInlineResponse200DataVideo) o;
    return Objects.equals(this.videoId, inlineResponse200DataVideo.videoId) &&
        Objects.equals(this.width, inlineResponse200DataVideo.width) &&
        Objects.equals(this.height, inlineResponse200DataVideo.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToutiaoVideoCreateCreateInlineResponse200DataVideo {\n");
    
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
