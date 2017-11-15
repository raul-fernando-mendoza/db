package com.sl.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class DataListAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(DataListAction.class.getName());
	

	long entityID;
	
	public long getEntityID() {
		return entityID;
	}

	public void setEntityID(long entityID) {
		m_logger.debug("setEntityID:" + entityID);
		this.entityID = entityID;
	}
	
	Entity entity = null;
	
	

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}
	
	Property properties[] = null;	

	public Property[] getProperties(){
		return properties;
	}
	
	Collection<Data> data;
	
	public Collection<Data> getData() {
		return data;
	}

	public String execute() {
		m_logger.debug("called DataAction");
		try {
			m_logger.debug("id:" + entityID);
			entity = EntityDAO.getByEntityID(entityID);
			ArrayList<Property> propertiesList = PropertyDAO.getByParentEntityID(entity.getEntityID());
			
			properties = new Property[propertiesList.size()];  
			propertiesList.toArray(properties);
			data = DataDAO.getListAll(entity, properties);
			
			
		} catch (Exception e) {
			m_logger.error(e);
			addActionError("entity.notfound");
			return ERROR;
		}	
		return SUCCESS;
	}


}