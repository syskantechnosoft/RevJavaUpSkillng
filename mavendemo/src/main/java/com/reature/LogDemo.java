package com.reature;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger log = Logger.getLogger(LogDemo.class);
		
		BasicConfigurator.configure();  
		
		log.info("Information Log");
		log.warn("Warning message!!!!");
		log.error("Error Message");
	}

}
