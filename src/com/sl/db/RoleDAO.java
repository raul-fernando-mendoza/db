/*
  DAO created for class: class is class com.sl.buscaenmonterrey.Role using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.buscaenmonterrey.Role	
	Method Name: getRoleID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.Role	
	Method Name: setRoleID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.Role	
	Method Name: getRoleName startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.Role	
	Method Name: setRoleName startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.Role	
	Method Name: getCreateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.Role	
	Method Name: setCreateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.Role	
	Method Name: getUpdateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.Role	
	Method Name: setUpdateDate startwith: set
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

		//int getRoleID 
		//void setRoleID 
		//class java.lang.String getRoleName 
		//void setRoleName 
		//class java.util.Date getCreateDate 
		//void setCreateDate 
		//class java.util.Date getUpdateDate 
		//void setUpdateDate 
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


public class RoleDAO extends DAOBase{
	private static Logger m_logger = Logger.getLogger(RoleDAO.class.getName());

 	public static int create(String schema, Role role) throws Exception {
		Connection conn = Database.getConnection();
		Integer identity = null;
		PreparedStatement pstmt = null;
		try {
			String f = "";
			String v = "";
			
			
			
		//int getRoleID
			//f += " role_id";
			//v += " ?";
		//class java.lang.String getRoleName
			f += " role_name";
			v += " ?";
		//class java.util.Date getCreateDate
			//f += ", create_date";
			//v += ", ?";
		//class java.util.Date getUpdateDate
			//f += ", update_date";
			//v += ", ?";
			String qry = "insert into "+ schema + "$role(" + f + ") values(" + v + ");";
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//int getRoleID
			//m_logger.debug("role.getRoleID() :" + role.getRoleID() );
			//pstmt.setInt(i++ , role.getRoleID() );
		//class java.lang.String getRoleName
			m_logger.debug("role.getRoleName() :" + role.getRoleName() );
			setPrepararedStatementString( pstmt, i++, role.getRoleName() );
		//class java.util.Date getCreateDate
			//pstmt.setDate(i++ , null);
		//class java.util.Date getUpdateDate
			//pstmt.setDate(i++ , null);
			
			pstmt.executeUpdate(); // execute insert statement
		} catch (SQLException e) {
			m_logger.error(e);
		//int getRoleID
		m_logger.error("role.getRoleID() :" + role.getRoleID() );
		//class java.lang.String getRoleName
		m_logger.error("role.getRoleName() :" + role.getRoleName() );
		//class java.util.Date getCreateDate
		m_logger.error("role.getCreateDate() :" + role.getCreateDate() );
		//class java.util.Date getUpdateDate
		m_logger.error("role.getUpdateDate() :" + role.getUpdateDate() );
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
		
		role.setRoleID(identity.intValue());

		return identity.intValue();
		
	}
	
//	searching for keys
		//int getRoleID 
		//void setRoleID 
		//	parameter 0 : int
		//class java.lang.String getRoleName 
		//void setRoleName 
		//	parameter 0 : java.lang.String
			//setRoleName is a key setter
//****
	public static ArrayList<Role> getByRoleName(String schema, String RoleName) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Role> arrRole = new ArrayList<Role>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//int getRoleID class com.sl.buscaenmonterrey.Role class com.sl.buscaenmonterrey.Role
			
	 
			//void setRoleID class com.sl.buscaenmonterrey.Role class com.sl.buscaenmonterrey.Role
			
			//	parameter method : public void com.sl.buscaenmonterrey.Role.setRoleID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + " role_id"
	 
			//class java.lang.String getRoleName class com.sl.buscaenmonterrey.Role class com.sl.buscaenmonterrey.Role
			
	 
			//void setRoleName class com.sl.buscaenmonterrey.Role class com.sl.buscaenmonterrey.Role
			
			//	parameter method : public void com.sl.buscaenmonterrey.Role.setRoleName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", role_name"
	 
			//class java.util.Date getCreateDate class com.sl.buscaenmonterrey.Role class com.sl.buscaenmonterrey.Role
			
	 
			//void setCreateDate class com.sl.buscaenmonterrey.Role class com.sl.buscaenmonterrey.Role
			
			//	parameter method : public void com.sl.buscaenmonterrey.Role.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//class java.util.Date getUpdateDate class com.sl.buscaenmonterrey.Role class com.sl.buscaenmonterrey.Role
			
	 
			//void setUpdateDate class com.sl.buscaenmonterrey.Role class com.sl.buscaenmonterrey.Role
			
			//	parameter method : public void com.sl.buscaenmonterrey.Role.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.Role
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.Role
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.Role
			
	 
			//boolean equals class java.lang.Object class com.sl.buscaenmonterrey.Role
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.buscaenmonterrey.Role
			
	 
			//int hashCode class java.lang.Object class com.sl.buscaenmonterrey.Role
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.buscaenmonterrey.Role
			
	 
			//void notify class java.lang.Object class com.sl.buscaenmonterrey.Role
			
	 
			//void notifyAll class java.lang.Object class com.sl.buscaenmonterrey.Role
			
					+ " FROM "+ schema + "$role" 
					+ " WHERE role_name = '" + RoleName + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Role role =  new Role();
			//int getRoleID
			//void setRoleID
				m_logger.debug("role.setRoleID(" + rs.getInt("role_id") + ")" );
				role.setRoleID(rs.getInt("role_id"));
			//class java.lang.String getRoleName
			//void setRoleName
				m_logger.debug("role.setRoleName(" + rs.getString("role_name") + ")" );
				role.setRoleName(rs.getString("role_name"));
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("role.setCreateDate(" + rs.getDate("create_date") + ")" );
				role.setCreateDate(rs.getDate("create_date"));
			//class java.util.Date getUpdateDate
			//void setUpdateDate
				m_logger.debug("role.setUpdateDate(" + rs.getDate("update_date") + ")" );
				role.setUpdateDate(rs.getDate("update_date"));
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
		//int getRoleID 
		//void setRoleID 
			//	parameter 0 : int
				
		//class java.lang.String getRoleName 
		//void setRoleName 
			//	parameter 0 : java.lang.String
				
				//setRoleName is a key setter
				//keytype: String
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
				arrRole.add(role);
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

		return arrRole;
	}

	public static void deleteByRoleName(String schema, String RoleName) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from "+ schema + "$role"
					+ " WHERE role_name = '" + RoleName + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + RoleName);
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
		//class java.util.Date getCreateDate 
		//void setCreateDate 
		//	parameter 0 : java.util.Date
			//setCreateDate is a key setter
//****
		//class java.util.Date getUpdateDate 
		//void setUpdateDate 
		//	parameter 0 : java.util.Date
			//setUpdateDate is a key setter
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
 
	public static Role getByRoleID(String schema, int roleID) throws Exception {
		// read all the records in a buffer (m_ads)
		Role role = null;
		
		Connection conn = Database.getConnection();

		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//int getRoleID 
			//void setRoleID 
			//	parameter 0 : int
				 + " role_id"
			//class java.lang.String getRoleName 
			//void setRoleName 
			//	parameter 0 : java.lang.String
				 + ", role_name"
			//class java.util.Date getCreateDate 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//class java.util.Date getUpdateDate 
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//void wait 
			//void wait 
			//void wait 
			//boolean equals 
			//class java.lang.String toString 
			//int hashCode 
			//class java.lang.Class getClass 
			//void notify 
			//void notifyAll 
					+ " FROM "+ schema + "$role" 
					+ " WHERE role_id = " + roleID;

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);

			if (rs.next()) {
				role = new Role();
			//int getRoleID
			//void setRoleID
				m_logger.debug("role.setRoleID(" + rs.getInt("role_id") + ")" );
				role.setRoleID(rs.getInt("role_id"));
			//class java.lang.String getRoleName
			//void setRoleName
				m_logger.debug("role.setRoleName(" + rs.getString("role_name") + ")" );
				role.setRoleName(rs.getString("role_name"));
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("role.setCreateDate(" + rs.getDate("create_date") + ")" );
				role.setCreateDate(rs.getDate("create_date"));
			//class java.util.Date getUpdateDate
			//void setUpdateDate
				m_logger.debug("role.setUpdateDate(" + rs.getDate("update_date") + ")" );
				role.setUpdateDate(rs.getDate("update_date"));
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
		//int getRoleID 
		//void setRoleID 
			//	parameter 0 : int
		//class java.lang.String getRoleName 
		//void setRoleName 
			//	parameter 0 : java.lang.String
				//setRoleName is a key setter
				//keytype: String
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
		
		return role;
	}
	
	public static void deleteByRoleID(String schema, int roleID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from "+ schema + "$role where role_id=" + roleID;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting record:" + roleID);
			} else {
				m_logger.debug("record was deleted correctly:" + roleID);
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

 
	public static void update(String schema, Role role) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		try {
			String f = "";
			
		//int getRoleID
			f += " role_id = ?";
		//class java.lang.String getRoleName
			f += ", role_name = ?";
		//class java.util.Date getCreateDate
			f += ", create_date = ?";
		//class java.util.Date getUpdateDate
			f += ", update_date = ?";
			String qry = "update "+ schema + "$role set " + f + " where role_id = " + role.getRoleID() ;
			m_logger.debug(qry);
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//int getRoleID
			pstmt.setInt(i++ , role.getRoleID() );

		//class java.lang.String getRoleName
			setPrepararedStatementString( pstmt, i++, role.getRoleName() );

		//class java.util.Date getCreateDate
			setPrepararedStatementDate( pstmt, i++, role.getCreateDate() );

		//class java.util.Date getUpdateDate
			setPrepararedStatementDate( pstmt, i++, new Date() );

			
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
// end searching for setRoleID
  	
	public static Collection<Role> getListAll(String schema) throws Exception {
		// read all the records in a buffer 
		ArrayList<Role> list = new ArrayList<Role>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//int getRoleID 
			//void setRoleID 
			//	parameter 0 : int
				 + " role_id"
			//class java.lang.String getRoleName 
			//void setRoleName 
			//	parameter 0 : java.lang.String
				 + ", role_name"
			//class java.util.Date getCreateDate 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//class java.util.Date getUpdateDate 
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//void wait 
			//void wait 
			//void wait 
			//boolean equals 
			//class java.lang.String toString 
			//int hashCode 
			//class java.lang.Class getClass 
			//void notify 
			//void notifyAll 
					+ " FROM "+ schema + "$role"; 

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
		
			while (rs.next()) {
				Role role = new Role();
			//int getRoleID
			//void setRoleID
				m_logger.debug("role.setRoleID(" + rs.getInt("role_id") + ")" );
				role.setRoleID(rs.getInt("role_id"));
			//class java.lang.String getRoleName
			//void setRoleName
				m_logger.debug("role.setRoleName(" + rs.getString("role_name") + ")" );
				role.setRoleName(rs.getString("role_name"));
			//class java.util.Date getCreateDate
			//void setCreateDate
				m_logger.debug("role.setCreateDate(" + rs.getDate("create_date") + ")" );
				role.setCreateDate(rs.getDate("create_date"));
			//class java.util.Date getUpdateDate
			//void setUpdateDate
				m_logger.debug("role.setUpdateDate(" + rs.getDate("update_date") + ")" );
				role.setUpdateDate(rs.getDate("update_date"));
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
		//int getRoleID 
		//void setRoleID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
		//class java.lang.String getRoleName 
		//void setRoleName 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setRoleName is a key setter
				//keytype1: String
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
	  
				list.add( role );
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
