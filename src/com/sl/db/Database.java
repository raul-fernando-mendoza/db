package com.sl.db;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import java.sql.ResultSet;

public class Database {

	private static Logger m_logger = Logger.getLogger(Database.class.getName());
			
	private static Connection m_conn = null;
	
	private static String url;
	private static String userid;
	private static String password;
	
	
	
	public static Connection getConnection() throws Exception{
		url = "jdbc:mysql://localhost/db";
		userid = "webapp";
		password = "mendozra";		
		if( null == m_conn  || !m_conn.isValid(1) ){
			m_logger.debug("getConnection called");
			try {
				Class.forName("com.mysql.jdbc.Driver") ;
			} catch (ClassNotFoundException e) {
				m_logger.debug(e);
				e.printStackTrace();
				throw new Exception(e);
			}
			m_conn = DriverManager.getConnection(url, userid, password);
			m_logger.debug("new connection c:" + m_conn);
		}
		return m_conn;
	}
    public static void Shutdown() throws SQLException {
        m_conn.close(); 
        m_logger.debug("shutdown completed");
    }
    public static void ExecuteUpdate(Connection c,String sql) throws SQLException {
    	Statement st = c.createStatement();
    	st.executeUpdate(sql);
    }
    
    public static void Dump(ResultSet rs) throws SQLException {

        // the order of the rows in a cursor
        // are implementation dependent unless you use the SQL ORDER statement
        ResultSetMetaData meta   = rs.getMetaData();
        int               colmax = meta.getColumnCount();
        int               i;
        Object            o = null;

        // the result set is a cursor into the data.  You can only
        // point to one row at a time
        // assume we are pointing to BEFORE the first row
        // rs.next() points to next row and returns true
        // or false if there is no next row, which breaks the loop
        for (; rs.next(); ) {
            for (i = 0; i < colmax; ++i) {
                o = rs.getObject(i + 1);    // Is SQL the first column is indexed

                // with 1 not 0
                System.out.print(o.toString() + " ");
            }

            System.out.println(" ");
        }
    }      
 

}
