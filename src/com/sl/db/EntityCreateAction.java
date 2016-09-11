package com.sl.db;

import java.util.Date;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class EntityCreateAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(EntityCreateAction.class.getName());
	
	Entity entity;
	private String parentEntityName;
	private String entityName;
	private String label;
	private String description;
	private String isMultiple="N";
	
	private Entity parentEntity=null;
	
	
	public Object getData(){
		return entity;
	}


	public String getParentEntityName() {
		return parentEntityName;
	}

	public void setParentEntityName(String parentEntityName) {
		this.parentEntityName = parentEntityName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsMultiple() {
		return isMultiple;
	}

	public void setIsMultiple(String isMultiple) {
		this.isMultiple = isMultiple;
	}
	
	public String initialize(){
		m_logger.debug("called CreateEntityAction_initialize");
		return SUCCESS;
	}
	
	public String execute() {
		m_logger.debug("called CreateEntityAction");
		try {
			
			entity = new Entity();
			entity.setEntityName(entityName);
			entity.setLabel(label);
			entity.setDescription(description);
			entity.setIsMultiple(isMultiple);
			if( null != parentEntity ){
				entity.setParentEntityID(parentEntity.getEntityID());
			}	
			User currentUser = getCurrentUser();
			entity.setCreatedBy(getCurrentUser().getUserID());
			entity.setUpdatedBy(getCurrentUser().getUserID());
			entity.setCreateDate(new Date());
			entity.setUpdateDate(new Date());
			EntityDDL.Create(Long.toString(currentUser.getUserID()), entity);
			EntityDAO.create(entity);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}