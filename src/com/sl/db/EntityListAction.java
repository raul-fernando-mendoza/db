package com.sl.db;

import java.util.ArrayList;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class EntityListAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(EntityListAction.class.getName());
	
	Entity[] arr_entities;

	public Object getData(){
		return arr_entities;
	}


	
	public String execute() {
		m_logger.debug("called CreateEntityAction");
		try {
			ArrayList<Entity> entities = EntityDAO.getByCreatedBy(getCurrentUser().getUserID());
			entities.sort((o1, o2) -> o1.getEntityName().compareTo(o2.getEntityName()));
			arr_entities = new Entity[entities.size()];
			entities.toArray(arr_entities);
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getMessage()); 
			return ERROR;
		}
		return SUCCESS;
	}
	
	

}