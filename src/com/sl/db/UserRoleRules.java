package com.sl.db;

public class UserRoleRules {
	public static boolean userHasRole(User u, String roleName){
		for(int i = 0;i<u.getUserRole().size(); i++){
			if( u.getUserRole().get(i).getRole().getRoleName().equals(roleName)){
				return true;
			}
		}
		return false;
	}	
}
