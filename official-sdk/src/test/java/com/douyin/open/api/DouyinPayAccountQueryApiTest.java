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

import com.douyin.open.models.DouyinPayDouyinPayInlineResponse2002;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DouyinPayAccountQueryApi
 */
@Ignore
public class DouyinPayAccountQueryApiTest {

    private final DouyinPayAccountQueryApi api = new DouyinPayAccountQueryApi();

    /**
     * 账户余额查询
     *
     * * Scope: &#x60;douyin.pay.op&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void douyinPayAccountQueryGetTest() {
        String accessToken = null;
        Integer merchantId = null;
        Integer liveId = null;
        DouyinPayDouyinPayInlineResponse2002 response = api.douyinPayAccountQueryGet(accessToken, merchantId, liveId);

        // TODO: test validations
    }
}
