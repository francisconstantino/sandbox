package collections2;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		int result;
		result = p1.getLastName().compareTo(p2.getLastName());
		return result;
	}

}
