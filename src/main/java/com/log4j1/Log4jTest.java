/**
 * 
 */
package com.log4j1;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ma.Yan
 *
 * Create Time: Jun 5, 2018 2:44:21 PM
 */
public class Log4jTest {

	private Logger logger = LoggerFactory.getLogger(Log4jTest.class);

	@Test
	public void info() {
		logger.info("info");
	}

	@Test
	public void debug() {
		logger.debug("debug");
	}

	@Test
	public void warn() {
		logger.warn("warn");
	}
}
