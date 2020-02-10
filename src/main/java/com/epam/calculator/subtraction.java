package com.epam.calculator;

public class subtraction extends addition {

	void sub(double a,double b) {
		if(a>b) {
		System.out.println("subtraction is : "+(a-b));
		}
		else {
			System.out.println("subtraction is : "+(b-a));	
		}
	}

}
