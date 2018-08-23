package address;

public class Letter implements Address {
	private String street;
	private String city;

	public Letter(String street, String city) {
		this.street = street;
		this.city = city;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public String getStreet() {
		return street;
	}

	public static void main(String[] args) {
		Letter letter = new Letter("1001 Lotus Panache", "Delhi");
		System.out.println(letter.age);
		System.out.println(letter.getAddress());
		System.out.println("Country " + Address.getCountry());
	}

}
