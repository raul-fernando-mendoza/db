package com.sl.db;

public class StringUtil {

    public static String getCleanFileName(String strFileName){
    	String strNewFileName = "";
    	for(int i=0; i<strFileName.length();i++){
    		char c = strFileName.charAt(i);
    		if( (c >= 'a' && c<='z') || 
    			(c>='A' && c<='Z') ||
    			(c>='0' && c<='9') ||
    			c=='.' ){
    			strNewFileName += c;
    		}
    	}
    	return strNewFileName;
    } 	
	
}
