package com.accenture.tcf.java.inheritance;

public class Student extends Person {

	public void play(){
		System.out.println("Student is playing.");
	}

	public void eat(){
		super.eat();
		System.out.println("Student is eating a lot.");
	}

	public String eat(String food){
		return this.getName() + " is eating " + food +".";
	}

}
