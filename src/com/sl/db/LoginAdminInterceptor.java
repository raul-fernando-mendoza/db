package com.sl.db;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ValidationAware;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.sl.db.User;
import com.sl.db.UserRoleRules;

public class LoginAdminInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
	private static Logger m_logger = Logger.getLogger(LoginAdminInterceptor.class.getName());
	
	public String intercept(ActionInvocation invocation) throws Exception {
		m_logger.debug("LoginAdminInterceptor intercept invocation called");
	    // Get the action context from the invocation so we can access the
	    // HttpServletRequest and HttpSession objects.
		final ActionContext context = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);

		
		
	    HttpSession session =  request.getSession (true);
	    String schema = request.getParameter("schema");
	    if (null == schema || schema.isEmpty() ){
	    	m_logger.error("no schema in parameters");
	    	return "LoginAdminError";
	    }
	    
	    
	    // Is there a "user" object stored in the user's HttpSession?
	    Object user = session.getAttribute (schema + ".user");

	    
	    if (user == null || !UserRoleRules.userHasRole((User)user,"admin")) {
	        m_logger.debug("The user has not logged in yet or is not admin");

            Object action = invocation.getAction ();
            if (action instanceof ValidationAware) {
            	((ValidationAware) action).addActionError("Username or password incorrect.");
            }
	        return "LoginAdminError";
	    } else {
	    	m_logger.debug("the user is logged as admin");
	        return invocation.invoke ();
	    }

	}

}
