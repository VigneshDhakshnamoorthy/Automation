package selenium.samples;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log_4j_test {
	static Logger log = Logger.getLogger(Log_4j_test.class.getName());  
    
	   public static void main(String[] args)throws IOException,SQLException{  
	      PropertyConfigurator.configure("C:\\Users\\vigne\\Documents\\EclipseWorkspace\\Automation\\InterviewSample\\src\\test\\java\\selenium\\samples\\log4j.properties");
	      log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message");  
	   }  
}
