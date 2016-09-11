package com.sl.db;

import java.util.ArrayList;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class PropertyListAction extends BaseAction { 

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(PropertyListAction.class.getName());
	
	Property[] arr_properties;

	public Object getData(){
		return arr_properties;
	}

	long entityID;
	
	public long getEntityID() {
		return entityID;
	}

	public void setEntityID(long entityID) {
		this.entityID = entityID;
	}




	public String execute() {
		m_logger.debug("called PropertyList Action");
		try {
			ArrayList<Property> properties = PropertyDAO.getByParentEntityID(entityID);
			properties.sort((o1, o2) -> o1.getPropertyName().compareTo(o2.getPropertyName()));
			arr_properties = new Property[properties.size()];
			properties.toArray(arr_properties);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}