package com.sl.freemarker;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

/**
 *  FreeMarker user-defined directive that progressively transforms
 *  the output of its nested content to upper-case.
 *  
 *  
 *  <p><b>Directive info</b></p>
 * 
 *  <p>Directive parameters: None
 *  <p>Loop variables: None
 *  <p>Directive nested content: Yes
 */
public class DatabaseNameDirective implements TemplateDirectiveModel {
    
    public void execute(Environment env,
            Map params, TemplateModel[] loopVars,
            TemplateDirectiveBody body)
            throws TemplateException, IOException {
        // Check if no parameters were given:
        if (!params.isEmpty()) {
            throw new TemplateModelException(
                    "This directive doesn't allow parameters.");
        }
        if (loopVars.length != 0) {
                throw new TemplateModelException(
                    "This directive doesn't allow loop variables.");
        }
        
        // If there is non-empty nested content:
        if (body != null) {
            // Executes the nested body. Same as <#nested> in FTL, except
            // that we use our own writer instead of the current output writer.
            body.render(new UpperCaseFilterWriter(env.getOut()));
        } else {
            throw new RuntimeException("missing body");
        }
    }
    
    /**
     * A {@link Writer} that transforms the character stream to upper case
     * and forwards it to another {@link Writer}.
     */ 
    private static class UpperCaseFilterWriter extends Writer {
       
        private final Writer out;
           
        UpperCaseFilterWriter (Writer out) {
            this.out = out;
        }

        public void write(char[] cbuf, int off, int len)
                throws IOException {
        	int size = len;
            for (int i = 0; i < len; i++) {
            	if( i>0 && Character.isUpperCase(cbuf[i + off]) && false == Character.isUpperCase(cbuf[i + off -1])){
            		size+=1;
            	}
            }
            char[] transformedCbuf = new char[size];
            int j=0;
            for (int i = 0; i < len; i++) {
            	if( i>0 && Character.isUpperCase(cbuf[i + off]) && false == Character.isUpperCase(cbuf[i + off -1])){
            		transformedCbuf[j++] = '_';
            	}
                transformedCbuf[j++] = Character.toLowerCase(cbuf[i + off]);
            }
            out.write(transformedCbuf);
        }

        public void flush() throws IOException {
            out.flush();
        }

        public void close() throws IOException {
            out.close();
        }
    }

}
