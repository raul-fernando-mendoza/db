package com.sl.db;

import java.util.ArrayList;
import java.util.Date;

public class User {
	
	private int userID;
	private String email;
	private String password;
	private Boolean isActive;
	private Date createDate;
	private Date updateDate;
	private ArrayList<UserRole> userRole;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isactive) {
		this.isActive = isactive;
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
	public ArrayList<UserRole> getUserRole() {
		return userRole;
	}
	public void setUserRole(ArrayList<UserRole> userRole) {
		this.userRole = userRole;
	}

}
