/**
 * 文 件 名: LoggerAdvice.java
 * 版    权:  Greyson. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  Greyson
 * 修改时间:  2018年7月4日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.greyson.gycptest.aop;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 日志管理
 *
 * @author Greyson
 * @version  [SD V101R001, 2018年7月4日]
 *
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Aspect
@Service
public class LoggerAdvice {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("within(com.greyson.gycptest..*) && @annotation(loggerManager)")
	public void addBeforeLogger(JoinPoint joinPoint,LoggerManager loggerManager) {
		logger.info("执行 " + loggerManager.description() + " 开始");
		logger.info(joinPoint.getSignature().toString());
		logger.info(parseParames(joinPoint.getArgs()));
	}
	
	@AfterReturning("within(com.favorites..*) && @annotation(loggerManage)")
	public void addAfterReturningLogger(JoinPoint joinPoint, LoggerManager loggerManager) {
		logger.info("执行 " + loggerManager.description() + " 结束");
	}
	
	@AfterThrowing(pointcut = "within(com.favorites..*) && @annotation(loggerManage)", throwing = "ex")
	public void addAfterThrowingLogger(JoinPoint joinPoint, LoggerManager loggerManager, Exception ex) {
		logger.error("执行 " + loggerManager.description() + " 异常", ex);
	}
	
	private String parseParames(Object[] parames) {
		if (null == parames || parames.length <= 0 || parames.length >1024) {
			return "";
		}
		StringBuffer param = new StringBuffer("传入参数[{}] ");
		for (Object obj : parames) {
			param.append(ToStringBuilder.reflectionToString(obj)).append("  ");
		}
		return param.toString();
	}
}
