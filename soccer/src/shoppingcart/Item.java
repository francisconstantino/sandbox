package shoppingcart;

public abstract class Item {

	private String name;
	private double price;
	public int age = 12;

	public Item(String name, double price) {
		setName(name);
		setPrice(price);
	}

	public void display() {
		System.out.println(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract void wear();




}
