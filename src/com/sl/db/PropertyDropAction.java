package com.sl.db;

import java.util.Collection;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class PropertyDropAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(PropertyDropAction.class.getName());
	
	
	long propertyID;
	
	Property property;
	
	Entity parentEntity;

	public long getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(long propertyID) {
		this.propertyID = propertyID;
	}
	
	public Object getData(){
		return property;
	}	

	public Property getProperty(){
		return property;
	}

	public Entity getParentEntity(){
		return parentEntity;
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
			property = PropertyDAO.getByPropertyID(propertyID);
			parentEntity = EntityDAO.getByEntityID(property.getParentEntityID());
		} catch (Exception e) {
			m_logger.debug("Property can not be found");
			addActionError(e.getMessage());
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	public String execute() {
		m_logger.debug("called PropertyDropAction");
		try {
			property = PropertyDAO.getByPropertyID(propertyID);
			parentEntity=EntityDAO.getByEntityID(property.getParentEntityID());
			PropertyDDL.Drop(Long.toString(getCurrentUser().getUserID()), parentEntity.getEntityName(), property.getPropertyName());
			PropertyDAO.deleteByPropertyID(propertyID);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
		
	}
	
	

}