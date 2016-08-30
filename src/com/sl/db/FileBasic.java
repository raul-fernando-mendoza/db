package com.sl.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.log4j.Category;

public class FileBasic {
	private static Category m_logger = Category.getInstance(FileBasic.class.getName());

	public static void copyfile(String srFile, String dtFile) throws Exception{
		m_logger.debug("copyfile(String srFile, String dtFile)");
		 try{
		   File f1 = new File(srFile);
		   File f2 = new File(dtFile);
		   InputStream in = new FileInputStream(f1);
		   
		   //For Append the file.
//		   OutputStream out = new FileOutputStream(f2,true);

		   //For Overwrite the file.
		   OutputStream out = new FileOutputStream(f2);

		   byte[] buf = new byte[1024];
		   int len;
		   while ((len = in.read(buf)) > 0){
		    out.write(buf, 0, len);
		   }
		   in.close();
		   out.close();
		   m_logger.debug("File copied.");
		  }
		  catch(FileNotFoundException e){
		   m_logger.error("FileNotFoundException " + e.getMessage() );
		   throw new Exception(e);
		  }
		  catch(IOException e){
		   m_logger.error("IOException " + e.getMessage());
		   throw new Exception(e);
		  }
		  catch(Exception e){
		  	m_logger.error("Exception Error copiando archivos:" + srFile + " to " + dtFile);
		  	throw new Exception(e);
		  }
	}
	public static void copyfile(File source, File target) throws Exception{
		m_logger.debug("copyfile(File source, File target)");
		 try{
		   InputStream in = new FileInputStream(source);
		   
		   //For Append the file.
//		   OutputStream out = new FileOutputStream(f2,true);

		   //For Overwrite the file.
		   OutputStream out = new FileOutputStream(target);

		   byte[] buf = new byte[1024];
		   int len;
		   while ((len = in.read(buf)) > 0){
		    out.write(buf, 0, len);
		   }
		   in.close();
		   out.close();
		   m_logger.debug("File copied.");
		  }
		  catch(FileNotFoundException e){
		   m_logger.error("FileNotFoundException " + e.getMessage() + " in the specified directory.");
		   throw new Exception(e);
		  }
		  catch(IOException e){
		   m_logger.error("IOException " + e.getMessage());
		   throw new Exception(e);
		  }
		  catch(Exception e){
		  	m_logger.error("Exception Error copiando archivos:" + source + " to " + target);
		  	throw new Exception(e);
		  }
	}


}
