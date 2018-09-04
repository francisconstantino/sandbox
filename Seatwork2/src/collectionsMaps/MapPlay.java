package collectionsMaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MapPlay {

	public static void main(String[] args) {

		/*
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "Apple");
		map.put(2, "Orange");
		map.put(1, "Banana");
		map.put(4, "Grapes");

//		map.entrySet().stream().forEach(e -> System.out.println(e));

		//Reverse key of map
		Set <Integer> set = new TreeSet<>(Collections.reverseOrder());
		set.addAll(map.keySet());
		set.forEach(e -> System.out.println(e));

		//Reverse value of map
		Collection <String> values = map.values();
		Set <String> sortedValues = new TreeSet<>(Collections.reverseOrder());
		sortedValues.addAll(values);
		sortedValues.forEach(e -> System.out.println(e));

		//Get a list of map values, reversed
		List<Entry<Integer, String>> list = map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey()
								.reversed())
								.collect(Collectors.toList());
		list.forEach(e -> System.out.println(e));

		*/


		//Sort the person value of map by last name using comparator demo
		Map<Integer, Person> map = new TreeMap<>();
		map.put(2, new Person("Francis", "Constantino", 23));
		map.put(1, new Person("Apple", "Mango", 13));
		map.put(3, new Person("Mango", "Apple", 15));

		Collection <Person> values = map.values();
		List <Person> list = new ArrayList<>(values);

		Collections.sort(list, new ComparatorDemo());
		list.forEach(e -> System.out.println(e));













	}

}
