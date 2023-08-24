package com.qimu.qiapibackend.model.dto.InterfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoUpdateRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    /**
     * 接口名称
     */
    private String name;
    /**
     * 接口地址
     */
    private String url;
    /**
     * 请求方法
     */
    private String method;
    /**
     * 接口请求参数
     */
    private String requestParams;
    /**
     * 描述信息
     */
    private String description;
    /**
     * 请求示例
     */
    private String requestExample;
    /**
     * 请求头
     */
    private String requestHeader;
    /**
     * 响应头
     */
    private String responseHeader;
    /**
     * 接口状态（0- 默认下线 1- 上线）
     */
    private Integer status;
}