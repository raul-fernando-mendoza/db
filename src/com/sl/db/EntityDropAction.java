package com.sl.db;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class EntityDropAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(EntityDropAction.class.getName());
	
	String schema;
	String entityName;
	Entity entity;

	public Object getData(){
		return entity;
	}	
	
	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}
	


	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	@Override
	public void validate() {
		super.validate();
		if( schema == null || schema.isEmpty() ) addFieldError("schema", "schema.invalid");
		if( entityName == null || entityName.isEmpty()) addFieldError("entityName","entity.invalidName");
	}



	public String execute() {
		m_logger.debug("called EntityDropAction");
		try {
			entity = EntityDAO.getByEntityName(schema, entityName);
			EntityDDL.Drop(schema, entityName);
			EntityDAO.deleteByEntityName(schema, entityName);
		} catch (Exception e) {
			m_logger.error("the exception Received:" + e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}