package com.accenture.tcf.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Roland");
		list.add("Ron");
		list.add("Gwen");
		list.add("Shawee");
		list.add("Renz");
		list.add("Renz");


		System.out.println(list.get(1) + " & " + list.get(2));

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

//		for(String name: list){
//			System.out.println(name);
//		}

//		Iterator<String> iterator = list.iterator();
//
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//
//		}

		list.forEach(kahitAno -> {
			System.out.println(kahitAno);
		});


	}
}
