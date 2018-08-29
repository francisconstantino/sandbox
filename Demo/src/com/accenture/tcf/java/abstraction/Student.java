package com.accenture.tcf.java.abstraction;

public class Student extends Person {

	public Student(){
	}

	public Student(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	@Override
	public void eat() {
		System.out.println(this.getName() + " is eating steak.");

	}





}
