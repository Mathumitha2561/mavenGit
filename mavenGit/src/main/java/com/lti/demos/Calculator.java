package com.lti.demos;

public class Calculator {
	
	public String sayHello() {
		return "Hello world";
		
	}
	
	public int addNum(int x,int y) {
		return (x+y);
	}
	
	public int subNum(int x,int y) {
		return (x-y);
	}
	
	public void searchEmp(int empId) {
		if(empId == 0) {
			throw new ArithmeticException("U have entered 0");
		}
		else {
			System.out.println("Do something");
		}
	}

}
