package com.sl.db;
import java.util.Date;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class UserCreateAction extends BaseAction {

	private static final long serialVersionUID = 1L;

	private static Category m_logger = Logger.getLogger(UserCreateAction.class.getName());
		
	User user = new User();
	String schema;
	
	
	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String execute() throws Exception {
		m_logger.debug("execute called");
		String result = ERROR;
		try{
			if( null == user.getEmail() || user.getEmail().isEmpty() ||
					null == user.getPassword() || user.getPassword().isEmpty() ){
				addActionMessage( getText("user.invalidUserID") );
				result= ERROR;
			}
			else{
				m_logger.debug("Creating user");
				String encryptedPassword = AES.encrypt(user.getPassword());
				user.setPassword(encryptedPassword);
				user.setIsActive(true);
				user.setCreateDate(new Date());
				user.setUpdateDate(new Date());				
				int userID = UserDAO.create(schema, user);
				user.setUserID(userID);
				
				result = SUCCESS;
			}
		}
		catch(Exception e){
			m_logger.error("an error has occurred:" + e);
			//if( e.getMessage().contains("UNIQUE_NAME"))
			addActionMessage(e.getMessage());
			//else
			//	addActionMessage(e.getMessage());
			result = ERROR;
		}
		return result;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
