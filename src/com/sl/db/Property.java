package com.sl.db;

import java.util.Date;

public class Property {
	int propertyID;
	int parentEntityID;
	String propertyName;
	String label;
	int dataTypeID;
	int size;
	int isPk;
	int createdBy; 
	int updatedBy;
	Date createDate;
	Date updateDate;
	
	DataType dataType;

	public int getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	public int getParentEntityID() {
		return parentEntityID;
	}

	public void setParentEntityID(int parentEntityID) {
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

	public int getDataTypeID() {
		return dataTypeID;
	}

	public void setDataTypeID(int dataTypeID) {
		this.dataTypeID = dataTypeID;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getIsPk() {
		return isPk;
	}

	public void setIsPk(int isPk) {
		this.isPk = isPk;
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

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

}
