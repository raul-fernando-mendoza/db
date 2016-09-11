package com.sl.db;

import java.util.Date;


public class Entity {
	private long entityID;
	private long parentEntityID;
	private String entityName;
	private String label;
	private String description;
	private String isMultiple;
	private long createdBy;
	private long updatedBy;
	private Date createDate;
	private Date updateDate;
	public long getEntityID() {
		return entityID;
	}
	public void setEntityID(long entityID) {
		this.entityID = entityID;
	}
	public long getParentEntityID() {
		return parentEntityID;
	}
	public void setParentEntityID(long parentEntityID) {
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
	public String getIsMultiple() {
		return isMultiple;
	}
	public void setIsMultiple(String isMultiple) {
		this.isMultiple = isMultiple;
	}
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(long updatedBy) {
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
