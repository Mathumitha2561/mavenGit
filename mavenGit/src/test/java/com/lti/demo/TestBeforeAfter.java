package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {
	
	Calculator c = new Calculator();
	int sum =0;
	@BeforeEach
	public void testStart() {
		sum = 0;
		System.out.println("Sum is zero "+sum);
	}
	@Test
    public void testAddNum() {
		System.out.println("Testcase 1");
    	Assertions.assertEquals(300, c.addNum(200, 100));
    }
    
    @Test
    public void testubNum() {
    	System.out.println("Testcase 2");
    	Assertions.assertEquals(100, c.subNum(200, 100),"Plz check sub method");
    }
    
    @BeforeAll
    public static void testStartDbConn() {
    	System.out.println("Db conn is done only once");
    }
    @AfterEach
    public void testShutDown() {
    	System.out.println("After every testcase");
    	
    }
    @AfterAll
    public static void testShutDownConn() {
    	System.out.println("After all only once");
    }
	

}
