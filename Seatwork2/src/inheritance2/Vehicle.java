package inheritance2;

public class Vehicle {
	private int doors;
	private int seats;
	private int wheels;

	public Vehicle() {
		System.out.println("Building a vehicle");
	}

	public Vehicle(int d, int s, int w) {
		this.doors = d;
		this.seats = s;
		this.wheels = w;
	}

	public void drive() {
		System.out.println("Driving a Vehicle");
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


}
