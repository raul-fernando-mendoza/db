package com.sl.db;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.struts2.util.ServletContextAware;

import java.sql.PreparedStatement;
import java.util.Date;

import javax.servlet.ServletContext;

public class ImageReadAction extends BaseAction implements ServletContextAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger m_logger = Logger.getLogger(ImageReadAction.class.getName());

    
    String schema;
    String entityName;
    String propertyName;
    int id;
    int width;
    
    String fileName;
    public String getData(){
    	return fileName;
    }
    
    public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

    public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String execute() throws SQLException, IOException {
       m_logger.debug("execute");
       
       Connection conn;
       FileInputStream fis = null;
       PreparedStatement ps = null;
       
       String filePath = context.getRealPath("/")+"images";
       m_logger.debug("filepath:" + filePath);
       
       try {
			conn = Database.getConnection();
			
			String sql = "select update_date," + propertyName + " from "+ schema + "$" + entityName + " where " + entityName  + "_id = " + id;
			m_logger.debug(sql);
			ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

		    if(rs.next()){          
		        Date d = rs.getDate(1);
		    	
		    	int multiple = width / 50 ;
		    	int newWidth = multiple * 50;

		    	fileName = schema + "_" + entityName + "_" + id + "_" + newWidth + "_" + getDateFormatted(d);
		        File file = new File( filePath, fileName );
		        
		        if( false == file.exists() ){
		        	
		        	InputStream originalImageStream = rs.getBinaryStream(2);

		            FileOutputStream fileOutputStream = new FileOutputStream(file);
		            int length =0;
		            while ((length = originalImageStream.read()) != -1) {
		                fileOutputStream.write(length);                 
		            }
		            fileOutputStream.close();
		        }    
		    }
		} catch (Exception e) {
			m_logger.error(e);
			addActionError(e.getLocalizedMessage());
			return ERROR;
		}
       finally {
    	   ps.close();
       }
       
       return SUCCESS;
    }

	ServletContext context; 
	@Override
	public void setServletContext(ServletContext context) {
		this.context = context; 
		
	}
}