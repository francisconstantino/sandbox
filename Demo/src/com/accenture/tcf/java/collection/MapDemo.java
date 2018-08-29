package com.accenture.tcf.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {


		Map<String, Employee> map = new HashMap<String, Employee>();

		map.put("lakas", new Employee("Ron", 18));
		map.put("ganda", new Employee("Gwen", 18));
		map.put("sexy", new Employee("Mik", 18));
		map.put("macho", new Employee("Gino", 18));
		map.put("tulog", new Employee("Renz", 18));
		map.put("ganda", new Employee("Shawee", 18));


//		System.out.println(map.get("lakas") + " at si " + map.get("ganda"));


		//getting map values using keys
		/*Set keys = map.keySet();

		keys.forEach(k -> {
			System.out.println(map.get(k));
		});*/

		//getting map values
		Collection<Employee> mapValues = map.values();

		mapValues.forEach(v -> {
			System.out.println(v);
		});





	}

}
