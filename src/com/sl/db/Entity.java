package com.sl.db;

import java.util.Date;


public class Entity {
	private int entityID;
	private int parentEntityID;
	private String entityName;
	private String label;
	private String description;
	private int isMultiple;
	private int createdBy;
	private int updatedBy;
	private Date createDate;
	private Date updateDate;
	public int getEntityID() {
		return entityID;
	}
	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}
	public int getParentEntityID() {
		return parentEntityID;
	}
	public void setParentEntityID(int parentEntityID) {
		this.parentEntityID = parentEntityID;
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
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
