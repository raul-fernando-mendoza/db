/*
  DAO created for class: class is class com.sl.buscaenmonterrey.User using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: getUserID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: setUserID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: getEmail startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: setEmail startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: getPassword startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: setPassword startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: getIsActive startwith: get
	Method return type: class java.lang.Boolean

		is getter 
     Method type: class java.lang.Boolean
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: setIsActive startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.Boolean
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: getCreateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: setCreateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: getUpdateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: setUpdateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: getUserRole startwith: get
	Method return type: class java.util.ArrayList

		is getter 
     Method type: class java.util.ArrayList
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.User	
	Method Name: setUserRole startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.ArrayList
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: wait startwith: wai
	Method return type: void

     Method type: void
     Parameters:
     		long
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: wait startwith: wai
	Method return type: void

     Method type: void
     Parameters:
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: wait startwith: wai
	Method return type: void

     Method type: void
     Parameters:
     		long
     		int
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: equals startwith: equ
	Method return type: boolean

     Method type: boolean
     Parameters:
     		java.lang.Object
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: toString startwith: toS
	Method return type: class java.lang.String

     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: hashCode startwith: has
	Method return type: int

     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: getClass startwith: get
	Method return type: class java.lang.Class

		is getter 
     Method type: class java.lang.Class
     Parameters:
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: notify startwith: not
	Method return type: void

     Method type: void
     Parameters:
-------------------
	Method Declaring Class: class java.lang.Object	
	Method Name: notifyAll startwith: not
	Method return type: void

     Method type: void
     Parameters:
-------------------
*/

 //	searching for getID

		//int getUserID 
		//void setUserID 
		//class java.lang.String getEmail 
		//void setEmail 
		//class java.lang.String getPassword 
		//void setPassword 
		//class java.lang.Boolean getIsActive 
		//void setIsActive 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
		//class java.util.Date getUpdateDate 
		//void setUpdateDate 
		//class java.util.ArrayList getUserRole 
		//void setUserRole 
		//void wait 
		//void wait 
		//void wait 
		//boolean equals 
		//class java.lang.String toString 
		//int hashCode 
		//class java.lang.Class getClass 
		//void notify 
		//void notifyAll 

package com.sl.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.apache.log4j.Logger;


public class UserDAO extends DAOBase{
	private static Logger m_logger = Logger.getLogger(UserDAO.class.getName());

 	public static int create(String schema,User user) throws Exception {
		Connection conn = Database.getConnection();
		Integer identity = null;
		PreparedStatement pstmt = null;
		try {
			String f = "";
			String v = "";
			
			
			
		//int getUserID
			//f += " user_id";
			//v += " ?";
		//class java.lang.String getEmail
			f += " email";
			v += " ?";
		//class java.lang.String getPassword
			f += ", password";
			v += ", ?";
		//class java.lang.Boolean getIsActive
			f += ", is_active";
			v += ", ?";
		//class java.util.Date getCreateDate
			//f += ", create_date";
			//v += ", ?";
		//class java.util.Date getUpdateDate
			//f += ", update_date";
			//v += ", ?";
		//class java.util.ArrayList getUserRole
			String qry = "insert into user(" + f + ") values(" + v + ");";
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//int getUserID
			//m_logger.debug("user.getUserID() :" + user.getUserID() );
			//pstmt.setInt(i++ , user.getUserID() );
		//class java.lang.String getEmail
			m_logger.debug("user.getEmail() :" + user.getEmail() );
			setPrepararedStatementString( pstmt, i++, user.getEmail() );
		//class java.lang.String getPassword
			m_logger.debug("user.getPassword() :" + user.getPassword() );
			setPrepararedStatementString( pstmt, i++, user.getPassword() );
		//class java.lang.Boolean getIsActive
			m_logger.debug("user.getIsActive() :" + user.getIsActive() );
			setPrepararedStatementBoolean( pstmt, i++, user.getIsActive() );
		//class java.util.Date getCreateDate
			//pstmt.setDate(i++ , null);
		//class java.util.Date getUpdateDate
			//pstmt.setDate(i++ , null);
		//class java.util.ArrayList getUserRole
			
			pstmt.executeUpdate(); // execute insert statement
		} catch (SQLException e) {
			m_logger.error(e);
		//int getUserID
		m_logger.error("user.getUserID() :" + user.getUserID() );
		//class java.lang.String getEmail
		m_logger.error("user.getEmail() :" + user.getEmail() );
		//class java.lang.String getPassword
		m_logger.error("user.getPassword() :" + user.getPassword() );
		//class java.lang.Boolean getIsActive
		m_logger.error("user.getIsActive() :" + user.getIsActive() );
		//class java.util.Date getCreateDate
		m_logger.error("user.getCreateDate() :" + user.getCreateDate() );
		//class java.util.Date getUpdateDate
		m_logger.error("user.getUpdateDate() :" + user.getUpdateDate() );
		//class java.util.ArrayList getUserRole
		m_logger.error("user.getUserRole() :" + user.getUserRole() );
			pstmt.close();
			pstmt = null;
			throw( e);
		} finally {
			pstmt.close();
			pstmt = null;
		}
		// recover the id used to insert
		Statement stIdentity = null;
		ResultSet resIdentity = null;
		try{
			stIdentity = conn.createStatement();
			resIdentity = stIdentity.executeQuery("select LAST_INSERT_ID()");
			if (resIdentity.next()) {
				m_logger.debug("Generated key: " + resIdentity.getInt(1));
				identity = new Integer(resIdentity.getInt(1));
			}
		} catch (SQLException e) {
			m_logger.error(e);
			resIdentity.close();
			resIdentity = null;
			stIdentity.close();
			stIdentity = null;
			throw( e);
		} finally {
			resIdentity.close();
			resIdentity = null;
			stIdentity.close();
			stIdentity = null;
		}	
		conn = null;
		
		user.setUserID(identity.intValue());

		return identity.intValue();
		
	}
	
//	searching for keys
		//int getUserID 
		//void setUserID 
		//	parameter 0 : int
		//class java.lang.String getEmail 
		//void setEmail 
		//	parameter 0 : java.lang.String
			//setEmail is a key setter
//****
	public static ArrayList<User> getByEmail(String schema, String Email) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<User> arrUser = new ArrayList<User>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//int getUserID class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setUserID class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setUserID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + " user_id"
	 
			//class java.lang.String getEmail class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setEmail class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setEmail(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", email"
	 
			//class java.lang.String getPassword class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setPassword class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setPassword(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", password"
	 
			//class java.lang.Boolean getIsActive class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setIsActive class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setIsActive(java.lang.Boolean)
			//	parameter method : class java.lang.Boolean
			//	parameter 0 : java.lang.Boolean
				
				 + ", is_active"
	 
			//class java.util.Date getCreateDate class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setCreateDate class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//class java.util.Date getUpdateDate class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setUpdateDate class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.util.ArrayList getUserRole class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setUserRole class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setUserRole(java.util.ArrayList)
			//	parameter method : class java.util.ArrayList
			//	parameter 0 : java.util.ArrayList
				
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//boolean equals class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//int hashCode class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//void notify class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//void notifyAll class java.lang.Object class com.sl.buscaenmonterrey.User
			
					+ " FROM "
					+ " " + schema + "$user" 
					+ " WHERE email = '" + Email + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				User user =  new User();
			//int getUserID
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getInt("user_id") + ")" );
				user.setUserID(rs.getInt("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//class java.lang.String getPassword
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//class java.lang.Boolean getIsActive
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
			//class java.util.Date getUpdateDate
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.util.ArrayList getUserRole
			//void setUserRole
			//void wait
			//void wait
			//void wait
			//boolean equals
			//class java.lang.String toString
			//int hashCode
			//class java.lang.Class getClass
			//void notify
			//void notifyAll

	//getting dependencies	
		//int getUserID 
		//void setUserID 
			//	parameter 0 : int
				
		//class java.lang.String getEmail 
		//void setEmail 
			//	parameter 0 : java.lang.String
				
				//setEmail is a key setter
				//keytype: String
		//class java.lang.String getPassword 
		//void setPassword 
			//	parameter 0 : java.lang.String
				
				//setPassword is a key setter
				//keytype: String
		//class java.lang.Boolean getIsActive 
		//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				
				//setIsActive is a key setter
				//keytype: Boolean
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//class java.util.Date getUpdateDate 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.util.ArrayList getUserRole 
		//void setUserRole 
			//	parameter 0 : java.util.ArrayList
				
				//setUserRole is a key setter
				//keytype: ArrayList
					    //retrieve using the class ID
						user.setUserRole( UserRoleDAO.getByUserID(schema, user.getUserID()));
		//void wait 
		//void wait 
		//void wait 
		//boolean equals 
		//class java.lang.String toString 
		//int hashCode 
		//class java.lang.Class getClass 
		//void notify 
		//void notifyAll 
	//end getting dependencies  
				arrUser.add(user);
			}
			rs.close();
			rs = null;
		} catch (SQLException e) {
			m_logger.error(e);
			st.close();
			st = null;
			throw( e);
		} finally {
			st.close();
			st = null;
		}	

		return arrUser;
	}

	public static void deleteByEmail(String schema, String Email) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from " + schema + "$user"
					+ " WHERE email = '" + Email + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + Email);
			} else {
				m_logger.debug("record was deleted");
			}
		} catch (SQLException e) {
			m_logger.error(e);
			st.close();
			st = null;
			throw( e);
		} finally {
			st.close();
			st = null;
		}	
	}
			
			
//******	
		//class java.lang.Boolean getIsActive 
		//void setIsActive 
		//	parameter 0 : java.lang.Boolean
			//setIsActive is a key setter
//****
	public static ArrayList<User> getByIsActive(String schema,Boolean IsActive) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<User> arrUser = new ArrayList<User>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//int getUserID class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setUserID class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setUserID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + " user_id"
	 
			//class java.lang.String getEmail class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setEmail class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setEmail(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", email"
	 
			//class java.lang.String getPassword class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setPassword class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setPassword(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", password"
	 
			//class java.lang.Boolean getIsActive class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setIsActive class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setIsActive(java.lang.Boolean)
			//	parameter method : class java.lang.Boolean
			//	parameter 0 : java.lang.Boolean
				
				 + ", is_active"
	 
			//class java.util.Date getCreateDate class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setCreateDate class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//class java.util.Date getUpdateDate class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setUpdateDate class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.util.ArrayList getUserRole class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
	 
			//void setUserRole class com.sl.buscaenmonterrey.User class com.sl.buscaenmonterrey.User
			
			//	parameter method : public void com.sl.buscaenmonterrey.User.setUserRole(java.util.ArrayList)
			//	parameter method : class java.util.ArrayList
			//	parameter 0 : java.util.ArrayList
				
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//boolean equals class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//int hashCode class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//void notify class java.lang.Object class com.sl.buscaenmonterrey.User
			
	 
			//void notifyAll class java.lang.Object class com.sl.buscaenmonterrey.User
			
					+ " FROM " + schema + "$user" 
					+ " WHERE is_active = " + IsActive;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				User user =  new User();
			//int getUserID
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getInt("user_id") + ")" );
				user.setUserID(rs.getInt("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//class java.lang.String getPassword
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//class java.lang.Boolean getIsActive
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
			//class java.util.Date getUpdateDate
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.util.ArrayList getUserRole
			//void setUserRole
			//void wait
			//void wait
			//void wait
			//boolean equals
			//class java.lang.String toString
			//int hashCode
			//class java.lang.Class getClass
			//void notify
			//void notifyAll

	//getting dependencies	
		//int getUserID 
		//void setUserID 
			//	parameter 0 : int
				
		//class java.lang.String getEmail 
		//void setEmail 
			//	parameter 0 : java.lang.String
				
				//setEmail is a key setter
				//keytype: String
		//class java.lang.String getPassword 
		//void setPassword 
			//	parameter 0 : java.lang.String
				
				//setPassword is a key setter
				//keytype: String
		//class java.lang.Boolean getIsActive 
		//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				
				//setIsActive is a key setter
				//keytype: Boolean
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//class java.util.Date getUpdateDate 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.util.ArrayList getUserRole 
		//void setUserRole 
			//	parameter 0 : java.util.ArrayList
				
				//setUserRole is a key setter
				//keytype: ArrayList
					    //retrieve using the class ID
						user.setUserRole( UserRoleDAO.getByUserID(schema, user.getUserID()));
		//void wait 
		//void wait 
		//void wait 
		//boolean equals 
		//class java.lang.String toString 
		//int hashCode 
		//class java.lang.Class getClass 
		//void notify 
		//void notifyAll 
	//end getting dependencies  
				arrUser.add(user);
			}
			rs.close();
			rs = null;
		} catch (SQLException e) {
			m_logger.error(e);
			st.close();
			st = null;
			throw( e);
		} finally {
			st.close();
			st = null;
		}	

		return arrUser;
	}

 
	public static User getByUserID(String schema,int userID) throws Exception {
		// read all the records in a buffer (m_ads)
		User user = null;
		
		Connection conn = Database.getConnection();

		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//int getUserID 
			//void setUserID 
			//	parameter 0 : int
				 + " user_id"
			//class java.lang.String getEmail 
			//void setEmail 
			//	parameter 0 : java.lang.String
				 + ", email"
			//class java.lang.String getPassword 
			//void setPassword 
			//	parameter 0 : java.lang.String
				 + ", password"
			//class java.lang.Boolean getIsActive 
			//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				 + ", is_active"
			//class java.util.Date getCreateDate 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//class java.util.Date getUpdateDate 
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//class java.util.ArrayList getUserRole 
			//void setUserRole 
			//	parameter 0 : java.util.ArrayList
			//void wait 
			//void wait 
			//void wait 
			//boolean equals 
			//class java.lang.String toString 
			//int hashCode 
			//class java.lang.Class getClass 
			//void notify 
			//void notifyAll 
					+ " FROM " + schema + "$user" 
					+ " WHERE user_id = " + userID;

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);

			if (rs.next()) {
				user = new User();
			//int getUserID
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getInt("user_id") + ")" );
				user.setUserID(rs.getInt("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//class java.lang.String getPassword
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//class java.lang.Boolean getIsActive
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
			//class java.util.Date getUpdateDate
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.util.ArrayList getUserRole
			//void setUserRole
			//void wait
			//void wait
			//void wait
			//boolean equals
			//class java.lang.String toString
			//int hashCode
			//class java.lang.Class getClass
			//void notify
			//void notifyAll

			}
			rs.close();
			rs = null;
		} catch (SQLException e) {
			m_logger.error(e);
			st.close();
			st = null;
			throw( e);
		} finally {
			st.close();
			st = null;
		}
		//getting dependencies	
		//int getUserID 
		//void setUserID 
			//	parameter 0 : int
		//class java.lang.String getEmail 
		//void setEmail 
			//	parameter 0 : java.lang.String
				//setEmail is a key setter
				//keytype: String
		//class java.lang.String getPassword 
		//void setPassword 
			//	parameter 0 : java.lang.String
				//setPassword is a key setter
				//keytype: String
		//class java.lang.Boolean getIsActive 
		//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				//setIsActive is a key setter
				//keytype: Boolean
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				//setCreateDate is a key setter
				//keytype: Date
		//class java.util.Date getUpdateDate 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.util.ArrayList getUserRole 
		//void setUserRole 
			//	parameter 0 : java.util.ArrayList
				//setUserRole is a key setter
				//keytype: ArrayList
					    //retrieve using the class ID
						user.setUserRole( UserRoleDAO.getByUserID(schema, user.getUserID()));
		//void wait 
		//void wait 
		//void wait 
		//boolean equals 
		//class java.lang.String toString 
		//int hashCode 
		//class java.lang.Class getClass 
		//void notify 
		//void notifyAll 
	//end getting dependencies	
		
		return user;
	}
	
	public static void deleteByUserID(String schema, int userID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from " + schema + "$user where user_id=" + userID;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting record:" + userID);
			} else {
				m_logger.debug("record was deleted correctly:" + userID);
			}
		} catch (SQLException e) {
			m_logger.error(e);
			st.close();
			st = null;
			throw( e);
		} finally {
			st.close();
			st = null;
		}	
	
		conn = null;
	}

 
	public static void update(String schema, User user) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		try {
			String f = "";
			
		//int getUserID
			f += " user_id = ?";
		//class java.lang.String getEmail
			f += ", email = ?";
		//class java.lang.String getPassword
			f += ", password = ?";
		//class java.lang.Boolean getIsActive
			f += ", is_active = ?";
		//class java.util.Date getCreateDate
			f += ", create_date = ?";
		//class java.util.Date getUpdateDate
			f += ", update_date = ?";
		//class java.util.ArrayList getUserRole
			String qry = "update " + schema + "$user set " + f + " where user_id = " + user.getUserID() ;
			m_logger.debug(qry);
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//int getUserID
			pstmt.setInt(i++ , user.getUserID() );

		//class java.lang.String getEmail
			setPrepararedStatementString( pstmt, i++, user.getEmail() );

		//class java.lang.String getPassword
			setPrepararedStatementString( pstmt, i++, user.getPassword() );

		//class java.lang.Boolean getIsActive
			setPrepararedStatementBoolean( pstmt, i++, user.getIsActive() );

		//class java.util.Date getCreateDate
			setPrepararedStatementDate( pstmt, i++, user.getCreateDate() );

		//class java.util.Date getUpdateDate
			setPrepararedStatementDate( pstmt, i++, new Date() );

		//class java.util.ArrayList getUserRole

			
			pstmt.executeUpdate(); // execute insert statement
		} catch (SQLException e) {
			m_logger.error(e);
			pstmt.close();
			pstmt = null;
			throw( e);
		} finally {
			pstmt.close();
			pstmt = null;
		}	

	}
// end searching for setUserID
  	
	public static Collection<User> getListAll(String schema) throws Exception {
		// read all the records in a buffer 
		ArrayList<User> list = new ArrayList<User>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//int getUserID 
			//void setUserID 
			//	parameter 0 : int
				 + " user_id"
			//class java.lang.String getEmail 
			//void setEmail 
			//	parameter 0 : java.lang.String
				 + ", email"
			//class java.lang.String getPassword 
			//void setPassword 
			//	parameter 0 : java.lang.String
				 + ", password"
			//class java.lang.Boolean getIsActive 
			//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				 + ", is_active"
			//class java.util.Date getCreateDate 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//class java.util.Date getUpdateDate 
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//class java.util.ArrayList getUserRole 
			//void setUserRole 
			//	parameter 0 : java.util.ArrayList
			//void wait 
			//void wait 
			//void wait 
			//boolean equals 
			//class java.lang.String toString 
			//int hashCode 
			//class java.lang.Class getClass 
			//void notify 
			//void notifyAll 
					+ " FROM " + schema + "$user"; 

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
		
			while (rs.next()) {
				User user = new User();
			//int getUserID
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getInt("user_id") + ")" );
				user.setUserID(rs.getInt("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//class java.lang.String getPassword
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//class java.lang.Boolean getIsActive
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
			//class java.util.Date getUpdateDate
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.util.ArrayList getUserRole
			//void setUserRole
			//void wait
			//void wait
			//void wait
			//boolean equals
			//class java.lang.String toString
			//int hashCode
			//class java.lang.Class getClass
			//void notify
			//void notifyAll
		//getting dependencies	
		//int getUserID 
		//void setUserID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
		//class java.lang.String getEmail 
		//void setEmail 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setEmail is a key setter
				//keytype1: String
		//class java.lang.String getPassword 
		//void setPassword 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setPassword is a key setter
				//keytype1: String
		//class java.lang.Boolean getIsActive 
		//void setIsActive 
			//  parameter 0 definition: class java.lang.Boolean
			//	parameter 0 : java.lang.Boolean
			
				//setIsActive is a key setter
				//keytype1: Boolean
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setCreateDate is a key setter
				//keytype1: Date
		//class java.util.Date getUpdateDate 
		//void setUpdateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setUpdateDate is a key setter
				//keytype1: Date
		//class java.util.ArrayList getUserRole 
		//void setUserRole 
			//  parameter 0 definition: class java.util.ArrayList
			//	parameter 0 : java.util.ArrayList
			
				//setUserRole is a key setter
				//keytype1: ArrayList
					    //retrieve using the class ID
						user.setUserRole( UserRoleDAO.getByUserID(schema, user.getUserID()));
		//void wait 
		//void wait 
		//void wait 
		//boolean equals 
		//class java.lang.String toString 
		//int hashCode 
		//class java.lang.Class getClass 
		//void notify 
		//void notifyAll 
	//end getting dependencies	 	  
	  
				list.add( user );
			}
			rs.close();
			rs = null;
		} catch (SQLException e) {
			m_logger.error(e);
			st.close();
			st = null;
			throw( e);
		} finally {
			st.close();
			st = null;
		}
		return list;
	}

}
