package org.tnsindia.junitdemo;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;


class FirstJunitTest {

	@Test
	// it will perform testing on method
	void test() {
		System.out.println("hello Everyone");
	}
  @Test
  @Disabled
	void display() {
		fail("hii");
	}

}
