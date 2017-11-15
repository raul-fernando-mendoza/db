/*
  DAO created for class: class is class com.sl.db.Data using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.db.Data	
	Method Name: getStringValue startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Data	
	Method Name: getIntegerValue startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Data	
	Method Name: setDateValue startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.util.Date
-------------------
	Method Declaring Class: class com.sl.db.Data	
	Method Name: setStringValue startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		java.lang.String
-------------------
	Method Declaring Class: class com.sl.db.Data	
	Method Name: getDateValue startwith: get
	Method return type: class java.util.Date

		is getter 
     Method type: class java.util.Date
     Parameters:
-------------------
	Method Declaring Class: class com.sl.db.Data	
	Method Name: setIntegerValue startwith: set
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

		//class java.lang.String getStringValue 
		//int getIntegerValue 
		//void setDateValue 
		//void setStringValue 
		//class java.util.Date getDateValue 
		//void setIntegerValue 
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

public class DataDAO extends DAOBase{
	private static Logger m_logger = Logger.getLogger(DataDAO.class.getName());

 	public static long create(Data data) throws Exception {
		Connection conn = Database.getConnection();
		PreparedStatement pstmt = null;
		int id=0;
		
		try {
			String f = "";
			String v = "";
			
			
			
		//class java.lang.String getStringValue
			f += " string_value";
			v += " ?";
		//int getIntegerValue
			f += ", integer_value";
			v += ", ?";
		//class java.util.Date getDateValue
			f += ", date_value";
			v += ", ?";
			String qry = "insert into data(" + f + ") values(" + v + ");";
			m_logger.debug("preparing statement:" + qry );
			pstmt = conn.prepareStatement(qry,Statement.RETURN_GENERATED_KEYS); // create a statement
			int i=1;

		//class java.lang.String getStringValue
			m_logger.debug("data.getStringValue() :" + data.getStringValue() );
/*			setPrepararedStatementString( pstmt, i++, data.getStringValue() );   */
		//int getIntegerValue
			m_logger.debug("data.getIntegerValue() :" + data.getIntegerValue() );
			pstmt.setInt(i++ , data.getIntegerValue() );
		//class java.util.Date getDateValue
			m_logger.debug("data.getDateValue() :" + data.getDateValue() );
			setPrepararedStatementDate( pstmt, i++, data.getDateValue() );
			
			pstmt.executeUpdate(); // execute insert statement
			
			ResultSet rs = pstmt.getGeneratedKeys();
			// get generated key
			if (rs != null && rs.next()) {
			  id = rs.getInt(1);
			  m_logger.debug("generated key:" + id);
			}
						
			
		} catch (SQLException e) {
			m_logger.error(e);
		//class java.lang.String getStringValue
		m_logger.error("data.getStringValue() :" + data.getStringValue() );
		//int getIntegerValue
		m_logger.error("data.getIntegerValue() :" + data.getIntegerValue() );
		//class java.util.Date getDateValue
		m_logger.error("data.getDateValue() :" + data.getDateValue() );
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
		//class java.lang.String getStringValue 
		//int getIntegerValue 
		//void setDateValue 
		//	parameter 0 : java.util.Date
			//setDateValue is a key setter
//****
		//void setStringValue 
		//	parameter 0 : java.lang.String
			//setStringValue is a key setter
//****
	public static ArrayList<Data> getByStringValue(String StringValue) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Data> arrData = new ArrayList<Data>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getStringValue class com.sl.db.Data class com.sl.db.Data
			
	 
			//int getIntegerValue class com.sl.db.Data class com.sl.db.Data
			
	 
			//void setDateValue class com.sl.db.Data class com.sl.db.Data
			
			//	parameter method : public void com.sl.db.Data.setDateValue(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + " date_value"
	 
			//void setStringValue class com.sl.db.Data class com.sl.db.Data
			
			//	parameter method : public void com.sl.db.Data.setStringValue(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", string_value"
	 
			//class java.util.Date getDateValue class com.sl.db.Data class com.sl.db.Data
			
	 
			//void setIntegerValue class com.sl.db.Data class com.sl.db.Data
			
			//	parameter method : public void com.sl.db.Data.setIntegerValue(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", integer_value"
	 
			//void wait class java.lang.Object class com.sl.db.Data
			
	 
			//void wait class java.lang.Object class com.sl.db.Data
			
	 
			//void wait class java.lang.Object class com.sl.db.Data
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Data
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Data
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Data
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Data
			
	 
			//void notify class java.lang.Object class com.sl.db.Data
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Data
			
					+ " FROM "
					+ " data" 
					+ " WHERE string_value = '" + StringValue + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Data data =  new Data();
			//class java.lang.String getStringValue
			//int getIntegerValue
			//void setDateValue
				m_logger.debug("data.setDateValue(" + rs.getDate("date_value") + ")" );
				data.setDateValue(rs.getDate("date_value"));
			//void setStringValue
				m_logger.debug("data.setStringValue(" + rs.getString("string_value") + ")" );
				data.setStringValue(rs.getString("string_value"));
			//class java.util.Date getDateValue
			//void setIntegerValue
				m_logger.debug("data.setIntegerValue(" + rs.getInt("integer_value") + ")" );
				data.setIntegerValue(rs.getInt("integer_value"));
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
		//class java.lang.String getStringValue 
		//int getIntegerValue 
		//void setDateValue 
			//	parameter 0 : java.util.Date
				
				//setDateValue is a key setter
				//keytype: Date
		//void setStringValue 
			//	parameter 0 : java.lang.String
				
				//setStringValue is a key setter
				//keytype: String
		//class java.util.Date getDateValue 
		//void setIntegerValue 
			//	parameter 0 : int
				
				//setIntegerValue is a key setter
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
				arrData.add(data);
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

		return arrData;
	}

	public static void deleteByStringValue(String StringValue) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from data"
					+ " WHERE string_value = '" + StringValue + "'";
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + StringValue);
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
		//class java.util.Date getDateValue 
		//void setIntegerValue 
		//	parameter 0 : int
			//setIntegerValue is a key setter
//****
	public static ArrayList<Data> getByIntegerValue(int IntegerValue) throws Exception {
		// read all the records in a buffer (m_ads)
		ArrayList<Data> arrData = new ArrayList<Data>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//class java.lang.String getStringValue class com.sl.db.Data class com.sl.db.Data
			
	 
			//int getIntegerValue class com.sl.db.Data class com.sl.db.Data
			
	 
			//void setDateValue class com.sl.db.Data class com.sl.db.Data
			
			//	parameter method : public void com.sl.db.Data.setDateValue(java.util.Date)
			//	parameter method : class java.util.Date
			//	parameter 0 : java.util.Date
				
				 + " date_value"
	 
			//void setStringValue class com.sl.db.Data class com.sl.db.Data
			
			//	parameter method : public void com.sl.db.Data.setStringValue(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", string_value"
	 
			//class java.util.Date getDateValue class com.sl.db.Data class com.sl.db.Data
			
	 
			//void setIntegerValue class com.sl.db.Data class com.sl.db.Data
			
			//	parameter method : public void com.sl.db.Data.setIntegerValue(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + ", integer_value"
	 
			//void wait class java.lang.Object class com.sl.db.Data
			
	 
			//void wait class java.lang.Object class com.sl.db.Data
			
	 
			//void wait class java.lang.Object class com.sl.db.Data
			
	 
			//boolean equals class java.lang.Object class com.sl.db.Data
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.db.Data
			
	 
			//int hashCode class java.lang.Object class com.sl.db.Data
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.db.Data
			
	 
			//void notify class java.lang.Object class com.sl.db.Data
			
	 
			//void notifyAll class java.lang.Object class com.sl.db.Data
			
					+ " FROM "
					+ " data" 
					+ " WHERE integer_value = " + IntegerValue;
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			m_logger.debug("record found:" + rs.getFetchSize());
			while (rs.next()) {
				Data data =  new Data();
			//class java.lang.String getStringValue
			//int getIntegerValue
			//void setDateValue
				m_logger.debug("data.setDateValue(" + rs.getDate("date_value") + ")" );
				data.setDateValue(rs.getDate("date_value"));
			//void setStringValue
				m_logger.debug("data.setStringValue(" + rs.getString("string_value") + ")" );
				data.setStringValue(rs.getString("string_value"));
			//class java.util.Date getDateValue
			//void setIntegerValue
				m_logger.debug("data.setIntegerValue(" + rs.getInt("integer_value") + ")" );
				data.setIntegerValue(rs.getInt("integer_value"));
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
		//class java.lang.String getStringValue 
		//int getIntegerValue 
		//void setDateValue 
			//	parameter 0 : java.util.Date
				
				//setDateValue is a key setter
				//keytype: Date
		//void setStringValue 
			//	parameter 0 : java.lang.String
				
				//setStringValue is a key setter
				//keytype: String
		//class java.util.Date getDateValue 
		//void setIntegerValue 
			//	parameter 0 : int
				
				//setIntegerValue is a key setter
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
				arrData.add(data);
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

		return arrData;
	}

	public static void deleteByIntegerValue(int IntegerValue) throws Exception {
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strSQL = "delete from data"
					+ " WHERE integer_value = " + IntegerValue;
			m_logger.debug(strSQL);
			int r1 = st.executeUpdate(strSQL);
			if (r1 == -1) {
				m_logger.error("there was and error deleting by:" + IntegerValue);
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
// end searching for setDataID
  	
	public static Collection<Data> getListAll(Entity entity, Property properties[]) throws Exception {
		// read all the records in a buffer 
		ArrayList<Data> list = new ArrayList<Data>();
		Connection conn = Database.getConnection();
		
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT " + entity.getEntityName() + "_id";

			for(int i=0; i< properties.length; i++){
				strQry += ',' + properties[i].propertyName;
			}
			strQry += " FROM ";
			
			strQry += Long.toString(entity.getCreatedBy()) + "$" + entity.getEntityName(); 

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
		
			while (rs.next()) {
				Data<String,Object> data = new Data<String,Object>();
				data.put(entity.getEntityName() + "ID",rs.getLong(entity.getEntityName() + "_id"));
				for(int i=0; i< properties.length; i++){
					
					if( 1== properties[i].getDatatypeID() ){
						m_logger.debug("data.put(" + properties[i].propertyName + "+" + rs.getInt(properties[i].propertyName) + ")" );
						data.put(properties[i].propertyName,rs.getInt(properties[i].propertyName));
					}
					else if( 2== properties[i].getDatatypeID()){
						m_logger.debug("data.put(" + properties[i].propertyName + "+" + rs.getString(properties[i].propertyName) + ")" );
						data.put(properties[i].propertyName,rs.getString(properties[i].propertyName));
					}
					else if( 3 == properties[i].getDatatypeID()){
						m_logger.debug("data.put(" + properties[i].propertyName + "+" + rs.getDate(properties[i].propertyName) + ")" );
						data.put(properties[i].propertyName,rs.getDate(properties[i].propertyName));
					}
				}	
				list.add( data );
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
