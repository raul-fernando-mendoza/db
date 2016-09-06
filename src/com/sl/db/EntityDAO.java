/*
  DAO created for class: class is class com.sl.db.Entity using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getEntityName startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getDescription startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getEntityID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setDescription startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setCreatedBy startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
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
	Method Name: getUpdatedBy startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getCreatedBy startwith: get
	Method return type: int

		is getter 
     Method type: int
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
	Method Name: setIsMultiple startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setLabel startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setUpdateDate startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setEntityID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setEntityName startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getIsMultiple startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setUpdatedBy startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getUpdateDate startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: getParentEntityID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Entity	
	Method Name: setParentEntityID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
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

		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
		//void setCreatedBy 
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
		//void setIsMultiple 
		//void setLabel 
		//void setUpdateDate 
		//void setEntityID 
		//void setEntityName 
		//int getIsMultiple 
		//void setUpdatedBy 
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
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
			
			
			
		//class java.lang.String getEntityName
			f += " entity_name";
			v += " ?";
		//class java.lang.String getDescription
			f += ", description";
			v += ", ?";
		//int getEntityID
			//f += ", entity_id";
			//v += ", ?";
		//class java.util.Date getCreateDate
			f += ", create_date";
			v += ", ?";
		//class java.lang.String getLabel
			f += ", label";
			v += ", ?";
		//int getUpdatedBy
			f += ", updated_by";
			v += ", ?";
		//int getCreatedBy
			f += ", created_by";
			v += ", ?";
		//int getIsMultiple
			f += ", is_multiple";
			v += ", ?";
		//class java.util.Date getUpdateDate
			f += ", update_date";
			v += ", ?";
		//int getParentEntityID
			f += ", parent_entity_id";
			v += ", ?";
			String qry = "insert into entity(" + f + ") values(" + v + ");";
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry,Statement.RETURN_GENERATED_KEYS); // create a statement
			int i=1;

		//class java.lang.String getEntityName
			m_logger.debug("entity.getEntityName() :" + entity.getEntityName() );
			setPrepararedStatementString( pstmt, i++, entity.getEntityName() );
		//class java.lang.String getDescription
			m_logger.debug("entity.getDescription() :" + entity.getDescription() );
			setPrepararedStatementString( pstmt, i++, entity.getDescription() );
		//int getEntityID
			//m_logger.debug("entity.getEntityID() :" + entity.getEntityID() );
			//pstmt.setInt(i++ , entity.getEntityID() );
		//class java.util.Date getCreateDate
			setPrepararedStatementDate(pstmt, i++ , new Date());
		//class java.lang.String getLabel
			m_logger.debug("entity.getLabel() :" + entity.getLabel() );
			setPrepararedStatementString( pstmt, i++, entity.getLabel() );
		//int getUpdatedBy
			m_logger.debug("entity.getUpdatedBy() :" + entity.getUpdatedBy() );
			pstmt.setInt(i++ , entity.getUpdatedBy() );
		//int getCreatedBy
			m_logger.debug("entity.getCreatedBy() :" + entity.getCreatedBy() );
			pstmt.setInt(i++ , entity.getCreatedBy() );
		//int getIsMultiple
			m_logger.debug("entity.getIsMultiple() :" + entity.getIsMultiple() );
			pstmt.setInt(i++ , entity.getIsMultiple() );
		//class java.util.Date getUpdateDate
			setPrepararedStatementDate(pstmt, i++ , new Date());
		//int getParentEntityID
			m_logger.debug("entity.getParentEntityID() :" + entity.getParentEntityID() );
			pstmt.setInt(i++ , entity.getParentEntityID() );
			
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
		//class java.lang.String getEntityName
		m_logger.error("entity.getEntityName() :" + entity.getEntityName() );
		//class java.lang.String getDescription
		m_logger.error("entity.getDescription() :" + entity.getDescription() );
		//int getEntityID
		m_logger.error("entity.getEntityID() :" + entity.getEntityID() );
		//class java.util.Date getCreateDate
		m_logger.error("entity.getCreateDate() :" + entity.getCreateDate() );
		//class java.lang.String getLabel
		m_logger.error("entity.getLabel() :" + entity.getLabel() );
		//int getUpdatedBy
		m_logger.error("entity.getUpdatedBy() :" + entity.getUpdatedBy() );
		//int getCreatedBy
		m_logger.error("entity.getCreatedBy() :" + entity.getCreatedBy() );
		//int getIsMultiple
		m_logger.error("entity.getIsMultiple() :" + entity.getIsMultiple() );
		//class java.util.Date getUpdateDate
		m_logger.error("entity.getUpdateDate() :" + entity.getUpdateDate() );
		//int getParentEntityID
		m_logger.error("entity.getParentEntityID() :" + entity.getParentEntityID() );
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
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

	  
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + " description"
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", created_by"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", is_multiple"
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", entity_id"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//int getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", updated_by"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", parent_entity_id"
	 
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
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : int
				
				//setCreatedBy is a key setter
				//keytype: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setIsMultiple 
			//	parameter 0 : int
				
				//setIsMultiple is a key setter
				//keytype: int
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setEntityID 
			//	parameter 0 : int
				
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//	parameter 0 : int
				
				//setUpdatedBy is a key setter
				//keytype: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : int
				
				//setParentEntityID is a key setter
				//keytype: int
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
		//void setCreatedBy 
		//	parameter 0 : int
			//setCreatedBy is a key setter
//****
	public static ArrayList<Entity> getByCreatedBy(int CreatedBy) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + " description"
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", created_by"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", is_multiple"
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", entity_id"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//int getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", updated_by"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", parent_entity_id"
	 
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
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : int
				
				//setCreatedBy is a key setter
				//keytype: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setIsMultiple 
			//	parameter 0 : int
				
				//setIsMultiple is a key setter
				//keytype: int
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setEntityID 
			//	parameter 0 : int
				
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//	parameter 0 : int
				
				//setUpdatedBy is a key setter
				//keytype: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : int
				
				//setParentEntityID is a key setter
				//keytype: int
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

	public static void deleteByCreatedBy(int CreatedBy) throws Exception {
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
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
		//	parameter 0 : java.util.Date
			//setCreateDate is a key setter
//****
		//void setIsMultiple 
		//	parameter 0 : int
			//setIsMultiple is a key setter
//****
	public static ArrayList<Entity> getByIsMultiple(int IsMultiple) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + " description"
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", created_by"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", is_multiple"
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", entity_id"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//int getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", updated_by"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", parent_entity_id"
	 
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
					+ " WHERE is_multiple = " + IsMultiple;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Entity entity =  new Entity();
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : int
				
				//setCreatedBy is a key setter
				//keytype: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setIsMultiple 
			//	parameter 0 : int
				
				//setIsMultiple is a key setter
				//keytype: int
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setEntityID 
			//	parameter 0 : int
				
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//	parameter 0 : int
				
				//setUpdatedBy is a key setter
				//keytype: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : int
				
				//setParentEntityID is a key setter
				//keytype: int
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

	public static void deleteByIsMultiple(int IsMultiple) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from entity"
					+ " WHERE is_multiple = " + IsMultiple;
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

	  
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + " description"
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", created_by"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", is_multiple"
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", entity_id"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//int getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", updated_by"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", parent_entity_id"
	 
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
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : int
				
				//setCreatedBy is a key setter
				//keytype: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setIsMultiple 
			//	parameter 0 : int
				
				//setIsMultiple is a key setter
				//keytype: int
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setEntityID 
			//	parameter 0 : int
				
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//	parameter 0 : int
				
				//setUpdatedBy is a key setter
				//keytype: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : int
				
				//setParentEntityID is a key setter
				//keytype: int
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
		//void setUpdateDate 
		//	parameter 0 : java.util.Date
			//setUpdateDate is a key setter
//****
		//void setEntityID 
		//	parameter 0 : int
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

	  
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + " description"
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", created_by"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", is_multiple"
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", entity_id"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//int getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", updated_by"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", parent_entity_id"
	 
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
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : int
				
				//setCreatedBy is a key setter
				//keytype: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setIsMultiple 
			//	parameter 0 : int
				
				//setIsMultiple is a key setter
				//keytype: int
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setEntityID 
			//	parameter 0 : int
				
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//	parameter 0 : int
				
				//setUpdatedBy is a key setter
				//keytype: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : int
				
				//setParentEntityID is a key setter
				//keytype: int
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
		//int getIsMultiple 
		//void setUpdatedBy 
		//	parameter 0 : int
			//setUpdatedBy is a key setter
//****
	public static ArrayList<Entity> getByUpdatedBy(int UpdatedBy) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + " description"
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", created_by"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", is_multiple"
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", entity_id"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//int getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", updated_by"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", parent_entity_id"
	 
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
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : int
				
				//setCreatedBy is a key setter
				//keytype: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setIsMultiple 
			//	parameter 0 : int
				
				//setIsMultiple is a key setter
				//keytype: int
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setEntityID 
			//	parameter 0 : int
				
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//	parameter 0 : int
				
				//setUpdatedBy is a key setter
				//keytype: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : int
				
				//setParentEntityID is a key setter
				//keytype: int
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

	public static void deleteByUpdatedBy(int UpdatedBy) throws Exception {
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
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
		//	parameter 0 : int
			//setParentEntityID is a key setter
//****
	public static ArrayList<Entity> getByParentEntityID(int ParentEntityID) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Entity> arrEntity = new ArrayList<Entity>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getEntityName class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getDescription class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setDescription class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setDescription(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + " description"
	 
			//void setCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", created_by"
	 
			//class java.util.Date getCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//class java.lang.String getLabel class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getCreatedBy class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setCreateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setCreateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", create_date"
	 
			//void setIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setIsMultiple(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", is_multiple"
	 
			//void setLabel class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setLabel(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", label"
	 
			//void setUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdateDate(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + ", update_date"
	 
			//void setEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", entity_id"
	 
			//void setEntityName class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setEntityName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", entity_name"
	 
			//int getIsMultiple class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setUpdatedBy class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setUpdatedBy(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", updated_by"
	 
			//class java.util.Date getUpdateDate class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//int getParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
	 
			//void setParentEntityID class com.sl.db.Entity class com.sl.db.Entity
			
			//	parameter method : public void com.sl.db.Entity.setParentEntityID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", parent_entity_id"
	 
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
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//	parameter 0 : java.lang.String
				
				//setDescription is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : int
				
				//setCreatedBy is a key setter
				//keytype: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				
				//setCreateDate is a key setter
				//keytype: Date
		//void setIsMultiple 
			//	parameter 0 : int
				
				//setIsMultiple is a key setter
				//keytype: int
		//void setLabel 
			//	parameter 0 : java.lang.String
				
				//setLabel is a key setter
				//keytype: String
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				
				//setUpdateDate is a key setter
				//keytype: Date
		//void setEntityID 
			//	parameter 0 : int
				
		//void setEntityName 
			//	parameter 0 : java.lang.String
				
				//setEntityName is a key setter
				//keytype: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//	parameter 0 : int
				
				//setUpdatedBy is a key setter
				//keytype: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : int
				
				//setParentEntityID is a key setter
				//keytype: int
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

	public static void deleteByParentEntityID(int ParentEntityID) throws Exception {
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
 
	public static Entity getByEntityID(int entityID) throws Exception {
		// read all the records in a buffer (m_ads)
		Entity entity = null;
		
		Connection conn = Database.getConnection();

		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//class java.lang.String getEntityName 
			//class java.lang.String getDescription 
			//int getEntityID 
			//void setDescription 
			//	parameter 0 : java.lang.String
				 + " description"
			//void setCreatedBy 
			//	parameter 0 : int
				 + ", created_by"
			//class java.util.Date getCreateDate 
			//class java.lang.String getLabel 
			//int getUpdatedBy 
			//int getCreatedBy 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//void setIsMultiple 
			//	parameter 0 : int
				 + ", is_multiple"
			//void setLabel 
			//	parameter 0 : java.lang.String
				 + ", label"
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//void setEntityID 
			//	parameter 0 : int
				 + ", entity_id"
			//void setEntityName 
			//	parameter 0 : java.lang.String
				 + ", entity_name"
			//int getIsMultiple 
			//void setUpdatedBy 
			//	parameter 0 : int
				 + ", updated_by"
			//class java.util.Date getUpdateDate 
			//int getParentEntityID 
			//void setParentEntityID 
			//	parameter 0 : int
				 + ", parent_entity_id"
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
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//	parameter 0 : java.lang.String
				//setDescription is a key setter
				//keytype: String
		//void setCreatedBy 
			//	parameter 0 : int
				//setCreatedBy is a key setter
				//keytype: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//	parameter 0 : java.util.Date
				//setCreateDate is a key setter
				//keytype: Date
		//void setIsMultiple 
			//	parameter 0 : int
				//setIsMultiple is a key setter
				//keytype: int
		//void setLabel 
			//	parameter 0 : java.lang.String
				//setLabel is a key setter
				//keytype: String
		//void setUpdateDate 
			//	parameter 0 : java.util.Date
				//setUpdateDate is a key setter
				//keytype: Date
		//void setEntityID 
			//	parameter 0 : int
		//void setEntityName 
			//	parameter 0 : java.lang.String
				//setEntityName is a key setter
				//keytype: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//	parameter 0 : int
				//setUpdatedBy is a key setter
				//keytype: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//	parameter 0 : int
				//setParentEntityID is a key setter
				//keytype: int
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
	
	public static void deleteByEntityID(int entityID) throws Exception {
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
			
		//class java.lang.String getEntityName
			f += " entity_name = ?";
		//class java.lang.String getDescription
			f += ", description = ?";
		//int getEntityID
			f += ", entity_id = ?";
		//class java.util.Date getCreateDate
			f += ", create_date = ?";
		//class java.lang.String getLabel
			f += ", label = ?";
		//int getUpdatedBy
			f += ", updated_by = ?";
		//int getCreatedBy
			f += ", created_by = ?";
		//int getIsMultiple
			f += ", is_multiple = ?";
		//class java.util.Date getUpdateDate
			f += ", update_date = ?";
		//int getParentEntityID
			f += ", parent_entity_id = ?";
			String qry = "update entity set " + f + " where entity_id = " + entity.getEntityID() ;
			m_logger.debug(qry);
			pstmt = conn.prepareStatement(qry); // create a statement
			int i=1;

		//class java.lang.String getEntityName
			setPrepararedStatementString( pstmt, i++, entity.getEntityName() );

		//class java.lang.String getDescription
			setPrepararedStatementString( pstmt, i++, entity.getDescription() );

		//int getEntityID
			pstmt.setInt(i++ , entity.getEntityID() );

		//class java.util.Date getCreateDate
			setPrepararedStatementDate( pstmt, i++, entity.getCreateDate() );

		//class java.lang.String getLabel
			setPrepararedStatementString( pstmt, i++, entity.getLabel() );

		//int getUpdatedBy
			pstmt.setInt(i++ , entity.getUpdatedBy() );

		//int getCreatedBy
			pstmt.setInt(i++ , entity.getCreatedBy() );

		//int getIsMultiple
			pstmt.setInt(i++ , entity.getIsMultiple() );

		//class java.util.Date getUpdateDate
			setPrepararedStatementDate( pstmt, i++, new Date() );

		//int getParentEntityID
			pstmt.setInt(i++ , entity.getParentEntityID() );

			
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

	  
			//class java.lang.String getEntityName 
			//class java.lang.String getDescription 
			//int getEntityID 
			//void setDescription 
			//	parameter 0 : java.lang.String
				 + " description"
			//void setCreatedBy 
			//	parameter 0 : int
				 + ", created_by"
			//class java.util.Date getCreateDate 
			//class java.lang.String getLabel 
			//int getUpdatedBy 
			//int getCreatedBy 
			//void setCreateDate 
			//	parameter 0 : java.util.Date
				 + ", create_date"
			//void setIsMultiple 
			//	parameter 0 : int
				 + ", is_multiple"
			//void setLabel 
			//	parameter 0 : java.lang.String
				 + ", label"
			//void setUpdateDate 
			//	parameter 0 : java.util.Date
				 + ", update_date"
			//void setEntityID 
			//	parameter 0 : int
				 + ", entity_id"
			//void setEntityName 
			//	parameter 0 : java.lang.String
				 + ", entity_name"
			//int getIsMultiple 
			//void setUpdatedBy 
			//	parameter 0 : int
				 + ", updated_by"
			//class java.util.Date getUpdateDate 
			//int getParentEntityID 
			//void setParentEntityID 
			//	parameter 0 : int
				 + ", parent_entity_id"
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
			//class java.lang.String getEntityName
			//class java.lang.String getDescription
			//int getEntityID
			//void setDescription
				m_logger.debug("entity.setDescription(" + rs.getString("description") + ")" );
				entity.setDescription(rs.getString("description"));
			//void setCreatedBy
				m_logger.debug("entity.setCreatedBy(" + rs.getInt("created_by") + ")" );
				entity.setCreatedBy(rs.getInt("created_by"));
			//class java.util.Date getCreateDate
			//class java.lang.String getLabel
			//int getUpdatedBy
			//int getCreatedBy
			//void setCreateDate
				m_logger.debug("entity.setCreateDate(" + rs.getDate("create_date") + ")" );
				entity.setCreateDate(rs.getDate("create_date"));
			//void setIsMultiple
				m_logger.debug("entity.setIsMultiple(" + rs.getInt("is_multiple") + ")" );
				entity.setIsMultiple(rs.getInt("is_multiple"));
			//void setLabel
				m_logger.debug("entity.setLabel(" + rs.getString("label") + ")" );
				entity.setLabel(rs.getString("label"));
			//void setUpdateDate
				m_logger.debug("entity.setUpdateDate(" + rs.getDate("update_date") + ")" );
				entity.setUpdateDate(rs.getDate("update_date"));
			//void setEntityID
				m_logger.debug("entity.setEntityID(" + rs.getInt("entity_id") + ")" );
				entity.setEntityID(rs.getInt("entity_id"));
			//void setEntityName
				m_logger.debug("entity.setEntityName(" + rs.getString("entity_name") + ")" );
				entity.setEntityName(rs.getString("entity_name"));
			//int getIsMultiple
			//void setUpdatedBy
				m_logger.debug("entity.setUpdatedBy(" + rs.getInt("updated_by") + ")" );
				entity.setUpdatedBy(rs.getInt("updated_by"));
			//class java.util.Date getUpdateDate
			//int getParentEntityID
			//void setParentEntityID
				m_logger.debug("entity.setParentEntityID(" + rs.getInt("parent_entity_id") + ")" );
				entity.setParentEntityID(rs.getInt("parent_entity_id"));
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
		//class java.lang.String getEntityName 
		//class java.lang.String getDescription 
		//int getEntityID 
		//void setDescription 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setDescription is a key setter
				//keytype1: String
		//void setCreatedBy 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
				//setCreatedBy is a key setter
				//keytype1: int
		//class java.util.Date getCreateDate 
		//class java.lang.String getLabel 
		//int getUpdatedBy 
		//int getCreatedBy 
		//void setCreateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setCreateDate is a key setter
				//keytype1: Date
		//void setIsMultiple 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
				//setIsMultiple is a key setter
				//keytype1: int
		//void setLabel 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setLabel is a key setter
				//keytype1: String
		//void setUpdateDate 
			//  parameter 0 definition: class java.util.Date
			//	parameter 0 : java.util.Date
			
				//setUpdateDate is a key setter
				//keytype1: Date
		//void setEntityID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
		//void setEntityName 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setEntityName is a key setter
				//keytype1: String
		//int getIsMultiple 
		//void setUpdatedBy 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
				//setUpdatedBy is a key setter
				//keytype1: int
		//class java.util.Date getUpdateDate 
		//int getParentEntityID 
		//void setParentEntityID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
				//setParentEntityID is a key setter
				//keytype1: int
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
