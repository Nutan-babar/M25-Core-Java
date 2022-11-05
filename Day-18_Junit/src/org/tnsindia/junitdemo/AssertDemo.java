package org.tnsindia.junitdemo;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertDemo {

	@Test
	public void assertdemo()
	{
		//falis when expected does not equal actual
		assertEquals(7,7);
	}
	@Test
	public void assertdemo1()
    {
		//Fails when expected does not equal actual
		assertNull(null);
	}

}
