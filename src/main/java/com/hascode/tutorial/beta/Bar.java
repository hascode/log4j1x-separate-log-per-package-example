package com.hascode.tutorial.beta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bar {
	private final Logger log = LoggerFactory.getLogger(getClass());

	public void doSth(String input) {
		log.info("doSth called with parameter {}", input);
		System.out.println("bar " + input);
	}
}
