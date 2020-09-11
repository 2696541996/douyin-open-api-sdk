package com.jason.open.api.video;

import cn.hutool.core.util.StrUtil;
import com.douyin.open.api.VideoPublishApi;
import com.douyin.open.models.*;
import com.jason.open.api.utils.DouyinConstant;
import com.jason.open.api.utils.FileSizeUtil;
import com.jason.open.api.utils.exception.VideoException;
import org.springframework.beans.BeanUtils;
import org.springframework.web.client.RestClientException;

import java.io.File;

/**
 * @Description 抖音视频功能管理
 * @Date 2020/9/11 15:10
 * @Author by 尘心
 */
public class DouyinVideoManager {


    /** 视频发布api */
    private VideoPublishApi videoPublishApi;


    /** 初始化构造器 */
    public DouyinVideoManager() {
        videoPublishApi = new VideoPublishApi();
    }


    /**
     * 视频上传, 超过50m的视频自动采用分片上传
     * <p>
     *     Scope: `video.create`需要申请权限需要用户授权
     *     该接口用于上传视频文件到文件服务器，获取视频文件video_id。该接口适用于抖音。
     * </p>
     * @param video         视频文件
     * @param openId        用户唯一标志
     * @param accessToken   access_token
     */
    public VideoCreateAwemeCreateInlineResponse200 videoAutoUpload(File video, String openId, String accessToken) {
        if (StrUtil.isBlank(openId)||StrUtil.isBlank(accessToken)||video == null) {
            throw new VideoException("视频文件, openId , accessToken 不能为空!!");
        }

        // 返回结果
        VideoCreateAwemeCreateInlineResponse200 result = null;

        // 查看文件大小, 单位为MB
        double size = FileSizeUtil.getFileOrFilesSize(video.getAbsolutePath(), FileSizeUtil.SIZETYPE_MB);
        if (size> DouyinConstant.SINGE_VIDEO_MAX_SIZE) {
            // 根据视频大小, 自动切换为分片下载
            // 视频分片
            Integer partTotal = FileSizeUtil.slicedVideo(size);
            // 分片上传
            result = videoUploadByPart(video,partTotal,openId,accessToken);
        }else {

            // 不采用分区
            try {
                result = videoPublishApi.videoUploadPost(video,openId,accessToken);
            } catch (RestClientException e) {
                e.printStackTrace();
            }
        }



        return result;
    }

    /**
     * 创建抖音视频
     * @param openId  用户唯一标志
     * @param accessToken access_token
     * @param body The body parameter
     */
    public VideoCreateAwemeCreateInlineResponse2001 createVideo(String openId, String accessToken ,VideoCreateAwemeCreateBody1 body) {
        if (StrUtil.isBlank(openId)||StrUtil.isBlank(accessToken)) {
            throw new VideoException("openId , accessToken 不能为空!!");
        }

        VideoCreateAwemeCreateInlineResponse2001 result = null;
        try {
            result = videoPublishApi.videoCreatePost(openId, accessToken, body);
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return result;
    }



    /**
     *  视频分片上传 超过50m的视频建议采用分片上传
     * @param video         视频文件
     * @param partTotal     总片数
     * @param openId        用户唯一标志
     * @param accessToken   access_token
     */
    private VideoCreateAwemeCreateInlineResponse200 videoUploadByPart(File video,Integer partTotal,String openId, String accessToken) {
        VideoCreateAwemeCreateInlineResponse200 result = new VideoCreateAwemeCreateInlineResponse200();

        // 分片初始化
        VideoCreateAwemeCreateInlineResponse2002 response2002 = videoPartInitPost(openId, accessToken);
        VideoCreateAwemeCreateInlineResponse2002Data data = response2002.getData();
        Integer errorCode = data.getErrorCode();
        if (errorCode.equals(DouyinConstant.OK)) {
            // 获取上传id号
            String uploadId = data.getUploadId();
            if (uploadId!=null) {
                // 分片初始化上传正常
                if (partTotal>0) {
                    // 分片上传, 从1 开始
                    for (int i = 1; i <= partTotal; i++) {

                        VideoCreateAwemeCreateInlineResponse2003 res = videoPartUploadPost(video, openId, accessToken, uploadId, i);
                        VideoCreateAwemeCreateInlineResponse2003Data resData = res.getData();
                        Integer dataErrorCode = resData.getErrorCode();
                        if (!dataErrorCode.equals(DouyinConstant.OK)) {
                            // 拷贝错误信息, 并返回
                            BeanUtils.copyProperties(result,res);
                            // 遇到错误, 中断传输, 直接返回错误信息
                            return result;
                        }
                    }

                    // 调用上传完成接口
                    VideoCreateAwemeCreateInlineResponse2004 response2004 = videoPartCompletePost(openId, accessToken, uploadId);
                    // 返回接口信息
                    BeanUtils.copyProperties(result,response2004);
                }
            }


        }else {
            // 拷贝属性,并返回
            BeanUtils.copyProperties(result,response2002);
        }

        return result;
    }



    /**
     * 分片初始化上传
     * <p>
     *     Scope: `video.create`需要申请权限需要用户授权
     *     该接口用于分片上传视频文件到文件服务器，先初始化上传获取upload_id。该接口适用于抖音。
     * </p>
     * @param openId        用户唯一标志
     * @param accessToken   access_token
     */
    private VideoCreateAwemeCreateInlineResponse2002 videoPartInitPost(String openId, String accessToken) {
        if (StrUtil.isBlank(openId)||StrUtil.isBlank(accessToken)) {
            throw new VideoException("openId , accessToken 不能为空!!");
        }

        VideoCreateAwemeCreateInlineResponse2002 result = null;
        try {
            result = videoPublishApi.videoPartInitPost(openId,accessToken);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }


    /**
     * 上传视频分片到文件服务器
     * <p>
     *     Scope: `video.create`需要申请权限需要用户授权
     *     该接口用于分片上传视频文件到文件服务器，上传阶段。该接口适用于抖音。
     * </p>
     * @param video The video parameter
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param uploadId 分片上传的标记。有限时间为2小时。
     * @param partNumber 第几个分片，从1开始
     */
    private VideoCreateAwemeCreateInlineResponse2003 videoPartUploadPost(File video, String openId, String accessToken, String uploadId, Integer partNumber) {
        if (video == null||StrUtil.isBlank(openId)||StrUtil.isBlank(accessToken)||StrUtil.isBlank(uploadId)||partNumber==null) {
            throw new VideoException("视频,openId , accessToken , uploadId, 分片号, 不能为空!!");
        }

        VideoCreateAwemeCreateInlineResponse2003 result = null;
        try {
            result = videoPublishApi.videoPartUploadPost(video, openId, accessToken, uploadId, partNumber);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }


    /**
     * 完成上传
     * <p>
     *     Scope: `video.create`需要申请权限需要用户授权
     *     该接口用于分片上传视频文件到文件服务器，完成上传。该接口适用于抖音。
     * </p>
     * @param openId 通过/oauth/access_token/获取，用户唯一标志
     * @param accessToken 调用/oauth/access_token/生成的token，此token需要用户授权。
     * @param uploadId 分片上传的标记。有限时间为2小时。
     * @return
     */
    private VideoCreateAwemeCreateInlineResponse2004 videoPartCompletePost(String openId, String accessToken, String uploadId) {
        if (StrUtil.isBlank(openId)||StrUtil.isBlank(accessToken)||StrUtil.isBlank(uploadId)) {
            throw new VideoException("openId , accessToken , uploadId不能为空!!");
        }

        VideoCreateAwemeCreateInlineResponse2004 result = null;
        try {
            result = videoPublishApi.videoPartCompletePost(openId, accessToken, uploadId);
        } catch (RestClientException e) {
            e.printStackTrace();
        }

        return result;
    }




}
