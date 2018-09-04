package collectionsPractice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableMain {

	public static void main(String[] args) {
		Person p1 = new Person("francis", "constantino", 18);
		Person p2 = new Person("francis", "constantino", 20);
		Person p3 = new Person("francis", "constantino", 5);
		Person p4 = new Person("francis", "constantino", 23);
		Person p5 = new Person("francis", "constantino", 14);
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Set <Person> set = new TreeSet<>(Collections.reverseOrder()); //will sort
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
//		list.forEach(e -> {
//			System.out.println(e);
//		});
		
		Collections.sort(list);
		
		System.out.println("Sort by age descending");
		System.out.println("---------------------------------");
		System.out.printf("%-18s%-18s%-18s\n", "First Name", "Last Name", "Age");
		Iterator<Person> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
