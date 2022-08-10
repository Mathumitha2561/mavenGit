package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class ExceptionTest {

	@Disabled
	@Test
	void testException() {
		Assertions.assertThrows(IllegalArgumentException.class,
		()->{Integer.parseInt("One");});
	}

	@Test
	public void testZeroExp() {
		Calculator c = new Calculator();
		
		final Exception e = assertThrows(ArithmeticException.class,
				()->{c.searchEmp(0);});
		Assertions.assertEquals("U have entered 0",e.getMessage());
	}
}
