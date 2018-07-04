package com.greyson.gycptest.comm.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.*;

public class SecurityFilter implements Filter{
	private static Set<String> GreenUrlSet = new HashSet<String>();

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
