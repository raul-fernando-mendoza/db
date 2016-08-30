package com.sl.db;

import java.sql.SQLException;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent; 

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class DBContextServletListener implements ServletContextListener{

	private static Category m_logger = Logger.getLogger(DBContextServletListener.class.getName());
	
	    public void contextInitialized(ServletContextEvent context) 
	    {
	        //ServletContext application = e.getServletContext();
	        m_logger.debug("***************************************");
	        m_logger.debug("The context ROOT DBContextServletListener has been created now");
        
	    }

	    /**
	     * Attempts to close the DataSource
	     */
	    public void contextDestroyed(ServletContextEvent e) 
	    {
	        //ServletContext application = e.getServletContext();
            m_logger.debug("the context DBContextServletListener has been destroyed");
            m_logger.debug("Database is been shutdown");
            try {
				Database.Shutdown();
			} catch (SQLException e1) {
				m_logger.error(e);
				e1.printStackTrace();
			} 
            m_logger.debug("shutdown completed successfully");
            //ElasticSearchAccess.shutdown(); 
	    }

}
