/*
 * 
 * 
 * 项目名称 : demo
 * 创建日期 : 2018年7月17日
 * 修改历史 : 
 *     1. [2018年7月17日]创建文件 by Greyson
 */
package com.greyson.gycptest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greyson.gycptest.comm.dto.BaseResponse;
import com.greyson.gycptest.util.LogUtil;
import com.greyson.gycptest.comm.SecurityConstants;
import com.greyson.gycptest.comm.SecurityProperties;

/**
 * //TODO 自定义controller需要身份认证需要跳转过来
 * @author Greyson
 */
@RestController
public class BrowserSecurityController {
    //请求信息缓存
    private RequestCache requestCache = new HttpSessionRequestCache();
    //重定向
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    
    @Autowired
    private SecurityProperties securityProperties;
    
    
    /**
     * 
     * //TODO 需要认证跳转的页面
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    public BaseResponse requireAuthenication(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        SavedRequest saveRequest = requestCache.getRequest(request, response);
        if(saveRequest != null) {
            String targetUrl = saveRequest.getRedirectUrl();
            LogUtil.info("引发跳转请求的是" + targetUrl);
            if(StringUtils.endsWithIgnoreCase(targetUrl, ".html")) {
                redirectStrategy.sendRedirect(request, response, securityProperties.getBrowser().getLoginPage());//跳转到登陆页面
                
            }
        }
        return new BaseResponse("访问的服务需要身份认证，请引导用户到登录页");
    }
    
    
    /**
     * 
     * //TODO session失效
     * @return
     */
    @GetMapping("/session/invalid")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    public BaseResponse sessionInvalid(){
        return new BaseResponse("session超时");
    }
    
}
