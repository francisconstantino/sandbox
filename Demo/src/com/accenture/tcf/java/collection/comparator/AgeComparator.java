package com.accenture.tcf.java.collection.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return arg0.getAge() - arg1.getAge();
	}

}
