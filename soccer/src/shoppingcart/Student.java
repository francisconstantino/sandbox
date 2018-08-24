package shoppingcart;

public class Student extends Person {

	public String display() {
		return super.getName() + super.getAge();
	}
}
