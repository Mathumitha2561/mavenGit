package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class CalculatorTests {
	Calculator c = new Calculator();
    @Test
	public void testCalSayHello() {
		Assertions.assertEquals("Hello world",c.sayHello());
	}
    @Test
    public void testAddNum() {
    	Assertions.assertEquals(300, c.addNum(200, 100));
    }
    
    @Test
    public void testubNum() {
    	Assertions.assertEquals(100, c.subNum(200, 100),"Plz check sub method");
    }
    @Test
    public void testAssertNulls() {
    	String s1 = null;
    	String s2 = "Nikhil";
    	Assertions.assertNull(s1);
    	Assertions.assertNotNull(s2);
    }
    
    @Test
    public void testAssertFails() {
    	Assertions.assertFalse("Madhu".length()==10);
    	Assertions.assertFalse(10>20,"10 is smaller");
    	Assertions.assertNotEquals("Hello", "hello");
    }
    @Test
    public void testArray() {
    	ArrayList<Integer> myList = new ArrayList<>();
    	Assertions.assertEquals(0,myList.size());
    	Assertions.assertTrue(myList.isEmpty());

	}
}
