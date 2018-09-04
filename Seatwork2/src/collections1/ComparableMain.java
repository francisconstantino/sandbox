package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		Person p1 = new Person("Francis", "Constantino", 20);
		Person p2 = new Person("Francis", "Constantino", 18);
		Person p3 = new Person("Francis", "Constantino", 13);
		Person p4 = new Person("Francis", "Constantino", 23);
		Person p5 = new Person("Francis", "Constantino", 21);

		List<Person> person = new ArrayList<>();
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);

		Collections.reverse(person);

		System.out.println("Sort by Age - Descending");
		System.out.println("-------------------------------------");
		System.out.println("First Name\t" + "Last Name\t" + "Age");
		person.forEach(e -> {
			System.out.println(e);
		});

	}

}
