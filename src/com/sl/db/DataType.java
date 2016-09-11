package com.sl.db;

import java.util.Date;

public class Datatype {
		private int datatypeID;
		private String datatypeName;
		private String label;
		private long createdBy;
		private long updatedBy;
		private Date createDate;
		private Date updateDate;
		public int getDatatypeID() {
			return datatypeID;
		}
		public void setDatatypeID(int dataTypeID) {
			this.datatypeID = dataTypeID;
		}
		public String getDatatypeName() {
			return datatypeName;
		}
		public void setDatatypeName(String dataTypeName) {
			this.datatypeName = dataTypeName;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
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
