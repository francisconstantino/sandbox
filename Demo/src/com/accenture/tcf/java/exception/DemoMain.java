package com.accenture.tcf.java.exception;

public class DemoMain {


	public static void main(String[] args) {

		Arithmetic a = new Arithmetic();

			try {
				System.out.println(a.divide(100, 0));
				System.out.println(a.subtract(3, 9));
			} catch (URException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getMessage());
			}


	}




}
