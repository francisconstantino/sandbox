package inheritance3;

public class Theater extends Building {

	@Override
	public void showArea() {
		int newCapacity = super.getCapacity() * 12;
		System.out.println(newCapacity);

	}

	@Override
	public void showEvents() {
		System.out.println("Events ready to be hosted!");

	}

}
