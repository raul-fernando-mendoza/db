package com.sl.db;
import java.util.ArrayList;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;


public class UserLoginAction extends BaseAction{

	private static final long serialVersionUID = 1L;

	private static Category m_logger = Logger.getLogger(UserLoginAction.class.getName());
		

	private String email;
	private String password;

		
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
	public String initialize(){
		email = "";
		password = "";
		return INPUT;
	}
	public String execute() throws Exception {
		String returnValue = INPUT;
		m_logger.debug("validating login and password not empty:" + email);
		if( null == email || email.length() == 0 ||
				null == password || password.isEmpty() == true){
			session.remove("user");
			addActionError("user.invalidCredentials");
			return INPUT;
		}
		m_logger.debug("encrypting password");
		String encryptedPassword = AES.encrypt(password);
		m_logger.debug("encrypting password:" + encryptedPassword);
		
		ArrayList<User> users = UserDAO.getByEmail(email); 
		m_logger.debug("users readead :" + users.size());
		if( users.size() > 0 ){
			m_logger.debug("user found with loginID:" + email );
			User tempUser = users.get(0);
			m_logger.debug("comparing:" + tempUser.getPassword() + "==" + encryptedPassword );
			if( tempUser.getPassword().equals(encryptedPassword) ){
				m_logger.debug("Is a valid password");
				User user = tempUser;
				session.put("user", user);
				m_logger.debug("login was successful");
				returnValue= SUCCESS;
			}
			else{
				m_logger.debug("the user password does not match or location is incorrect");
				addActionError("user.incorrectPassword");
				returnValue=INPUT;
			}
		}
		else{
			m_logger.debug("users with loginID:" + email + "has not been found");
			addActionError("user.notfound");
			returnValue=INPUT;
		}		
		return returnValue;
	}
}
