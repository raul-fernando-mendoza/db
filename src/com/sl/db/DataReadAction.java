package com.sl.db;

import java.util.HashMap;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class DataReadAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(DataReadAction.class.getName());
	
	String schema;
	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		m_logger.debug("setSchema:" + schema);
		this.schema = schema;
	}

	public String entityName;
	
	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		m_logger.debug("setEntityName:" + entityName);
		this.entityName = entityName;
	}

	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	HashMap<String,Object> data;
	


	public HashMap<String, Object> getData() {
		return data;
	}

	public void setData(HashMap<String, Object> data) {
		this.data = data;
	}

	public String execute() {
		m_logger.debug("called DataReadAction");
		try {
			
			m_logger.debug("schema:" + schema);
			m_logger.debug("Entity:" + entityName);
			m_logger.debug("id:" + id);
			data = DataDAO.getByEntityNameID(schema, entityName, id);
			
		} catch (Exception e) {
			m_logger.error(e);
			addActionError("entity.notfound");
			return ERROR;
		}	
		return SUCCESS;
	}


}