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

import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse200;
import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse2001;
import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse2002;
import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse2003;
import com.douyin.open.models.ExternalDataItemExternalDataItemInlineResponse2004;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataExternalItemApi
 */
@Ignore
public class DataExternalItemApiTest {

    private final DataExternalItemApi api = new DataExternalItemApi();

    /**
     * 获取视频基础数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemBaseGetTest() {
        String openId = null;
        String accessToken = null;
        String itemId = null;
        ExternalDataItemExternalDataItemInlineResponse200 response = api.dataExternalItemBaseGet(openId, accessToken, itemId);

        // TODO: test validations
    }
    /**
     * 获取视频评论数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemCommentGetTest() {
        String openId = null;
        String accessToken = null;
        String itemId = null;
        Integer dateType = null;
        ExternalDataItemExternalDataItemInlineResponse2002 response = api.dataExternalItemCommentGet(openId, accessToken, itemId, dateType);

        // TODO: test validations
    }
    /**
     * 获取视频点赞数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemLikeGetTest() {
        String openId = null;
        String accessToken = null;
        String itemId = null;
        Integer dateType = null;
        ExternalDataItemExternalDataItemInlineResponse2001 response = api.dataExternalItemLikeGet(openId, accessToken, itemId, dateType);

        // TODO: test validations
    }
    /**
     * 获取视频播放数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemPlayGetTest() {
        String openId = null;
        String accessToken = null;
        String itemId = null;
        Integer dateType = null;
        ExternalDataItemExternalDataItemInlineResponse2003 response = api.dataExternalItemPlayGet(openId, accessToken, itemId, dateType);

        // TODO: test validations
    }
    /**
     * 获取视频分享数据
     *
     * * Scope: &#x60;data.external.item&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalItemShareGetTest() {
        String openId = null;
        String accessToken = null;
        String itemId = null;
        Integer dateType = null;
        ExternalDataItemExternalDataItemInlineResponse2004 response = api.dataExternalItemShareGet(openId, accessToken, itemId, dateType);

        // TODO: test validations
    }
}
