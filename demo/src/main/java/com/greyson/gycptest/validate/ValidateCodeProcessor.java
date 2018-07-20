/*
 * 
 * 
 * 项目名称 : demo
 * 创建日期 : 2018年7月19日
 * 修改历史 : 
 *     1. [2018年7月19日]创建文件 by Greyson
 */
package com.greyson.gycptest.validate;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * //TODO 校验码处理器  封装不同的验证码处理逻辑
 * @author Greyson
 */
@Configuration
public interface ValidateCodeProcessor {
    /**
     * 验证码放入session时的前缀
     */
    String SESSION_KEY_PREFIX = "SESSION_KEY_FOR_CODE_";

    /**
     * 创建校验码
     *
     * @param request
     * @throws Exception
     */
    void create(ServletWebRequest request) throws Exception;

    /**
     * 校验验证码
     *
     * @param servletWebRequest
     * @throws Exception
     */
    void validate(ServletWebRequest servletWebRequest);
}
