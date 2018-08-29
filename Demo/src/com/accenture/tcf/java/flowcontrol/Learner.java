package com.accenture.tcf.java.flowcontrol;

public class Learner {

	private String name;
	private int age;

	public Learner(){

	}

	public Learner(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void compute() {
		System.out.println("Learner is computing.");
	}

	@Override
	public String toString() {
		return "Learner [name=" + name + ", age=" + age + "]";
	}



}
