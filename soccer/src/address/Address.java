package address;

public interface Address {

	String getStreet();

	String getCity();
	int age = 5;
	default String getAddress() {
		return getStreet() + ", " + getCity();
	}

	static String getCountry() {
		return ("India");
	}

}
