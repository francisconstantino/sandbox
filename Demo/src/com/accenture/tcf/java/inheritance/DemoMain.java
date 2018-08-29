package com.accenture.tcf.java.inheritance;

public class DemoMain {

	public static void main(String[] args) {

		System.out.println("Person Class");
		Person person = new Person();

		person.setName("JV");
		person.setAge(18);
		System.out.println(person);
		person.eat();

		System.out.println("\nStudent Class");
		Student student = new Student();

		student.setName("Ron");
		student.setAge(15);
		System.out.println(student);
		student.eat();
		student.play();

		String ginagawaNiRon =student.eat("steak");

		System.out.println(ginagawaNiRon);

		System.out.println("\nStudent Class 2");
		Student student2 = new Student();

		student2.setName("Gwen");
		student2.setAge(13);
		System.out.println(student);
		student2.eat();
		student2.play();

		String ginagawaNiStudent =student2.eat("steak");

		System.out.println(ginagawaNiStudent);


	}

}