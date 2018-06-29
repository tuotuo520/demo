package com.greyson.gycptest.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;

import com.greyson.gycptest.config.DatabaseContextHolder;
import com.greyson.gycptest.config.DatabaseType;
import com.greyson.gycptest.config.DynamicDataSource;
import com.greyson.gycptest.util.LogUtil;
/**
 * 
 * 利用切面动态处理数据源
 *
 * @author Greyson
 * @version  [SD V101R001, 2018年6月29日]
 *
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Aspect
@Component
@EnableAspectJAutoProxy(proxyTargetClass = true)//基于cglib库代理
public class DataSourceAspect {
	 @Pointcut("execution(* com.greyson.gycptest.dao.*.*(..))")//切点
	    public void aspect() {

	    }
	 
	 @Before("aspect()")
	    public void before(JoinPoint point) { //在指定切点的方法之前执行
	        String className = point.getTarget().getClass().getName();
	        String method = point.getSignature().getName();
	        String args = StringUtils.join(point.getArgs(), ",");
	        LogUtil.info("className:{}, method:{}, args:{} ", className, method, args);
	        try {
	            for (DatabaseType type : DatabaseType.values()) {
	                List<String> values = DynamicDataSource.METHOD_TYPE_MAP.get(type);
	                for (String key : values) {
	                    if (method.startsWith(key)) {
	                    	LogUtil.info(">>{} 方法使用的数据源为:{}<<", method, key);
	                        DatabaseContextHolder.setDatabaseType(type);
	                        DatabaseType types = DatabaseContextHolder.getDatabaseType();
	                        LogUtil.info(">>{}方法使用的数据源为:{}<<", method, types);
	                    }
	                }
	            }
	        } catch (Exception e) {
	        	LogUtil.error(e.getMessage(), e);
	        }
	    }
}
