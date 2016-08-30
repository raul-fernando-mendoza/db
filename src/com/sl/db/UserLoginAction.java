package com.sl.db;
import java.util.ArrayList;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;


public class UserLoginAction extends BaseAction{

	private static final long serialVersionUID = 1L;

	private static Category m_logger = Logger.getLogger(UserLoginAction.class.getName());
		
	User user = new User();

	public User getData() {
		return user;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}



	String schema;
	
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
/*
	public static boolean isValidLoginIdPassword(String email, String password, String schema) throws Exception{
		boolean resultValue = false;
		if( null == email || email.length() == 0 ||
				null == password || password.length() == 0 ||
				null == schema || schema.length() == 0){
			return false;
		}
		m_logger.debug("encrypting password");
		String encryptedPassword = AES.encrypt(password);
		
		ArrayList<User> users = UserDAO.getByEmail(schema, email);
		m_logger.debug("users readead :" + users.size());
		if( users.size() > 0 ){
			m_logger.debug("user found with loginID:" + email );
			User user = users.get(0);
			
			
			if( user.getPassword().equals(encryptedPassword) ){
				m_logger.debug("Is a valid password");
				resultValue = true;
			}
			else{
				m_logger.debug("Incorrect password");
			}
		}

		return resultValue;
	}
*/	
	public String execute() throws Exception {
		String returnValue = ERROR;
		m_logger.debug("validating login and password not empty:" + user.getEmail());
		if( null == user.getEmail() || user.getEmail().length() == 0 ||
				null == user.getPassword() || user.getPassword().length() == 0 || 
				null == schema || schema.length() == 0){
			session.remove(schema + ".user");
			addActionError("user.invalidCredentials");
			return ERROR;
		}
		m_logger.debug("encrypting password");
		String encryptedPassword = AES.encrypt(user.getPassword());
		
		ArrayList<User> users = UserDAO.getByEmail(schema, user.getEmail()); 
		m_logger.debug("users readead :" + users.size());
		if( users.size() > 0 ){
			m_logger.debug("user found with loginID:" + user.getEmail() );
			User tempUser = users.get(0);
			m_logger.debug("comparing:" + tempUser.getPassword() + "==" + encryptedPassword );
			if( tempUser.getPassword().equals(encryptedPassword) ){
				m_logger.debug("Is a valid password");
				user = tempUser;
				session.put(schema + ".user", user);
				m_logger.debug("login was successful");
				returnValue= SUCCESS;
			}
			else{
				m_logger.debug("the user password does not match or location is incorrect");
				addActionError("user.incorrectPassword");
			}
		}
		else{
			m_logger.debug("users with loginID:" + user.getEmail() + "has not been found");
			addActionError("user.notfound");
		}		
		return returnValue;
	}
}
