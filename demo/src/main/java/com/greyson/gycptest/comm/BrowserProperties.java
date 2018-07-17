/*
 * 项目名称 : demo 创建日期 : 2018年7月17日 修改历史 : 1. [2018年7月17日]创建文件 by Greyson
 */
package com.greyson.gycptest.comm;

/**
 * //TODO 配置读取
 * 
 * @author Greyson
 */
public class BrowserProperties {
    private SessionProperties session = new SessionProperties();

    /**
     * 默认登录页面
     */
    private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;

    /**
     * 默认登录方式
     */
    private LoginResponseType loginType = LoginResponseType.JSON;

    /**
     * 默认记住我的时长
     */
    private int rememberMeSeconds = 3600;

    public SessionProperties getSession() {
        return session;
    }

    public void setSession(SessionProperties session) {
        this.session = session;
    }

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginResponseType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginResponseType loginType) {
        this.loginType = loginType;
    }

    public int getRememberMeSeconds() {
        return rememberMeSeconds;
    }

    public void setRememberMeSeconds(int rememberMeSeconds) {
        this.rememberMeSeconds = rememberMeSeconds;
    }

}
