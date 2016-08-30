package com.sl.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class EntityDDL extends DAOBase{
	private static Logger m_logger = Logger.getLogger(EntityDDL.class.getName());

	public static void Create(String schema,Entity entity) throws Exception {
		PreparedStatement pstmt = null;
		try {		
			
			Connection conn = Database.getConnection();
			
			Entity parentEntity = null;
			if( entity.getParentEntityID() > 0 ){
				m_logger.debug("there is parent entity" + entity.getParentEntityID());
				parentEntity = EntityDAO.getByEntityID(schema, entity.getParentEntityID());
				if( parentEntity == null){
					m_logger.error("entity.parentEntityNotFound");
					throw( new Exception("entity.parentEntityNotFound"));
				}	
			}
			
			String qry = "CREATE TABLE "+ schema + "$" + entity.getEntityName() + "( "
					+ entity.getEntityName() + "_id INTEGER NOT NULL AUTO_INCREMENT";
			if( parentEntity !=null){
				qry+= "," + parentEntity.getEntityName() + "_id INT NOT NULL";
			}		
					
				qry+=	", PRIMARY KEY(" + entity.getEntityName() + "_id)" ;
			if( parentEntity !=null){
				qry+= ",";
				if( entity.getIsMultiple() == 0){
					qry += "UNIQUE";
				}
				qry+=" INDEX " + entity.getEntityName() + parentEntity.getEntityName() + "_idx (" + parentEntity.getEntityName() + "_id ASC)";
				qry+= 
						",CONSTRAINT " + entity.getEntityName() + "_" + parentEntity.getEntityName() +
					    " FOREIGN KEY (" + parentEntity.getEntityName() + "_id)" +
					    " REFERENCES " + schema + "$" + parentEntity.getEntityName() +  "(" + parentEntity.getEntityName() + "_id)" +
					    " ON DELETE CASCADE ON UPDATE CASCADE";
					m_logger.debug("adding constraint" + qry);
			}
			qry += ") ENGINE = InnoDB";
			
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry); 
			m_logger.debug("the prepared statement is ready to be executed");
			pstmt.executeUpdate(); 
			m_logger.debug("prepared statement has been executed");
		} catch (SQLException e) {
			m_logger.error( e);
			throw(e);
		}	
		finally {
			pstmt.close();
			pstmt = null;
		}
	}
	
	public static void Drop(String schema,String entityName) throws Exception {
		PreparedStatement pstmt = null;
		try {		
			Connection conn = Database.getConnection();
			String qry = "DROP TABLE "+ schema + "$" + entityName;
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry); 
			m_logger.debug("the prepared statement is ready to be executed");
			pstmt.executeUpdate(); 
			m_logger.debug("prepared statement has been executed");
		} catch (SQLException e) {
			m_logger.error( e.getMessage());
			throw(e);
		}	
		finally {
			pstmt.close();
			pstmt = null;
		}
	}	
	
}
