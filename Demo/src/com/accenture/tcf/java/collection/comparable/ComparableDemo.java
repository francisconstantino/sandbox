package com.accenture.tcf.java.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("Ron", 20));
		empList.add(new Employee("Gwen", 18));
		empList.add(new Employee("Mik", 19));
		empList.add(new Employee("Gino", 21));
		empList.add(new Employee("Renz", 75));


		System.out.println("Before Sorting:");
		empList.forEach(e -> {
			System.out.println(e);
		});

//		Collections.sort(empList);
//
//		System.out.println("\nAfter Sorting:");
//		empList.forEach(e -> {
//			System.out.println(e);
//		});


	}

}
