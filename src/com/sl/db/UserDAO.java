/*
  DAO created for class: class is class com.sl.db.User using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.db.User	
	Method Name: setUserID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		long
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: getEmail startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: setEmail startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: setPassword startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: setIsActive startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.Boolean
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: getUpdateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: getPassword startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: getUserID startwith: get
	Method return type: long

		is getter 
     Method type: long
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: setUpdateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: getIsActive startwith: get
	Method return type: class java.lang.Boolean

		is getter 
     Method type: class java.lang.Boolean
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: getCreateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.User	
	Method Name: setCreateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
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
	Method Name: wait startwith: wai
	Method return type: void

     Method type: void
     Parameters:
     		long
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

		//void setUserID 
		//class java.lang.String getEmail 
		//void setEmail 
		//void setPassword 
		//void setIsActive 
		//class java.util.Date getUpdateDate 
		//class java.lang.String getPassword 
		//long getUserID 
		//void setUpdateDate 
		//class java.lang.Boolean getIsActive 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
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

 	public static long create(User user) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		int id=0;
		
		try {
			String f = "";
			String v = "";
			
			
			
		//class java.lang.String getEmail
			f += " email";
			v += " ?";
		//class java.util.Date getUpdateDate
			f += ", update_date";
			v += ", ?";
		//class java.lang.String getPassword
			f += ", password";
			v += ", ?";
		//long getUserID
			//f += ", user_id";
			//v += ", ?";
		//class java.lang.Boolean getIsActive
			f += ", is_active";
			v += ", ?";
		//class java.util.Date getCreateDate
			f += ", create_date";
			v += ", ?";
			String qry = "insert into user(" + f + ") values(" + v + ");";
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry,Statement.RETURN_GENERATED_KEYS); // create a statement
			int i=1;

		//class java.lang.String getEmail
			m_logger.debug("user.getEmail() :" + user.getEmail() );
			setPrepararedStatementString( pstmt, i++, user.getEmail() );
		//class java.util.Date getUpdateDate
			setPrepararedStatementDate(pstmt, i++ , new Date());
		//class java.lang.String getPassword
			m_logger.debug("user.getPassword() :" + user.getPassword() );
			setPrepararedStatementString( pstmt, i++, user.getPassword() );
		//long getUserID
			//m_logger.debug("user.getUserID() :" + user.getUserID() );
			//pstmt.setInt(i++ , user.getUserID() );
		//class java.lang.Boolean getIsActive
			m_logger.debug("user.getIsActive() :" + user.getIsActive() );
			setPrepararedStatementBoolean( pstmt, i++, user.getIsActive() );
		//class java.util.Date getCreateDate
			setPrepararedStatementDate(pstmt, i++ , new Date());
			
			pstmt.executeUpdate(); // execute insert statement
			
			ResultSet rs = pstmt.getGeneratedKeys();
			// get generated key
			if (rs != null && rs.next()) {
			  id = rs.getInt(1);
			  m_logger.debug("generated key:" + id);
			}
						
			user.setUserID(id);
			
		} catch (SQLException e) {
			m_logger.error(e);
		//class java.lang.String getEmail
		m_logger.error("user.getEmail() :" + user.getEmail() );
		//class java.util.Date getUpdateDate
		m_logger.error("user.getUpdateDate() :" + user.getUpdateDate() );
		//class java.lang.String getPassword
		m_logger.error("user.getPassword() :" + user.getPassword() );
		//long getUserID
		m_logger.error("user.getUserID() :" + user.getUserID() );
		//class java.lang.Boolean getIsActive
		m_logger.error("user.getIsActive() :" + user.getIsActive() );
		//class java.util.Date getCreateDate
		m_logger.error("user.getCreateDate() :" + user.getCreateDate() );
			pstmt.close();
			pstmt = null;
			throw( e);
		} finally {
			pstmt.close();
			pstmt = null;
		}
		
		return id;
		
	}
	
//	searching for keys
		//void setUserID 
		//	parameter 0 : long
		//class java.lang.String getEmail 
		//void setEmail 
		//	parameter 0 : java.lang.String
			//setEmail is a key setter
//****
	public static ArrayList<User> getByEmail(String Email) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<User> arrUser = new ArrayList<User>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//void setUserID class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setUserID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " user_id"
	 
			//class java.lang.String getEmail class com.sl.db.User class com.sl.db.User
			
	 
			//void setEmail class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setEmail(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", email"
	 
			//void setPassword class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setPassword(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", password"
	 
			//void setIsActive class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setIsActive(java.lang.Boolean)
			//	parameter method : class java.lang.Boolean
			//	parameter 0 : java.lang.Boolean
				
				 + ", is_active"
	 
			//class java.util.Date getUpdateDate class com.sl.db.User class com.sl.db.User
			
	 
			//class java.lang.String getPassword class com.sl.db.User class com.sl.db.User
			
	 
			//long getUserID class com.sl.db.User class com.sl.db.User
			
	 
			//void setUpdateDate class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.lang.Boolean getIsActive class com.sl.db.User class com.sl.db.User
			
	 
			//class java.util.Date getCreateDate class com.sl.db.User class com.sl.db.User
			
	 
			//void setCreateDate class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//boolean equals class java.lang.Object class com.sl.db.User
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.User
			
	 
			//int hashCode class java.lang.Object class com.sl.db.User
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.User
			
	 
			//void notify class java.lang.Object class com.sl.db.User
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.User
			
					+ " FROM "
					+ " user" 
					+ " WHERE email = '" + Email + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				User user =  new User();
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getLong("user_id") + ")" );
				user.setUserID(rs.getLong("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getUpdateDate
			//class java.lang.String getPassword
			//long getUserID
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.lang.Boolean getIsActive
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
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
		//void setUserID 
			//	parameter 0 : long
				
		//class java.lang.String getEmail 
		//void setEmail 
			//	parameter 0 : java.lang.String
				
				//setEmail is a key setter
				//keytype: String
		//void setPassword 
			//	parameter 0 : java.lang.String
				
				//setPassword is a key setter
				//keytype: String
		//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				
				//setIsActive is a key setter
				//keytype: Boolean
		//class java.util.Date getUpdateDate 
		//class java.lang.String getPassword 
		//long getUserID 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.lang.Boolean getIsActive 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
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

	public static void deleteByEmail(String Email) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from user"
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
		//void setPassword 
		//	parameter 0 : java.lang.String
			//setPassword is a key setter
//****
	public static ArrayList<User> getByPassword(String Password) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<User> arrUser = new ArrayList<User>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//void setUserID class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setUserID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " user_id"
	 
			//class java.lang.String getEmail class com.sl.db.User class com.sl.db.User
			
	 
			//void setEmail class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setEmail(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", email"
	 
			//void setPassword class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setPassword(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", password"
	 
			//void setIsActive class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setIsActive(java.lang.Boolean)
			//	parameter method : class java.lang.Boolean
			//	parameter 0 : java.lang.Boolean
				
				 + ", is_active"
	 
			//class java.util.Date getUpdateDate class com.sl.db.User class com.sl.db.User
			
	 
			//class java.lang.String getPassword class com.sl.db.User class com.sl.db.User
			
	 
			//long getUserID class com.sl.db.User class com.sl.db.User
			
	 
			//void setUpdateDate class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.lang.Boolean getIsActive class com.sl.db.User class com.sl.db.User
			
	 
			//class java.util.Date getCreateDate class com.sl.db.User class com.sl.db.User
			
	 
			//void setCreateDate class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//boolean equals class java.lang.Object class com.sl.db.User
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.User
			
	 
			//int hashCode class java.lang.Object class com.sl.db.User
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.User
			
	 
			//void notify class java.lang.Object class com.sl.db.User
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.User
			
					+ " FROM "
					+ " user" 
					+ " WHERE password = '" + Password + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				User user =  new User();
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getLong("user_id") + ")" );
				user.setUserID(rs.getLong("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getUpdateDate
			//class java.lang.String getPassword
			//long getUserID
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.lang.Boolean getIsActive
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
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
		//void setUserID 
			//	parameter 0 : long
				
		//class java.lang.String getEmail 
		//void setEmail 
			//	parameter 0 : java.lang.String
				
				//setEmail is a key setter
				//keytype: String
		//void setPassword 
			//	parameter 0 : java.lang.String
				
				//setPassword is a key setter
				//keytype: String
		//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				
				//setIsActive is a key setter
				//keytype: Boolean
		//class java.util.Date getUpdateDate 
		//class java.lang.String getPassword 
		//long getUserID 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.lang.Boolean getIsActive 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
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

	public static void deleteByPassword(String Password) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from user"
					+ " WHERE password = '" + Password + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + Password);
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
		//void setIsActive 
		//	parameter 0 : java.lang.Boolean
			//setIsActive is a key setter
//****
	public static ArrayList<User> getByIsActive(Boolean IsActive) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<User> arrUser = new ArrayList<User>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//void setUserID class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setUserID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " user_id"
	 
			//class java.lang.String getEmail class com.sl.db.User class com.sl.db.User
			
	 
			//void setEmail class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setEmail(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", email"
	 
			//void setPassword class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setPassword(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", password"
	 
			//void setIsActive class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setIsActive(java.lang.Boolean)
			//	parameter method : class java.lang.Boolean
			//	parameter 0 : java.lang.Boolean
				
				 + ", is_active"
	 
			//class java.util.Date getUpdateDate class com.sl.db.User class com.sl.db.User
			
	 
			//class java.lang.String getPassword class com.sl.db.User class com.sl.db.User
			
	 
			//long getUserID class com.sl.db.User class com.sl.db.User
			
	 
			//void setUpdateDate class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.lang.Boolean getIsActive class com.sl.db.User class com.sl.db.User
			
	 
			//class java.util.Date getCreateDate class com.sl.db.User class com.sl.db.User
			
	 
			//void setCreateDate class com.sl.db.User class com.sl.db.User
			
			//	parameter method : public void com.sl.db.User.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//void wait class java.lang.Object class com.sl.db.User
			
	 
			//boolean equals class java.lang.Object class com.sl.db.User
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.User
			
	 
			//int hashCode class java.lang.Object class com.sl.db.User
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.User
			
	 
			//void notify class java.lang.Object class com.sl.db.User
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.User
			
					+ " FROM "
					+ " user" 
					+ " WHERE is_active = " + IsActive;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				User user =  new User();
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getLong("user_id") + ")" );
				user.setUserID(rs.getLong("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getUpdateDate
			//class java.lang.String getPassword
			//long getUserID
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.lang.Boolean getIsActive
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
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
		//void setUserID 
			//	parameter 0 : long
				
		//class java.lang.String getEmail 
		//void setEmail 
			//	parameter 0 : java.lang.String
				
				//setEmail is a key setter
				//keytype: String
		//void setPassword 
			//	parameter 0 : java.lang.String
				
				//setPassword is a key setter
				//keytype: String
		//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				
				//setIsActive is a key setter
				//keytype: Boolean
		//class java.util.Date getUpdateDate 
		//class java.lang.String getPassword 
		//long getUserID 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.lang.Boolean getIsActive 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
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

	public static void deleteByIsActive(Boolean IsActive) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from user"
					+ " WHERE is_active = " + IsActive;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + IsActive);
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
		//class java.util.Date getUpdateDate 
		//class java.lang.String getPassword 
		//long getUserID 
		//void setUpdateDate 
		//	parameter 0 : java.util.Date
			//setUpdateDate is a key setter
//****
		//class java.lang.Boolean getIsActive 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
		//	parameter 0 : java.util.Date
			//setCreateDate is a key setter
//****
		//void wait 
		//void wait 
		//void wait 
		//boolean equals 
		//class java.lang.String toString 
		//int hashCode 
		//class java.lang.Class getClass 
		//void notify 
		//void notifyAll 

 // end searching for keys
 
//****
 
	public static User getByUserID(int userID) throws Exception {
		// read all the records in a buffer (m_ads)
		User user = null;
		
		Connection conn = Database.getConnection();

		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//void setUserID 
			//	parameter 0 : long
				 + " user_id"
			//class java.lang.String getEmail 
			//void setEmail 
			//	parameter 0 : java.lang.String
				 + ", email"
			//void setPassword 
			//	parameter 0 : java.lang.String
				 + ", password"
			//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				 + ", is_active"
			//class java.util.Date getUpdateDate 
			//class java.lang.String getPassword 
			//long getUserID 
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//class java.lang.Boolean getIsActive 
			//class java.util.Date getCreateDate 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//void wait 
			//void wait 
			//void wait 
			//boolean equals 
			//class java.lang.String toString 
			//int hashCode 
			//class java.lang.Class getClass 
			//void notify 
			//void notifyAll 
					+ " FROM "
					+ " user" 
					+ " WHERE user_id = " + userID;

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);

			if (rs.next()) {
				user = new User();
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getLong("user_id") + ")" );
				user.setUserID(rs.getLong("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getUpdateDate
			//class java.lang.String getPassword
			//long getUserID
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.lang.Boolean getIsActive
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
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
		//void setUserID 
			//	parameter 0 : long
		//class java.lang.String getEmail 
		//void setEmail 
			//	parameter 0 : java.lang.String
				//setEmail is a key setter
				//keytype: String
		//void setPassword 
			//	parameter 0 : java.lang.String
				//setPassword is a key setter
				//keytype: String
		//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				//setIsActive is a key setter
				//keytype: Boolean
		//class java.util.Date getUpdateDate 
		//class java.lang.String getPassword 
		//long getUserID 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.lang.Boolean getIsActive 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				//setCreateDate is a key setter
				//keytype: Date
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
	
	public static void deleteByUserID(int userID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from user where user_id=" + userID;
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

 
	public static void update(User user) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		try {
			String f = "";
			
		//class java.lang.String getEmail
			f += " email = ?";
		//class java.util.Date getUpdateDate
			f += ", update_date = ?";
		//class java.lang.String getPassword
			f += ", password = ?";
		//long getUserID
			f += ", user_id = ?";
		//class java.lang.Boolean getIsActive
			f += ", is_active = ?";
		//class java.util.Date getCreateDate
			f += ", create_date = ?";
			String qry = "update user set " + f + " where user_id = " + user.getUserID() ;
			m_logger.debug(qry);
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//class java.lang.String getEmail
			setPrepararedStatementString( pstmt, i++, user.getEmail() );

		//class java.util.Date getUpdateDate
			setPrepararedStatementDate( pstmt, i++, new Date() );

		//class java.lang.String getPassword
			setPrepararedStatementString( pstmt, i++, user.getPassword() );

		//long getUserID

		//class java.lang.Boolean getIsActive
			setPrepararedStatementBoolean( pstmt, i++, user.getIsActive() );

		//class java.util.Date getCreateDate
			setPrepararedStatementDate( pstmt, i++, user.getCreateDate() );

			
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
  	
	public static Collection<User> getListAll() throws Exception {
		// read all the records in a buffer 
		ArrayList<User> list = new ArrayList<User>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//void setUserID 
			//	parameter 0 : long
				 + " user_id"
			//class java.lang.String getEmail 
			//void setEmail 
			//	parameter 0 : java.lang.String
				 + ", email"
			//void setPassword 
			//	parameter 0 : java.lang.String
				 + ", password"
			//void setIsActive 
			//	parameter 0 : java.lang.Boolean
				 + ", is_active"
			//class java.util.Date getUpdateDate 
			//class java.lang.String getPassword 
			//long getUserID 
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//class java.lang.Boolean getIsActive 
			//class java.util.Date getCreateDate 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//void wait 
			//void wait 
			//void wait 
			//boolean equals 
			//class java.lang.String toString 
			//int hashCode 
			//class java.lang.Class getClass 
			//void notify 
			//void notifyAll 
					+ " FROM "
					+ " user"; 

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
		
			while (rs.next()) {
				User user = new User();
			//void setUserID
				m_logger.debug("user.setUserID(" + rs.getLong("user_id") + ")" );
				user.setUserID(rs.getLong("user_id"));
			//class java.lang.String getEmail
			//void setEmail
				m_logger.debug("user.setEmail(" + rs.getString("email") + ")" );
				user.setEmail(rs.getString("email"));
			//void setPassword
				m_logger.debug("user.setPassword(" + rs.getString("password") + ")" );
				user.setPassword(rs.getString("password"));
			//void setIsActive
				m_logger.debug("user.setIsActive(" + rs.getBoolean("is_active") + ")" );
				user.setIsActive(rs.getBoolean("is_active"));
			//class java.util.Date getUpdateDate
			//class java.lang.String getPassword
			//long getUserID
			//void setUpdateDate
				m_logger.debug("user.setUpdateDate(" + rs.getDate("update_date") + ")" );
				user.setUpdateDate(rs.getDate("update_date"));
			//class java.lang.Boolean getIsActive
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("user.setCreateDate(" + rs.getDate("create_date") + ")" );
				user.setCreateDate(rs.getDate("create_date"));
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
		//void setUserID 
			//  parameter 0 definition: long
			//	parameter 0 : long
			
		//class java.lang.String getEmail 
		//void setEmail 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setEmail is a key setter
				//keytype1: String
		//void setPassword 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setPassword is a key setter
				//keytype1: String
		//void setIsActive 
			//  parameter 0 definition: class java.lang.Boolean
			//	parameter 0 : java.lang.Boolean
			
				//setIsActive is a key setter
				//keytype1: Boolean
		//class java.util.Date getUpdateDate 
		//class java.lang.String getPassword 
		//long getUserID 
		//void setUpdateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setUpdateDate is a key setter
				//keytype1: Date
		//class java.lang.Boolean getIsActive 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setCreateDate is a key setter
				//keytype1: Date
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
