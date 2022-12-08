package Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;

public class Log {

	private static Logger logger = Logger.getLogger(Log.class.getName());
	
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
	static String filename = System.getProperty("user.dir") + File.separator + "log" + File.separator + "logFile_"
			+ dateFormat.format(new Date()) + ".log";
	static String log4jPropertiesPath = System.getProperty("user.dir") + File.separator + "configs\\log4j.properties";
	
	Appender myAppender;
    SimpleLayout myLayout;
    
    public Log() {
    	logger.setLevel(Level.INFO);
    	
    	myLayout=new SimpleLayout();
    	myAppender=  (Appender) new FileAppender();
    	
    	logger.addAppender(myAppender);
    	PropertyConfigurator.configure(log4jPropertiesPath);
    }
		
	public static void startTestCase(String sTestCaseName) {
        
		logger.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");

	}

	public static void endTestCase(String sTestCaseName) {

		logger.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

	}

	public static void info(String message) {
        
		logger.info(message);

	}

	public static void warn(String message) {

		logger.warn(message);

	}

	public static void error(String message) {

		logger.error(message);

	}

	public static void fatal(String message) {

		logger.fatal(message);
		System.out.println("line no " + new Exception().getStackTrace()[1]);

	}

	public static void debug(String message) {

		logger.debug(message);

	}
}
