package org.tnsindia.junitdemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display()
	{
		//System.setProperty("Nutan","Num1");
		//will evaluate the given assumption and if it results in true then the given test is allowed to execute
		System.setProperty("Nutan","Num");
		Assumptions.assumeTrue("Num".equals(System.getProperty("Nutan")));
	}
	
	@Test
	void display1()
	{
		//System.setProperty("Nutan","Num1");
		//will evaluate the given assumption and test wll run if result is false.
		System.setProperty("Nutan","Num");
		Assumptions.assumeFalse("Num1".equals(System.getProperty("Nutan")));
	}

}
