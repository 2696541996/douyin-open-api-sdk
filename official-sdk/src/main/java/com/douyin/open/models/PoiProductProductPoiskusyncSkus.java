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
import com.douyin.open.models.PoiProductProductOnlineStatus;
import com.douyin.open.models.PoiProductProductSkuAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PoiProductProductPoiskusyncSkus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PoiProductProductPoiskusyncSkus {
  @JsonProperty("price")
  private Integer price = null;

  @JsonProperty("stock")
  private Integer stock = null;

  @JsonProperty("status")
  private PoiProductProductOnlineStatus status = null;

  @JsonProperty("attributes")
  private PoiProductProductSkuAttributes attributes = null;

  public PoiProductProductPoiskusyncSkus price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 价格(人民币分)
   * @return price
  **/
  @Schema(example = "69800", required = true, description = "价格(人民币分)")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public PoiProductProductPoiskusyncSkus stock(Integer stock) {
    this.stock = stock;
    return this;
  }

   /**
   * 库存数量
   * @return stock
  **/
  @Schema(example = "2", required = true, description = "库存数量")
  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public PoiProductProductPoiskusyncSkus status(PoiProductProductOnlineStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public PoiProductProductOnlineStatus getStatus() {
    return status;
  }

  public void setStatus(PoiProductProductOnlineStatus status) {
    this.status = status;
  }

  public PoiProductProductPoiskusyncSkus attributes(PoiProductProductSkuAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public PoiProductProductSkuAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(PoiProductProductSkuAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductPoiskusyncSkus poiskusyncSkus = (PoiProductProductPoiskusyncSkus) o;
    return Objects.equals(this.price, poiskusyncSkus.price) &&
        Objects.equals(this.stock, poiskusyncSkus.stock) &&
        Objects.equals(this.status, poiskusyncSkus.status) &&
        Objects.equals(this.attributes, poiskusyncSkus.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, stock, status, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductPoiskusyncSkus {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
