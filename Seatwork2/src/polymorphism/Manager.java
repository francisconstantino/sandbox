package polymorphism;

public class Manager extends Employee{

	public void sayHello() {
		System.out.println("Hello! I am a manager. ");
	}

	public void doWork() {
		System.out.println("Doing managerial work.");
	}

	public void beBusy() {
		System.out.println("I am a manager. I am busy.");
	}

}
