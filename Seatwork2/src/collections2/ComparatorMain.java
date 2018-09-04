package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		Person p1 = new Person("Francis", "Constantino", 18);
		Person p2 = new Person("Francis", "Zebra", 18);
		Person p3 = new Person("Francis", "Apple", 18);
		Person p4 = new Person("Francis", "Mango", 18);
		Person p5 = new Person("Francis", "Banana", 18);

		List <Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

//		ComparatorDemo cd = new ComparatorDemo();
//		Collections.sort(list, cd);
//
//		list.forEach(e -> {
//			System.out.println(e);
//		});

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.getLastName().compareTo(p2.getLastName());
			}

		});

		list.forEach(e -> {
			System.out.println(e);
		});

	}

}
