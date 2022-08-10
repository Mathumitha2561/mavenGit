package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {

	@ParameterizedTest
	@ValueSource(ints = {8,2,32,36,90})
	public void testIntArrParameters(int arg) {
		System.out.println("arg :"+arg);
		Assertions.assertTrue(arg%2 == 0);
	}
	@DisplayName("Pass all parameters")
	@ParameterizedTest
	@ValueSource(strings = {"Hello","Hii","World"})
	public void testParams(String args) {
		Assertions.assertNotNull(args);
	}
	
	
	@Test
	public void testLambdaList() {
		Integer[] intArr = {10,20,30,40,50};
		List<Integer> list = Arrays.asList(intArr);
		Assertions.assertAll(
				()->assertEquals(10,list.get(0)),
				()->assertEquals(20,list.get(1)),
				()->assertEquals(30,list.get(2)),
				()->assertEquals(40,list.get(3)),
				()->assertNotNull(10));
	}
	@RepeatedTest(value = 3,name = "Repeat 3 times")
	public void repeatTest() {
		int a = 10,b =20;
		System.out.println("Repeat");
		Assertions.assertEquals(200,(a*b));
	}
}
