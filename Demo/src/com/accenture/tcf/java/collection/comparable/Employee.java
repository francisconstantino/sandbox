package com.accenture.tcf.java.collection.comparable;

public class Employee implements Comparable<Employee>{

	private String name;
	private int age;

	public Employee() {
	}
	public Employee(String name, int age) {
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee arg0) {

		return this.age - arg0.age;

	}



}
