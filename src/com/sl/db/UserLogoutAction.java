package com.sl.db;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.TextProvider;

public class UserLogoutAction extends BaseAction implements SessionAware, TextProvider{

	private static final long serialVersionUID = 1L;

	private static Logger m_logger = Logger.getLogger(UserLogoutAction.class.getName());

	
	public User user;
	
	public User getData() {
		return user;
	}

	public String execute() throws Exception {
			user = (User)session.get("user");
			session.remove("user");
			m_logger.debug("user logged out:" + user.getEmail());
			return SUCCESS;
	}


}
