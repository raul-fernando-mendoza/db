package com.sl.db;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
	private static Logger m_logger = Logger.getLogger(LoginInterceptor.class.getName());
	
	public String intercept(ActionInvocation invocation) throws Exception {
		m_logger.debug("LoginInterceptor intercept invocation called");
	    // Get the action context from the invocation so we can access the
	    // HttpServletRequest and HttpSession objects.
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
		

	    HttpSession session =  request.getSession (true);

	    // Is there a "user" object stored in the user's HttpSession?
	    String schema = request.getParameter("schema");
	    if (null == schema || schema.isEmpty() ){
	    	m_logger.error("no schema in parameters");
	    	return "LoginError";
	    }
	    
	    Object user = session.getAttribute (schema + ".user");
	    
	    if (user != null) {
	    	m_logger.debug("the user is logged");
	        return invocation.invoke ();
	    }else {
	    	m_logger.debug("the user is NOT logged");
	    	return "loginError";
	    }

	}
}
