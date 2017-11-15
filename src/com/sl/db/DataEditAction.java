package com.sl.db;

import java.util.Date;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class DataEditAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(DataEditAction.class.getName());
	
	Entity entity;
	public Entity getEntity() {
		return entity;
	}
	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	long entityID;
	public long getEntityID() {
		return entityID;
	}
	public void setEntityID(long entityID) {
		this.entityID = entityID;
	}



	public String initialize(){
		m_logger.debug("called EntityAction_initialize");
		try {
			entity = EntityDAO.getByEntityID(entityID);
			
		} catch (Exception e) {
			m_logger.error("entity to edit not found");
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String execute() {
		m_logger.debug("called EntityEditAction");
		
		return SUCCESS;
	}
	
	

}