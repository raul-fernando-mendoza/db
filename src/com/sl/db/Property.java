package com.sl.db;

import java.util.Date;

public class Property {
	long propertyID;
	long parentEntityID;
	String propertyName;
	String label;
	int datatypeID;
	int size;
	String isPk;
	long createdBy; 
	long updatedBy;
	Date createDate;
	Date updateDate;
	
	public long getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(long propertyID) {
		this.propertyID = propertyID;
	}

	public long getParentEntityID() {
		return parentEntityID;
	}

	public void setParentEntityID(long parentEntityID) {
		this.parentEntityID = parentEntityID;
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
