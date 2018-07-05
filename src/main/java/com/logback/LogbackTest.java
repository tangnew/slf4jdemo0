/**
 * 
 */
package com.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ma.Yan
 *
 * Create Time: Jun 5, 2018 4:57:02 PM
 */
public class LogbackTest {
	private Logger logger = LoggerFactory.getLogger(LogbackTest.class);

	@Test
	public void info() {
		logger.info("info");
		String name = "Aub";
		String message = "3Q";
		String[] fruits = { "apple", "banana" };

		// logback提供的可以使用变量的打印方式，结果为"Hello,Aub!"
		logger.info("Hello,{}!", name);

		// 可以有多个参数,结果为“Hello,Aub! 3Q!”
		logger.info("Hello,{}!   {}!", name, message);

		// 可以传入一个数组，结果为"Fruit: apple,banana"
		logger.info("Fruit:  {},{}", fruits);
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
