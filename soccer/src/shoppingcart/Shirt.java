package shoppingcart;

public class Shirt extends Item{
	public char size;
	public char colorCode;



	public Shirt(char size, char colorCode) {
		super("Shirt", 25.99);
		this.size = size;
		this.colorCode = colorCode;
		// TODO Auto-generated constructor stub
	}



	public void display() {
		super.display();
		System.out.println(getPrice());
		System.out.println(size);
		System.out.println(colorCode);
	}

	public void getFit() {
		System.out.println("Getting fitted");
	}





}
