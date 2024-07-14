/**
 * 
 */
package com.mystore.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Rayhan Naufal
 *
 */
public class Log {

	public static Logger log = LogManager.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName){		  
		log.info("====================================="+sTestCaseName+" TEST START=========================================");
		 }
	
	public static void endTestCase(String sTestCaseName){
		log.info("====================================="+sTestCaseName+" TEST END=========================================");
		 }
	
	// Need to create below methods, so that they can be called  

	 public static void info(String message) {

		 log.info("INFO" +message);

			}

	 public static void warn(String message) {

		 log.warn("WARN" +message);

		}

	 public static void error(String message) {

		 log.error("ERROR" +message);

		}

	 public static void fatal(String message) {

		 log.fatal("FATAL" +message);

		}

	 public static void debug(String message) {

		 log.debug("DEBUG" + message);

		}
	 
}
