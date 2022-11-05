package org.tnsindia.junitdemo;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@Test
	@RepeatedTest(5)
	void test() {
		System.out.println("Hello M25");
	}

}
