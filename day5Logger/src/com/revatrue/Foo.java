package com.revatrue;



import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Foo {
	private static LogManager  logging = LogManager.getLogManager();
	private static Logger log = logging.getLogger("foo");

	public static void main(String[] args) {
		
		log.info("Hello world!");
//		log.warn("Uh oh");
//		log.error("This is not good!");
	}

}
