package com.sl.db;

public class UserRole {

	private int userRoleID;
	private int userID;
	private int roleID;
	
	private Role role;
	
	public int getUserRoleID() {
		return userRoleID;
	}
	public void setUserRoleID(int userRoleID) {
		this.userRoleID = userRoleID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
