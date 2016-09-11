package com.sl.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class PropertyDDL extends DAOBase{
	private static Logger m_logger = Logger.getLogger(PropertyDDL.class.getName());

	public static void Create(String schema,String entityName,String propertyName,String dataTypeName,int size, String isUnique) throws Exception {
		PreparedStatement pstmt = null;
		try {		
			Connection conn = Database.getConnection();
			String qry = 
			
			"ALTER TABLE " + schema + "$" + entityName + 
			" ADD COLUMN " + propertyName + " " +  dataTypeName;
			
			if( size > 0 ){
				qry += "(" + size + ")";
			};
			
			if( "Y".equals(isUnique)  ){
				qry += " NOT NULL, ADD UNIQUE INDEX " + schema  + entityName + propertyName +  "_UQ (" + propertyName + " ASC)";
			};
			
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
	
	public static void Drop(String schema,String entityName,String propertyName)  throws Exception {
		PreparedStatement pstmt = null;
		try {		
			Connection conn = Database.getConnection();
			String qry = 
					"ALTER TABLE " + schema + "$" + entityName +   
					" DROP COLUMN " + propertyName;
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
