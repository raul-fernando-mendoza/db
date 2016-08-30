package com.sl.db;

import java.util.Date;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class EntityCreateAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(EntityCreateAction.class.getName());
	
	String schema;
	Entity entity;
	private String parentEntityName;
	private String entityName;
	private String label;
	private String description;
	private int isMultiple;
	
	private Entity parentEntity=null;
	
	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}
	
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

	public int getIsMultiple() {
		return isMultiple;
	}

	public void setIsMultiple(int isMultiple) {
		this.isMultiple = isMultiple;
	}
	
	

	@Override
	public void validate() {
		super.validate();
		if( null == schema || schema.isEmpty()) 
			addFieldError("schema","entity.invalidSchema");
		if( parentEntityName != null &&  !parentEntityName.isEmpty() ){
			try {
				parentEntity = EntityDAO.getByEntityName(schema, parentEntityName);
				if( null==parentEntity ){
					addFieldError("parentEntityName","entity.invalidParent");
				}
			} catch (Exception e) {
				m_logger.error(e);
				addActionError(e.getMessage());
			}
		}
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
			entity.setCreatedBy(getCurrentUser(schema).getUserID());
			entity.setUpdatedBy(getCurrentUser(schema).getUserID());
			entity.setCreateDate(new Date());
			entity.setUpdateDate(new Date());
			EntityDDL.Create(schema, entity);
			EntityDAO.create(schema, entity);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}