/*
 * 创建消息卡片
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
import com.douyin.open.models.EnterpriseImCardCardSaveQuestionListQuestions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterpriseImCardCardSaveQuestionList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:43.117611+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EnterpriseImCardCardSaveQuestionList {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("questions")
  private List<EnterpriseImCardCardSaveQuestionListQuestions> questions = new ArrayList<>();

  public EnterpriseImCardCardSaveQuestionList text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 问题文案
   * @return text
  **/
  @Schema(example = "有疑惑点击下方问题", required = true, description = "问题文案")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public EnterpriseImCardCardSaveQuestionList questions(List<EnterpriseImCardCardSaveQuestionListQuestions> questions) {
    this.questions = questions;
    return this;
  }

  public EnterpriseImCardCardSaveQuestionList addQuestionsItem(EnterpriseImCardCardSaveQuestionListQuestions questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * 问题关键词列表，用户点击后会发送出关键词，企业主可配置该关键词自动回复功能配合使用
   * @return questions
  **/
  @Schema(required = true, description = "问题关键词列表，用户点击后会发送出关键词，企业主可配置该关键词自动回复功能配合使用")
  public List<EnterpriseImCardCardSaveQuestionListQuestions> getQuestions() {
    return questions;
  }

  public void setQuestions(List<EnterpriseImCardCardSaveQuestionListQuestions> questions) {
    this.questions = questions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseImCardCardSaveQuestionList questionList = (EnterpriseImCardCardSaveQuestionList) o;
    return Objects.equals(this.text, questionList.text) &&
        Objects.equals(this.questions, questionList.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, questions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseImCardCardSaveQuestionList {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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
