package com.hascode.tutorial;

import com.hascode.tutorial.alpha.Foo;
import com.hascode.tutorial.beta.Bar;

public class Main {
	public static void main(String[] args) {
		final String input = "hello, logger";
		new Foo().doSth(input);
		new Bar().doSth(input);

	}
}
