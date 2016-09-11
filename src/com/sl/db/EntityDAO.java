/*
  DAO created for class: class is class com.sl.db.Entity using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getDescription startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getEntityName startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getParentEntityID startwith: get
	Method return type: long

		is getter 
     Method type: long
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setParentEntityID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		long
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setEntityID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		long
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getUpdateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setCreatedBy startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		long
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setEntityName startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getUpdatedBy startwith: get
	Method return type: long

		is getter 
     Method type: long
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setLabel startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setIsMultiple startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getIsMultiple startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setUpdateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setUpdatedBy startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		long
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getEntityID startwith: get
	Method return type: long

		is getter 
     Method type: long
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setCreateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setDescription startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getCreateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getLabel startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getCreatedBy startwith: get
	Method return type: long

		is getter 
     Method type: long
     Parameters:
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

		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
		//void setEntityID 
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
		//void setEntityName 
		//long getUpdatedBy 
		//void setLabel 
		//void setIsMultiple 
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
		//void setUpdatedBy 
		//long getEntityID 
		//void setCreateDate 
		//void setDescription 
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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

public class EntityDAO extends DAOBase{
	private static Logger m_logger = Logger.getLogger(EntityDAO.class.getName());

 	public static long create(Entity entity) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		int id=0;
		
		try {
			String f = "";
			String v = "";
			
			
			
		//class java.lang.String getDescription
			f += " description";
			v += " ?";
		//class java.lang.String getEntityName
			f += ", entity_name";
			v += ", ?";
		//long getParentEntityID
			f += ", parent_entity_id";
			v += ", ?";
		//class java.util.Date getUpdateDate
			f += ", update_date";
			v += ", ?";
		//long getUpdatedBy
			f += ", updated_by";
			v += ", ?";
		//class java.lang.String getIsMultiple
			f += ", is_multiple";
			v += ", ?";
		//long getEntityID
			//f += ", entity_id";
			//v += ", ?";
		//class java.util.Date getCreateDate
			f += ", create_date";
			v += ", ?";
		//class java.lang.String getLabel
			f += ", label";
			v += ", ?";
		//long getCreatedBy
			f += ", created_by";
			v += ", ?";
			String qry = "insert into entity(" + f + ") values(" + v + ");";
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry,Statement.RETURN_GENERATED_KEYS); // create a statement
			int i=1;

		//class java.lang.String getDescription
			m_logger.debug("entity.getDescription() :" + entity.getDescription() );
			setPrepararedStatementString( pstmt, i++, entity.getDescription() );
		//class java.lang.String getEntityName
			m_logger.debug("entity.getEntityName() :" + entity.getEntityName() );
			setPrepararedStatementString( pstmt, i++, entity.getEntityName() );
		//long getParentEntityID
			m_logger.debug("entity.getParentEntityID() :" + entity.getParentEntityID() );
			pstmt.setLong(i++ , entity.getParentEntityID() );
		//class java.util.Date getUpdateDate
			setPrepararedStatementDate(pstmt, i++ , new Date());
		//long getUpdatedBy
			m_logger.debug("entity.getUpdatedBy() :" + entity.getUpdatedBy() );
			pstmt.setLong(i++ , entity.getUpdatedBy() );
		//class java.lang.String getIsMultiple
			m_logger.debug("entity.getIsMultiple() :" + entity.getIsMultiple() );
			setPrepararedStatementString( pstmt, i++, entity.getIsMultiple() );
		//long getEntityID
			//m_logger.debug("entity.getEntityID() :" + entity.getEntityID() );
			//pstmt.setInt(i++ , entity.getEntityID() );
		//class java.util.Date getCreateDate
			setPrepararedStatementDate(pstmt, i++ , new Date());
		//class java.lang.String getLabel
			m_logger.debug("entity.getLabel() :" + entity.getLabel() );
			setPrepararedStatementString( pstmt, i++, entity.getLabel() );
		//long getCreatedBy
			m_logger.debug("entity.getCreatedBy() :" + entity.getCreatedBy() );
			pstmt.setLong(i++ , entity.getCreatedBy() );
			
			pstmt.executeUpdate(); // execute insert statement
			
			ResultSet rs = pstmt.getGeneratedKeys();
			// get generated key
			if (rs != null && rs.next()) {
			  id = rs.getInt(1);
			  m_logger.debug("generated key:" + id);
			}
						
			entity.setEntityID(id);
			
		} catch (SQLException e) {
			m_logger.error(e);
		//class java.lang.String getDescription
		m_logger.error("entity.getDescription() :" + entity.getDescription() );
		//class java.lang.String getEntityName
		m_logger.error("entity.getEntityName() :" + entity.getEntityName() );
		//long getParentEntityID
		m_logger.error("entity.getParentEntityID() :" + entity.getParentEntityID() );
		//class java.util.Date getUpdateDate
		m_logger.error("entity.getUpdateDate() :" + entity.getUpdateDate() );
		//long getUpdatedBy
		m_logger.error("entity.getUpdatedBy() :" + entity.getUpdatedBy() );
		//class java.lang.String getIsMultiple
		m_logger.error("entity.getIsMultiple() :" + entity.getIsMultiple() );
		//long getEntityID
		m_logger.error("entity.getEntityID() :" + entity.getEntityID() );
		//class java.util.Date getCreateDate
		m_logger.error("entity.getCreateDate() :" + entity.getCreateDate() );
		//class java.lang.String getLabel
		m_logger.error("entity.getLabel() :" + entity.getLabel() );
		//long getCreatedBy
		m_logger.error("entity.getCreatedBy() :" + entity.getCreatedBy() );
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
		//	parameter 0 : long
			//setParentEntityID is a key setter
//****
	public static ArrayList<Entity> getByParentEntityID(long ParentEntityID) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " parent_entity_id"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", entity_id"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//long getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", is_multiple"
	 
			//class java.lang.String getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", updated_by"
	 
			//long getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", description"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Entity
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Entity
			
	 
			//void notify class java.lang.Object class com.sl.db.Entity
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Entity
			
					+ " FROM "
					+ " entity" 
					+ " WHERE parent_entity_id = " + ParentEntityID;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Entity entity =  new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : long
				
				//setParentEntityID is a key setter
				//keytype: long
		//void setEntityID 
			//	parameter 0 : long
				
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//long getUpdatedBy 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setIsMultiple 
			//	parameter 0 : java.lang.String
				
				//setIsMultiple is a key setter
				//keytype: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//long getEntityID 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
				arrEntity.add(entity);
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

		return arrEntity;
	}

	public static void deleteByParentEntityID(long ParentEntityID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity"
					+ " WHERE parent_entity_id = " + ParentEntityID;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + ParentEntityID);
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
		//void setEntityID 
		//	parameter 0 : long
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
		//	parameter 0 : long
			//setCreatedBy is a key setter
//****
	public static ArrayList<Entity> getByCreatedBy(long CreatedBy) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " parent_entity_id"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", entity_id"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//long getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", is_multiple"
	 
			//class java.lang.String getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", updated_by"
	 
			//long getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", description"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Entity
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Entity
			
	 
			//void notify class java.lang.Object class com.sl.db.Entity
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Entity
			
					+ " FROM "
					+ " entity" 
					+ " WHERE created_by = " + CreatedBy;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Entity entity =  new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : long
				
				//setParentEntityID is a key setter
				//keytype: long
		//void setEntityID 
			//	parameter 0 : long
				
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//long getUpdatedBy 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setIsMultiple 
			//	parameter 0 : java.lang.String
				
				//setIsMultiple is a key setter
				//keytype: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//long getEntityID 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
				arrEntity.add(entity);
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

		return arrEntity;
	}

	public static void deleteByCreatedBy(long CreatedBy) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity"
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
		//void setEntityName 
		//	parameter 0 : java.lang.String
			//setEntityName is a key setter
//****
	public static ArrayList<Entity> getByEntityName(String EntityName) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " parent_entity_id"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", entity_id"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//long getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", is_multiple"
	 
			//class java.lang.String getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", updated_by"
	 
			//long getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", description"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Entity
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Entity
			
	 
			//void notify class java.lang.Object class com.sl.db.Entity
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Entity
			
					+ " FROM "
					+ " entity" 
					+ " WHERE entity_name = '" + EntityName + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Entity entity =  new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : long
				
				//setParentEntityID is a key setter
				//keytype: long
		//void setEntityID 
			//	parameter 0 : long
				
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//long getUpdatedBy 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setIsMultiple 
			//	parameter 0 : java.lang.String
				
				//setIsMultiple is a key setter
				//keytype: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//long getEntityID 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
				arrEntity.add(entity);
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

		return arrEntity;
	}

	public static void deleteByEntityName(String EntityName) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity"
					+ " WHERE entity_name = '" + EntityName + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + EntityName);
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
		//long getUpdatedBy 
		//void setLabel 
		//	parameter 0 : java.lang.String
			//setLabel is a key setter
//****
	public static ArrayList<Entity> getByLabel(String Label) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " parent_entity_id"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", entity_id"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//long getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", is_multiple"
	 
			//class java.lang.String getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", updated_by"
	 
			//long getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", description"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Entity
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Entity
			
	 
			//void notify class java.lang.Object class com.sl.db.Entity
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Entity
			
					+ " FROM "
					+ " entity" 
					+ " WHERE label = '" + Label + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Entity entity =  new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : long
				
				//setParentEntityID is a key setter
				//keytype: long
		//void setEntityID 
			//	parameter 0 : long
				
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//long getUpdatedBy 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setIsMultiple 
			//	parameter 0 : java.lang.String
				
				//setIsMultiple is a key setter
				//keytype: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//long getEntityID 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
				arrEntity.add(entity);
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

		return arrEntity;
	}

	public static void deleteByLabel(String Label) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity"
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
		//void setIsMultiple 
		//	parameter 0 : java.lang.String
			//setIsMultiple is a key setter
//****
	public static ArrayList<Entity> getByIsMultiple(String IsMultiple) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " parent_entity_id"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", entity_id"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//long getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", is_multiple"
	 
			//class java.lang.String getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", updated_by"
	 
			//long getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", description"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Entity
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Entity
			
	 
			//void notify class java.lang.Object class com.sl.db.Entity
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Entity
			
					+ " FROM "
					+ " entity" 
					+ " WHERE is_multiple = '" + IsMultiple + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Entity entity =  new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : long
				
				//setParentEntityID is a key setter
				//keytype: long
		//void setEntityID 
			//	parameter 0 : long
				
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//long getUpdatedBy 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setIsMultiple 
			//	parameter 0 : java.lang.String
				
				//setIsMultiple is a key setter
				//keytype: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//long getEntityID 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
				arrEntity.add(entity);
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

		return arrEntity;
	}

	public static void deleteByIsMultiple(String IsMultiple) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity"
					+ " WHERE is_multiple = '" + IsMultiple + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + IsMultiple);
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
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
		//	parameter 0 : java.util.Date
			//setUpdateDate is a key setter
//****
		//void setUpdatedBy 
		//	parameter 0 : long
			//setUpdatedBy is a key setter
//****
	public static ArrayList<Entity> getByUpdatedBy(long UpdatedBy) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " parent_entity_id"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", entity_id"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//long getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", is_multiple"
	 
			//class java.lang.String getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", updated_by"
	 
			//long getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", description"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Entity
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Entity
			
	 
			//void notify class java.lang.Object class com.sl.db.Entity
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Entity
			
					+ " FROM "
					+ " entity" 
					+ " WHERE updated_by = " + UpdatedBy;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Entity entity =  new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : long
				
				//setParentEntityID is a key setter
				//keytype: long
		//void setEntityID 
			//	parameter 0 : long
				
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//long getUpdatedBy 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setIsMultiple 
			//	parameter 0 : java.lang.String
				
				//setIsMultiple is a key setter
				//keytype: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//long getEntityID 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
				arrEntity.add(entity);
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

		return arrEntity;
	}

	public static void deleteByUpdatedBy(long UpdatedBy) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity"
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
		//long getEntityID 
		//void setCreateDate 
		//	parameter 0 : java.util.Date
			//setCreateDate is a key setter
//****
		//void setDescription 
		//	parameter 0 : java.lang.String
			//setDescription is a key setter
//****
	public static ArrayList<Entity> getByDescription(String Description) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + " parent_entity_id"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", entity_id"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", created_by"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//long getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", is_multiple"
	 
			//class java.lang.String getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(long)
			//	parameter method : long
			//	parameter 0 : long
				
				 + ", updated_by"
	 
			//long getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", description"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//long getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//void wait class java.lang.Object class com.sl.db.Entity
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Entity
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Entity
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Entity
			
	 
			//void notify class java.lang.Object class com.sl.db.Entity
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Entity
			
					+ " FROM "
					+ " entity" 
					+ " WHERE description = '" + Description + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Entity entity =  new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : long
				
				//setParentEntityID is a key setter
				//keytype: long
		//void setEntityID 
			//	parameter 0 : long
				
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//	parameter 0 : long
				
				//setCreatedBy is a key setter
				//keytype: long
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//long getUpdatedBy 
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setIsMultiple 
			//	parameter 0 : java.lang.String
				
				//setIsMultiple is a key setter
				//keytype: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setUpdatedBy 
			//	parameter 0 : long
				
				//setUpdatedBy is a key setter
				//keytype: long
		//long getEntityID 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
				arrEntity.add(entity);
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

		return arrEntity;
	}

	public static void deleteByDescription(String Description) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity"
					+ " WHERE description = '" + Description + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + Description);
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
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
 
	public static Entity getByEntityID(long entityID) throws Exception {
		// read all the records in a buffer (m_ads)
		Entity entity = null;
		
		Connection conn = Database.getConnection();

		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//class java.lang.String getDescription 
			//class java.lang.String getEntityName 
			//long getParentEntityID 
			//void setParentEntityID 
			//	parameter 0 : long
				 + " parent_entity_id"
			//void setEntityID 
			//	parameter 0 : long
				 + ", entity_id"
			//class java.util.Date getUpdateDate 
			//void setCreatedBy 
			//	parameter 0 : long
				 + ", created_by"
			//void setEntityName 
			//	parameter 0 : java.lang.String
				 + ", entity_name"
			//long getUpdatedBy 
			//void setLabel 
			//	parameter 0 : java.lang.String
				 + ", label"
			//void setIsMultiple 
			//	parameter 0 : java.lang.String
				 + ", is_multiple"
			//class java.lang.String getIsMultiple 
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//void setUpdatedBy 
			//	parameter 0 : long
				 + ", updated_by"
			//long getEntityID 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//void setDescription 
			//	parameter 0 : java.lang.String
				 + ", description"
			//class java.util.Date getCreateDate 
			//class java.lang.String getLabel 
			//long getCreatedBy 
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
					+ " entity" 
					+ " WHERE entity_id = " + entityID;

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);

			if (rs.next()) {
				entity = new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : long
				//setParentEntityID is a key setter
				//keytype: long
		//void setEntityID 
			//	parameter 0 : long
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//	parameter 0 : long
				//setCreatedBy is a key setter
				//keytype: long
		//void setEntityName 
			//	parameter 0 : java.lang.String
				//setEntityName is a key setter
				//keytype: String
		//long getUpdatedBy 
		//void setLabel 
			//	parameter 0 : java.lang.String
				//setLabel is a key setter
				//keytype: String
		//void setIsMultiple 
			//	parameter 0 : java.lang.String
				//setIsMultiple is a key setter
				//keytype: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				//setUpdateDate is a key setter
				//keytype: Date
		//void setUpdatedBy 
			//	parameter 0 : long
				//setUpdatedBy is a key setter
				//keytype: long
		//long getEntityID 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				//setCreateDate is a key setter
				//keytype: Date
		//void setDescription 
			//	parameter 0 : java.lang.String
				//setDescription is a key setter
				//keytype: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
		
		return entity;
	}
	
	public static void deleteByEntityID(long entityID) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity where entity_id=" + entityID;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting record:" + entityID);
			} else {
				m_logger.debug("record was deleted correctly:" + entityID);
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

 
	public static void update(Entity entity) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		try {
			String f = "";
			
		//class java.lang.String getDescription
			f += " description = ?";
		//class java.lang.String getEntityName
			f += ", entity_name = ?";
		//long getParentEntityID
			f += ", parent_entity_id = ?";
		//class java.util.Date getUpdateDate
			f += ", update_date = ?";
		//long getUpdatedBy
			f += ", updated_by = ?";
		//class java.lang.String getIsMultiple
			f += ", is_multiple = ?";
		//long getEntityID
			f += ", entity_id = ?";
		//class java.util.Date getCreateDate
			f += ", create_date = ?";
		//class java.lang.String getLabel
			f += ", label = ?";
		//long getCreatedBy
			f += ", created_by = ?";
			String qry = "update entity set " + f + " where entity_id = " + entity.getEntityID() ;
			m_logger.debug(qry);
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//class java.lang.String getDescription
			setPrepararedStatementString( pstmt, i++, entity.getDescription() );

		//class java.lang.String getEntityName
			setPrepararedStatementString( pstmt, i++, entity.getEntityName() );

		//long getParentEntityID

		//class java.util.Date getUpdateDate
			setPrepararedStatementDate( pstmt, i++, new Date() );

		//long getUpdatedBy

		//class java.lang.String getIsMultiple
			setPrepararedStatementString( pstmt, i++, entity.getIsMultiple() );

		//long getEntityID

		//class java.util.Date getCreateDate
			setPrepararedStatementDate( pstmt, i++, entity.getCreateDate() );

		//class java.lang.String getLabel
			setPrepararedStatementString( pstmt, i++, entity.getLabel() );

		//long getCreatedBy

			
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
// end searching for setEntityID
  	
	public static Collection<Entity> getListAll() throws Exception {
		// read all the records in a buffer 
		ArrayList<Entity> list = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//class java.lang.String getDescription 
			//class java.lang.String getEntityName 
			//long getParentEntityID 
			//void setParentEntityID 
			//	parameter 0 : long
				 + " parent_entity_id"
			//void setEntityID 
			//	parameter 0 : long
				 + ", entity_id"
			//class java.util.Date getUpdateDate 
			//void setCreatedBy 
			//	parameter 0 : long
				 + ", created_by"
			//void setEntityName 
			//	parameter 0 : java.lang.String
				 + ", entity_name"
			//long getUpdatedBy 
			//void setLabel 
			//	parameter 0 : java.lang.String
				 + ", label"
			//void setIsMultiple 
			//	parameter 0 : java.lang.String
				 + ", is_multiple"
			//class java.lang.String getIsMultiple 
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//void setUpdatedBy 
			//	parameter 0 : long
				 + ", updated_by"
			//long getEntityID 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//void setDescription 
			//	parameter 0 : java.lang.String
				 + ", description"
			//class java.util.Date getCreateDate 
			//class java.lang.String getLabel 
			//long getCreatedBy 
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
					+ " entity"; 

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
		
			while (rs.next()) {
				Entity entity = new Entity();
			//class java.lang.String getDescription
			//class java.lang.String getEntityName
			//long getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getLong("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getLong("parent_entity_id"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getLong("entity_id") + ")" );
				entity.setEntityID(rs.getLong("entity_id"));
			//class java.util.Date getUpdateDate
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getLong("created_by") + ")" );
				entity.setCreatedBy(rs.getLong("created_by"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//long getUpdatedBy
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getString("is_multiple") + ")" );
				entity.setIsMultiple(rs.getString("is_multiple"));
			//class java.lang.String getIsMultiple
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getLong("updated_by") + ")" );
				entity.setUpdatedBy(rs.getLong("updated_by"));
			//long getEntityID
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//long getCreatedBy
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
		//class java.lang.String getDescription 
		//class java.lang.String getEntityName 
		//long getParentEntityID 
		//void setParentEntityID 
			//  parameter 0 definition: long
			//	parameter 0 : long
			
				//setParentEntityID is a key setter
				//keytype1: long
		//void setEntityID 
			//  parameter 0 definition: long
			//	parameter 0 : long
			
		//class java.util.Date getUpdateDate 
		//void setCreatedBy 
			//  parameter 0 definition: long
			//	parameter 0 : long
			
				//setCreatedBy is a key setter
				//keytype1: long
		//void setEntityName 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setEntityName is a key setter
				//keytype1: String
		//long getUpdatedBy 
		//void setLabel 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setLabel is a key setter
				//keytype1: String
		//void setIsMultiple 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setIsMultiple is a key setter
				//keytype1: String
		//class java.lang.String getIsMultiple 
		//void setUpdateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setUpdateDate is a key setter
				//keytype1: Date
		//void setUpdatedBy 
			//  parameter 0 definition: long
			//	parameter 0 : long
			
				//setUpdatedBy is a key setter
				//keytype1: long
		//long getEntityID 
		//void setCreateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setCreateDate is a key setter
				//keytype1: Date
		//void setDescription 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setDescription is a key setter
				//keytype1: String
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//long getCreatedBy 
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
	  
				list.add( entity );
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
