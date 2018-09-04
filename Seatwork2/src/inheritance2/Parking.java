package inheritance2;

public class Parking {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle();
		Vehicle vehicle = new Vehicle(0, 0, 0);
		System.out.println("number of doors = " + vehicle.getDoors());
		System.out.println("number of seats = " + vehicle.getSeats());
		System.out.println("number of wheels = " + vehicle.getWheels());

		Car car = new Car();
		car.setDoors(4);
		car.setSeats(5);
		car.setWheels(4);

		System.out.println("number of doors = " + car.getDoors());
		System.out.println("number of seats = " + car.getSeats());
		System.out.println("number of wheels = " + car.getWheels());
		car.drive();


	}

}
