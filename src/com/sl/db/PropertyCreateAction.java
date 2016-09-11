package com.sl.db;

import java.util.Collection;
import java.util.Date;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class PropertyCreateAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(PropertyCreateAction.class.getName());
	
	int parentEntityID;
	String propertyName;
	String label;
	int datatypeID;
	int size;
	String isPk;
	
	Entity parentEntity;
	
	public int getParentEntityID() {
		return parentEntityID;
	}
	public void setParentEntityID(int parentEntityID) {
		this.parentEntityID = parentEntityID;
	}
	public Entity getParentEntity(){
		return parentEntity;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getDatatypeID() {
		return datatypeID;
	}
	public void setDatatypeID(int datatypeID) {
		this.datatypeID = datatypeID;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getIsPk() {
		return isPk;
	}
	public void setIsPk(String isPk) {
		this.isPk = isPk;
	}
	public Collection<Datatype> getDatatypes(){
		Collection<Datatype> datatypes = null;
		try {
			datatypes = DatatypeDAO.getListAll();
		} catch (Exception e) {
			m_logger.debug("can not read the datatypelist");
			e.printStackTrace();
		}
		return datatypes;
	}	

	public String initialize(){
		try {
			parentEntity = EntityDAO.getByEntityID(parentEntityID);
		} catch (Exception e) {
			m_logger.debug("can not retrieve parent entity");
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}


	public String execute() {
		m_logger.debug("called PropertyCreateAction");
		try {
			Entity parentEntity = EntityDAO.getByEntityID(parentEntityID);
			Property property = new Property();
			property.setParentEntityID(parentEntityID);
			property.setPropertyName(propertyName);
			property.setLabel(label);
			property.setDatatypeID(datatypeID);
			property.setSize(size);
			property.setIsPk(isPk);
			property.setCreatedBy(getCurrentUser().getUserID());
			property.setUpdatedBy(getCurrentUser().getUserID());
			property.setCreateDate(new Date());
			property.setUpdateDate(new Date());
			Datatype dataType=DatatypeDAO.getByDatatypeID(datatypeID);
			PropertyDDL.Create(Long.toString(getCurrentUser().getUserID()),  parentEntity.getEntityName(), propertyName, dataType.getDatatypeName(), size, isPk);
			PropertyDAO.create(property);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}