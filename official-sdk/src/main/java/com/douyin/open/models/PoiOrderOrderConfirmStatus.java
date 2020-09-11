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
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 订单确认状态。0 - 订单确认, 1 - 价格变动, 2 - 库存不足, 3 - 确认中
 */
public enum PoiOrderOrderConfirmStatus {
  NUMBER_0(0),
  NUMBER_1(1),
  NUMBER_2(2),
  NUMBER_3(3);

  private Integer value;

  PoiOrderOrderConfirmStatus(Integer value) {
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
  public static PoiOrderOrderConfirmStatus fromValue(String text) {
    for (PoiOrderOrderConfirmStatus b : PoiOrderOrderConfirmStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
