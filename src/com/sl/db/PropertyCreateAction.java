package com.sl.db;

import java.util.Date;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class PropertyCreateAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(PropertyCreateAction.class.getName());
	
	String schema;
	String entityName;
	String propertyName;
	String type;
	String label;
	int size;
	int isUnique;
	
	Property property;
	
	public Property getData(){
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	
	public int getIsUnique() {
		return isUnique;
	}

	public void setIsUnique(int isUnique) {
		this.isUnique = isUnique;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public void validate() {
		super.validate();
		m_logger.debug("validating");
		
		if( null == schema || schema.isEmpty() ) addFieldError("schema","schema.cannotBeEmpty");
		
		if( null == entityName || entityName.isEmpty() ) addFieldError("entityName","entity.cannotBeEmpty");
		
		if( null == propertyName || propertyName.isEmpty() ) addFieldError("propertyName","property.cannotBeEmpty");
		
		DataType dataType = null;
		try {
			dataType = DataTypeDAO.getByDataTypeName(schema, type);
			m_logger.debug("dataType=" + dataType);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage());
		}
		if( null == dataType ){
			addFieldError("type","property.invalidDatatype");
		}
	}

	public String execute() {
		m_logger.debug("called PropertyCreateAction");
		try {
			Entity entity = EntityDAO.getByEntityName(schema, entityName);
			property = new Property();
			property.setPropertyName(propertyName);
			property.setParentEntityID(entity.getEntityID());
			property.setCreatedBy(getCurrentUser(schema).getUserID());
			property.setUpdatedBy(getCurrentUser(schema).getUserID());
			property.setCreateDate(new Date());
			property.setUpdateDate(new Date());
			property.setDataTypeID(DataTypeDAO.getByDataTypeName(schema, type).getDataTypeID());
			property.setDataType(DataTypeDAO.getByDataTypeName(schema, type));
			property.setSize(size);
			property.setLabel(label);
			PropertyDDL.Create(schema,  entityName, propertyName, type, size, isUnique);
			PropertyDAO.create(schema, property);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}