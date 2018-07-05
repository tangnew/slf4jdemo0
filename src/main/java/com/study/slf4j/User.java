/**
 * 
 */
package com.study.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ma.Yan
 *
 * Create Time: Jun 4, 2018 5:16:39 PM
 */
public class User {
	private static Logger logger = LoggerFactory.getLogger(User.class);

	public static void main(String[] args) {
		logger.debug("test");
		Student s = new Student();
		s.sayInfo();
	}
}
