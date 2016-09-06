/*
  
 Create a template.ftl with the following content
  
 the class is ${class}

  <#list class.methods as method>
     Method Declaring Class: ${method.declaringClass}	
     Method Name: ${method.name}
     Method type: ${method.returnType}
     Parameters:
     <#list method.parameterTypes as parameter>
     		${parameter.class}
     </#list>
-------------------
  </#list>
*/

package com.sl.freemarker;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class FreeMarkerTemplateModelMerger { 


    public static void main(String[] args) throws Exception {
        
    	
    	if( args.length < 2){
    		System.out.println("usage: FreeMarkerTemplateModelMerger c:/templatepath/template.ftl javaClass");
    		File f = new File(".");
    		System.out.println("running from:" + f.getAbsolutePath());
    		return;
    	}
        /* ------------------------------------------------------------------- */    
        /* You should do this ONLY ONCE in the whole application life-cycle:   */    
    
        /* Create and adjust the configuration */
    	String strTemplatePath = -1 == args[0].lastIndexOf("/") ? "." : args[0].substring(0, args[0].lastIndexOf("/")) ;
    	String strTemplateFile = -1 == args[0].lastIndexOf("/") ? args[0] : args[0].substring(args[0].lastIndexOf("/")+1) ;
    	
    	Configuration cfg = null;
    	try{
         cfg = new Configuration();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
        cfg.setDirectoryForTemplateLoading(new File(strTemplatePath));
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        /* ------------------------------------------------------------------- */    
        /* You usually do these for many times in the application life-cycle:  */    
                
        /* Get or create a template */
        Template temp = cfg.getTemplate(strTemplateFile);

        /* Create a data-model */
        Object model = getInstanceForName(args[1]);

        getPublicProcedures(model.getClass());
       
        /* Merge data-model with template */
        Writer out = new OutputStreamWriter(System.out);
        
        temp.process(model, out);
        out.flush();
    }
	private static Object getInstanceForName(String className){
		Object obj=null;
		try{
			obj = Class.forName(className).newInstance();
		}
		catch(Exception e){
			System.out.println("Error Can not create a class for:" +  className + " " + e);
		}
		return obj;
	}
	private static Method[] getPublicProcedures(Class c){
		Method[] classMethods = c.getMethods();
		for( int i=0; i<classMethods.length;i++){
			Method m = classMethods[i];
			Class parameterClasses[] = m.getParameterTypes();
			for(int p=0; parameterClasses!=null && p<parameterClasses.length; p++){
				Class pc=parameterClasses[p];
				//System.out.println(pc.getCanonicalName());
			}
			m.getReturnType();
			m.getDeclaringClass();
			if( m.getName().startsWith("get") || m.getName().startsWith("set") ){ 
				
			}
		}
		return null; 
	}
} 
