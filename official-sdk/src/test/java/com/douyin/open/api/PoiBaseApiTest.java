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

import com.douyin.open.models.PoiBaseBaseInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PoiBaseApi
 */
@Ignore
public class PoiBaseApiTest {

    private final PoiBaseApi api = new PoiBaseApi();

    /**
     * 通过高德POI ID获取抖音POI ID
     *
     * * Scope: &#x60;poi.base&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void poiBaseQueryAmapGetTest() {
        String accessToken = null;
        String amapId = null;
        PoiBaseBaseInlineResponse200 response = api.poiBaseQueryAmapGet(accessToken, amapId);

        // TODO: test validations
    }
}
