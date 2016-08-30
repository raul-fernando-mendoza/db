package com.sl.db;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CachingHeadersInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
	private static Logger m_logger = Logger.getLogger(CachingHeadersInterceptor.class.getName());
	
	public String intercept(ActionInvocation invocation) throws Exception {
		m_logger.debug("CachingHeadersInterceptor intercept invocation called");
		final ActionContext context = invocation.getInvocationContext();
		
		HttpServletRequest request = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
		m_logger.debug("Request getRequestURI:" + request.getRequestURI());
		m_logger.debug("getContextPath():" + request.getContextPath());
		m_logger.debug("getQueryString():" + request.getQueryString() );
		m_logger.debug("getRequestURL:" + request.getRequestURL());
		m_logger.debug("getPathInfo:" + request.getPathInfo() );
		m_logger.debug("getServletPath:" + request.getServletPath() );
		m_logger.debug("getCharacterEncoding:" + request.getCharacterEncoding());
		m_logger.debug("User-Agent:" + request.getHeader("User-Agent"));
		m_logger.debug("Accept:" + request.getHeader("Accept"));

		final HttpServletResponse response = (HttpServletResponse) context
		.get(StrutsStatics.HTTP_RESPONSE);
		
		if (response != null) {
			m_logger.debug("remove caches");
			response.setHeader("Cache-control", "no-cache, no-store");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
		}
		return invocation.invoke();
	}
}
