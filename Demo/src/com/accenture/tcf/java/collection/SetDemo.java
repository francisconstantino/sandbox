package com.accenture.tcf.java.collection;

import java.util.HashSet;
import java.util.Set;


public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Roland");
		set.add("Ron");
		set.add("Gwen");
		set.add("Shawee");
		set.add("Renz");
		set.add("Renz");


//		for(String name: set){
//			System.out.println(name);
//		}

//		Iterator<String> iterator = set.iterator();
//
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//
//		}

		set.forEach(kahitAno -> {
			System.out.println(kahitAno);
		});

	}

}
