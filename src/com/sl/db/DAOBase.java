package com.sl.db;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DAOBase {
	public static void setPrepararedStatementString(PreparedStatement pstmt, int idx, String s) throws SQLException{
		if( null == s ){
			pstmt.setNull(idx, java.sql.Types.VARCHAR);
		}
		else{
			pstmt.setString(idx, s);
		}
	}
	public static void setPrepararedStatementInteger(PreparedStatement pstmt, int idx, Integer i) throws SQLException{
		if( null == i ){
			pstmt.setNull(idx, java.sql.Types.INTEGER);
		}
		else{
			pstmt.setInt(idx,i);
		}
	}	
	public static void setPrepararedStatementDouble(PreparedStatement pstmt, int idx, Double d) throws SQLException{
		if( null == d ){
			pstmt.setNull(idx, java.sql.Types.DOUBLE);
		}
		else{
			pstmt.setDouble(idx, d.doubleValue());
		}
	}
	public static void setPrepararedStatementDate(PreparedStatement pstmt, int idx, Date d) throws SQLException{
		if( null == d ){
			pstmt.setNull(idx, java.sql.Types.DATE);
		}
		else{
			pstmt.setDate(idx, new java.sql.Date(d.getTime()));
		}
	}
	public static void setPrepararedStatementBoolean(PreparedStatement pstmt, int idx, Boolean b) throws SQLException{
		if( null == b ){
			pstmt.setNull(idx, java.sql.Types.BOOLEAN);
		}
		else{
			pstmt.setBoolean(idx, b);
		}
	}
	public static void setPrepararedStatementArray(PreparedStatement pstmt, int idx, Array a) throws SQLException{
		if( null == a ){
			pstmt.setNull(idx, java.sql.Types.ARRAY);
		}
		else{
			pstmt.setArray(idx, a);
		}
	}
	public static Double getDouble(ResultSet rs, String fieldName ) throws SQLException{
	  if( null == rs.getObject(fieldName) ){
		  return null;
	  }
	  else{
		  return rs.getDouble(fieldName); 
	  }
	}
	public static Integer getInteger(ResultSet rs, String fieldName ) throws SQLException{
		  if( null == rs.getObject(fieldName) ){
			  return null;
		  }
		  else{
			  return rs.getInt(fieldName); 
		  }
		}	
}
