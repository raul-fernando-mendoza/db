package com.sl.db;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class SystemInfoAction extends com.opensymphony.xwork2.ActionSupport{

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(SystemInfoAction.class.getName());
	
	public String execute() {
		try {
			this.addActionMessage("MySqlVersion:" + Database.getConnection().getMetaData().getDatabaseProductVersion());
		} catch (Exception e) {
		    m_logger.error("ERROR:" + e);
		    this.addActionError(e.getMessage());
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}	
}
