package com.accenture.tcf.java.exception;

public class Arithmetic {

	public double divide(int a, int b) throws URException{

		double result = 0;

		try {
			result = a / b;
		} catch (ArithmeticException e) {
			throw new URException("You are the only exception in my life. - Renz");
		}

		return result;
	}

	public int subtract(int a, int b) throws URException{

		int result = a - b;

		if (result < 0){
			throw new URException("Cannot be, borrow from Renz.");
		}

		return result;

	}

}
