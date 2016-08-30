/*
  DAO created for class: class is class com.sl.buscaenmonterrey.UserRole using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.buscaenmonterrey.UserRole	
	Method Name: getUserRoleID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.UserRole	
	Method Name: setUserRoleID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.UserRole	
	Method Name: getUserID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.UserRole	
	Method Name: setUserID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.UserRole	
	Method Name: getRoleID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.UserRole	
	Method Name: setRoleID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.UserRole	
	Method Name: getRole startwith: get
	Method return type: class com.sl.buscaenmonterrey.Role

		is getter 
     Method type: class com.sl.buscaenmonterrey.Role
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.UserRole	
	Method Name: setRole startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		com.sl.buscaenmonterrey.Role
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

		//int getUserRoleID 
		//void setUserRoleID 
		//int getUserID 
		//void setUserID 
		//int getRoleID 
		//void setRoleID 
		//class com.sl.buscaenmonterrey.Role getRole 
		//void setRole 
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
import org.apache.log4j.Logger;


public class UserRoleDAO extends DAOBase{
	private static Logger m_logger = Logger.getLogger(UserRoleDAO.class.getName());

 	public static int create(String schema, UserRole userrole) throws Exception {
		Connection conn = Database.getConnection();
		Integer identity = null;
		PreparedStatement pstmt = null;
		try {
			String f = "";
			String v = "";
			
			
			
		//int getUserRoleID
			//f += " user_role_id";
			//v += " ?";
		//int getUserID
			f += " user_id";
			v += " ?";
		//int getRoleID
			f += ", role_id";
			v += ", ?";
		//class com.sl.buscaenmonterrey.Role getRole
			String qry = "insert into " + schema + "$user_role(" + f + ") values(" + v + ");";
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//int getUserRoleID
			//m_logger.debug("userrole.getUserRoleID() :" + userrole.getUserRoleID() );
			//pstmt.setInt(i++ , userrole.getUserRoleID() );
		//int getUserID
			m_logger.debug("userrole.getUserID() :" + userrole.getUserID() );
			pstmt.setInt(i++ , userrole.getUserID() );
		//int getRoleID
			m_logger.debug("userrole.getRoleID() :" + userrole.getRoleID() );
			pstmt.setInt(i++ , userrole.getRoleID() );
		//class com.sl.buscaenmonterrey.Role getRole
			
			pstmt.executeUpdate(); // execute insert statement
		} catch (SQLException e) {
			m_logger.error(e);
		//int getUserRoleID
		m_logger.error("userrole.getUserRoleID() :" + userrole.getUserRoleID() );
		//int getUserID
		m_logger.error("userrole.getUserID() :" + userrole.getUserID() );
		//int getRoleID
		m_logger.error("userrole.getRoleID() :" + userrole.getRoleID() );
		//class com.sl.buscaenmonterrey.Role getRole
		m_logger.error("userrole.getRole() :" + userrole.getRole() );
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
			resIdentity = stIdentity.executeQuery("call IDENTITY()");
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
		
		userrole.setUserRoleID(identity.intValue());

		return identity.intValue();
		
	}
	
//	searching for keys
		//int getUserRoleID 
		//void setUserRoleID 
		//	parameter 0 : int
		//int getUserID 
		//void setUserID 
		//	parameter 0 : int
			//setUserID is a key setter
//****
	public static ArrayList<UserRole> getByUserID(String schema,int UserID) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<UserRole> arrUserRole = new ArrayList<UserRole>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//int getUserRoleID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
	 
			//void setUserRoleID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
			//	parameter method : public void com.sl.buscaenmonterrey.UserRole.setUserRoleID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + " user_role_id"
	 
			//int getUserID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
	 
			//void setUserID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
			//	parameter method : public void com.sl.buscaenmonterrey.UserRole.setUserID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", user_id"
	 
			//int getRoleID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
	 
			//void setRoleID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
			//	parameter method : public void com.sl.buscaenmonterrey.UserRole.setRoleID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", role_id"
	 
			//class com.sl.buscaenmonterrey.Role getRole class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
	 
			//void setRole class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
			//	parameter method : public void com.sl.buscaenmonterrey.UserRole.setRole(com.sl.buscaenmonterrey.Role)
			//	parameter method : class com.sl.buscaenmonterrey.Role
			//	parameter 0 : com.sl.buscaenmonterrey.Role
				
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//boolean equals class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//int hashCode class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//void notify class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//void notifyAll class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
					+ " FROM " + schema + "$user_role" 
					+ " WHERE user_id = " + UserID;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				UserRole userrole =  new UserRole();
			//int getUserRoleID
			//void setUserRoleID
				m_logger.debug("userrole.setUserRoleID(" + rs.getInt("user_role_id") + ")" );
				userrole.setUserRoleID(rs.getInt("user_role_id"));
			//int getUserID
			//void setUserID
				m_logger.debug("userrole.setUserID(" + rs.getInt("user_id") + ")" );
				userrole.setUserID(rs.getInt("user_id"));
			//int getRoleID
			//void setRoleID
				m_logger.debug("userrole.setRoleID(" + rs.getInt("role_id") + ")" );
				userrole.setRoleID(rs.getInt("role_id"));
			//class com.sl.buscaenmonterrey.Role getRole
			//void setRole
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
		//int getUserRoleID 
		//void setUserRoleID 
			//	parameter 0 : int
				
		//int getUserID 
		//void setUserID 
			//	parameter 0 : int
				
				//setUserID is a key setter
				//keytype: int
		//int getRoleID 
		//void setRoleID 
			//	parameter 0 : int
				
				//setRoleID is a key setter
				//keytype: int
		//class com.sl.buscaenmonterrey.Role getRole 
		//void setRole 
			//	parameter 0 : com.sl.buscaenmonterrey.Role
				
				//setRole is a key setter
				//keytype: Role
						//retrieve using the method id
						userrole.setRole( RoleDAO.getByRoleID(schema, userrole.getRoleID()));
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
				arrUserRole.add(userrole);
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

		return arrUserRole;
	}

	public static void deleteByUserID(String schema,int UserID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from " + schema + "$user_role"
					+ " WHERE user_id = " + UserID;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + UserID);
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
		//int getRoleID 
		//void setRoleID 
		//	parameter 0 : int
			//setRoleID is a key setter
//****
	public static ArrayList<UserRole> getByRoleID(String schema, int RoleID) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<UserRole> arrUserRole = new ArrayList<UserRole>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//int getUserRoleID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
	 
			//void setUserRoleID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
			//	parameter method : public void com.sl.buscaenmonterrey.UserRole.setUserRoleID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + " user_role_id"
	 
			//int getUserID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
	 
			//void setUserID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
			//	parameter method : public void com.sl.buscaenmonterrey.UserRole.setUserID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", user_id"
	 
			//int getRoleID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
	 
			//void setRoleID class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
			//	parameter method : public void com.sl.buscaenmonterrey.UserRole.setRoleID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", role_id"
	 
			//class com.sl.buscaenmonterrey.Role getRole class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
	 
			//void setRole class com.sl.buscaenmonterrey.UserRole class com.sl.buscaenmonterrey.UserRole
			
			//	parameter method : public void com.sl.buscaenmonterrey.UserRole.setRole(com.sl.buscaenmonterrey.Role)
			//	parameter method : class com.sl.buscaenmonterrey.Role
			//	parameter 0 : com.sl.buscaenmonterrey.Role
				
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//boolean equals class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//int hashCode class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//void notify class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
	 
			//void notifyAll class java.lang.Object class com.sl.buscaenmonterrey.UserRole
			
					+ " FROM " + schema + "$user_role" 
					+ " WHERE role_id = " + RoleID;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				UserRole userrole =  new UserRole();
			//int getUserRoleID
			//void setUserRoleID
				m_logger.debug("userrole.setUserRoleID(" + rs.getInt("user_role_id") + ")" );
				userrole.setUserRoleID(rs.getInt("user_role_id"));
			//int getUserID
			//void setUserID
				m_logger.debug("userrole.setUserID(" + rs.getInt("user_id") + ")" );
				userrole.setUserID(rs.getInt("user_id"));
			//int getRoleID
			//void setRoleID
				m_logger.debug("userrole.setRoleID(" + rs.getInt("role_id") + ")" );
				userrole.setRoleID(rs.getInt("role_id"));
			//class com.sl.buscaenmonterrey.Role getRole
			//void setRole
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
		//int getUserRoleID 
		//void setUserRoleID 
			//	parameter 0 : int
				
		//int getUserID 
		//void setUserID 
			//	parameter 0 : int
				
				//setUserID is a key setter
				//keytype: int
		//int getRoleID 
		//void setRoleID 
			//	parameter 0 : int
				
				//setRoleID is a key setter
				//keytype: int
		//class com.sl.buscaenmonterrey.Role getRole 
		//void setRole 
			//	parameter 0 : com.sl.buscaenmonterrey.Role
				
				//setRole is a key setter
				//keytype: Role
						//retrieve using the method id
						userrole.setRole( RoleDAO.getByRoleID(schema, userrole.getRoleID()));
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
				arrUserRole.add(userrole);
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

		return arrUserRole;
	}

	public static void deleteByRoleID(String schema,int RoleID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from " + schema + "$user_role"
					+ " WHERE role_id = " + RoleID;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + RoleID);
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
		//class com.sl.buscaenmonterrey.Role getRole 
		//void setRole 
		//	parameter 0 : com.sl.buscaenmonterrey.Role
			//setRole is a key setter
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
 
	public static UserRole getByUserRoleID(String schema, int userroleID) throws Exception {
		// read all the records in a buffer (m_ads)
		UserRole userrole = null;
		
		Connection conn = Database.getConnection();

		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//int getUserRoleID 
			//void setUserRoleID 
			//	parameter 0 : int
				 + " user_role_id"
			//int getUserID 
			//void setUserID 
			//	parameter 0 : int
				 + ", user_id"
			//int getRoleID 
			//void setRoleID 
			//	parameter 0 : int
				 + ", role_id"
			//class com.sl.buscaenmonterrey.Role getRole 
			//void setRole 
			//	parameter 0 : com.sl.buscaenmonterrey.Role
			//void wait 
			//void wait 
			//void wait 
			//boolean equals 
			//class java.lang.String toString 
			//int hashCode 
			//class java.lang.Class getClass 
			//void notify 
			//void notifyAll 
					+ " FROM " + schema + "$user_role" 
					+ " WHERE userrole_id = " + userroleID;

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);

			if (rs.next()) {
				userrole = new UserRole();
			//int getUserRoleID
			//void setUserRoleID
				m_logger.debug("userrole.setUserRoleID(" + rs.getInt("user_role_id") + ")" );
				userrole.setUserRoleID(rs.getInt("user_role_id"));
			//int getUserID
			//void setUserID
				m_logger.debug("userrole.setUserID(" + rs.getInt("user_id") + ")" );
				userrole.setUserID(rs.getInt("user_id"));
			//int getRoleID
			//void setRoleID
				m_logger.debug("userrole.setRoleID(" + rs.getInt("role_id") + ")" );
				userrole.setRoleID(rs.getInt("role_id"));
			//class com.sl.buscaenmonterrey.Role getRole
			//void setRole
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
		//int getUserRoleID 
		//void setUserRoleID 
			//	parameter 0 : int
		//int getUserID 
		//void setUserID 
			//	parameter 0 : int
				//setUserID is a key setter
				//keytype: int
		//int getRoleID 
		//void setRoleID 
			//	parameter 0 : int
				//setRoleID is a key setter
				//keytype: int
		//class com.sl.buscaenmonterrey.Role getRole 
		//void setRole 
			//	parameter 0 : com.sl.buscaenmonterrey.Role
				//setRole is a key setter
				//keytype: Role
						//retrieve using the method id
						userrole.setRole( RoleDAO.getByRoleID(schema, userrole.getRoleID()));
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
		
		return userrole;
	}
	
	public static void deleteByUserRoleID(String schema,int userroleID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from " + schema + "$user_role where userrole_id=" + userroleID;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting record:" + userroleID);
			} else {
				m_logger.debug("record was deleted correctly:" + userroleID);
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

 
	public static void update(String schema, UserRole userrole) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		try {
			String f = "";
			
		//int getUserRoleID
			f += " user_role_id = ?";
		//int getUserID
			f += ", user_id = ?";
		//int getRoleID
			f += ", role_id = ?";
		//class com.sl.buscaenmonterrey.Role getRole
			String qry = "update " + schema + "$user_role set " + f + " where userrole_id = " + userrole.getUserRoleID() ;
			m_logger.debug(qry);
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//int getUserRoleID
			pstmt.setInt(i++ , userrole.getUserRoleID() );

		//int getUserID
			pstmt.setInt(i++ , userrole.getUserID() );

		//int getRoleID
			pstmt.setInt(i++ , userrole.getRoleID() );

		//class com.sl.buscaenmonterrey.Role getRole

			
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
// end searching for setUserRoleID
  	
	public static Collection<UserRole> getListAll(String schema) throws Exception {
		// read all the records in a buffer 
		ArrayList<UserRole> list = new ArrayList<UserRole>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//int getUserRoleID 
			//void setUserRoleID 
			//	parameter 0 : int
				 + " user_role_id"
			//int getUserID 
			//void setUserID 
			//	parameter 0 : int
				 + ", user_id"
			//int getRoleID 
			//void setRoleID 
			//	parameter 0 : int
				 + ", role_id"
			//class com.sl.buscaenmonterrey.Role getRole 
			//void setRole 
			//	parameter 0 : com.sl.buscaenmonterrey.Role
			//void wait 
			//void wait 
			//void wait 
			//boolean equals 
			//class java.lang.String toString 
			//int hashCode 
			//class java.lang.Class getClass 
			//void notify 
			//void notifyAll 
					+ " FROM " + schema + "$user_role"; 

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
		
			while (rs.next()) {
				UserRole userrole = new UserRole();
			//int getUserRoleID
			//void setUserRoleID
				m_logger.debug("userrole.setUserRoleID(" + rs.getInt("user_role_id") + ")" );
				userrole.setUserRoleID(rs.getInt("user_role_id"));
			//int getUserID
			//void setUserID
				m_logger.debug("userrole.setUserID(" + rs.getInt("user_id") + ")" );
				userrole.setUserID(rs.getInt("user_id"));
			//int getRoleID
			//void setRoleID
				m_logger.debug("userrole.setRoleID(" + rs.getInt("role_id") + ")" );
				userrole.setRoleID(rs.getInt("role_id"));
			//class com.sl.buscaenmonterrey.Role getRole
			//void setRole
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
		//int getUserRoleID 
		//void setUserRoleID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
		//int getUserID 
		//void setUserID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
				//setUserID is a key setter
				//keytype1: int
		//int getRoleID 
		//void setRoleID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
				//setRoleID is a key setter
				//keytype1: int
		//class com.sl.buscaenmonterrey.Role getRole 
		//void setRole 
			//  parameter 0 definition: class com.sl.buscaenmonterrey.Role
			//	parameter 0 : com.sl.buscaenmonterrey.Role
			
				//setRole is a key setter
				//keytype1: Role
						//retrieve using the method id
						userrole.setRole( RoleDAO.getByRoleID(schema, userrole.getRoleID()));
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
	  
				list.add( userrole );
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
