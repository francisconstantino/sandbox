package polymorphism;

public class Bank {

	public static void main(String[] args) {
		Employee employee = new Manager();
		employee.sayHello();
		employee.dozeOff(); //dozeOff is exclusive to employee

		//employee.beBusy(); illegal
	}

}
