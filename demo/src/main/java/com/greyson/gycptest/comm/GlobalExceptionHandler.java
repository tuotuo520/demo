package com.greyson.gycptest.comm;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.greyson.gycptest.util.LogUtil;


@ControllerAdvice
public class GlobalExceptionHandler {
	public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(Exception e, HttpServletRequest request) throws Exception {
        LogUtil.info("请求地址：" + request.getRequestURL());
        ModelAndView mav = new ModelAndView();
        LogUtil.error("异常信息：",e);
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
}
