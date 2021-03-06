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

package com.douyin.open.api;

import com.douyin.open.models.PoiSupplierSupplierBody;
import com.douyin.open.models.PoiSupplierSupplierBody1;
import com.douyin.open.models.PoiSupplierSupplierBody2;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse200;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse2001;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse2002;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse2003;
import com.douyin.open.models.PoiSupplierSupplierInlineResponse2004;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PoiSupplierApi
 */
@Ignore
public class PoiSupplierApiTest {

    private final PoiSupplierApi api = new PoiSupplierApi();

    /**
     * 获取抖音POI ID
     *
     * * Scope: &#x60;poi.product&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiQueryGetTest() {
        String accessToken = null;
        String amapId = null;
        PoiSupplierSupplierInlineResponse2002 response = api.poiQueryGet(accessToken, amapId);

        // TODO: test validations
    }
    /**
     * 店铺匹配
     *
     * * Scope: &#x60;poi.product&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSupplierMatchPostTest() {
        PoiSupplierSupplierBody1 body = null;
        String accessToken = null;
        PoiSupplierSupplierInlineResponse2003 response = api.poiSupplierMatchPost(body, accessToken);

        // TODO: test validations
    }
    /**
     * 店铺匹配结果查询
     *
     * * Scope: &#x60;poi.product&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSupplierMatchQueryGetTest() {
        PoiSupplierSupplierBody2 body = null;
        String accessToken = null;
        PoiSupplierSupplierInlineResponse2004 response = api.poiSupplierMatchQueryGet(body, accessToken);

        // TODO: test validations
    }
    /**
     * 查询店铺
     *
     * * Scope: &#x60;poi.product&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSupplierQueryGetTest() {
        String accessToken = null;
        String supplierExtId = null;
        PoiSupplierSupplierInlineResponse2001 response = api.poiSupplierQueryGet(accessToken, supplierExtId);

        // TODO: test validations
    }
    /**
     * 商铺同步
     *
     * * Scope: &#x60;poi.product&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiSupplierSyncPostTest() {
        PoiSupplierSupplierBody body = null;
        String accessToken = null;
        PoiSupplierSupplierInlineResponse200 response = api.poiSupplierSyncPost(body, accessToken);

        // TODO: test validations
    }
}
