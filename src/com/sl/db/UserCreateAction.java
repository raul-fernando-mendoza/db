package com.sl.db;
import java.util.Date;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class UserCreateAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private static Category m_logger = Logger.getLogger(UserCreateAction.class.getName());
	
	private String email;
	private String password;
	private String passwordConfirmation;

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


	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}


	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	public String initialize(){
		return SUCCESS;
	}

	public String execute() throws Exception {
		m_logger.debug("execute called");
		String result = INPUT;
		try{
			if( null == email || email.isEmpty() ){
				m_logger.error("email cannot be empty");
				addActionError( getText("user.invalidEmail") );
				result= INPUT;
			}
			else if(null == password || password.isEmpty()){
				m_logger.error("password is invalid");
				addActionError( getText("user.invalidPassword") );
				result= INPUT;
			}
			else if(password.equals(passwordConfirmation) != true){
				m_logger.error("password and confirmation does not match");
				addActionError( getText("user.invalidPasswordConfirmation") );
				result= INPUT;
			}
			else{
				m_logger.debug("Creating user");
				String encryptedPassword = AES.encrypt(password);
				User user= new User();
				user.setEmail(email);
				user.setPassword(encryptedPassword);
				user.setIsActive(true);
				user.setCreateDate(new Date());
				user.setUpdateDate(new Date());				
				long userID = UserDAO.create( user);
				user.setUserID(userID);
				session.put("user", user);
				m_logger.debug("User Creation successfull");
				result = SUCCESS;
			}
		}
		catch(Exception e){
			m_logger.error("an error has occurred:" + e);
			//if( e.getMessage().contains("UNIQUE_NAME"))
			addActionError(e.getMessage());
			//else
			//	addActionMessage(e.getMessage());
			result = INPUT;
		}
		return result;
	}



}
