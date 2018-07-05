/**
 * 
 */
package com.study.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ma.Yan
 *
 * Create Time: Jun 4, 2018 5:42:31 PM
 */
public class Student {
	private static Logger logger = LoggerFactory.getLogger(Student.class);

	public void sayInfo() {
		logger.info("test info");
		logger.debug("test debug");
	}
}
