package org.jacoco.examples.maven.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

	private HelloWorld subject;

	@BeforeEach
	public void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessage() {
		System.out.println();
	}
	
}
