package com.hascode.tutorial.alpha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {
	private final Logger log = LoggerFactory.getLogger(getClass());

	public void doSth(String input) {
		log.info("doSth called with parameter {}", input);
		System.out.println("foo " + input);
	}
}
