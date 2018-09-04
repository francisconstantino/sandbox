package collections1;

public class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	private int age;

	public Person(String name, String lastName, int age) {
		super();
		this.firstName = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person p) {
		return this.age - p.age;
	}

	@Override
	public String toString() {
		return firstName + "\t\t" + lastName + "\t" + age;
	}




}
