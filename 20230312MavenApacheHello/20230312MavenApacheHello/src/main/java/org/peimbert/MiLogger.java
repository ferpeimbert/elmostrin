/**
 * 
 */
package org.peimbert;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author fpeimbert
 *
SEVERE (highest)
WARNING
INFO
CONFIG
FINE
FINER
FINEST
 */


public class MiLogger {
	private final static Logger L = 
//			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * 
	 */
	public MiLogger() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L.setLevel(Level.INFO);
		System.out.println();
		System.out.println();
		System.out.println(L.getLevel());
		System.out.println(L.getName());
		System.out.println(L.getParent());
		System.out.println(L.getGlobal());
		

	}



}
