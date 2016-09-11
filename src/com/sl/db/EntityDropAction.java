package com.sl.db;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class EntityDropAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(EntityDropAction.class.getName());
	
	long entityID;
	Entity entity;

	public Object getData(){
		return entity;
	}	
	public Entity getEntity(){
		return entity;
	}

	public void setEntityID(long entityID) {
		this.entityID = entityID;
	}
	public long getEntityID(){
		return entityID;
	}
	public String getEntityName() {
		return entity.getEntityName();
	}
	
	public String initialize(){
		m_logger.debug("called EntityDropAction Initialize");
		try {
			
			entity = EntityDAO.getByEntityID(entityID);
		} catch (Exception e) {
			m_logger.error("the exception Received:" + e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}

	public String execute() {
		m_logger.debug("called EntityDropAction");
		try {
			
			entity = EntityDAO.getByEntityID(entityID);
			EntityDDL.Drop(Long.toString(getCurrentUser().getUserID()), entity.getEntityName());
			EntityDAO.deleteByEntityID(entityID);;
		} catch (Exception e) {
			m_logger.error("the exception Received:" + e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}