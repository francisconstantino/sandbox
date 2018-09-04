package inheritance2;

public class Car extends Vehicle{

	public Car() {
		super();
		System.out.println("Building a car");
	}

	public void drive() {
		System.out.println("Driving a Car");
	}
}
