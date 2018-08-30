package com.accenture.tcf.java.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorDemo {

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

		//using anonymous inner class
		/*Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee arg0, Employee arg1) {
				return arg0.getAge() - arg1.getAge();
			}
		});*/

		//using a class the implement Comparator interface
//		AgeComparator ac = new AgeComparator();
//		Collections.sort(empList, ac);
		Collections.sort(empList, new AgeComparator());

		System.out.println("\nAfter Sorting:");
		empList.forEach(e -> {
			System.out.println(e);
		});

	}

}
