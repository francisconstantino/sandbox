package collectionsPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ComparatorMain {
	
	public static void main(String[] args) {
		Person p1 = new Person("francis", "constantino", 18);
		Person p2 = new Person("francis", "mango", 20);
		Person p3 = new Person("francis", "apple", 5);
		Person p4 = new Person("francis", "banana", 23);
		Person p5 = new Person("francis", "constantino", 14);
		
		List <Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Collections.sort(list, new ComparatorDemo());
//		list.forEach(e -> System.out.println(e));
		
		System.out.println("Sort by age - Descending");
		System.out.println("-------------------------------------");
		System.out.printf("%-18s%-18s%-22s\n", "First Name", "Last Name", "Age");
		Person m = new Person("francis", "constantino", 14);
		Iterator<Person> iterator = list.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();
			if(p.toString().equals(m.toString())) {
				System.out.println(p.toString());
			}
		}
		

	}

}
