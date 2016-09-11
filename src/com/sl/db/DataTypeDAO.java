/*
  DAO created for class: class is class com.sl.db.Datatype using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: setUpdatedBy startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		long
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: setCreateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: setUpdateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: getCreateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: getUpdatedBy startwith: get
	Method return type: long

		is getter 
     Method type: long
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: getUpdateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: setDatatypeID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: getCreatedBy startwith: get
	Method return type: long

		is getter 
     Method type: long
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: getDatatypeName startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: getLabel startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: setLabel startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: setCreatedBy startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		long
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: getDatatypeID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Datatype	
	Method Name: setDatatypeName startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
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

		//void setUpdatedBy 
		//void setCreateDate 
		//void setUpdateDate 
		//class java.util.Date getCreateDate 
		//long getUpdatedBy 
		//class java.util.Date getUpdateDate 
		//void setDatatypeID 
		//long getCreatedBy 
		//class java.lang.String getDatatypeName 
		//class java.lang.String getLabel 
		//void setLabel 
		//void setCreatedBy 
		//int getDatatypeID 
		//void setDatatypeName 
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

public class DatatypeDAO extends DAOBase{
	private static Logger m_logger = Logger.getLogger(DatatypeDAO.class.getName());

 	public static long create(Datatype datatype) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		int id=0;
		
		try {
			String f = "";
			String v = "";
			
			
			
		//class java.util.Date getCreateDate
			f += " create_date";
			v += " ?";
		//long getUpdatedBy
			f += " updated_by";
			v += " ?";
		//class java.util.Date getUpdateDate
			f += ", update_date";
			v += ", ?";
		//long getCreatedBy
			f += ", created_by";
			v += ", ?";
		//class java.lang.String getDatatypeName
			f += ", datatype_name";
			v += ", ?";
		//class java.lang.String getLabel
			f += ", label";
			v += ", ?";
		//int getDatatypeID
			//f += ", datatype_id";
			//v += ", ?";
			String qry = "insert into datatype(" + f + ") values(" + v + ");";
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry,Statement.RETURN_GENERATED_KEYS); // create a statement
			int i=1;

		//class java.util.Date getCreateDate
			setPrepararedStatementDate(pstmt, i++ , new Date());
		//long getUpdatedBy
			m_logger.debug("datatype.getUpdatedBy() :" + datatype.getUpdatedBy() );
			pstmt.setLong(i++ , datatype.getUpdatedBy() );
		//class java.util.Date getUpdateDate
			setPrepararedStatementDate(pstmt, i++ , new Date());
		//long getCreatedBy
			m_logger.debug("datatype.getCreatedBy() :" + datatype.getCreatedBy() );
			pstmt.setLong(i++ , datatype.getCreatedBy() );
		//class java.lang.String getDatatypeName
			m_logger.debug("datatype.getDatatypeName() :" + datatype.getDatatypeName() );
			setPrepararedStatementString( pstmt, i++, datatype.getDatatypeName() );
		//class java.lang.String getLabel
			m_logger.debug("datatype.getLabel() :" + datatype.getLabel() );
			setPrepararedStatementString( pstmt, i++, datatype.getLabel() );
		//int getDatatypeID
			//m_logger.debug("datatype.getDatatypeID() :" + datatype.getDatatypeID() );
			//pstmt.setInt(i++ , datatype.getDatatypeID() );
			
			pstmt.executeUpdate(); // execute insert statement
			
			ResultSet rs = pstmt.getGeneratedKeys();
			// get generated key
			if (rs != null && rs.next()) {
			  id = rs.getInt(1);
			  m_logger.debug("generated key:" + id);
			}
						
			datatype.setDatatypeID(id);
			
		} catch (SQLException e) {
			m_logger.error(e);
		//class java.util.Date getCreateDate
		m_logger.error("datatype.getCreateDate() :" + datatype.getCreateDate() );
		//long getUpdatedBy
		m_logger.error("datatype.getUpdatedBy() :" + datatype.getUpdatedBy() );
		//class java.util.Date getUpdateDate
		m_logger.error("datatype.getUpdateDate() :" + datatype.getUpdateDate() );
		//long getCreatedBy
		m_logger.error("datatype.getCreatedBy() :" + datatype.getCreatedBy() );
		//class java.lang.String getDatatypeName
		m_logger.error("datatype.getDatatypeName() :" + datatype.getDatatypeName() );
		//class java.lang.String getLabel
		m_logger.error("datatype.getLabel() :" + datatype.getLabel() );
		//int getDatatypeID
		m_logger.error("datatype.getDatatypeID() :" + datatype.getDatatypeID() );
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
		//void setUpdatedBy 
		//	parameter 0 : long
			//setUpdatedBy is a key setter
//****
	public static ArrayList<Datatype> getByUpdatedBy(long UpdatedBy) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Datatype> arrDatatype = new ArrayList<Datatype>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//void setUpdatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " updated_by"
	 
			//void setCreateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setUpdateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.util.Date getCreateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//long getUpdatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.util.Date getUpdateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setDatatypeID class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setDatatypeID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", datatype_id"
	 
			//long getCreatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.lang.String getDatatypeName class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.lang.String getLabel class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setLabel class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setCreatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//int getDatatypeID class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setDatatypeName class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setDatatypeName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", datatype_name"
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Datatype
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Datatype
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Datatype
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Datatype
			
	 
			//void notify class java.lang.Object class com.sl.db.Datatype
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Datatype
			
					+ " FROM "
					+ " datatype" 
					+ " WHERE updated_by = " + UpdatedBy;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Datatype datatype =  new Datatype();
			//void setUpdatedBy
				m_logger.debug("datatype.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				datatype.setUpdatedBy(rs.getLong("updated_by"));
			//void setCreateDate
				m_logger.debug("datatype.setCreateDate(" + rs.getDate("create_date") + ")" );
				datatype.setCreateDate(rs.getDate("create_date"));
			//void setUpdateDate
				m_logger.debug("datatype.setUpdateDate(" + rs.getDate("update_date") + ")" );
				datatype.setUpdateDate(rs.getDate("update_date"));
			//class java.util.Date getCreateDate
			//long getUpdatedBy
			//class java.util.Date getUpdateDate
			//void setDatatypeID
				m_logger.debug("datatype.setDatatypeID(" + rs.getInt("datatype_id") + ")" );
				datatype.setDatatypeID(rs.getInt("datatype_id"));
			//long getCreatedBy
			//class java.lang.String getDatatypeName
			//class java.lang.String getLabel
			//void setLabel
				m_logger.debug("datatype.setLabel(" + rs.getString("label") + ")" );
				datatype.setLabel(rs.getString("label"));
			//void setCreatedBy
				m_logger.debug("datatype.setCreatedBy(" + rs.getLong("created_by") + ")" );
				datatype.setCreatedBy(rs.getLong("created_by"));
			//int getDatatypeID
			//void setDatatypeName
				m_logger.debug("datatype.setDatatypeName(" + rs.getString("datatype_name") + ")" );
				datatype.setDatatypeName(rs.getString("datatype_name"));
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
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.util.Date getCreateDate 
		//long getUpdatedBy 
		//class java.util.Date getUpdateDate 
		//void setDatatypeID 
			//	parameter 0 : int
				
		//long getCreatedBy 
		//class java.lang.String getDatatypeName 
		//class java.lang.String getLabel 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//int getDatatypeID 
		//void setDatatypeName 
			//	parameter 0 : java.lang.String
				
				//setDatatypeName is a key setter
				//keytype: String
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
				arrDatatype.add(datatype);
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

		return arrDatatype;
	}

	public static void deleteByUpdatedBy(long UpdatedBy) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from datatype"
					+ " WHERE updated_by = " + UpdatedBy;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + UpdatedBy);
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
		//void setCreateDate 
		//	parameter 0 : java.util.Date
			//setCreateDate is a key setter
//****
		//void setUpdateDate 
		//	parameter 0 : java.util.Date
			//setUpdateDate is a key setter
//****
		//class java.util.Date getCreateDate 
		//long getUpdatedBy 
		//class java.util.Date getUpdateDate 
		//void setDatatypeID 
		//	parameter 0 : int
		//long getCreatedBy 
		//class java.lang.String getDatatypeName 
		//class java.lang.String getLabel 
		//void setLabel 
		//	parameter 0 : java.lang.String
			//setLabel is a key setter
//****
	public static ArrayList<Datatype> getByLabel(String Label) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Datatype> arrDatatype = new ArrayList<Datatype>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//void setUpdatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " updated_by"
	 
			//void setCreateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setUpdateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.util.Date getCreateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//long getUpdatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.util.Date getUpdateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setDatatypeID class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setDatatypeID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", datatype_id"
	 
			//long getCreatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.lang.String getDatatypeName class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.lang.String getLabel class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setLabel class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setCreatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//int getDatatypeID class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setDatatypeName class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setDatatypeName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", datatype_name"
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Datatype
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Datatype
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Datatype
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Datatype
			
	 
			//void notify class java.lang.Object class com.sl.db.Datatype
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Datatype
			
					+ " FROM "
					+ " datatype" 
					+ " WHERE label = '" + Label + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Datatype datatype =  new Datatype();
			//void setUpdatedBy
				m_logger.debug("datatype.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				datatype.setUpdatedBy(rs.getLong("updated_by"));
			//void setCreateDate
				m_logger.debug("datatype.setCreateDate(" + rs.getDate("create_date") + ")" );
				datatype.setCreateDate(rs.getDate("create_date"));
			//void setUpdateDate
				m_logger.debug("datatype.setUpdateDate(" + rs.getDate("update_date") + ")" );
				datatype.setUpdateDate(rs.getDate("update_date"));
			//class java.util.Date getCreateDate
			//long getUpdatedBy
			//class java.util.Date getUpdateDate
			//void setDatatypeID
				m_logger.debug("datatype.setDatatypeID(" + rs.getInt("datatype_id") + ")" );
				datatype.setDatatypeID(rs.getInt("datatype_id"));
			//long getCreatedBy
			//class java.lang.String getDatatypeName
			//class java.lang.String getLabel
			//void setLabel
				m_logger.debug("datatype.setLabel(" + rs.getString("label") + ")" );
				datatype.setLabel(rs.getString("label"));
			//void setCreatedBy
				m_logger.debug("datatype.setCreatedBy(" + rs.getLong("created_by") + ")" );
				datatype.setCreatedBy(rs.getLong("created_by"));
			//int getDatatypeID
			//void setDatatypeName
				m_logger.debug("datatype.setDatatypeName(" + rs.getString("datatype_name") + ")" );
				datatype.setDatatypeName(rs.getString("datatype_name"));
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
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.util.Date getCreateDate 
		//long getUpdatedBy 
		//class java.util.Date getUpdateDate 
		//void setDatatypeID 
			//	parameter 0 : int
				
		//long getCreatedBy 
		//class java.lang.String getDatatypeName 
		//class java.lang.String getLabel 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//int getDatatypeID 
		//void setDatatypeName 
			//	parameter 0 : java.lang.String
				
				//setDatatypeName is a key setter
				//keytype: String
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
				arrDatatype.add(datatype);
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

		return arrDatatype;
	}

	public static void deleteByLabel(String Label) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from datatype"
					+ " WHERE label = '" + Label + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + Label);
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
		//void setCreatedBy 
		//	parameter 0 : long
			//setCreatedBy is a key setter
//****
	public static ArrayList<Datatype> getByCreatedBy(long CreatedBy) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Datatype> arrDatatype = new ArrayList<Datatype>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//void setUpdatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " updated_by"
	 
			//void setCreateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setUpdateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.util.Date getCreateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//long getUpdatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.util.Date getUpdateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setDatatypeID class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setDatatypeID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", datatype_id"
	 
			//long getCreatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.lang.String getDatatypeName class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.lang.String getLabel class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setLabel class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setCreatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//int getDatatypeID class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setDatatypeName class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setDatatypeName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", datatype_name"
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Datatype
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Datatype
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Datatype
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Datatype
			
	 
			//void notify class java.lang.Object class com.sl.db.Datatype
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Datatype
			
					+ " FROM "
					+ " datatype" 
					+ " WHERE created_by = " + CreatedBy;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Datatype datatype =  new Datatype();
			//void setUpdatedBy
				m_logger.debug("datatype.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				datatype.setUpdatedBy(rs.getLong("updated_by"));
			//void setCreateDate
				m_logger.debug("datatype.setCreateDate(" + rs.getDate("create_date") + ")" );
				datatype.setCreateDate(rs.getDate("create_date"));
			//void setUpdateDate
				m_logger.debug("datatype.setUpdateDate(" + rs.getDate("update_date") + ")" );
				datatype.setUpdateDate(rs.getDate("update_date"));
			//class java.util.Date getCreateDate
			//long getUpdatedBy
			//class java.util.Date getUpdateDate
			//void setDatatypeID
				m_logger.debug("datatype.setDatatypeID(" + rs.getInt("datatype_id") + ")" );
				datatype.setDatatypeID(rs.getInt("datatype_id"));
			//long getCreatedBy
			//class java.lang.String getDatatypeName
			//class java.lang.String getLabel
			//void setLabel
				m_logger.debug("datatype.setLabel(" + rs.getString("label") + ")" );
				datatype.setLabel(rs.getString("label"));
			//void setCreatedBy
				m_logger.debug("datatype.setCreatedBy(" + rs.getLong("created_by") + ")" );
				datatype.setCreatedBy(rs.getLong("created_by"));
			//int getDatatypeID
			//void setDatatypeName
				m_logger.debug("datatype.setDatatypeName(" + rs.getString("datatype_name") + ")" );
				datatype.setDatatypeName(rs.getString("datatype_name"));
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
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.util.Date getCreateDate 
		//long getUpdatedBy 
		//class java.util.Date getUpdateDate 
		//void setDatatypeID 
			//	parameter 0 : int
				
		//long getCreatedBy 
		//class java.lang.String getDatatypeName 
		//class java.lang.String getLabel 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//int getDatatypeID 
		//void setDatatypeName 
			//	parameter 0 : java.lang.String
				
				//setDatatypeName is a key setter
				//keytype: String
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
				arrDatatype.add(datatype);
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

		return arrDatatype;
	}

	public static void deleteByCreatedBy(long CreatedBy) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from datatype"
					+ " WHERE created_by = " + CreatedBy;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + CreatedBy);
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
		//int getDatatypeID 
		//void setDatatypeName 
		//	parameter 0 : java.lang.String
			//setDatatypeName is a key setter
//****
	public static ArrayList<Datatype> getByDatatypeName(String DatatypeName) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Datatype> arrDatatype = new ArrayList<Datatype>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//void setUpdatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " updated_by"
	 
			//void setCreateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setUpdateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//class java.util.Date getCreateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//long getUpdatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.util.Date getUpdateDate class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setDatatypeID class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setDatatypeID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", datatype_id"
	 
			//long getCreatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.lang.String getDatatypeName class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//class java.lang.String getLabel class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setLabel class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setCreatedBy class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//int getDatatypeID class com.sl.db.Datatype class com.sl.db.Datatype
			
	 
			//void setDatatypeName class com.sl.db.Datatype class com.sl.db.Datatype
			
			//	parameter method : public void com.sl.db.Datatype.setDatatypeName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", datatype_name"
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//void wait class java.lang.Object class com.sl.db.Datatype
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Datatype
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Datatype
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Datatype
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Datatype
			
	 
			//void notify class java.lang.Object class com.sl.db.Datatype
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Datatype
			
					+ " FROM "
					+ " datatype" 
					+ " WHERE datatype_name = '" + DatatypeName + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Datatype datatype =  new Datatype();
			//void setUpdatedBy
				m_logger.debug("datatype.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				datatype.setUpdatedBy(rs.getLong("updated_by"));
			//void setCreateDate
				m_logger.debug("datatype.setCreateDate(" + rs.getDate("create_date") + ")" );
				datatype.setCreateDate(rs.getDate("create_date"));
			//void setUpdateDate
				m_logger.debug("datatype.setUpdateDate(" + rs.getDate("update_date") + ")" );
				datatype.setUpdateDate(rs.getDate("update_date"));
			//class java.util.Date getCreateDate
			//long getUpdatedBy
			//class java.util.Date getUpdateDate
			//void setDatatypeID
				m_logger.debug("datatype.setDatatypeID(" + rs.getInt("datatype_id") + ")" );
				datatype.setDatatypeID(rs.getInt("datatype_id"));
			//long getCreatedBy
			//class java.lang.String getDatatypeName
			//class java.lang.String getLabel
			//void setLabel
				m_logger.debug("datatype.setLabel(" + rs.getString("label") + ")" );
				datatype.setLabel(rs.getString("label"));
			//void setCreatedBy
				m_logger.debug("datatype.setCreatedBy(" + rs.getLong("created_by") + ")" );
				datatype.setCreatedBy(rs.getLong("created_by"));
			//int getDatatypeID
			//void setDatatypeName
				m_logger.debug("datatype.setDatatypeName(" + rs.getString("datatype_name") + ")" );
				datatype.setDatatypeName(rs.getString("datatype_name"));
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
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.util.Date getCreateDate 
		//long getUpdatedBy 
		//class java.util.Date getUpdateDate 
		//void setDatatypeID 
			//	parameter 0 : int
				
		//long getCreatedBy 
		//class java.lang.String getDatatypeName 
		//class java.lang.String getLabel 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//int getDatatypeID 
		//void setDatatypeName 
			//	parameter 0 : java.lang.String
				
				//setDatatypeName is a key setter
				//keytype: String
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
				arrDatatype.add(datatype);
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

		return arrDatatype;
	}

	public static void deleteByDatatypeName(String DatatypeName) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from datatype"
					+ " WHERE datatype_name = '" + DatatypeName + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + DatatypeName);
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
 
	public static Datatype getByDatatypeID(long datatypeID) throws Exception {
		// read all the records in a buffer (m_ads)
		Datatype datatype = null;
		
		Connection conn = Database.getConnection();

		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//void setUpdatedBy 
			//	parameter 0 : long
				 + " updated_by"
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//class java.util.Date getCreateDate 
			//long getUpdatedBy 
			//class java.util.Date getUpdateDate 
			//void setDatatypeID 
			//	parameter 0 : int
				 + ", datatype_id"
			//long getCreatedBy 
			//class java.lang.String getDatatypeName 
			//class java.lang.String getLabel 
			//void setLabel 
			//	parameter 0 : java.lang.String
				 + ", label"
			//void setCreatedBy 
			//	parameter 0 : long
				 + ", created_by"
			//int getDatatypeID 
			//void setDatatypeName 
			//	parameter 0 : java.lang.String
				 + ", datatype_name"
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
					+ " datatype" 
					+ " WHERE datatype_id = " + datatypeID;

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);

			if (rs.next()) {
				datatype = new Datatype();
			//void setUpdatedBy
				m_logger.debug("datatype.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				datatype.setUpdatedBy(rs.getLong("updated_by"));
			//void setCreateDate
				m_logger.debug("datatype.setCreateDate(" + rs.getDate("create_date") + ")" );
				datatype.setCreateDate(rs.getDate("create_date"));
			//void setUpdateDate
				m_logger.debug("datatype.setUpdateDate(" + rs.getDate("update_date") + ")" );
				datatype.setUpdateDate(rs.getDate("update_date"));
			//class java.util.Date getCreateDate
			//long getUpdatedBy
			//class java.util.Date getUpdateDate
			//void setDatatypeID
				m_logger.debug("datatype.setDatatypeID(" + rs.getInt("datatype_id") + ")" );
				datatype.setDatatypeID(rs.getInt("datatype_id"));
			//long getCreatedBy
			//class java.lang.String getDatatypeName
			//class java.lang.String getLabel
			//void setLabel
				m_logger.debug("datatype.setLabel(" + rs.getString("label") + ")" );
				datatype.setLabel(rs.getString("label"));
			//void setCreatedBy
				m_logger.debug("datatype.setCreatedBy(" + rs.getLong("created_by") + ")" );
				datatype.setCreatedBy(rs.getLong("created_by"));
			//int getDatatypeID
			//void setDatatypeName
				m_logger.debug("datatype.setDatatypeName(" + rs.getString("datatype_name") + ")" );
				datatype.setDatatypeName(rs.getString("datatype_name"));
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
		//void setUpdatedBy 
			//	parameter 0 : long
				//setUpdatedBy is a key setter
				//keytype: long
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				//setCreateDate is a key setter
				//keytype: Date
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				//setUpdateDate is a key setter
				//keytype: Date
		//class java.util.Date getCreateDate 
		//long getUpdatedBy 
		//class java.util.Date getUpdateDate 
		//void setDatatypeID 
			//	parameter 0 : int
		//long getCreatedBy 
		//class java.lang.String getDatatypeName 
		//class java.lang.String getLabel 
		//void setLabel 
			//	parameter 0 : java.lang.String
				//setLabel is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : long
				//setCreatedBy is a key setter
				//keytype: long
		//int getDatatypeID 
		//void setDatatypeName 
			//	parameter 0 : java.lang.String
				//setDatatypeName is a key setter
				//keytype: String
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
		
		return datatype;
	}
	
	public static void deleteByDatatypeID(long datatypeID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from datatype where datatype_id=" + datatypeID;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting record:" + datatypeID);
			} else {
				m_logger.debug("record was deleted correctly:" + datatypeID);
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

 
	public static void update(Datatype datatype) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		try {
			String f = "";
			
		//class java.util.Date getCreateDate
			f += " create_date = ?";
		//long getUpdatedBy
			f += ", updated_by = ?";
		//class java.util.Date getUpdateDate
			f += ", update_date = ?";
		//long getCreatedBy
			f += ", created_by = ?";
		//class java.lang.String getDatatypeName
			f += ", datatype_name = ?";
		//class java.lang.String getLabel
			f += ", label = ?";
		//int getDatatypeID
			f += ", datatype_id = ?";
			String qry = "update datatype set " + f + " where datatype_id = " + datatype.getDatatypeID() ;
			m_logger.debug(qry);
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//class java.util.Date getCreateDate
			setPrepararedStatementDate( pstmt, i++, datatype.getCreateDate() );

		//long getUpdatedBy

		//class java.util.Date getUpdateDate
			setPrepararedStatementDate( pstmt, i++, new Date() );

		//long getCreatedBy

		//class java.lang.String getDatatypeName
			setPrepararedStatementString( pstmt, i++, datatype.getDatatypeName() );

		//class java.lang.String getLabel
			setPrepararedStatementString( pstmt, i++, datatype.getLabel() );

		//int getDatatypeID
			pstmt.setInt(i++ , datatype.getDatatypeID() );

			
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
// end searching for setDatatypeID
  	
	public static Collection<Datatype> getListAll() throws Exception {
		// read all the records in a buffer 
		ArrayList<Datatype> list = new ArrayList<Datatype>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//void setUpdatedBy 
			//	parameter 0 : long
				 + " updated_by"
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//class java.util.Date getCreateDate 
			//long getUpdatedBy 
			//class java.util.Date getUpdateDate 
			//void setDatatypeID 
			//	parameter 0 : int
				 + ", datatype_id"
			//long getCreatedBy 
			//class java.lang.String getDatatypeName 
			//class java.lang.String getLabel 
			//void setLabel 
			//	parameter 0 : java.lang.String
				 + ", label"
			//void setCreatedBy 
			//	parameter 0 : long
				 + ", created_by"
			//int getDatatypeID 
			//void setDatatypeName 
			//	parameter 0 : java.lang.String
				 + ", datatype_name"
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
					+ " datatype"; 

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
		
			while (rs.next()) {
				Datatype datatype = new Datatype();
			//void setUpdatedBy
				m_logger.debug("datatype.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				datatype.setUpdatedBy(rs.getLong("updated_by"));
			//void setCreateDate
				m_logger.debug("datatype.setCreateDate(" + rs.getDate("create_date") + ")" );
				datatype.setCreateDate(rs.getDate("create_date"));
			//void setUpdateDate
				m_logger.debug("datatype.setUpdateDate(" + rs.getDate("update_date") + ")" );
				datatype.setUpdateDate(rs.getDate("update_date"));
			//class java.util.Date getCreateDate
			//long getUpdatedBy
			//class java.util.Date getUpdateDate
			//void setDatatypeID
				m_logger.debug("datatype.setDatatypeID(" + rs.getInt("datatype_id") + ")" );
				datatype.setDatatypeID(rs.getInt("datatype_id"));
			//long getCreatedBy
			//class java.lang.String getDatatypeName
			//class java.lang.String getLabel
			//void setLabel
				m_logger.debug("datatype.setLabel(" + rs.getString("label") + ")" );
				datatype.setLabel(rs.getString("label"));
			//void setCreatedBy
				m_logger.debug("datatype.setCreatedBy(" + rs.getLong("created_by") + ")" );
				datatype.setCreatedBy(rs.getLong("created_by"));
			//int getDatatypeID
			//void setDatatypeName
				m_logger.debug("datatype.setDatatypeName(" + rs.getString("datatype_name") + ")" );
				datatype.setDatatypeName(rs.getString("datatype_name"));
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
		//void setUpdatedBy 
			//  parameter 0 definition: long
			//	parameter 0 : long
			
				//setUpdatedBy is a key setter
				//keytype1: long
		//void setCreateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setCreateDate is a key setter
				//keytype1: Date
		//void setUpdateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setUpdateDate is a key setter
				//keytype1: Date
		//class java.util.Date getCreateDate 
		//long getUpdatedBy 
		//class java.util.Date getUpdateDate 
		//void setDatatypeID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
		//long getCreatedBy 
		//class java.lang.String getDatatypeName 
		//class java.lang.String getLabel 
		//void setLabel 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setLabel is a key setter
				//keytype1: String
		//void setCreatedBy 
			//  parameter 0 definition: long
			//	parameter 0 : long
			
				//setCreatedBy is a key setter
				//keytype1: long
		//int getDatatypeID 
		//void setDatatypeName 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setDatatypeName is a key setter
				//keytype1: String
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
	  
				list.add( datatype );
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
