package com.spring_boot_basic_app.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootBasicAppApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootBasicAppApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test Case Executed!");
		assertEquals(true, true);
	}

}
