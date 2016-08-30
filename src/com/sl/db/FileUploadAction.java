package com.sl.db;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import java.sql.PreparedStatement;

public class FileUploadAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger m_logger = Logger.getLogger(FileUploadAction.class.getName());
    private File file=null;
    private String contentType;
    private String filename;
    private int id;
    private String entityName;
    private String propertyName;
    
    String schema;

    
    
    
    
    public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	String getData(){
    	return file.getAbsolutePath();
    }

    public void setUpload(File file) {
    	m_logger.debug("setUpload:" + file.getAbsolutePath());
       this.file = file;
    }

    public void setUploadContentType(String contentType) {
    	m_logger.debug("setUploadContentType:" + contentType);
       this.contentType = contentType;
    }

    public void setUploadFileName(String filename) {
    	m_logger.debug("setUploadFileName:" + filename);
       this.filename = filename;
    }

    public String Initialize(){
    	m_logger.debug("initialize");
    	return INPUT;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String execute() throws SQLException, IOException {
       m_logger.debug("execute" + file.getAbsolutePath() + " contentType:" + contentType + " filename:" + filename);
       
       Connection conn;
       FileInputStream fis = null;
       PreparedStatement ps = null;
       
       
       try {
			conn = Database.getConnection();
			
			String INSERT_PICTURE = "insert " + schema + "$" + entityName + "(" + propertyName + "," + propertyName + "_name) values(1,1,?)";

			 conn.setAutoCommit(false);
			 fis = new FileInputStream(file);
			 ps = conn.prepareStatement(INSERT_PICTURE);

			 ps.setBinaryStream(1, fis, (int) file.length());
			 ps.executeUpdate();
			 conn.commit();
			 
			 m_logger.debug("insert was successful");
        
		} catch (Exception e) {
			e.printStackTrace();
		}
       finally {
    	   ps.close();
    	   fis.close();
       }
       
       return SUCCESS;
    }
}