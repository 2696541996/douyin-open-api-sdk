/*
 * 
 * 关注指定抖音号
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.api;

import com.douyin.open.models.RelationRelationFollowCommonResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RelationFollowCancelApi
 */
@Ignore
public class RelationFollowCancelApiTest {

    private final RelationFollowCancelApi api = new RelationFollowCancelApi();

    /**
     * 取消关注指定抖音号
     *
     * * Scope: &#x60;relation.follow&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void relationFollowingCancelPostTest() {
        String openId = null;
        String accessToken = null;
        RelationRelationFollowCommonResponse response = api.relationFollowingCancelPost(openId, accessToken);

        // TODO: test validations
    }
}
