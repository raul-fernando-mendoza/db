package com.sl.db;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class PropertyDropAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(PropertyDropAction.class.getName());
	
	String schema;
	String entityName;
	String propertyName;

	Property property;
	public Object getData(){
		return property;
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

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String execute() {
		m_logger.debug("called PropertyCreateAction");
		try {
			PropertyDDL.Drop(schema, entityName, propertyName);
			property = PropertyDAO.getByPropertyName(schema, entityName, propertyName);
			PropertyDAO.deleteByPropertyName(schema, entityName, propertyName);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}