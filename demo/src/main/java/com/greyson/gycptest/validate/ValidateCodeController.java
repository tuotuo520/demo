/*
 * 
 * 
 * 项目名称 : demo
 * 创建日期 : 2018年7月19日
 * 修改历史 : 
 *     1. [2018年7月19日]创建文件 by Greyson
 */
package com.greyson.gycptest.validate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import com.greyson.gycptest.comm.SecurityConstants;

/**
 * //TODO 将随机数存到接口中
 * @author Greyson
 */


@RestController
public class ValidateCodeController {
    
    @Autowired
    private ValidateCodeProcessorHolder validateCodeProcessorHolder;
    
    /**
     * 
     * //TODO 创建验证码，根据验证码类型不同，调用不同的 {@link ValidateCodeProcessor}接口实现
     * @param request
     * @param response
     * @param type
     * @throws Exception
     */
    @GetMapping(SecurityConstants.DEFAULT_VALIDATE_CODE_URL_PREFIX + "/{type}")
    public void createCode(HttpServletRequest request, HttpServletResponse response, @PathVariable String type)
            throws Exception {
        validateCodeProcessorHolder.findValidateCodeProcessor(type).create(new ServletWebRequest(request, response));
    }

}
