/*
  DAO created for class: class is class com.sl.buscaenmonterrey.DataType using Raul Mendoza Template Library ver 1.0
	Method Declaring Class: class com.sl.buscaenmonterrey.DataType	
	Method Name: getDataTypeID startwith: get
	Method return type: int

		is getter 
     Method type: int
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.DataType	
	Method Name: setDataTypeID startwith: set
	Method return type: void

     Method type: void
     Parameters:
     		int
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.DataType	
	Method Name: getDataTypeName startwith: get
	Method return type: class java.lang.String

		is getter 
     Method type: class java.lang.String
     Parameters:
-------------------
	Method Declaring Class: class com.sl.buscaenmonterrey.DataType	
	Method Name: setDataTypeName startwith: set
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

		//int getDataTypeID 
		//void setDataTypeID 
		//class java.lang.String getDataTypeName 
		//void setDataTypeName 
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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class DataTypeDAO extends DAOBase{
	private static Logger m_logger = Logger.getLogger(DataTypeDAO.class.getName());

	public static DataType getByDataTypeName(String schema, String DataTypeName) throws Exception {
		// read all the records in a buffer (m_ads)
		DataType dataType = null;
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
	 
			//int getDataTypeID class com.sl.buscaenmonterrey.DataType class com.sl.buscaenmonterrey.DataType
			
	 
			//void setDataTypeID class com.sl.buscaenmonterrey.DataType class com.sl.buscaenmonterrey.DataType
			
			//	parameter method : public void com.sl.buscaenmonterrey.DataType.setDataTypeID(int)
			//	parameter method : int
			//	parameter 0 : int
				
				 + " data_type_id"
	 
			//class java.lang.String getDataTypeName class com.sl.buscaenmonterrey.DataType class com.sl.buscaenmonterrey.DataType
			
	 
			//void setDataTypeName class com.sl.buscaenmonterrey.DataType class com.sl.buscaenmonterrey.DataType
			
			//	parameter method : public void com.sl.buscaenmonterrey.DataType.setDataTypeName(java.lang.String)
			//	parameter method : class java.lang.String
			//	parameter 0 : java.lang.String
				
				 + ", data_type_name"
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
	 
			//void wait class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
	 
			//boolean equals class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
	 
			//class java.lang.String toString class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
	 
			//int hashCode class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
	 
			//class java.lang.Class getClass class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
	 
			//void notify class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
	 
			//void notifyAll class java.lang.Object class com.sl.buscaenmonterrey.DataType
			
					+ " FROM "
					+ schema + "$data_type" 
					+ " WHERE data_type_name = '" + DataTypeName + "'";
			
			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
			if (rs.next()) {
				dataType =  new DataType();
			//int getDataTypeID
			//void setDataTypeID
				m_logger.debug("datatype.setDataTypeID(" + rs.getInt("data_type_id") + ")" );
				dataType.setDataTypeID(rs.getInt("data_type_id"));
			//class java.lang.String getDataTypeName
			//void setDataTypeName
				m_logger.debug("datatype.setDataTypeName(" + rs.getString("data_type_name") + ")" );
				dataType.setDataTypeName(rs.getString("data_type_name"));
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
		//int getDataTypeID 
		//void setDataTypeID 
			//	parameter 0 : int
				
		//class java.lang.String getDataTypeName 
		//void setDataTypeName 
			//	parameter 0 : java.lang.String
				
				//setDataTypeName is a key setter
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

		return dataType;
	}


			

 
//****
 
	public static DataType getByDataTypeID(String schema, int datatypeID) throws Exception {
		// read all the records in a buffer (m_ads)
		DataType datatype = null;
		
		Connection conn = Database.getConnection();

		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//int getDataTypeID 
			//void setDataTypeID 
			//	parameter 0 : int
				 + " data_type_id"
			//class java.lang.String getDataTypeName 
			//void setDataTypeName 
			//	parameter 0 : java.lang.String
				 + ", data_type_name"
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
					+ schema + "$data_type" 
					+ " WHERE data_type_id = " + datatypeID;

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);

			if (rs.next()) {
				datatype = new DataType();
			//int getDataTypeID
			//void setDataTypeID
				m_logger.debug("datatype.setDataTypeID(" + rs.getInt("data_type_id") + ")" );
				datatype.setDataTypeID(rs.getInt("data_type_id"));
			//class java.lang.String getDataTypeName
			//void setDataTypeName
				m_logger.debug("datatype.setDataTypeName(" + rs.getString("data_type_name") + ")" );
				datatype.setDataTypeName(rs.getString("data_type_name"));
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
		//int getDataTypeID 
		//void setDataTypeID 
			//	parameter 0 : int
		//class java.lang.String getDataTypeName 
		//void setDataTypeName 
			//	parameter 0 : java.lang.String
				//setDataTypeName is a key setter
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
	


 

  	
	public static DataType[] getListAll(String schema) throws Exception {
		// read all the records in a buffer 
		ArrayList<DataType> list = new ArrayList<DataType>();
		Connection conn = Database.getConnection();
		Statement st = conn.createStatement();
		try{
			String strQry = "SELECT "

	  
			//int getDataTypeID 
			//void setDataTypeID 
			//	parameter 0 : int
				 + " data_type_id"
			//class java.lang.String getDataTypeName 
			//void setDataTypeName 
			//	parameter 0 : java.lang.String
				 + ", data_type_name"
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
					+ schema + "$data_type"; 

			m_logger.debug("Executing SQL:" + strQry);
			ResultSet rs = st.executeQuery(strQry);
		
			while (rs.next()) {
				DataType datatype = new DataType();
			//int getDataTypeID
			//void setDataTypeID
				m_logger.debug("datatype.setDataTypeID(" + rs.getInt("data_type_id") + ")" );
				datatype.setDataTypeID(rs.getInt("data_type_id"));
			//class java.lang.String getDataTypeName
			//void setDataTypeName
				m_logger.debug("datatype.setDataTypeName(" + rs.getString("data_type_name") + ")" );
				datatype.setDataTypeName(rs.getString("data_type_name"));
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
		//int getDataTypeID 
		//void setDataTypeID 
			//  parameter 0 definition: int
			//	parameter 0 : int
			
		//class java.lang.String getDataTypeName 
		//void setDataTypeName 
			//  parameter 0 definition: class java.lang.String
			//	parameter 0 : java.lang.String
			
				//setDataTypeName is a key setter
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
		return list.toArray(new DataType[list.size()]);
	}

}
