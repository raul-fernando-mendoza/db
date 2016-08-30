package com.sl.db;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;


public class AboutAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private static Category m_logger = Logger.getLogger(AboutAction.class.getName());
	
	public String execute() throws Exception {
		m_logger.debug("About called");
		return INPUT;
	}	
}
