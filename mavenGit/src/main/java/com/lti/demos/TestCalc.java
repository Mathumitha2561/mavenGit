package com.lti.demos;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		String msg = cal.sayHello();
		System.out.println(msg);
		int sum = cal.addNum(100,134);
		System.out.println(sum);
		System.out.println("Newline added");
		

	}

}
