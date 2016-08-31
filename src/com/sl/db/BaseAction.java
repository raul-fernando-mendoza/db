package com.sl.db;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.opensymphony.xwork2.TextProvider;
import com.sl.db.PojoMapper;

public class BaseAction extends com.opensymphony.xwork2.ActionSupport implements TextProvider, SessionAware{

	private static Logger m_logger = Logger.getLogger(BaseAction.class.getName());
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}


	
	public User getCurrentUser(String schema){
		m_logger.debug("getCurrentUser called");
		User user = null;
		Object obj = session.get(schema + ".user");
		if( null != obj && obj instanceof User){
		 user = (User)obj;	
		}
		m_logger.debug("getCurrentUser:" + user);
		return user;
	}	
	
	public String getJSON(Object o,boolean prettyPrint) throws JsonMappingException, JsonGenerationException, IOException{
		return PojoMapper.toJson(o, prettyPrint);
	}	
	public String getJSON(Object o) throws JsonMappingException, JsonGenerationException, IOException{
		return PojoMapper.toJson(o, false);
	}	
	public String getDateFormatted(Date d){
		SimpleDateFormat sdfOutput = new SimpleDateFormat  (  "yyyyMMdd_hhmmss"  ) ;
		return sdfOutput.format (  d  );
	}
}
