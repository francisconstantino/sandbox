package collectionsMaps;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		int result = p1.getLastName().compareTo(p2.getLastName());
		return result;
	}

}
