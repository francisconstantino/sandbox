package com.accenture.tcf.java.abstraction;

public class DemoMain {

	public static void main(String[] args) {
//		Person person = new Person();

		System.out.println("Student class");
		Student student = new Student("JV", 18);

		System.out.println(student);
		student.eat();


		System.out.println("\nDog class");
		Dog dog = new Dog();
		dog.eat();

	}

}
