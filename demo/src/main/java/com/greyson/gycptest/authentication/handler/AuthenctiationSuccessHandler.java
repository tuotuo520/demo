/*
 * 
 * 
 * 项目名称 : demo
 * 创建日期 : 2018年7月17日
 * 修改历史 : 
 *     1. [2018年7月17日]创建文件 by Greyson
 */
package com.greyson.gycptest.authentication.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greyson.gycptest.comm.LoginResponseType;
import com.greyson.gycptest.comm.SecurityProperties;
import com.greyson.gycptest.util.LogUtil;

/**
 * //TODO 认证成功的handler类
 * @author Greyson
 */
@Component("authenctiationSuccessHandler")
public class AuthenctiationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private SecurityProperties securityProperties;
    

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        LogUtil.info("登陆成功");
        if(LoginResponseType.JSON.equals(securityProperties.getBrowser().getLoginType())) {
            
        }
        
        
        super.onAuthenticationSuccess(request, response, authentication);
    }
    
}
