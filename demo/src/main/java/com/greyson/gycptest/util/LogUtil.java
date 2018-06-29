package com.greyson.gycptest.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/**
 * 
 * 
 * 日志工具类
 *
 * @author Greyson
 * @version  [SD V101R001, 2018年6月29日]
 *
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class LogUtil {
private static Logger logger = LoggerFactory.getLogger("sasLog");
	
	private LogUtil(){};
	
	public static void debug(String msg) {
		logger.debug(msg);
	}

	public static void debug(String format, Object arg) {
		logger.debug(format, arg);
	}

	public static void debug(String format, Object arg1, Object arg2) {
		logger.debug(format, arg1, arg2);
	}

	public static void debug(String format, Object... arguments) {
		logger.debug(format, arguments);
	}

	public static void debug(String msg, Throwable t) {
		logger.debug(msg, t);
	}
	
	public static void debug(Marker marker, String msg) {
		logger.debug(marker, msg);
	}

	public static void debug(Marker marker, String format, Object arg) {
		logger.debug(marker, format, arg);		
	}

	public static void debug(Marker marker, String format, Object arg1, Object arg2) {
		logger.debug(marker, format, arg1,arg2);
	}
	
	public static void debug(Marker marker, String format, Object... arguments) {
		logger.debug(marker,format,arguments);
	}
	
	public static void debug(Marker marker, String msg, Throwable t) {
		logger.debug(marker,msg,t);
	}
	
	public static void info(String msg) {
		logger.info(msg);
	}
	
	public static void info(String format, Object arg) {
		logger.info(format,arg);		
	}

	public static void info(String format, Object arg1, Object arg2) {
		logger.info(format,arg1,arg2);
	}
	
	public static void info(String format, Object... arguments) {
		logger.info( format, arguments);
	}
	
	public static void info(String msg, Throwable t) {
		logger.info( msg, t);
	}
	
	public static void info(Marker marker, String msg) {
		logger.info( marker, msg);
	}

	public static void info(Marker marker, String format, Object arg) {
		logger.info( marker, format, arg);
	}
	
	public static void info(Marker marker, String format, Object arg1, Object arg2) {
		logger.info( marker, format, arg1, arg2);
	}
	
	public static void info(Marker marker, String format, Object... arguments) {
		logger.info( marker, format, arguments);
	}
	
	public static void info(Marker marker, String msg, Throwable t) {
		logger.info( marker, msg, t);
	}
	
	public static void warn(String msg) {
		logger.warn(msg);
	}
	
	public static void warn(String format, Object arg) {
		logger.warn( format, arg);
	}
	
	public static void warn(String format, Object... arguments) {
		logger.warn( format, arguments);
	}
	
	public static void warn(String format, Object arg1, Object arg2) {
		logger.warn( format, arg1, arg2);
	}
	
	public static void warn(String msg, Throwable t) {
		logger.warn(msg,t);
	}

	public static void warn(Marker marker, String msg) {
		logger.warn(marker, msg);
	}
	
	public static void warn(Marker marker, String format, Object arg) {
		logger.warn( marker, format, arg);
	}
	
	public static void warn(Marker marker, String format, Object arg1, Object arg2) {
		logger.warn( marker,  format,  arg1,  arg2);
	}
	
	public static void warn(Marker marker, String format, Object... arguments) {
		logger.warn( marker, format, arguments);
	}
	
	public static void warn(Marker marker, String msg, Throwable t) {
		logger.warn( marker, msg, t);		
	}

	public static void error(String msg) {
		logger.error( msg);
	}
	
	public static void error(String format, Object arg) {
		logger.error( format,  arg);
	}
	
	public static void error(String format, Object arg1, Object arg2) {
		logger.error( format, arg1, arg2);
	}
	
	public static void error(String format, Object... arguments) {
		logger.error( format, arguments);
	}
	
	public static void error(String msg, Throwable t) {
		logger.error( msg,  t);
	}

	public static void error(Marker marker, String msg) {
		logger.error( marker,  msg);
	}
	
	public static void error(Marker marker, String format, Object arg) {
		logger.error( marker,  format,  arg);
	}
	
	public static void error(Marker marker, String format, Object arg1, Object arg2) {
		logger.error( marker, format, arg1, arg2);
	}
	
	public static void error(Marker marker, String format, Object... arguments) {
		logger.error( marker, format,  arguments);
	}
	
	public static void error(Marker marker, String msg, Throwable t) {
		logger.error( marker,  msg,  t);
	}
}
